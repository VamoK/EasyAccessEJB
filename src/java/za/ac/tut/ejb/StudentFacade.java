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
import za.ac.tut.entities.Student;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "EasyAccess2EJBPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public Student login(Long id, String password) {
        Query q = em.createQuery("SELECT s FROM Student s WHERE s.id = :id AND s.password = :password");
        
        q.setParameter("id", id);
        q.setParameter("password", password);
        
        Student student = (Student) q.getSingleResult();
        
        return student;
    }

    @Override
    public List<Student> classList(String groupID) {
        Query q = em.createQuery("SELECT s FROM Student s WHERE s.groupID = :groupID");
        q.setParameter("groupID", groupID);
        
        List<Student> classList = (List<Student>)q.getResultList();
        
        return classList;
    }
    
}
