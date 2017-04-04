/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Ruben
 */
@Entity
@Table(name = "programas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Programa.findAll", query = "SELECT p FROM Programa p")
    , @NamedQuery(name = "Programa.findByIdProgramas", query = "SELECT p FROM Programa p WHERE p.idProgramas = :idProgramas")
    , @NamedQuery(name = "Programa.findByFechaInicio", query = "SELECT p FROM Programa p WHERE p.fechaInicio = :fechaInicio")})
public class Programa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idProgramas")
    private Integer idProgramas;
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @OneToMany(mappedBy = "idPrograma", fetch = FetchType.EAGER)
    private List<Sesion> sesionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPrograma", fetch = FetchType.EAGER)
    private List<Inscripcion> inscripcionList;
    @JoinColumn(name = "idRutinaServicios", referencedColumnName = "idServicios")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private RutinaServicio idRutinaServicios;

    public Programa() {
    }

    public Programa(Integer idProgramas) {
        this.idProgramas = idProgramas;
    }

    public Integer getIdProgramas() {
        return idProgramas;
    }

    public void setIdProgramas(Integer idProgramas) {
        this.idProgramas = idProgramas;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @XmlTransient
    public List<Sesion> getSesionList() {
        return sesionList;
    }

    public void setSesionList(List<Sesion> sesionList) {
        this.sesionList = sesionList;
    }

    @XmlTransient
    public List<Inscripcion> getInscripcionList() {
        return inscripcionList;
    }

    public void setInscripcionList(List<Inscripcion> inscripcionList) {
        this.inscripcionList = inscripcionList;
    }

    public RutinaServicio getIdRutinaServicios() {
        return idRutinaServicios;
    }

    public void setIdRutinaServicios(RutinaServicio idRutinaServicios) {
        this.idRutinaServicios = idRutinaServicios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProgramas != null ? idProgramas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Programa)) {
            return false;
        }
        Programa other = (Programa) object;
        if ((this.idProgramas == null && other.idProgramas != null) || (this.idProgramas != null && !this.idProgramas.equals(other.idProgramas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Programa{" + "idProgramas=" + idProgramas + ", fechaInicio=" + fechaInicio +  '}';
    }

    
    
}
