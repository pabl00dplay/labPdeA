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
import main.java.logica.Actividad;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import main.java.com.mycompany.paplicaciones.persistencia.exceptions.NonexistentEntityException;
import main.java.com.mycompany.paplicaciones.persistencia.exceptions.PreexistingEntityException;
import main.java.logica.Paquete;

/**
 *
 * @author capo_
 */
public class PaqueteJpaController implements Serializable {

    public PaqueteJpaController() {
        this.emf = Persistence.createEntityManagerFactory("PAplicaciones");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Paquete paquete) throws PreexistingEntityException, Exception {
        if (paquete.getActs() == null) {
            paquete.setActs(new ArrayList<Actividad>());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            List<Actividad> attachedActs = new ArrayList<Actividad>();
            for (Actividad actsActividadToAttach : paquete.getActs()) {
                actsActividadToAttach = em.getReference(actsActividadToAttach.getClass(), actsActividadToAttach.getNom());
                attachedActs.add(actsActividadToAttach);
            }
            paquete.setActs(attachedActs);
            em.persist(paquete);
            for (Actividad actsActividad : paquete.getActs()) {
                actsActividad.getPaquetes().add(paquete);
                actsActividad = em.merge(actsActividad);
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPaquete(paquete.getNom()) != null) {
                throw new PreexistingEntityException("Paquete " + paquete + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Paquete paquete) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Paquete persistentPaquete = em.find(Paquete.class, paquete.getNom());
            List<Actividad> actsOld = persistentPaquete.getActs();
            List<Actividad> actsNew = paquete.getActs();
            List<Actividad> attachedActsNew = new ArrayList<Actividad>();
            for (Actividad actsNewActividadToAttach : actsNew) {
                actsNewActividadToAttach = em.getReference(actsNewActividadToAttach.getClass(), actsNewActividadToAttach.getNom());
                attachedActsNew.add(actsNewActividadToAttach);
            }
            actsNew = attachedActsNew;
            paquete.setActs(actsNew);
            paquete = em.merge(paquete);
            for (Actividad actsOldActividad : actsOld) {
                if (!actsNew.contains(actsOldActividad)) {
                    actsOldActividad.getPaquetes().remove(paquete);
                    actsOldActividad = em.merge(actsOldActividad);
                }
            }
            for (Actividad actsNewActividad : actsNew) {
                if (!actsOld.contains(actsNewActividad)) {
                    actsNewActividad.getPaquetes().add(paquete);
                    actsNewActividad = em.merge(actsNewActividad);
                }
            }
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = paquete.getNom();
                if (findPaquete(id) == null) {
                    throw new NonexistentEntityException("The paquete with id " + id + " no longer exists.");
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
            Paquete paquete;
            try {
                paquete = em.getReference(Paquete.class, id);
                paquete.getNom();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The paquete with id " + id + " no longer exists.", enfe);
            }
            List<Actividad> acts = paquete.getActs();
            for (Actividad actsActividad : acts) {
                actsActividad.getPaquetes().remove(paquete);
                actsActividad = em.merge(actsActividad);
            }
            em.remove(paquete);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Paquete> findPaqueteEntities() {
        return findPaqueteEntities(true, -1, -1);
    }

    public List<Paquete> findPaqueteEntities(int maxResults, int firstResult) {
        return findPaqueteEntities(false, maxResults, firstResult);
    }

    private List<Paquete> findPaqueteEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Paquete.class));
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

    public Paquete findPaquete(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Paquete.class, id);
        } finally {
            em.close();
        }
    }

    public int getPaqueteCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Paquete> rt = cq.from(Paquete.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
