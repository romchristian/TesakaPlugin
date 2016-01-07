/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author christian.romero
 */
@Entity
@Table(name = "TETOPG")
@NamedQueries({
    @NamedQuery(name = "Tetopg.findAll", query = "SELECT t FROM Tetopg t")})
public class Tetopg implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TetopgPK tetopgPK;
    @Column(name = "TeOPgForPag")
    private Character teOPgForPag;
    @Column(name = "TeOPgFchFonFij")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teOPgFchFonFij;
    @Column(name = "TeOPgEmpFonFijCod")
    private Short teOPgEmpFonFijCod;
    @Column(name = "TeOPgSucFonFijCod")
    private Short teOPgSucFonFijCod;
    @Column(name = "TeOPgEmpCod")
    private Short teOPgEmpCod;
    @Column(name = "TeOPgSucCod")
    private Short teOPgSucCod;
    @Column(name = "TeOPgDepCod")
    private Short teOPgDepCod;
    @Column(name = "TeOPgFch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teOPgFch;
    @Size(max = 60)
    @Column(name = "TeOPgBen")
    private String teOPgBen;
    @Size(max = 300)
    @Column(name = "TeOPgEspCon")
    private String teOPgEspCon;
    @Column(name = "TeOPgMndCod")
    private Short teOPgMndCod;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TeOPgCtz")
    private BigDecimal teOPgCtz;
    @Size(max = 20)
    @Column(name = "TeOPgUsuIng")
    private String teOPgUsuIng;
    @Size(max = 8)
    @Column(name = "TeOPgHorIng")
    private String teOPgHorIng;
    @Column(name = "TeOPgFchIng")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teOPgFchIng;
    @Column(name = "TeOPgImpEfe")
    private BigDecimal teOPgImpEfe;
    @Size(max = 300)
    @Column(name = "TeOPgObs")
    private String teOPgObs;
    @Column(name = "TeOPgImpMonLoc")
    private BigDecimal teOPgImpMonLoc;
    @Column(name = "TeOPgImpMonExt")
    private BigDecimal teOPgImpMonExt;
    @Column(name = "TeOPgCheImpTot")
    private BigDecimal teOPgCheImpTot;
    @Column(name = "TeOPgDebImpTot")
    private BigDecimal teOPgDebImpTot;
    @Column(name = "TeOPgTrfImpTot")
    private BigDecimal teOPgTrfImpTot;
    @Column(name = "TeOPgTotPagPrv")
    private BigDecimal teOPgTotPagPrv;
    @Column(name = "TeOPgTotPagFonFij")
    private BigDecimal teOPgTotPagFonFij;
    @Column(name = "TeOPgEst")
    private Character teOPgEst;
    @Column(name = "TeOPgUltItmDetFac")
    private Short teOPgUltItmDetFac;
    @Column(name = "TeOPgUltItmDetChe")
    private Short teOPgUltItmDetChe;
    @Column(name = "TeOPgUltItmDetDeb")
    private Short teOPgUltItmDetDeb;
    @Column(name = "TeOPgUltItmDetTrf")
    private Short teOPgUltItmDetTrf;
    @Column(name = "TeOPgUsuMod")
    private Short teOPgUsuMod;
    @Column(name = "TeOpgUbi")
    private Character teOpgUbi;
    @Column(name = "TeOpgGenAsi")
    private Character teOpgGenAsi;
    @Column(name = "TeOpgAsiNum")
    private Long teOpgAsiNum;
    @Column(name = "TeOpgPerCod")
    private Short teOpgPerCod;
    @Column(name = "TeOPgNumRef")
    private Long teOPgNumRef;
    @Column(name = "TeOPgCueConAntTra")
    private Long teOPgCueConAntTra;
    @Column(name = "TeOPgTpoTra")
    private Character teOPgTpoTra;
    @Column(name = "TeOPgPerRevCod")
    private Short teOPgPerRevCod;
    @Column(name = "TeOPgAsiRevNum")
    private Long teOPgAsiRevNum;
    @Column(name = "TeOPgTotIVARet")
    private BigDecimal teOPgTotIVARet;
    @Column(name = "TeOPgTotAPagSinResRet")
    private BigDecimal teOPgTotAPagSinResRet;
    @Column(name = "TeOPgRecRetEstNum")
    private Short teOPgRecRetEstNum;
    @Column(name = "TeOPgRecRetPunExpNum")
    private Short teOPgRecRetPunExpNum;
    @Column(name = "TeOPgRecRetNumSec")
    private Integer teOPgRecRetNumSec;
    @Column(name = "TeOPgTotComSinIVA")
    private BigDecimal teOPgTotComSinIVA;
    @Column(name = "TeOpgTotIVA")
    private BigDecimal teOpgTotIVA;
    @Column(name = "TeOpgTotComSinIVAMonLoc")
    private Long teOpgTotComSinIVAMonLoc;
    @Column(name = "TeOpgTotIVAMonLoc")
    private Long teOpgTotIVAMonLoc;
    @Column(name = "TeOPgTotIVARetMonLoc")
    private BigDecimal teOPgTotIVARetMonLoc;
    @Column(name = "TeOpgRecRetTim")
    private Integer teOpgRecRetTim;
    @Column(name = "TeOPgRecRetEdo")
    private Character teOPgRecRetEdo;
    @Column(name = "TeOPgFecRet")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teOPgFecRet;
    @Column(name = "TeOPgRecNum")
    private Long teOPgRecNum;
    @Size(max = 300)
    @Column(name = "TeOPgObsOtrosPagos")
    private String teOPgObsOtrosPagos;
    @Column(name = "TeOpgImpOtrosPagos")
    private BigDecimal teOpgImpOtrosPagos;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tetopg")
    private List<Tetdfa> tetdfaList;
    @JoinColumn(name = "TeOPgPrvCod", referencedColumnName = "CmPrvCod")
    @ManyToOne
    private Cmtprv teOPgPrvCod;
    @JoinColumn(name = "TeCPaCod", referencedColumnName = "TeCPaCod")
    @ManyToOne
    private Tetcpa teCPaCod;

    public Tetopg() {
    }

    public Tetopg(TetopgPK tetopgPK) {
        this.tetopgPK = tetopgPK;
    }

    public Tetopg(long teOPgNum, short teOPgEmpAuxCod) {
        this.tetopgPK = new TetopgPK(teOPgNum, teOPgEmpAuxCod);
    }

    public TetopgPK getTetopgPK() {
        return tetopgPK;
    }

    public void setTetopgPK(TetopgPK tetopgPK) {
        this.tetopgPK = tetopgPK;
    }

    public Character getTeOPgForPag() {
        return teOPgForPag;
    }

    public void setTeOPgForPag(Character teOPgForPag) {
        this.teOPgForPag = teOPgForPag;
    }

    public Date getTeOPgFchFonFij() {
        return teOPgFchFonFij;
    }

    public void setTeOPgFchFonFij(Date teOPgFchFonFij) {
        this.teOPgFchFonFij = teOPgFchFonFij;
    }

    public Short getTeOPgEmpFonFijCod() {
        return teOPgEmpFonFijCod;
    }

    public void setTeOPgEmpFonFijCod(Short teOPgEmpFonFijCod) {
        this.teOPgEmpFonFijCod = teOPgEmpFonFijCod;
    }

    public Short getTeOPgSucFonFijCod() {
        return teOPgSucFonFijCod;
    }

    public void setTeOPgSucFonFijCod(Short teOPgSucFonFijCod) {
        this.teOPgSucFonFijCod = teOPgSucFonFijCod;
    }

    public Short getTeOPgEmpCod() {
        return teOPgEmpCod;
    }

    public void setTeOPgEmpCod(Short teOPgEmpCod) {
        this.teOPgEmpCod = teOPgEmpCod;
    }

    public Short getTeOPgSucCod() {
        return teOPgSucCod;
    }

    public void setTeOPgSucCod(Short teOPgSucCod) {
        this.teOPgSucCod = teOPgSucCod;
    }

    public Short getTeOPgDepCod() {
        return teOPgDepCod;
    }

    public void setTeOPgDepCod(Short teOPgDepCod) {
        this.teOPgDepCod = teOPgDepCod;
    }

    public Date getTeOPgFch() {
        return teOPgFch;
    }

    public void setTeOPgFch(Date teOPgFch) {
        this.teOPgFch = teOPgFch;
    }

    public String getTeOPgBen() {
        return teOPgBen;
    }

    public void setTeOPgBen(String teOPgBen) {
        this.teOPgBen = teOPgBen;
    }

    public String getTeOPgEspCon() {
        return teOPgEspCon;
    }

    public void setTeOPgEspCon(String teOPgEspCon) {
        this.teOPgEspCon = teOPgEspCon;
    }

    public Short getTeOPgMndCod() {
        return teOPgMndCod;
    }

    public void setTeOPgMndCod(Short teOPgMndCod) {
        this.teOPgMndCod = teOPgMndCod;
    }

    public BigDecimal getTeOPgCtz() {
        return teOPgCtz;
    }

    public void setTeOPgCtz(BigDecimal teOPgCtz) {
        this.teOPgCtz = teOPgCtz;
    }

    public String getTeOPgUsuIng() {
        return teOPgUsuIng;
    }

    public void setTeOPgUsuIng(String teOPgUsuIng) {
        this.teOPgUsuIng = teOPgUsuIng;
    }

    public String getTeOPgHorIng() {
        return teOPgHorIng;
    }

    public void setTeOPgHorIng(String teOPgHorIng) {
        this.teOPgHorIng = teOPgHorIng;
    }

    public Date getTeOPgFchIng() {
        return teOPgFchIng;
    }

    public void setTeOPgFchIng(Date teOPgFchIng) {
        this.teOPgFchIng = teOPgFchIng;
    }

    public BigDecimal getTeOPgImpEfe() {
        return teOPgImpEfe;
    }

    public void setTeOPgImpEfe(BigDecimal teOPgImpEfe) {
        this.teOPgImpEfe = teOPgImpEfe;
    }

    public String getTeOPgObs() {
        return teOPgObs;
    }

    public void setTeOPgObs(String teOPgObs) {
        this.teOPgObs = teOPgObs;
    }

    public BigDecimal getTeOPgImpMonLoc() {
        return teOPgImpMonLoc;
    }

    public void setTeOPgImpMonLoc(BigDecimal teOPgImpMonLoc) {
        this.teOPgImpMonLoc = teOPgImpMonLoc;
    }

    public BigDecimal getTeOPgImpMonExt() {
        return teOPgImpMonExt;
    }

    public void setTeOPgImpMonExt(BigDecimal teOPgImpMonExt) {
        this.teOPgImpMonExt = teOPgImpMonExt;
    }

    public BigDecimal getTeOPgCheImpTot() {
        return teOPgCheImpTot;
    }

    public void setTeOPgCheImpTot(BigDecimal teOPgCheImpTot) {
        this.teOPgCheImpTot = teOPgCheImpTot;
    }

    public BigDecimal getTeOPgDebImpTot() {
        return teOPgDebImpTot;
    }

    public void setTeOPgDebImpTot(BigDecimal teOPgDebImpTot) {
        this.teOPgDebImpTot = teOPgDebImpTot;
    }

    public BigDecimal getTeOPgTrfImpTot() {
        return teOPgTrfImpTot;
    }

    public void setTeOPgTrfImpTot(BigDecimal teOPgTrfImpTot) {
        this.teOPgTrfImpTot = teOPgTrfImpTot;
    }

    public BigDecimal getTeOPgTotPagPrv() {
        return teOPgTotPagPrv;
    }

    public void setTeOPgTotPagPrv(BigDecimal teOPgTotPagPrv) {
        this.teOPgTotPagPrv = teOPgTotPagPrv;
    }

    public BigDecimal getTeOPgTotPagFonFij() {
        return teOPgTotPagFonFij;
    }

    public void setTeOPgTotPagFonFij(BigDecimal teOPgTotPagFonFij) {
        this.teOPgTotPagFonFij = teOPgTotPagFonFij;
    }

    public Character getTeOPgEst() {
        return teOPgEst;
    }

    public void setTeOPgEst(Character teOPgEst) {
        this.teOPgEst = teOPgEst;
    }

    public Short getTeOPgUltItmDetFac() {
        return teOPgUltItmDetFac;
    }

    public void setTeOPgUltItmDetFac(Short teOPgUltItmDetFac) {
        this.teOPgUltItmDetFac = teOPgUltItmDetFac;
    }

    public Short getTeOPgUltItmDetChe() {
        return teOPgUltItmDetChe;
    }

    public void setTeOPgUltItmDetChe(Short teOPgUltItmDetChe) {
        this.teOPgUltItmDetChe = teOPgUltItmDetChe;
    }

    public Short getTeOPgUltItmDetDeb() {
        return teOPgUltItmDetDeb;
    }

    public void setTeOPgUltItmDetDeb(Short teOPgUltItmDetDeb) {
        this.teOPgUltItmDetDeb = teOPgUltItmDetDeb;
    }

    public Short getTeOPgUltItmDetTrf() {
        return teOPgUltItmDetTrf;
    }

    public void setTeOPgUltItmDetTrf(Short teOPgUltItmDetTrf) {
        this.teOPgUltItmDetTrf = teOPgUltItmDetTrf;
    }

    public Short getTeOPgUsuMod() {
        return teOPgUsuMod;
    }

    public void setTeOPgUsuMod(Short teOPgUsuMod) {
        this.teOPgUsuMod = teOPgUsuMod;
    }

    public Character getTeOpgUbi() {
        return teOpgUbi;
    }

    public void setTeOpgUbi(Character teOpgUbi) {
        this.teOpgUbi = teOpgUbi;
    }

    public Character getTeOpgGenAsi() {
        return teOpgGenAsi;
    }

    public void setTeOpgGenAsi(Character teOpgGenAsi) {
        this.teOpgGenAsi = teOpgGenAsi;
    }

    public Long getTeOpgAsiNum() {
        return teOpgAsiNum;
    }

    public void setTeOpgAsiNum(Long teOpgAsiNum) {
        this.teOpgAsiNum = teOpgAsiNum;
    }

    public Short getTeOpgPerCod() {
        return teOpgPerCod;
    }

    public void setTeOpgPerCod(Short teOpgPerCod) {
        this.teOpgPerCod = teOpgPerCod;
    }

    public Long getTeOPgNumRef() {
        return teOPgNumRef;
    }

    public void setTeOPgNumRef(Long teOPgNumRef) {
        this.teOPgNumRef = teOPgNumRef;
    }

    public Long getTeOPgCueConAntTra() {
        return teOPgCueConAntTra;
    }

    public void setTeOPgCueConAntTra(Long teOPgCueConAntTra) {
        this.teOPgCueConAntTra = teOPgCueConAntTra;
    }

    public Character getTeOPgTpoTra() {
        return teOPgTpoTra;
    }

    public void setTeOPgTpoTra(Character teOPgTpoTra) {
        this.teOPgTpoTra = teOPgTpoTra;
    }

    public Short getTeOPgPerRevCod() {
        return teOPgPerRevCod;
    }

    public void setTeOPgPerRevCod(Short teOPgPerRevCod) {
        this.teOPgPerRevCod = teOPgPerRevCod;
    }

    public Long getTeOPgAsiRevNum() {
        return teOPgAsiRevNum;
    }

    public void setTeOPgAsiRevNum(Long teOPgAsiRevNum) {
        this.teOPgAsiRevNum = teOPgAsiRevNum;
    }

    public BigDecimal getTeOPgTotIVARet() {
        return teOPgTotIVARet;
    }

    public void setTeOPgTotIVARet(BigDecimal teOPgTotIVARet) {
        this.teOPgTotIVARet = teOPgTotIVARet;
    }

    public BigDecimal getTeOPgTotAPagSinResRet() {
        return teOPgTotAPagSinResRet;
    }

    public void setTeOPgTotAPagSinResRet(BigDecimal teOPgTotAPagSinResRet) {
        this.teOPgTotAPagSinResRet = teOPgTotAPagSinResRet;
    }

    public Short getTeOPgRecRetEstNum() {
        return teOPgRecRetEstNum;
    }

    public void setTeOPgRecRetEstNum(Short teOPgRecRetEstNum) {
        this.teOPgRecRetEstNum = teOPgRecRetEstNum;
    }

    public Short getTeOPgRecRetPunExpNum() {
        return teOPgRecRetPunExpNum;
    }

    public void setTeOPgRecRetPunExpNum(Short teOPgRecRetPunExpNum) {
        this.teOPgRecRetPunExpNum = teOPgRecRetPunExpNum;
    }

    public Integer getTeOPgRecRetNumSec() {
        return teOPgRecRetNumSec;
    }

    public void setTeOPgRecRetNumSec(Integer teOPgRecRetNumSec) {
        this.teOPgRecRetNumSec = teOPgRecRetNumSec;
    }

    public BigDecimal getTeOPgTotComSinIVA() {
        return teOPgTotComSinIVA;
    }

    public void setTeOPgTotComSinIVA(BigDecimal teOPgTotComSinIVA) {
        this.teOPgTotComSinIVA = teOPgTotComSinIVA;
    }

    public BigDecimal getTeOpgTotIVA() {
        return teOpgTotIVA;
    }

    public void setTeOpgTotIVA(BigDecimal teOpgTotIVA) {
        this.teOpgTotIVA = teOpgTotIVA;
    }

    public Long getTeOpgTotComSinIVAMonLoc() {
        return teOpgTotComSinIVAMonLoc;
    }

    public void setTeOpgTotComSinIVAMonLoc(Long teOpgTotComSinIVAMonLoc) {
        this.teOpgTotComSinIVAMonLoc = teOpgTotComSinIVAMonLoc;
    }

    public Long getTeOpgTotIVAMonLoc() {
        return teOpgTotIVAMonLoc;
    }

    public void setTeOpgTotIVAMonLoc(Long teOpgTotIVAMonLoc) {
        this.teOpgTotIVAMonLoc = teOpgTotIVAMonLoc;
    }

    public BigDecimal getTeOPgTotIVARetMonLoc() {
        return teOPgTotIVARetMonLoc;
    }

    public void setTeOPgTotIVARetMonLoc(BigDecimal teOPgTotIVARetMonLoc) {
        this.teOPgTotIVARetMonLoc = teOPgTotIVARetMonLoc;
    }

    public Integer getTeOpgRecRetTim() {
        return teOpgRecRetTim;
    }

    public void setTeOpgRecRetTim(Integer teOpgRecRetTim) {
        this.teOpgRecRetTim = teOpgRecRetTim;
    }

    public Character getTeOPgRecRetEdo() {
        return teOPgRecRetEdo;
    }

    public void setTeOPgRecRetEdo(Character teOPgRecRetEdo) {
        this.teOPgRecRetEdo = teOPgRecRetEdo;
    }

    public Date getTeOPgFecRet() {
        return teOPgFecRet;
    }

    public void setTeOPgFecRet(Date teOPgFecRet) {
        this.teOPgFecRet = teOPgFecRet;
    }

    public Long getTeOPgRecNum() {
        return teOPgRecNum;
    }

    public void setTeOPgRecNum(Long teOPgRecNum) {
        this.teOPgRecNum = teOPgRecNum;
    }

    public String getTeOPgObsOtrosPagos() {
        return teOPgObsOtrosPagos;
    }

    public void setTeOPgObsOtrosPagos(String teOPgObsOtrosPagos) {
        this.teOPgObsOtrosPagos = teOPgObsOtrosPagos;
    }

    public BigDecimal getTeOpgImpOtrosPagos() {
        return teOpgImpOtrosPagos;
    }

    public void setTeOpgImpOtrosPagos(BigDecimal teOpgImpOtrosPagos) {
        this.teOpgImpOtrosPagos = teOpgImpOtrosPagos;
    }

    public List<Tetdfa> getTetdfaList() {
        return tetdfaList;
    }

    public void setTetdfaList(List<Tetdfa> tetdfaList) {
        this.tetdfaList = tetdfaList;
    }

    public Cmtprv getTeOPgPrvCod() {
        return teOPgPrvCod;
    }

    public void setTeOPgPrvCod(Cmtprv teOPgPrvCod) {
        this.teOPgPrvCod = teOPgPrvCod;
    }

    public Tetcpa getTeCPaCod() {
        return teCPaCod;
    }

    public void setTeCPaCod(Tetcpa teCPaCod) {
        this.teCPaCod = teCPaCod;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tetopgPK != null ? tetopgPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tetopg)) {
            return false;
        }
        Tetopg other = (Tetopg) object;
        if ((this.tetopgPK == null && other.tetopgPK != null) || (this.tetopgPK != null && !this.tetopgPK.equals(other.tetopgPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.Tetopg[ tetopgPK=" + tetopgPK + " ]";
    }
    
}
