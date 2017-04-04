/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.facades;

import com.mapris.modelo.entities.DatoClinico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ruben
 */
@Local
public interface DatoClinicoFacadeLocal {

    void create(DatoClinico datoClinico);

    void edit(DatoClinico datoClinico);

    void remove(DatoClinico datoClinico);

    DatoClinico find(Object id);

    List<DatoClinico> findAll();

    List<DatoClinico> findRange(int[] range);

    int count();
    
}
