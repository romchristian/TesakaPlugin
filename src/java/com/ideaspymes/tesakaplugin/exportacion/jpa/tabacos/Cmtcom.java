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
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "CMTCOM")
@NamedQueries({
    @NamedQuery(name = "Cmtcom.findAll", query = "SELECT c FROM Cmtcom c")})
public class Cmtcom implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CmtcomPK cmtcomPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CmComExeSal")
    private BigDecimal cmComExeSal;
    @Column(name = "NuEmpCod")
    private Short nuEmpCod;
    @Column(name = "NuSucCod")
    private Short nuSucCod;
    @Column(name = "NuDepCod")
    private Short nuDepCod;
    @Column(name = "NuMndCod")
    private Short nuMndCod;
    @Size(max = 30)
    @Column(name = "CmComTCoTpoFctDes")
    private String cmComTCoTpoFctDes;
    @Column(name = "CmComCtz")
    private BigDecimal cmComCtz;
    @Column(name = "CmComFch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmComFch;
    @Column(name = "CmComFchRec")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmComFchRec;
    @Column(name = "CmComFchVto")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmComFchVto;
    @Column(name = "CmComFchUltPgo")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmComFchUltPgo;
    @Column(name = "CmComPla")
    private Short cmComPla;
    @Column(name = "CmComCanCuo")
    private Short cmComCanCuo;
    @Size(max = 40)
    @Column(name = "CmComCon")
    private String cmComCon;
    @Column(name = "CmComExeImp")
    private BigDecimal cmComExeImp;
    @Column(name = "CmComExeDes")
    private BigDecimal cmComExeDes;
    @Size(max = 300)
    @Column(name = "CmComExeDsc")
    private String cmComExeDsc;
    @Column(name = "CmComExeTot")
    private BigDecimal cmComExeTot;
    @Column(name = "CmComGraTot")
    private BigDecimal cmComGraTot;
    @Column(name = "CmComGraDes")
    private BigDecimal cmComGraDes;
    @Column(name = "CmComIVATot")
    private BigDecimal cmComIVATot;
    @Column(name = "CmComImpTot")
    private BigDecimal cmComImpTot;
    @Column(name = "CmComSal")
    private BigDecimal cmComSal;
    @Size(max = 300)
    @Column(name = "CmComObs")
    private String cmComObs;
    @Column(name = "CmComTiePrm")
    private Character cmComTiePrm;
    @Column(name = "CmComPrmImp")
    private BigDecimal cmComPrmImp;
    @Size(max = 20)
    @Column(name = "CmComUsuIng")
    private String cmComUsuIng;
    @Size(max = 8)
    @Column(name = "CmComHorIng")
    private String cmComHorIng;
    @Column(name = "CmComFchIng")
    @Temporal(TemporalType.TIMESTAMP)
    private Date cmComFchIng;
    @Column(name = "CmComUltNumGra")
    private Short cmComUltNumGra;
    @Column(name = "CmComUltNumCuo")
    private Short cmComUltNumCuo;
    @Column(name = "CmComEst")
    private Character cmComEst;
    @Column(name = "CmComFacNum")
    private Integer cmComFacNum;
    @Column(name = "CmComPerConCod")
    private Short cmComPerConCod;
    @Column(name = "CmComAsiNum")
    private Long cmComAsiNum;
    @Column(name = "CmComCueConResCod")
    private Long cmComCueConResCod;
    @Size(max = 8)
    @Column(name = "CmComActFigCod")
    private String cmComActFigCod;
    @Column(name = "CmComAsiRevNum")
    private Long cmComAsiRevNum;
    @Column(name = "CmComPerConRevCod")
    private Short cmComPerConRevCod;
    @Column(name = "CmComAplRetIVA")
    private Character cmComAplRetIVA;
    @Column(name = "CmComGraTotSinIVA")
    private BigDecimal cmComGraTotSinIVA;
    @Column(name = "CmComImpASerRet")
    private BigDecimal cmComImpASerRet;
    @Column(name = "CmComPrjRet")
    private BigDecimal cmComPrjRet;
    @Column(name = "CmComImpASerRetMonLoc")
    private Long cmComImpASerRetMonLoc;
    @Column(name = "CmComGraTotSinIVAMonLoc")
    private Long cmComGraTotSinIVAMonLoc;
    @Column(name = "CmComIVATotMonLoc")
    private Long cmComIVATotMonLoc;
    @Column(name = "CmComIVATotMonExt")
    private BigDecimal cmComIVATotMonExt;
    @Column(name = "CmComSalAplRet")
    private BigDecimal cmComSalAplRet;
    @Column(name = "CmComSalMinLegVig")
    private Long cmComSalMinLegVig;
    @Column(name = "CmComDesGen")
    private BigDecimal cmComDesGen;
    @Column(name = "CmComImpTotConDesGen")
    private BigDecimal cmComImpTotConDesGen;
    @Column(name = "CmComTotValven")
    private BigDecimal cmComTotValven;
    @Column(name = "CmComEsCompraMer")
    private Character cmComEsCompraMer;
    @Column(name = "CmComFacSuc")
    private Short cmComFacSuc;
    @Column(name = "CmComFacPunExp")
    private Short cmComFacPunExp;
    @Column(name = "CmComIVATotAux")
    private BigDecimal cmComIVATotAux;
    @Column(name = "CmComUltNumPro")
    private Short cmComUltNumPro;
    @Column(name = "CmComAsiGen")
    private Character cmComAsiGen;
    @Column(name = "CmComGenAsiGas")
    private Character cmComGenAsiGas;
    @JoinColumn(name = "CmPrvCod", referencedColumnName = "CmPrvCod", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cmtprv cmtprv;
    @JoinColumn(name = "CmTCoCod", referencedColumnName = "CmTCoCod", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cmttco cmttco;
    @OneToMany(mappedBy = "cmtcom")
    private List<Cmtcomdetalleproductos> cmtcomdetalleproductos;
    @OneToMany(mappedBy = "cmtcom")
    private List<Cmtcgr> cmtcgrs;

    public List<Cmtcgr> getCmtcgrs() {
        return cmtcgrs;
    }

    public void setCmtcgrs(List<Cmtcgr> cmtcgrs) {
        this.cmtcgrs = cmtcgrs;
    }

    
    
    public List<Cmtcomdetalleproductos> getCmtcomdetalleproductos() {
        return cmtcomdetalleproductos;
    }

    public void setCmtcomdetalleproductos(List<Cmtcomdetalleproductos> cmtcomdetalleproductos) {
        this.cmtcomdetalleproductos = cmtcomdetalleproductos;
    }

    public Cmtcom() {
    }

    public Cmtcom(CmtcomPK cmtcomPK) {
        this.cmtcomPK = cmtcomPK;
    }

    public Cmtcom(short cmPrvCod, short cmComSucPrv, short cmComPunExp, int cmComNum, short cmTCoCod, int cmComTimNum) {
        this.cmtcomPK = new CmtcomPK(cmPrvCod, cmComSucPrv, cmComPunExp, cmComNum, cmTCoCod, cmComTimNum);
    }

    public CmtcomPK getCmtcomPK() {
        return cmtcomPK;
    }

    public void setCmtcomPK(CmtcomPK cmtcomPK) {
        this.cmtcomPK = cmtcomPK;
    }

    public BigDecimal getCmComExeSal() {
        return cmComExeSal;
    }

    public void setCmComExeSal(BigDecimal cmComExeSal) {
        this.cmComExeSal = cmComExeSal;
    }

    public Short getNuEmpCod() {
        return nuEmpCod;
    }

    public void setNuEmpCod(Short nuEmpCod) {
        this.nuEmpCod = nuEmpCod;
    }

    public Short getNuSucCod() {
        return nuSucCod;
    }

    public void setNuSucCod(Short nuSucCod) {
        this.nuSucCod = nuSucCod;
    }

    public Short getNuDepCod() {
        return nuDepCod;
    }

    public void setNuDepCod(Short nuDepCod) {
        this.nuDepCod = nuDepCod;
    }

    public Short getNuMndCod() {
        return nuMndCod;
    }

    public void setNuMndCod(Short nuMndCod) {
        this.nuMndCod = nuMndCod;
    }

    public String getCmComTCoTpoFctDes() {
        return cmComTCoTpoFctDes;
    }

    public void setCmComTCoTpoFctDes(String cmComTCoTpoFctDes) {
        this.cmComTCoTpoFctDes = cmComTCoTpoFctDes;
    }

    public BigDecimal getCmComCtz() {
        return cmComCtz;
    }

    public void setCmComCtz(BigDecimal cmComCtz) {
        this.cmComCtz = cmComCtz;
    }

    public Date getCmComFch() {
        return cmComFch;
    }

    public void setCmComFch(Date cmComFch) {
        this.cmComFch = cmComFch;
    }

    public Date getCmComFchRec() {
        return cmComFchRec;
    }

    public void setCmComFchRec(Date cmComFchRec) {
        this.cmComFchRec = cmComFchRec;
    }

    public Date getCmComFchVto() {
        return cmComFchVto;
    }

    public void setCmComFchVto(Date cmComFchVto) {
        this.cmComFchVto = cmComFchVto;
    }

    public Date getCmComFchUltPgo() {
        return cmComFchUltPgo;
    }

    public void setCmComFchUltPgo(Date cmComFchUltPgo) {
        this.cmComFchUltPgo = cmComFchUltPgo;
    }

    public Short getCmComPla() {
        return cmComPla;
    }

    public void setCmComPla(Short cmComPla) {
        this.cmComPla = cmComPla;
    }

    public Short getCmComCanCuo() {
        return cmComCanCuo;
    }

    public void setCmComCanCuo(Short cmComCanCuo) {
        this.cmComCanCuo = cmComCanCuo;
    }

    public String getCmComCon() {
        return cmComCon;
    }

    public void setCmComCon(String cmComCon) {
        this.cmComCon = cmComCon;
    }

    public BigDecimal getCmComExeImp() {
        return cmComExeImp;
    }

    public void setCmComExeImp(BigDecimal cmComExeImp) {
        this.cmComExeImp = cmComExeImp;
    }

    public BigDecimal getCmComExeDes() {
        return cmComExeDes;
    }

    public void setCmComExeDes(BigDecimal cmComExeDes) {
        this.cmComExeDes = cmComExeDes;
    }

    public String getCmComExeDsc() {
        return cmComExeDsc;
    }

    public void setCmComExeDsc(String cmComExeDsc) {
        this.cmComExeDsc = cmComExeDsc;
    }

    public BigDecimal getCmComExeTot() {
        return cmComExeTot;
    }

    public void setCmComExeTot(BigDecimal cmComExeTot) {
        this.cmComExeTot = cmComExeTot;
    }

    public BigDecimal getCmComGraTot() {
        return cmComGraTot;
    }

    public void setCmComGraTot(BigDecimal cmComGraTot) {
        this.cmComGraTot = cmComGraTot;
    }

    public BigDecimal getCmComGraDes() {
        return cmComGraDes;
    }

    public void setCmComGraDes(BigDecimal cmComGraDes) {
        this.cmComGraDes = cmComGraDes;
    }

    public BigDecimal getCmComIVATot() {
        return cmComIVATot;
    }

    public void setCmComIVATot(BigDecimal cmComIVATot) {
        this.cmComIVATot = cmComIVATot;
    }

    public BigDecimal getCmComImpTot() {
        return cmComImpTot;
    }

    public void setCmComImpTot(BigDecimal cmComImpTot) {
        this.cmComImpTot = cmComImpTot;
    }

    public BigDecimal getCmComSal() {
        return cmComSal;
    }

    public void setCmComSal(BigDecimal cmComSal) {
        this.cmComSal = cmComSal;
    }

    public String getCmComObs() {
        return cmComObs;
    }

    public void setCmComObs(String cmComObs) {
        this.cmComObs = cmComObs;
    }

    public Character getCmComTiePrm() {
        return cmComTiePrm;
    }

    public void setCmComTiePrm(Character cmComTiePrm) {
        this.cmComTiePrm = cmComTiePrm;
    }

    public BigDecimal getCmComPrmImp() {
        return cmComPrmImp;
    }

    public void setCmComPrmImp(BigDecimal cmComPrmImp) {
        this.cmComPrmImp = cmComPrmImp;
    }

    public String getCmComUsuIng() {
        return cmComUsuIng;
    }

    public void setCmComUsuIng(String cmComUsuIng) {
        this.cmComUsuIng = cmComUsuIng;
    }

    public String getCmComHorIng() {
        return cmComHorIng;
    }

    public void setCmComHorIng(String cmComHorIng) {
        this.cmComHorIng = cmComHorIng;
    }

    public Date getCmComFchIng() {
        return cmComFchIng;
    }

    public void setCmComFchIng(Date cmComFchIng) {
        this.cmComFchIng = cmComFchIng;
    }

    public Short getCmComUltNumGra() {
        return cmComUltNumGra;
    }

    public void setCmComUltNumGra(Short cmComUltNumGra) {
        this.cmComUltNumGra = cmComUltNumGra;
    }

    public Short getCmComUltNumCuo() {
        return cmComUltNumCuo;
    }

    public void setCmComUltNumCuo(Short cmComUltNumCuo) {
        this.cmComUltNumCuo = cmComUltNumCuo;
    }

    public Character getCmComEst() {
        return cmComEst;
    }

    public void setCmComEst(Character cmComEst) {
        this.cmComEst = cmComEst;
    }

    public Integer getCmComFacNum() {
        return cmComFacNum;
    }

    public void setCmComFacNum(Integer cmComFacNum) {
        this.cmComFacNum = cmComFacNum;
    }

    public Short getCmComPerConCod() {
        return cmComPerConCod;
    }

    public void setCmComPerConCod(Short cmComPerConCod) {
        this.cmComPerConCod = cmComPerConCod;
    }

    public Long getCmComAsiNum() {
        return cmComAsiNum;
    }

    public void setCmComAsiNum(Long cmComAsiNum) {
        this.cmComAsiNum = cmComAsiNum;
    }

    public Long getCmComCueConResCod() {
        return cmComCueConResCod;
    }

    public void setCmComCueConResCod(Long cmComCueConResCod) {
        this.cmComCueConResCod = cmComCueConResCod;
    }

    public String getCmComActFigCod() {
        return cmComActFigCod;
    }

    public void setCmComActFigCod(String cmComActFigCod) {
        this.cmComActFigCod = cmComActFigCod;
    }

    public Long getCmComAsiRevNum() {
        return cmComAsiRevNum;
    }

    public void setCmComAsiRevNum(Long cmComAsiRevNum) {
        this.cmComAsiRevNum = cmComAsiRevNum;
    }

    public Short getCmComPerConRevCod() {
        return cmComPerConRevCod;
    }

    public void setCmComPerConRevCod(Short cmComPerConRevCod) {
        this.cmComPerConRevCod = cmComPerConRevCod;
    }

    public Character getCmComAplRetIVA() {
        return cmComAplRetIVA;
    }

    public void setCmComAplRetIVA(Character cmComAplRetIVA) {
        this.cmComAplRetIVA = cmComAplRetIVA;
    }

    public BigDecimal getCmComGraTotSinIVA() {
        return cmComGraTotSinIVA;
    }

    public void setCmComGraTotSinIVA(BigDecimal cmComGraTotSinIVA) {
        this.cmComGraTotSinIVA = cmComGraTotSinIVA;
    }

    public BigDecimal getCmComImpASerRet() {
        return cmComImpASerRet;
    }

    public void setCmComImpASerRet(BigDecimal cmComImpASerRet) {
        this.cmComImpASerRet = cmComImpASerRet;
    }

    public BigDecimal getCmComPrjRet() {
        return cmComPrjRet;
    }

    public void setCmComPrjRet(BigDecimal cmComPrjRet) {
        this.cmComPrjRet = cmComPrjRet;
    }

    public Long getCmComImpASerRetMonLoc() {
        return cmComImpASerRetMonLoc;
    }

    public void setCmComImpASerRetMonLoc(Long cmComImpASerRetMonLoc) {
        this.cmComImpASerRetMonLoc = cmComImpASerRetMonLoc;
    }

    public Long getCmComGraTotSinIVAMonLoc() {
        return cmComGraTotSinIVAMonLoc;
    }

    public void setCmComGraTotSinIVAMonLoc(Long cmComGraTotSinIVAMonLoc) {
        this.cmComGraTotSinIVAMonLoc = cmComGraTotSinIVAMonLoc;
    }

    public Long getCmComIVATotMonLoc() {
        return cmComIVATotMonLoc;
    }

    public void setCmComIVATotMonLoc(Long cmComIVATotMonLoc) {
        this.cmComIVATotMonLoc = cmComIVATotMonLoc;
    }

    public BigDecimal getCmComIVATotMonExt() {
        return cmComIVATotMonExt;
    }

    public void setCmComIVATotMonExt(BigDecimal cmComIVATotMonExt) {
        this.cmComIVATotMonExt = cmComIVATotMonExt;
    }

    public BigDecimal getCmComSalAplRet() {
        return cmComSalAplRet;
    }

    public void setCmComSalAplRet(BigDecimal cmComSalAplRet) {
        this.cmComSalAplRet = cmComSalAplRet;
    }

    public Long getCmComSalMinLegVig() {
        return cmComSalMinLegVig;
    }

    public void setCmComSalMinLegVig(Long cmComSalMinLegVig) {
        this.cmComSalMinLegVig = cmComSalMinLegVig;
    }

    public BigDecimal getCmComDesGen() {
        return cmComDesGen;
    }

    public void setCmComDesGen(BigDecimal cmComDesGen) {
        this.cmComDesGen = cmComDesGen;
    }

    public BigDecimal getCmComImpTotConDesGen() {
        return cmComImpTotConDesGen;
    }

    public void setCmComImpTotConDesGen(BigDecimal cmComImpTotConDesGen) {
        this.cmComImpTotConDesGen = cmComImpTotConDesGen;
    }

    public BigDecimal getCmComTotValven() {
        return cmComTotValven;
    }

    public void setCmComTotValven(BigDecimal cmComTotValven) {
        this.cmComTotValven = cmComTotValven;
    }

    public Character getCmComEsCompraMer() {
        return cmComEsCompraMer;
    }

    public void setCmComEsCompraMer(Character cmComEsCompraMer) {
        this.cmComEsCompraMer = cmComEsCompraMer;
    }

    public Short getCmComFacSuc() {
        return cmComFacSuc;
    }

    public void setCmComFacSuc(Short cmComFacSuc) {
        this.cmComFacSuc = cmComFacSuc;
    }

    public Short getCmComFacPunExp() {
        return cmComFacPunExp;
    }

    public void setCmComFacPunExp(Short cmComFacPunExp) {
        this.cmComFacPunExp = cmComFacPunExp;
    }

    public BigDecimal getCmComIVATotAux() {
        return cmComIVATotAux;
    }

    public void setCmComIVATotAux(BigDecimal cmComIVATotAux) {
        this.cmComIVATotAux = cmComIVATotAux;
    }

    public Short getCmComUltNumPro() {
        return cmComUltNumPro;
    }

    public void setCmComUltNumPro(Short cmComUltNumPro) {
        this.cmComUltNumPro = cmComUltNumPro;
    }

    public Character getCmComAsiGen() {
        return cmComAsiGen;
    }

    public void setCmComAsiGen(Character cmComAsiGen) {
        this.cmComAsiGen = cmComAsiGen;
    }

    public Character getCmComGenAsiGas() {
        return cmComGenAsiGas;
    }

    public void setCmComGenAsiGas(Character cmComGenAsiGas) {
        this.cmComGenAsiGas = cmComGenAsiGas;
    }

    public Cmtprv getCmtprv() {
        return cmtprv;
    }

    public void setCmtprv(Cmtprv cmtprv) {
        this.cmtprv = cmtprv;
    }

    public Cmttco getCmttco() {
        return cmttco;
    }

    public void setCmttco(Cmttco cmttco) {
        this.cmttco = cmttco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmtcomPK != null ? cmtcomPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmtcom)) {
            return false;
        }
        Cmtcom other = (Cmtcom) object;
        if ((this.cmtcomPK == null && other.cmtcomPK != null) || (this.cmtcomPK != null && !this.cmtcomPK.equals(other.cmtcomPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.Cmtcom[ cmtcomPK=" + cmtcomPK + " ]";
    }

}
