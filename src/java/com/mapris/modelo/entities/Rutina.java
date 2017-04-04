/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ruben
 */
@Entity
@Table(name = "rutinas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rutina.findAll", query = "SELECT r FROM Rutina r")
    , @NamedQuery(name = "Rutina.findByIdRutinas", query = "SELECT r FROM Rutina r WHERE r.idRutinas = :idRutinas")
    , @NamedQuery(name = "Rutina.findByNombre", query = "SELECT r FROM Rutina r WHERE r.nombre = :nombre")})
public class Rutina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "idRutinas")
    private Integer idRutinas;
    @Basic(optional = false)
   
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRutinas", fetch = FetchType.EAGER)
    private List<RutinaServicio> rutinaServicioList;

    public Rutina() {
    }

    public Rutina(Integer idRutinas) {
        this.idRutinas = idRutinas;
    }

    
    public Rutina(Integer idRutinas, String nombre) {
        this.idRutinas = idRutinas;
        this.nombre = nombre;
    }

    public Integer getIdRutinas() {
        return idRutinas;
    }

    public void setIdRutinas(Integer idRutinas) {
        this.idRutinas = idRutinas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<RutinaServicio> getRutinaServicioList() {
        return rutinaServicioList;
    }

    public void setRutinaServicioList(List<RutinaServicio> rutinaServicioList) {
        this.rutinaServicioList = rutinaServicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRutinas != null ? idRutinas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rutina)) {
            return false;
        }
        Rutina other = (Rutina) object;
        if ((this.idRutinas == null && other.idRutinas != null) || (this.idRutinas != null && !this.idRutinas.equals(other.idRutinas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Rutina{" + "idRutinas=" + idRutinas + ", nombre=" + nombre + ", rutinaServicioList=" + rutinaServicioList + '}';
    }

    
}
