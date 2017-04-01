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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "rutinaservicios")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RutinaServicio.findAll", query = "SELECT r FROM RutinaServicio r")
    , @NamedQuery(name = "RutinaServicio.findByIdRutinaServicios", query = "SELECT r FROM RutinaServicio r WHERE r.idRutinaServicios = :idRutinaServicios")})
public class RutinaServicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRutinaServicios")
    private Integer idRutinaServicios;
    @JoinColumn(name = "idRutinas", referencedColumnName = "idRutinas")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Rutina idRutinas;
    @JoinColumn(name = "idServicios", referencedColumnName = "idServicio")
    @ManyToOne(fetch = FetchType.EAGER)
    private Servicio idServicios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRutinaServicios", fetch = FetchType.EAGER)
    private List<Programa> programaList;

    public RutinaServicio() {
    }

    public RutinaServicio(Integer idRutinaServicios) {
        this.idRutinaServicios = idRutinaServicios;
    }

    public Integer getIdRutinaServicios() {
        return idRutinaServicios;
    }

    public void setIdRutinaServicios(Integer idRutinaServicios) {
        this.idRutinaServicios = idRutinaServicios;
    }

    public Rutina getIdRutinas() {
        return idRutinas;
    }

    public void setIdRutinas(Rutina idRutinas) {
        this.idRutinas = idRutinas;
    }

    public Servicio getIdServicios() {
        return idServicios;
    }

    public void setIdServicios(Servicio idServicios) {
        this.idServicios = idServicios;
    }

    @XmlTransient
    public List<Programa> getProgramaList() {
        return programaList;
    }

    public void setProgramaList(List<Programa> programaList) {
        this.programaList = programaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRutinaServicios != null ? idRutinaServicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RutinaServicio)) {
            return false;
        }
        RutinaServicio other = (RutinaServicio) object;
        if ((this.idRutinaServicios == null && other.idRutinaServicios != null) || (this.idRutinaServicios != null && !this.idRutinaServicios.equals(other.idRutinaServicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mapris.modelo.entities.RutinaServicio[ idRutinaServicios=" + idRutinaServicios + " ]";
    }
    
}
