/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.controllers;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author APRENDIZ
 */
@Named(value = "omb")
@ViewScoped
public class OtroManagerBeans implements Serializable {
    
    private String nombreRol;
    private Date hoy;

    /**
     * Creates a new instance of OtroManagerBeans
     */
    public OtroManagerBeans() {
        this.hoy= new Date();
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public Date getHoy() {
        return hoy;
    }
    
    
}
