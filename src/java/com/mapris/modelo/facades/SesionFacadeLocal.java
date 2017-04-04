/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.facades;

import com.mapris.modelo.entities.Sesion;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ruben
 */
@Local
public interface SesionFacadeLocal {

    void create(Sesion sesion);

    void edit(Sesion sesion);

    void remove(Sesion sesion);

    Sesion find(Object id);

    List<Sesion> findAll();

    List<Sesion> findRange(int[] range);

    int count();
    
}
