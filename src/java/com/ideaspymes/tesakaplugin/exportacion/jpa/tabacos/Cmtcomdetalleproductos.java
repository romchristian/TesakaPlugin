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
 * @author christian.romero
 */
@Entity
@Table(name = "CMTCOMDETALLEPRODUCTOS")
@NamedQueries({
    @NamedQuery(name = "Cmtcomdetalleproductos.findAll", query = "SELECT c FROM Cmtcomdetalleproductos c")})
public class Cmtcomdetalleproductos implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CmtcomdetalleproductosPK cmtcomdetalleproductosPK;
    @Size(max = 15)
    @Column(name = "CmDetProProCod")
    private String cmDetProProCod;
    @Size(max = 50)
    @Column(name = "CmDetProProDes")
    private String cmDetProProDes;
    @Column(name = "CmDetProUniMedCod")
    private Short cmDetProUniMedCod;
    @Size(max = 50)
    @Column(name = "CmDetProUniMedDes")
    private String cmDetProUniMedDes;
    @Column(name = "CmDetProCan")
    private BigDecimal cmDetProCan;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CmDetProPre")
    private BigDecimal cmDetProPre;
    @Column(name = "CmDetProPorIVA")
    private BigDecimal cmDetProPorIVA;
    @Column(name = "CmDetProValVen")
    private BigDecimal cmDetProValVen;
    @Column(name = "CmDetProCos")
    private BigDecimal cmDetProCos;
    @Column(name = "CmDetProComStockNum")
    private Integer cmDetProComStockNum;
    @Column(name = "CmDetProProcesado")
    private Character cmDetProProcesado;
    @JoinColumns({
        @JoinColumn(name = "CmPrvCod", referencedColumnName = "CmPrvCod", insertable = false, updatable = false),
        @JoinColumn(name = "CmComSucPrv", referencedColumnName = "CmComSucPrv", insertable = false, updatable = false),
        @JoinColumn(name = "CmComPunExp", referencedColumnName = "CmComPunExp", insertable = false, updatable = false),
        @JoinColumn(name = "CmComNum", referencedColumnName = "CmComNum", insertable = false, updatable = false),
        @JoinColumn(name = "CmTCoCod", referencedColumnName = "CmTCoCod", insertable = false, updatable = false),
        @JoinColumn(name = "CmComTimNum", referencedColumnName = "CmComTimNum", insertable = false, updatable = false)})
    
    @ManyToOne
    private Cmtcom cmtcom;

    public Cmtcomdetalleproductos() {
    }

    public Cmtcomdetalleproductos(CmtcomdetalleproductosPK cmtcomdetalleproductosPK) {
        this.cmtcomdetalleproductosPK = cmtcomdetalleproductosPK;
    }

    public Cmtcomdetalleproductos(short cmPrvCod, short cmComSucPrv, short cmComPunExp, int cmComNum, short cmTCoCod, int cmComTimNum, short cmDetProItm) {
        this.cmtcomdetalleproductosPK = new CmtcomdetalleproductosPK(cmPrvCod, cmComSucPrv, cmComPunExp, cmComNum, cmTCoCod, cmComTimNum, cmDetProItm);
    }

    public CmtcomdetalleproductosPK getCmtcomdetalleproductosPK() {
        return cmtcomdetalleproductosPK;
    }

    public void setCmtcomdetalleproductosPK(CmtcomdetalleproductosPK cmtcomdetalleproductosPK) {
        this.cmtcomdetalleproductosPK = cmtcomdetalleproductosPK;
    }

    public String getCmDetProProCod() {
        return cmDetProProCod;
    }

    public void setCmDetProProCod(String cmDetProProCod) {
        this.cmDetProProCod = cmDetProProCod;
    }

    public String getCmDetProProDes() {
        return cmDetProProDes;
    }

    public void setCmDetProProDes(String cmDetProProDes) {
        this.cmDetProProDes = cmDetProProDes;
    }

    public Short getCmDetProUniMedCod() {
        return cmDetProUniMedCod;
    }

    public void setCmDetProUniMedCod(Short cmDetProUniMedCod) {
        this.cmDetProUniMedCod = cmDetProUniMedCod;
    }

    public String getCmDetProUniMedDes() {
        return cmDetProUniMedDes;
    }

    public void setCmDetProUniMedDes(String cmDetProUniMedDes) {
        this.cmDetProUniMedDes = cmDetProUniMedDes;
    }

    public BigDecimal getCmDetProCan() {
        return cmDetProCan;
    }

    public void setCmDetProCan(BigDecimal cmDetProCan) {
        this.cmDetProCan = cmDetProCan;
    }

    public BigDecimal getCmDetProPre() {
        return cmDetProPre;
    }

    public void setCmDetProPre(BigDecimal cmDetProPre) {
        this.cmDetProPre = cmDetProPre;
    }

    public BigDecimal getCmDetProPorIVA() {
        return cmDetProPorIVA;
    }

    public void setCmDetProPorIVA(BigDecimal cmDetProPorIVA) {
        this.cmDetProPorIVA = cmDetProPorIVA;
    }

    public BigDecimal getCmDetProValVen() {
        return cmDetProValVen;
    }

    public void setCmDetProValVen(BigDecimal cmDetProValVen) {
        this.cmDetProValVen = cmDetProValVen;
    }

    public BigDecimal getCmDetProCos() {
        return cmDetProCos;
    }

    public void setCmDetProCos(BigDecimal cmDetProCos) {
        this.cmDetProCos = cmDetProCos;
    }

    public Integer getCmDetProComStockNum() {
        return cmDetProComStockNum;
    }

    public void setCmDetProComStockNum(Integer cmDetProComStockNum) {
        this.cmDetProComStockNum = cmDetProComStockNum;
    }

    public Character getCmDetProProcesado() {
        return cmDetProProcesado;
    }

    public void setCmDetProProcesado(Character cmDetProProcesado) {
        this.cmDetProProcesado = cmDetProProcesado;
    }

    public Cmtcom getCmtcom() {
        return cmtcom;
    }

    public void setCmtcom(Cmtcom cmtcom) {
        this.cmtcom = cmtcom;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmtcomdetalleproductosPK != null ? cmtcomdetalleproductosPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmtcomdetalleproductos)) {
            return false;
        }
        Cmtcomdetalleproductos other = (Cmtcomdetalleproductos) object;
        if ((this.cmtcomdetalleproductosPK == null && other.cmtcomdetalleproductosPK != null) || (this.cmtcomdetalleproductosPK != null && !this.cmtcomdetalleproductosPK.equals(other.cmtcomdetalleproductosPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.Cmtcomdetalleproductos[ cmtcomdetalleproductosPK=" + cmtcomdetalleproductosPK + " ]";
    }
    
}
