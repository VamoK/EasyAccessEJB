/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entities.Notification;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Stateless
public class NotificationFacade extends AbstractFacade<Notification> implements NotificationFacadeLocal {

    @PersistenceContext(unitName = "EasyAccess2EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NotificationFacade() {
        super(Notification.class);
    }

    @Override
    public List<Notification> getGroupNotification(String groupID) {
        Query q = em.createQuery("SELECT n FROM Notification n WHERE n.groupID = :groupID");
        
        q.setParameter("groupID", groupID);
        
        List<Notification> notifications = (List<Notification>) q.getResultList();
        
        return notifications;
    }
    
}
