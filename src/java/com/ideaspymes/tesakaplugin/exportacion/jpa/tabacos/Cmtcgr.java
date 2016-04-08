/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author margarita.caballero
 */
@Entity
@Table(name = "CMTCGR")
@NamedQueries({
    @NamedQuery(name = "Cmtcgr.findAll", query = "SELECT c FROM Cmtcgr c")})
public class Cmtcgr implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CmtcgrPK cmtcgrPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CmCGrPrcIVA")
    private BigDecimal cmCGrPrcIVA;
    @Column(name = "CmCGrImp")
    private BigDecimal cmCGrImp;
    @Column(name = "CmCGrImpIVA")
    private BigDecimal cmCGrImpIVA;
    @Column(name = "CmCGrImpDes")
    private BigDecimal cmCGrImpDes;
    @Column(name = "CmCGrImpConDes")
    private BigDecimal cmCGrImpConDes;
    @Size(max = 40)
    @Column(name = "CmCGrDesDsc")
    private String cmCGrDesDsc;
    @Column(name = "CmCGrImpIVAAux")
    private BigDecimal cmCGrImpIVAAux;
    @Column(name = "CmCGrSal")
    private BigDecimal cmCGrSal;
    
    @JoinColumns({
        @JoinColumn(name = "CmPrvCod", referencedColumnName = "CmPrvCod", insertable = false, updatable = false),
        @JoinColumn(name = "CmComSucPrv", referencedColumnName = "CmComSucPrv", insertable = false, updatable = false),
        @JoinColumn(name = "CmComPunExp", referencedColumnName = "CmComPunExp", insertable = false, updatable = false),
        @JoinColumn(name = "CmComNum", referencedColumnName = "CmComNum", insertable = false, updatable = false),
        @JoinColumn(name = "CmTCoCod", referencedColumnName = "CmTCoCod", insertable = false, updatable = false),
        @JoinColumn(name = "CmComTimNum", referencedColumnName = "CmComTimNum", insertable = false, updatable = false)})
    @ManyToOne
    private Cmtcom cmtcom;

    public Cmtcgr() {
    }

    public Cmtcgr(CmtcgrPK cmtcgrPK) {
        this.cmtcgrPK = cmtcgrPK;
    }

    public Cmtcgr(short cmPrvCod, short cmComSucPrv, short cmComPunExp, int cmComNum, short cmTCoCod, int cmComTimNum, short cmCGrItm) {
        this.cmtcgrPK = new CmtcgrPK(cmPrvCod, cmComSucPrv, cmComPunExp, cmComNum, cmTCoCod, cmComTimNum, cmCGrItm);
    }

    public CmtcgrPK getCmtcgrPK() {
        return cmtcgrPK;
    }

    public void setCmtcgrPK(CmtcgrPK cmtcgrPK) {
        this.cmtcgrPK = cmtcgrPK;
    }

    public BigDecimal getCmCGrPrcIVA() {
        return cmCGrPrcIVA;
    }

    public void setCmCGrPrcIVA(BigDecimal cmCGrPrcIVA) {
        this.cmCGrPrcIVA = cmCGrPrcIVA;
    }

    public BigDecimal getCmCGrImp() {
        return cmCGrImp;
    }

    public void setCmCGrImp(BigDecimal cmCGrImp) {
        this.cmCGrImp = cmCGrImp;
    }

    public BigDecimal getCmCGrImpIVA() {
        return cmCGrImpIVA;
    }

    public void setCmCGrImpIVA(BigDecimal cmCGrImpIVA) {
        this.cmCGrImpIVA = cmCGrImpIVA;
    }

    public BigDecimal getCmCGrImpDes() {
        return cmCGrImpDes;
    }

    public void setCmCGrImpDes(BigDecimal cmCGrImpDes) {
        this.cmCGrImpDes = cmCGrImpDes;
    }

    public BigDecimal getCmCGrImpConDes() {
        return cmCGrImpConDes;
    }

    public void setCmCGrImpConDes(BigDecimal cmCGrImpConDes) {
        this.cmCGrImpConDes = cmCGrImpConDes;
    }

    public String getCmCGrDesDsc() {
        return cmCGrDesDsc;
    }

    public void setCmCGrDesDsc(String cmCGrDesDsc) {
        this.cmCGrDesDsc = cmCGrDesDsc;
    }

    public BigDecimal getCmCGrImpIVAAux() {
        return cmCGrImpIVAAux;
    }

    public void setCmCGrImpIVAAux(BigDecimal cmCGrImpIVAAux) {
        this.cmCGrImpIVAAux = cmCGrImpIVAAux;
    }

    public BigDecimal getCmCGrSal() {
        return cmCGrSal;
    }

    public void setCmCGrSal(BigDecimal cmCGrSal) {
        this.cmCGrSal = cmCGrSal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmtcgrPK != null ? cmtcgrPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmtcgr)) {
            return false;
        }
        Cmtcgr other = (Cmtcgr) object;
        if ((this.cmtcgrPK == null && other.cmtcgrPK != null) || (this.cmtcgrPK != null && !this.cmtcgrPK.equals(other.cmtcgrPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Cmtcgr[ cmtcgrPK=" + cmtcgrPK + " ]";
    }
    
}
