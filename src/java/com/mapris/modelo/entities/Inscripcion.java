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
@Table(name = "inscripciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Inscripcion.findAll", query = "SELECT i FROM Inscripcion i")
    , @NamedQuery(name = "Inscripcion.findByIdInscripciones", query = "SELECT i FROM Inscripcion i WHERE i.idInscripciones = :idInscripciones")
    , @NamedQuery(name = "Inscripcion.findByFechaInicio", query = "SELECT i FROM Inscripcion i WHERE i.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Inscripcion.findByFechaFin", query = "SELECT i FROM Inscripcion i WHERE i.fechaFin = :fechaFin")
    , @NamedQuery(name = "Inscripcion.findByValor", query = "SELECT i FROM Inscripcion i WHERE i.valor = :valor")})
public class Inscripcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idInscripciones")
    private Integer idInscripciones;
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "valor")
    private Integer valor;
    @JoinColumn(name = "idPrograma", referencedColumnName = "idProgramas")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Programa idPrograma;
    @JoinColumn(name = "idCliente", referencedColumnName = "idClientes")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Cliente idCliente;

    public Inscripcion() {
    }

    public Inscripcion(Integer idInscripciones) {
        this.idInscripciones = idInscripciones;
    }

    public Integer getIdInscripciones() {
        return idInscripciones;
    }

    public void setIdInscripciones(Integer idInscripciones) {
        this.idInscripciones = idInscripciones;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Programa getIdPrograma() {
        return idPrograma;
    }

    public void setIdPrograma(Programa idPrograma) {
        this.idPrograma = idPrograma;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idInscripciones != null ? idInscripciones.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Inscripcion)) {
            return false;
        }
        Inscripcion other = (Inscripcion) object;
        if ((this.idInscripciones == null && other.idInscripciones != null) || (this.idInscripciones != null && !this.idInscripciones.equals(other.idInscripciones))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "idInscripciones=" + idInscripciones + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", valor=" + valor + ", idPrograma=" + idPrograma + '}';
    }

    
    
}
