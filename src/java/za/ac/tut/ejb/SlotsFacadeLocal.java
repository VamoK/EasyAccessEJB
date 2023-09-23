/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Slots;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Local
public interface SlotsFacadeLocal {

    void create(Slots slots);

    void edit(Slots slots);

    void remove(Slots slots);

    Slots find(Object id);

    List<Slots> findAll();

    List<Slots> findRange(int[] range);

    int count();
    
}
