/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.facades;

import com.mapris.modelo.entities.Rutina;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ruben
 */
@Local
public interface RutinaFacadeLocal {

    void create(Rutina rutina);

    void edit(Rutina rutina);

    void remove(Rutina rutina);

    Rutina find(Object id);

    List<Rutina> findAll();

    List<Rutina> findRange(int[] range);

    int count();
    
}
