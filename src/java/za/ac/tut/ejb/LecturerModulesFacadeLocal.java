/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.LecturerModules;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Local
public interface LecturerModulesFacadeLocal {

    void create(LecturerModules lecturerModules);

    void edit(LecturerModules lecturerModules);

    void remove(LecturerModules lecturerModules);

    LecturerModules find(Object id);

    List<LecturerModules> findAll();

    List<LecturerModules> findRange(int[] range);

    int count();
    
}
