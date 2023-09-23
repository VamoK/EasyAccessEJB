/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Lecturer;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Local
public interface LecturerFacadeLocal {

    void create(Lecturer lecturer);

    void edit(Lecturer lecturer);

    void remove(Lecturer lecturer);

    Lecturer find(Object id);
    
    Lecturer login(Long id, String password);

    List<Lecturer> findAll();

    List<Lecturer> findRange(int[] range);

    int count();
    
}
