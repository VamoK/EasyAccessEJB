/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.ejb;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entities.Timetable;

/**
 *
 * @author Vamokuhle Khumalo
 */
@Local
public interface TimetableFacadeLocal {

    void create(Timetable timetable);

    void edit(Timetable timetable);

    void remove(Timetable timetable);

    Timetable find(Object id);

    List<Timetable> findAll();

    List<Timetable> findRange(int[] range);

    int count();
    
}
