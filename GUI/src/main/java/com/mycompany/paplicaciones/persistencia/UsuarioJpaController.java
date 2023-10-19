/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.paplicaciones.persistencia;

import java.io.Serializable;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import main.java.logica.Inscripcion;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.java.com.mycompany.paplicaciones.persistencia.exceptions.NonexistentEntityException;
import main.java.com.mycompany.paplicaciones.persistencia.exceptions.PreexistingEntityException;
import main.java.logica.Compra;
import main.java.logica.Usuario;

/**
 *
 * @author pablo
 */
public class UsuarioJpaController implements Serializable {

    public UsuarioJpaController(){
        this.emf =  Persistence.createEntityManagerFactory("PAplicaciones");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Usuario usuario) throws PreexistingEntityException, Exception {
        if (usuario.getIns() == null) {
            usuario.setIns(new ArrayList<Inscripcion>());
        }
        if (usuario.getCompras() == null) {
            usuario.setCompras(new ArrayList<Compra>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Inscripcion> attachedIns = new ArrayList<Inscripcion>();
            for (Inscripcion insInscripcionToAttach : usuario.getIns()) {
                insInscripcionToAttach = em.getReference(insInscripcionToAttach.getClass(), insInscripcionToAttach.getId());
                attachedIns.add(insInscripcionToAttach);
            }
            usuario.setIns(attachedIns);
            List<Compra> attachedCompras = new ArrayList<Compra>();
            for (Compra comprasCompraToAttach : usuario.getCompras()) {
                comprasCompraToAttach = em.getReference(comprasCompraToAttach.getClass(), comprasCompraToAttach.getId());
                attachedCompras.add(comprasCompraToAttach);
            }
            usuario.setCompras(attachedCompras);
            em.persist(usuario);
            for (Inscripcion insInscripcion : usuario.getIns()) {
                Usuario oldTurOfInsInscripcion = insInscripcion.getTur();
                insInscripcion.setTur(usuario);
                insInscripcion = em.merge(insInscripcion);
                if (oldTurOfInsInscripcion != null) {
                    oldTurOfInsInscripcion.getIns().remove(insInscripcion);
                    oldTurOfInsInscripcion = em.merge(oldTurOfInsInscripcion);
                }
            }
            for (Compra comprasCompra : usuario.getCompras()) {
                Usuario oldTurOfComprasCompra = comprasCompra.getTur();
                comprasCompra.setTur(usuario);
                comprasCompra = em.merge(comprasCompra);
                if (oldTurOfComprasCompra != null) {
                    oldTurOfComprasCompra.getCompras().remove(comprasCompra);
                    oldTurOfComprasCompra = em.merge(oldTurOfComprasCompra);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findUsuario(usuario.getNick()) != null) {
                throw new PreexistingEntityException("Usuario " + usuario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Usuario usuario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario persistentUsuario = em.find(Usuario.class, usuario.getNick());
            List<Inscripcion> insOld = persistentUsuario.getIns();
            List<Inscripcion> insNew = usuario.getIns();
            List<Compra> comprasOld = persistentUsuario.getCompras();
            List<Compra> comprasNew = usuario.getCompras();
            List<Inscripcion> attachedInsNew = new ArrayList<Inscripcion>();
            for (Inscripcion insNewInscripcionToAttach : insNew) {
                insNewInscripcionToAttach = em.getReference(insNewInscripcionToAttach.getClass(), insNewInscripcionToAttach.getId());
                attachedInsNew.add(insNewInscripcionToAttach);
            }
            insNew = attachedInsNew;
            usuario.setIns(insNew);
            List<Compra> attachedComprasNew = new ArrayList<Compra>();
            for (Compra comprasNewCompraToAttach : comprasNew) {
                comprasNewCompraToAttach = em.getReference(comprasNewCompraToAttach.getClass(), comprasNewCompraToAttach.getId());
                attachedComprasNew.add(comprasNewCompraToAttach);
            }
            comprasNew = attachedComprasNew;
            usuario.setCompras(comprasNew);
            usuario = em.merge(usuario);
            for (Inscripcion insOldInscripcion : insOld) {
                if (!insNew.contains(insOldInscripcion)) {
                    insOldInscripcion.setTur(null);
                    insOldInscripcion = em.merge(insOldInscripcion);
                }
            }
            for (Inscripcion insNewInscripcion : insNew) {
                if (!insOld.contains(insNewInscripcion)) {
                    Usuario oldTurOfInsNewInscripcion = insNewInscripcion.getTur();
                    insNewInscripcion.setTur(usuario);
                    insNewInscripcion = em.merge(insNewInscripcion);
                    if (oldTurOfInsNewInscripcion != null && !oldTurOfInsNewInscripcion.equals(usuario)) {
                        oldTurOfInsNewInscripcion.getIns().remove(insNewInscripcion);
                        oldTurOfInsNewInscripcion = em.merge(oldTurOfInsNewInscripcion);
                    }
                }
            }
            for (Compra comprasOldCompra : comprasOld) {
                if (!comprasNew.contains(comprasOldCompra)) {
                    comprasOldCompra.setTur(null);
                    comprasOldCompra = em.merge(comprasOldCompra);
                }
            }
            for (Compra comprasNewCompra : comprasNew) {
                if (!comprasOld.contains(comprasNewCompra)) {
                    Usuario oldTurOfComprasNewCompra = comprasNewCompra.getTur();
                    comprasNewCompra.setTur(usuario);
                    comprasNewCompra = em.merge(comprasNewCompra);
                    if (oldTurOfComprasNewCompra != null && !oldTurOfComprasNewCompra.equals(usuario)) {
                        oldTurOfComprasNewCompra.getCompras().remove(comprasNewCompra);
                        oldTurOfComprasNewCompra = em.merge(oldTurOfComprasNewCompra);
                    }
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = usuario.getNick();
                if (findUsuario(id) == null) {
                    throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Usuario usuario;
            try {
                usuario = em.getReference(Usuario.class, id);
                usuario.getNick();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The usuario with id " + id + " no longer exists.", enfe);
            }
            List<Inscripcion> ins = usuario.getIns();
            for (Inscripcion insInscripcion : ins) {
                insInscripcion.setTur(null);
                insInscripcion = em.merge(insInscripcion);
            }
            List<Compra> compras = usuario.getCompras();
            for (Compra comprasCompra : compras) {
                comprasCompra.setTur(null);
                comprasCompra = em.merge(comprasCompra);
            }
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Usuario> findUsuarioEntities() {
        return findUsuarioEntities(true, -1, -1);
    }

    public List<Usuario> findUsuarioEntities(int maxResults, int firstResult) {
        return findUsuarioEntities(false, maxResults, firstResult);
    }

    private List<Usuario> findUsuarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Usuario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Usuario findUsuario(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Usuario> rt = cq.from(Usuario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
