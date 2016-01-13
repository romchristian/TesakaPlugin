/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author christian.romero
 */
@Entity
@Table(name = "TETRECRET")
@NamedQueries({
    @NamedQuery(name = "Tetrecret.findAll", query = "SELECT t FROM Tetrecret t")})
public class Tetrecret implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TetrecretPK tetrecretPK;
    @Column(name = "TeRecRetPrvEst")
    private Short teRecRetPrvEst;
    @Column(name = "TeRecRetPrvPunExp")
    private Short teRecRetPrvPunExp;
    @Column(name = "TeRecRetPrvDocNum")
    private Integer teRecRetPrvDocNum;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TeRecRetValTraSinIVA")
    private BigDecimal teRecRetValTraSinIVA;
    @Column(name = "TeRecRetIVAIncTra")
    private BigDecimal teRecRetIVAIncTra;
    @Column(name = "TeRecRetValTotTra")
    private BigDecimal teRecRetValTotTra;
    @Column(name = "TeRecRetPrjIVARet")
    private BigDecimal teRecRetPrjIVARet;
    @Column(name = "TeRecRetImpRet")
    private BigDecimal teRecRetImpRet;
    @Column(name = "TeRecRetTpoDoc")
    private Short teRecRetTpoDoc;
    @Column(name = "TeRecRetOPgNum")
    private Long teRecRetOPgNum;
    @Column(name = "TeRecRetFec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teRecRetFec;
    @Column(name = "TeRecRetEdo")
    private Character teRecRetEdo;
    @Column(name = "TeRecRetUltNumLinDet")
    private Short teRecRetUltNumLinDet;
    @Column(name = "TeRecRetPrvTimbrado")
    private Integer teRecRetPrvTimbrado;
    @Column(name = "TeRecRetImporteRetenidoGs")
    private BigDecimal teRecRetImporteRetenidoGs;
    @Column(name = "TeRecRetValorTotalTranGs")
    private BigDecimal teRecRetValorTotalTranGs;
    @Column(name = "TeRecRetIVAIncluidoGs")
    private BigDecimal teRecRetIVAIncluidoGs;
    @Column(name = "TeRecRetValorTotalSinIVAGs")
    private BigDecimal teRecRetValorTotalSinIVAGs;
    @Column(name = "CmPrvCod")
    private Short cmPrvCod;

    public Tetrecret() {
    }

    public Short getCmPrvCod() {
        return cmPrvCod;
    }

    public void setCmPrvCod(Short cmPrvCod) {
        this.cmPrvCod = cmPrvCod;
    }

    public Tetrecret(TetrecretPK tetrecretPK) {
        this.tetrecretPK = tetrecretPK;
    }

    public Tetrecret(short nuEmpCod, short teRecRetEst, short teRecRetPunExp, int teRecRetNumSec, int teRecRetTimNum) {
        this.tetrecretPK = new TetrecretPK(nuEmpCod, teRecRetEst, teRecRetPunExp, teRecRetNumSec, teRecRetTimNum);
    }

    public TetrecretPK getTetrecretPK() {
        return tetrecretPK;
    }

    public void setTetrecretPK(TetrecretPK tetrecretPK) {
        this.tetrecretPK = tetrecretPK;
    }

    public Short getTeRecRetPrvEst() {
        return teRecRetPrvEst;
    }

    public void setTeRecRetPrvEst(Short teRecRetPrvEst) {
        this.teRecRetPrvEst = teRecRetPrvEst;
    }

    public Short getTeRecRetPrvPunExp() {
        return teRecRetPrvPunExp;
    }

    public void setTeRecRetPrvPunExp(Short teRecRetPrvPunExp) {
        this.teRecRetPrvPunExp = teRecRetPrvPunExp;
    }

    public Integer getTeRecRetPrvDocNum() {
        return teRecRetPrvDocNum;
    }

    public void setTeRecRetPrvDocNum(Integer teRecRetPrvDocNum) {
        this.teRecRetPrvDocNum = teRecRetPrvDocNum;
    }

    public BigDecimal getTeRecRetValTraSinIVA() {
        return teRecRetValTraSinIVA;
    }

    public void setTeRecRetValTraSinIVA(BigDecimal teRecRetValTraSinIVA) {
        this.teRecRetValTraSinIVA = teRecRetValTraSinIVA;
    }

    public BigDecimal getTeRecRetIVAIncTra() {
        return teRecRetIVAIncTra;
    }

    public void setTeRecRetIVAIncTra(BigDecimal teRecRetIVAIncTra) {
        this.teRecRetIVAIncTra = teRecRetIVAIncTra;
    }

    public BigDecimal getTeRecRetValTotTra() {
        return teRecRetValTotTra;
    }

    public void setTeRecRetValTotTra(BigDecimal teRecRetValTotTra) {
        this.teRecRetValTotTra = teRecRetValTotTra;
    }

    public BigDecimal getTeRecRetPrjIVARet() {
        return teRecRetPrjIVARet;
    }

    public void setTeRecRetPrjIVARet(BigDecimal teRecRetPrjIVARet) {
        this.teRecRetPrjIVARet = teRecRetPrjIVARet;
    }

    public BigDecimal getTeRecRetImpRet() {
        return teRecRetImpRet;
    }

    public void setTeRecRetImpRet(BigDecimal teRecRetImpRet) {
        this.teRecRetImpRet = teRecRetImpRet;
    }

    public Short getTeRecRetTpoDoc() {
        return teRecRetTpoDoc;
    }

    public void setTeRecRetTpoDoc(Short teRecRetTpoDoc) {
        this.teRecRetTpoDoc = teRecRetTpoDoc;
    }

    public Long getTeRecRetOPgNum() {
        return teRecRetOPgNum;
    }

    public void setTeRecRetOPgNum(Long teRecRetOPgNum) {
        this.teRecRetOPgNum = teRecRetOPgNum;
    }

    public Date getTeRecRetFec() {
        return teRecRetFec;
    }

    public void setTeRecRetFec(Date teRecRetFec) {
        this.teRecRetFec = teRecRetFec;
    }

    public Character getTeRecRetEdo() {
        return teRecRetEdo;
    }

    public void setTeRecRetEdo(Character teRecRetEdo) {
        this.teRecRetEdo = teRecRetEdo;
    }

    public Short getTeRecRetUltNumLinDet() {
        return teRecRetUltNumLinDet;
    }

    public void setTeRecRetUltNumLinDet(Short teRecRetUltNumLinDet) {
        this.teRecRetUltNumLinDet = teRecRetUltNumLinDet;
    }

    public Integer getTeRecRetPrvTimbrado() {
        return teRecRetPrvTimbrado;
    }

    public void setTeRecRetPrvTimbrado(Integer teRecRetPrvTimbrado) {
        this.teRecRetPrvTimbrado = teRecRetPrvTimbrado;
    }

    public BigDecimal getTeRecRetImporteRetenidoGs() {
        return teRecRetImporteRetenidoGs;
    }

    public void setTeRecRetImporteRetenidoGs(BigDecimal teRecRetImporteRetenidoGs) {
        this.teRecRetImporteRetenidoGs = teRecRetImporteRetenidoGs;
    }

    public BigDecimal getTeRecRetValorTotalTranGs() {
        return teRecRetValorTotalTranGs;
    }

    public void setTeRecRetValorTotalTranGs(BigDecimal teRecRetValorTotalTranGs) {
        this.teRecRetValorTotalTranGs = teRecRetValorTotalTranGs;
    }

    public BigDecimal getTeRecRetIVAIncluidoGs() {
        return teRecRetIVAIncluidoGs;
    }

    public void setTeRecRetIVAIncluidoGs(BigDecimal teRecRetIVAIncluidoGs) {
        this.teRecRetIVAIncluidoGs = teRecRetIVAIncluidoGs;
    }

    public BigDecimal getTeRecRetValorTotalSinIVAGs() {
        return teRecRetValorTotalSinIVAGs;
    }

    public void setTeRecRetValorTotalSinIVAGs(BigDecimal teRecRetValorTotalSinIVAGs) {
        this.teRecRetValorTotalSinIVAGs = teRecRetValorTotalSinIVAGs;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tetrecretPK != null ? tetrecretPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tetrecret)) {
            return false;
        }
        Tetrecret other = (Tetrecret) object;
        if ((this.tetrecretPK == null && other.tetrecretPK != null) || (this.tetrecretPK != null && !this.tetrecretPK.equals(other.tetrecretPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Tetrecret[ tetrecretPK=" + tetrecretPK + " ]";
    }

}
