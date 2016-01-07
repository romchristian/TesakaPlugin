/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "CMTTCO")
@NamedQueries({
    @NamedQuery(name = "Cmttco.findAll", query = "SELECT c FROM Cmttco c")})
public class Cmttco implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmTCoCod")
    private Short cmTCoCod;
    @Size(max = 30)
    @Column(name = "CmTCoDsc")
    private String cmTCoDsc;
    @Column(name = "CmTCoTpoMov")
    private Short cmTCoTpoMov;
    @Column(name = "CmTCoNroIni")
    private Short cmTCoNroIni;
    @Column(name = "CmTCoNroFin")
    private Short cmTCoNroFin;
    @Column(name = "CmTCoPrxNum")
    private Short cmTCoPrxNum;
    @Column(name = "CmTCoTpoFct")
    private Character cmTCoTpoFct;
    @Column(name = "CmTCoEdiNum")
    private Character cmTCoEdiNum;
    @Column(name = "CmTCoTipDocHec")
    private Short cmTCoTipDocHec;
    @Column(name = "CmTCoTieTim")
    private Character cmTCoTieTim;
    @Column(name = "CmTCoTipDocTesaka")
    private Short cmTCoTipDocTesaka;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmttco")
    private List<Cmtcom> cmtcomList;

    public Cmttco() {
    }

    public Cmttco(Short cmTCoCod) {
        this.cmTCoCod = cmTCoCod;
    }

    public Short getCmTCoCod() {
        return cmTCoCod;
    }

    public void setCmTCoCod(Short cmTCoCod) {
        this.cmTCoCod = cmTCoCod;
    }

    public String getCmTCoDsc() {
        return cmTCoDsc;
    }

    public void setCmTCoDsc(String cmTCoDsc) {
        this.cmTCoDsc = cmTCoDsc;
    }

    public Short getCmTCoTpoMov() {
        return cmTCoTpoMov;
    }

    public void setCmTCoTpoMov(Short cmTCoTpoMov) {
        this.cmTCoTpoMov = cmTCoTpoMov;
    }

    public Short getCmTCoNroIni() {
        return cmTCoNroIni;
    }

    public void setCmTCoNroIni(Short cmTCoNroIni) {
        this.cmTCoNroIni = cmTCoNroIni;
    }

    public Short getCmTCoNroFin() {
        return cmTCoNroFin;
    }

    public void setCmTCoNroFin(Short cmTCoNroFin) {
        this.cmTCoNroFin = cmTCoNroFin;
    }

    public Short getCmTCoPrxNum() {
        return cmTCoPrxNum;
    }

    public void setCmTCoPrxNum(Short cmTCoPrxNum) {
        this.cmTCoPrxNum = cmTCoPrxNum;
    }

    public Character getCmTCoTpoFct() {
        return cmTCoTpoFct;
    }

    public void setCmTCoTpoFct(Character cmTCoTpoFct) {
        this.cmTCoTpoFct = cmTCoTpoFct;
    }

    public Character getCmTCoEdiNum() {
        return cmTCoEdiNum;
    }

    public void setCmTCoEdiNum(Character cmTCoEdiNum) {
        this.cmTCoEdiNum = cmTCoEdiNum;
    }

    public Short getCmTCoTipDocHec() {
        return cmTCoTipDocHec;
    }

    public void setCmTCoTipDocHec(Short cmTCoTipDocHec) {
        this.cmTCoTipDocHec = cmTCoTipDocHec;
    }

    public Character getCmTCoTieTim() {
        return cmTCoTieTim;
    }

    public void setCmTCoTieTim(Character cmTCoTieTim) {
        this.cmTCoTieTim = cmTCoTieTim;
    }

    public Short getCmTCoTipDocTesaka() {
        return cmTCoTipDocTesaka;
    }

    public void setCmTCoTipDocTesaka(Short cmTCoTipDocTesaka) {
        this.cmTCoTipDocTesaka = cmTCoTipDocTesaka;
    }

    public List<Cmtcom> getCmtcomList() {
        return cmtcomList;
    }

    public void setCmtcomList(List<Cmtcom> cmtcomList) {
        this.cmtcomList = cmtcomList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmTCoCod != null ? cmTCoCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmttco)) {
            return false;
        }
        Cmttco other = (Cmttco) object;
        if ((this.cmTCoCod == null && other.cmTCoCod != null) || (this.cmTCoCod != null && !this.cmTCoCod.equals(other.cmTCoCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.Cmttco[ cmTCoCod=" + cmTCoCod + " ]";
    }
    
}
