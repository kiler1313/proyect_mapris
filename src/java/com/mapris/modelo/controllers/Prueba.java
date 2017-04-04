/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.controllers;


import com.mapris.modelo.entities.Usuario;
import com.mapris.modelo.facades.ClienteFacadeLocal;
import com.mapris.modelo.facades.UsuarioFacadeLocal;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Ruben
 */
@Named(value = "prueba")
@SessionScoped
public class Prueba implements Serializable {
    
    @EJB
    private UsuarioFacadeLocal ufl;
    
    private Long idCliente;
    private Usuario u ;
    private Date fecha;
    
    
    /**
     * Creates a new instance of Prueba
     */
      
    public Prueba() {
       
        this.u = new Usuario();
       
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
    
    public List<Usuario> getBuscarTodos() {
        return ufl.findAll();
    }
    
    public String añadir(){
    
    
    ufl.create(u);
    u = new Usuario();
    return "newjsf.xhtml";
    }
    public void eliminar(Usuario u){
        
        ufl.remove(u);
        
    }
}
