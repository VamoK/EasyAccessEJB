/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Administrator;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Local
public interface AdministratorFacadeLocal {

    void create(Administrator administrator);

    void edit(Administrator administrator);

    void remove(Administrator administrator);

    Administrator find(Object id);
    
    Administrator login(Long id , String password);

    List<Administrator> findAll();

    List<Administrator> findRange(int[] range);

    int count();
    
}
