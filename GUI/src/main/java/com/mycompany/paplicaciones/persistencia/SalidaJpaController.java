/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.mycompany.paplicaciones.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import main.java.com.mycompany.paplicaciones.persistencia.exceptions.NonexistentEntityException;
import main.java.com.mycompany.paplicaciones.persistencia.exceptions.PreexistingEntityException;
import main.java.logica.Salida;

/**
 *
 * @author francisco
 */
public class SalidaJpaController implements Serializable {

    public SalidaJpaController() {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Salida salida) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(salida);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findSalida(salida.getNom()) != null) {
                throw new PreexistingEntityException("Salida " + salida + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Salida salida) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            salida = em.merge(salida);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = salida.getNom();
                if (findSalida(id) == null) {
                    throw new NonexistentEntityException("The salida with id " + id + " no longer exists.");
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
            Salida salida;
            try {
                salida = em.getReference(Salida.class, id);
                salida.getNom();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The salida with id " + id + " no longer exists.", enfe);
            }
            em.remove(salida);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Salida> findSalidaEntities() {
        return findSalidaEntities(true, -1, -1);
    }

    public List<Salida> findSalidaEntities(int maxResults, int firstResult) {
        return findSalidaEntities(false, maxResults, firstResult);
    }

    private List<Salida> findSalidaEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Salida.class));
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

    public Salida findSalida(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Salida.class, id);
        } finally {
            em.close();
        }
    }

    public int getSalidaCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Salida> rt = cq.from(Salida.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
