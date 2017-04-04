/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.facades;

import com.mapris.modelo.entities.RutinaServicio;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ruben
 */
@Local
public interface RutinaServicioFacadeLocal {

    void create(RutinaServicio rutinaServicio);

    void edit(RutinaServicio rutinaServicio);

    void remove(RutinaServicio rutinaServicio);

    RutinaServicio find(Object id);

    List<RutinaServicio> findAll();

    List<RutinaServicio> findRange(int[] range);

    int count();
    
}
