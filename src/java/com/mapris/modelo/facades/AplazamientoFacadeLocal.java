/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.facades;

import com.mapris.modelo.entities.Aplazamiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ruben
 */
@Local
public interface AplazamientoFacadeLocal {

    void create(Aplazamiento aplazamiento);

    void edit(Aplazamiento aplazamiento);

    void remove(Aplazamiento aplazamiento);

    Aplazamiento find(Object id);

    List<Aplazamiento> findAll();

    List<Aplazamiento> findRange(int[] range);

    int count();
    
}
