/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Lecturer;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Stateless
public class LecturerFacade extends AbstractFacade<Lecturer> implements LecturerFacadeLocal {

    @PersistenceContext(unitName = "EasyAccess2EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LecturerFacade() {
        super(Lecturer.class);
    }

    @Override
    public Lecturer login(Long id, String password) {
        Query q = em.createQuery("SELECT l FROM Lecturer l WHERE l.id = :id AND l.password = :password");
        q.setParameter("password", password);
        q.setParameter("id", id);
        
        Lecturer l = (Lecturer) q.getSingleResult();
        
        return l;
    }
    
}
