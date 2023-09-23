/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Subject;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Local
public interface SubjectFacadeLocal {

    void create(Subject subject);

    void edit(Subject subject);

    void remove(Subject subject);

    Subject find(Object id);

    List<Subject> findAll();

    List<Subject> findRange(int[] range);

    int count();
    
}
