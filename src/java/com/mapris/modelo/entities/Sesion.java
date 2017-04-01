/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mapris.modelo.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ruben
 */
@Entity
@Table(name = "sesiones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sesion.findAll", query = "SELECT s FROM Sesion s")
    , @NamedQuery(name = "Sesion.findByIdSesiones", query = "SELECT s FROM Sesion s WHERE s.idSesiones = :idSesiones")
    , @NamedQuery(name = "Sesion.findByFecha", query = "SELECT s FROM Sesion s WHERE s.fecha = :fecha")
    , @NamedQuery(name = "Sesion.findByHora", query = "SELECT s FROM Sesion s WHERE s.hora = :hora")
    , @NamedQuery(name = "Sesion.findByNumeroSesiones", query = "SELECT s FROM Sesion s WHERE s.numeroSesiones = :numeroSesiones")})
public class Sesion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSesiones")
    private Integer idSesiones;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "hora")
    @Temporal(TemporalType.TIME)
    private Date hora;
    @Column(name = "numeroSesiones")
    private Integer numeroSesiones;
    @JoinColumn(name = "idPersonal Medico", referencedColumnName = "idPersonalMedico")
    @ManyToOne(fetch = FetchType.EAGER)
    private PersonalMedico idPersonalMedico;
    @JoinColumn(name = "idPrograma", referencedColumnName = "idProgramas")
    @ManyToOne(fetch = FetchType.EAGER)
    private Programa idPrograma;

    public Sesion() {
    }

    public Sesion(Integer idSesiones) {
        this.idSesiones = idSesiones;
    }

    public Integer getIdSesiones() {
        return idSesiones;
    }

    public void setIdSesiones(Integer idSesiones) {
        this.idSesiones = idSesiones;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Integer getNumeroSesiones() {
        return numeroSesiones;
    }

    public void setNumeroSesiones(Integer numeroSesiones) {
        this.numeroSesiones = numeroSesiones;
    }

    public PersonalMedico getIdPersonalMedico() {
        return idPersonalMedico;
    }

    public void setIdPersonalMedico(PersonalMedico idPersonalMedico) {
        this.idPersonalMedico = idPersonalMedico;
    }

    public Programa getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Programa idPrograma) {
        this.idPrograma = idPrograma;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSesiones != null ? idSesiones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sesion)) {
            return false;
        }
        Sesion other = (Sesion) object;
        if ((this.idSesiones == null && other.idSesiones != null) || (this.idSesiones != null && !this.idSesiones.equals(other.idSesiones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mapris.modelo.entities.Sesion[ idSesiones=" + idSesiones + " ]";
    }
    
}
