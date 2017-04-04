/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ruben
 */
@Entity
@Table(name = "personalmedico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonalMedico.findAll", query = "SELECT p FROM PersonalMedico p")
    , @NamedQuery(name = "PersonalMedico.findByIdPersonalMedico", query = "SELECT p FROM PersonalMedico p WHERE p.idPersonalMedico = :idPersonalMedico")
    , @NamedQuery(name = "PersonalMedico.findByPerfilProfesional", query = "SELECT p FROM PersonalMedico p WHERE p.perfilProfesional = :perfilProfesional")
    , @NamedQuery(name = "PersonalMedico.findByCargo", query = "SELECT p FROM PersonalMedico p WHERE p.cargo = :cargo")})
public class PersonalMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
 
    @Column(name = "idPersonalMedico")
    private Long idPersonalMedico;
    @Basic(optional = false)
    
    @Column(name = "perfilProfesional")
    private String perfilProfesional;
    @Basic(optional = false)
    
    @Column(name = "cargo")
    private String cargo;
    @OneToMany(mappedBy = "idPersonalMedico", fetch = FetchType.EAGER)
    private List<Sesion> sesionList;
    @JoinColumn(name = "idPersonalMedico", referencedColumnName = "cedula", insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.EAGER)
    private Usuario usuario;

    public PersonalMedico() {
    }

    public PersonalMedico(Long idPersonalMedico) {
        this.idPersonalMedico = idPersonalMedico;
    }

    public PersonalMedico(Long idPersonalMedico, String perfilProfesional, String cargo) {
        this.idPersonalMedico = idPersonalMedico;
        this.perfilProfesional = perfilProfesional;
        this.cargo = cargo;
    }

    public Long getIdPersonalMedico() {
        return idPersonalMedico;
    }

    public void setIdPersonalMedico(Long idPersonalMedico) {
        this.idPersonalMedico = idPersonalMedico;
    }

    public String getPerfilProfesional() {
        return perfilProfesional;
    }

    public void setPerfilProfesional(String perfilProfesional) {
        this.perfilProfesional = perfilProfesional;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @XmlTransient
    public List<Sesion> getSesionList() {
        return sesionList;
    }

    public void setSesionList(List<Sesion> sesionList) {
        this.sesionList = sesionList;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersonalMedico != null ? idPersonalMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonalMedico)) {
            return false;
        }
        PersonalMedico other = (PersonalMedico) object;
        if ((this.idPersonalMedico == null && other.idPersonalMedico != null) || (this.idPersonalMedico != null && !this.idPersonalMedico.equals(other.idPersonalMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PersonalMedico{" + "idPersonalMedico=" + idPersonalMedico + ", perfilProfesional=" + perfilProfesional + ", cargo=" + cargo + ", sesionList=" + sesionList + '}';
    }

  

    
    
}
