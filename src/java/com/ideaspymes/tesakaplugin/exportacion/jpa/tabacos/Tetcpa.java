/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author christian.romero
 */
@Entity
@Table(name = "TETCPA")
@NamedQueries({
    @NamedQuery(name = "Tetcpa.findAll", query = "SELECT t FROM Tetcpa t")})
public class Tetcpa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeCPaCod")
    private Short teCPaCod;
    @Size(max = 40)
    @Column(name = "TeCPaDes")
    private String teCPaDes;
    @Column(name = "TeCPaPagPrv")
    private Character teCPaPagPrv;
    @Column(name = "TeCPaTpoOpe")
    private Character teCPaTpoOpe;
    @OneToMany(mappedBy = "teCPaCod")
    private List<Tetopg> tetopgList;

    public Tetcpa() {
    }

    public Tetcpa(Short teCPaCod) {
        this.teCPaCod = teCPaCod;
    }

    public Short getTeCPaCod() {
        return teCPaCod;
    }

    public void setTeCPaCod(Short teCPaCod) {
        this.teCPaCod = teCPaCod;
    }

    public String getTeCPaDes() {
        return teCPaDes;
    }

    public void setTeCPaDes(String teCPaDes) {
        this.teCPaDes = teCPaDes;
    }

    public Character getTeCPaPagPrv() {
        return teCPaPagPrv;
    }

    public void setTeCPaPagPrv(Character teCPaPagPrv) {
        this.teCPaPagPrv = teCPaPagPrv;
    }

    public Character getTeCPaTpoOpe() {
        return teCPaTpoOpe;
    }

    public void setTeCPaTpoOpe(Character teCPaTpoOpe) {
        this.teCPaTpoOpe = teCPaTpoOpe;
    }

    public List<Tetopg> getTetopgList() {
        return tetopgList;
    }

    public void setTetopgList(List<Tetopg> tetopgList) {
        this.tetopgList = tetopgList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (teCPaCod != null ? teCPaCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tetcpa)) {
            return false;
        }
        Tetcpa other = (Tetcpa) object;
        if ((this.teCPaCod == null && other.teCPaCod != null) || (this.teCPaCod != null && !this.teCPaCod.equals(other.teCPaCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.Tetcpa[ teCPaCod=" + teCPaCod + " ]";
    }
    
}
