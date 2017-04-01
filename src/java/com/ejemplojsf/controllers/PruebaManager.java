/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ejemplojsf.controllers;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author APRENDIZ
 */
@Named(value = "pmb")
@ViewScoped
public class PruebaManager implements Serializable {
    
    private Long documento;
    private String clave;
    private String mensaje;

    public PruebaManager() {
    }

    public PruebaManager(String clave) {
        this.clave = clave;
    }
    
    @PostConstruct
    public void init (){
    this.documento = 3456789L;
        System.out.println("Paso por el post Constructor");
    }

    public Long getDocumento() {
        return documento;
    }

    public String getClave() {
        return clave;
    }

    public void setDocumento(Long documento) {
        this.documento = documento;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getMensaje() {
        return mensaje;
    }
    
    public void con(){
        
        System.out.println("Valor que esta imprimiendo: ");
        System.out.println("Documento:" + this.documento);
        System.out.println("Clave:" +  this.clave);
    
    }
    
    public void validacionUsuario(){
        
        if (documento != null && clave.equals("") && clave == null) {
            
        } else {
        
            
        }
    
    }
    
    
    
    
}
