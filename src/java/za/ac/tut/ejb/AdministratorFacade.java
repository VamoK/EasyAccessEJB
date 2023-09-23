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
import za.ac.tut.entities.Administrator;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Stateless
public class AdministratorFacade extends AbstractFacade<Administrator> implements AdministratorFacadeLocal {

    @PersistenceContext(unitName = "EasyAccess2EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministratorFacade() {
        super(Administrator.class);
    }

    @Override
    public Administrator login(Long id, String password) {
        Query q = em.createQuery("SELECT a FROM Administrator a WHERE a.id = :id AND a.password = :password");
        q.setParameter("password", password);
        q.setParameter("id", id);
        
        Administrator admin =(Administrator) q.getSingleResult();
        return admin;
    }
    
}
