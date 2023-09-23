/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.entities.Timetable;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Stateless
public class TimetableFacade extends AbstractFacade<Timetable> implements TimetableFacadeLocal {

    @PersistenceContext(unitName = "EasyAccess2EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TimetableFacade() {
        super(Timetable.class);
    }
    
}
