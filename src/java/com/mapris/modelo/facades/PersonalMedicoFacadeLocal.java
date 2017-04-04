/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.facades;

import com.mapris.modelo.entities.PersonalMedico;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Ruben
 */
@Local
public interface PersonalMedicoFacadeLocal {

    void create(PersonalMedico personalMedico);

    void edit(PersonalMedico personalMedico);

    void remove(PersonalMedico personalMedico);

    PersonalMedico find(Object id);

    List<PersonalMedico> findAll();

    List<PersonalMedico> findRange(int[] range);

    int count();
    
}
