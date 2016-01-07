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
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author christian.romero
 */
@Entity
@Table(name = "TETDFA")
@NamedQueries({
    @NamedQuery(name = "Tetdfa.findAll", query = "SELECT t FROM Tetdfa t")})
public class Tetdfa implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TetdfaPK tetdfaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TeDFaImp")
    private BigDecimal teDFaImp;
    @Column(name = "TeDFaSucPrv")
    private Short teDFaSucPrv;
    @Column(name = "TeDFaPunExp")
    private Short teDFaPunExp;
    @Column(name = "TeDFaDocNum")
    private Integer teDFaDocNum;
    @Size(max = 30)
    @Column(name = "TeDFaTpoFac")
    private String teDFaTpoFac;
    @Column(name = "TeDFaFch")
    @Temporal(TemporalType.TIMESTAMP)
    private Date teDFaFch;
    @Column(name = "TeDFaTotCuo")
    private Short teDFaTotCuo;
    @Column(name = "TeDFaCtz")
    private BigDecimal teDFaCtz;
    @Column(name = "TeDFaMonTot")
    private BigDecimal teDFaMonTot;
    @Column(name = "TeDFaMndCod")
    private Short teDFaMndCod;
    @Size(max = 30)
    @Column(name = "TeDFaMndNom")
    private String teDFaMndNom;
    @Column(name = "TeDFaMndTpo")
    private Character teDFaMndTpo;
    @Column(name = "TeDFaCuoNum")
    private Short teDFaCuoNum;
    @Column(name = "TeDFaSal")
    private BigDecimal teDFaSal;
    @Column(name = "TeDFaImpMonFac")
    private BigDecimal teDFaImpMonFac;
    @Column(name = "TeDFaImpMonOP")
    private BigDecimal teDFaImpMonOP;
    @Size(max = 300)
    @Column(name = "TeDFaObs")
    private String teDFaObs;
    @Column(name = "TeDFaTCoCod")
    private Short teDFaTCoCod;
    @Column(name = "TeDFaImpRet")
    private BigDecimal teDFaImpRet;
    @Column(name = "TeDFaImpRetMonOP")
    private BigDecimal teDFaImpRetMonOP;
    @Column(name = "TeDFaImpSinIVA")
    private BigDecimal teDFaImpSinIVA;
    @Column(name = "TeDFaImpSinIVAMonLoc")
    private BigDecimal teDFaImpSinIVAMonLoc;
    @Column(name = "TeDFaImpIVA")
    private BigDecimal teDFaImpIVA;
    @Column(name = "TeDFaImpIVAMonLoc")
    private Long teDFaImpIVAMonLoc;
    @Column(name = "TeDFaAplRet")
    private Character teDFaAplRet;
    @Column(name = "TeDFaDocOriAplRet")
    private Character teDFaDocOriAplRet;
    @Column(name = "TeDFaImpNetPag")
    private BigDecimal teDFaImpNetPag;
    @Column(name = "TeDFaTimbrado")
    private Integer teDFaTimbrado;
    @JoinColumns({
        @JoinColumn(name = "TeOPgNum", referencedColumnName = "TeOPgNum", insertable = false, updatable = false),
        @JoinColumn(name = "TeOPgEmpAuxCod", referencedColumnName = "TeOPgEmpAuxCod", insertable = false, updatable = false)})
    @ManyToOne(optional = false)
    private Tetopg tetopg;

    public Tetdfa() {
    }

    public Tetdfa(TetdfaPK tetdfaPK) {
        this.tetdfaPK = tetdfaPK;
    }

    public Tetdfa(long teOPgNum, short teOPgEmpAuxCod, short teDFaItm) {
        this.tetdfaPK = new TetdfaPK(teOPgNum, teOPgEmpAuxCod, teDFaItm);
    }

    public TetdfaPK getTetdfaPK() {
        return tetdfaPK;
    }

    public void setTetdfaPK(TetdfaPK tetdfaPK) {
        this.tetdfaPK = tetdfaPK;
    }

    public BigDecimal getTeDFaImp() {
        return teDFaImp;
    }

    public void setTeDFaImp(BigDecimal teDFaImp) {
        this.teDFaImp = teDFaImp;
    }

    public Short getTeDFaSucPrv() {
        return teDFaSucPrv;
    }

    public void setTeDFaSucPrv(Short teDFaSucPrv) {
        this.teDFaSucPrv = teDFaSucPrv;
    }

    public Short getTeDFaPunExp() {
        return teDFaPunExp;
    }

    public void setTeDFaPunExp(Short teDFaPunExp) {
        this.teDFaPunExp = teDFaPunExp;
    }

    public Integer getTeDFaDocNum() {
        return teDFaDocNum;
    }

    public void setTeDFaDocNum(Integer teDFaDocNum) {
        this.teDFaDocNum = teDFaDocNum;
    }

    public String getTeDFaTpoFac() {
        return teDFaTpoFac;
    }

    public void setTeDFaTpoFac(String teDFaTpoFac) {
        this.teDFaTpoFac = teDFaTpoFac;
    }

    public Date getTeDFaFch() {
        return teDFaFch;
    }

    public void setTeDFaFch(Date teDFaFch) {
        this.teDFaFch = teDFaFch;
    }

    public Short getTeDFaTotCuo() {
        return teDFaTotCuo;
    }

    public void setTeDFaTotCuo(Short teDFaTotCuo) {
        this.teDFaTotCuo = teDFaTotCuo;
    }

    public BigDecimal getTeDFaCtz() {
        return teDFaCtz;
    }

    public void setTeDFaCtz(BigDecimal teDFaCtz) {
        this.teDFaCtz = teDFaCtz;
    }

    public BigDecimal getTeDFaMonTot() {
        return teDFaMonTot;
    }

    public void setTeDFaMonTot(BigDecimal teDFaMonTot) {
        this.teDFaMonTot = teDFaMonTot;
    }

    public Short getTeDFaMndCod() {
        return teDFaMndCod;
    }

    public void setTeDFaMndCod(Short teDFaMndCod) {
        this.teDFaMndCod = teDFaMndCod;
    }

    public String getTeDFaMndNom() {
        return teDFaMndNom;
    }

    public void setTeDFaMndNom(String teDFaMndNom) {
        this.teDFaMndNom = teDFaMndNom;
    }

    public Character getTeDFaMndTpo() {
        return teDFaMndTpo;
    }

    public void setTeDFaMndTpo(Character teDFaMndTpo) {
        this.teDFaMndTpo = teDFaMndTpo;
    }

    public Short getTeDFaCuoNum() {
        return teDFaCuoNum;
    }

    public void setTeDFaCuoNum(Short teDFaCuoNum) {
        this.teDFaCuoNum = teDFaCuoNum;
    }

    public BigDecimal getTeDFaSal() {
        return teDFaSal;
    }

    public void setTeDFaSal(BigDecimal teDFaSal) {
        this.teDFaSal = teDFaSal;
    }

    public BigDecimal getTeDFaImpMonFac() {
        return teDFaImpMonFac;
    }

    public void setTeDFaImpMonFac(BigDecimal teDFaImpMonFac) {
        this.teDFaImpMonFac = teDFaImpMonFac;
    }

    public BigDecimal getTeDFaImpMonOP() {
        return teDFaImpMonOP;
    }

    public void setTeDFaImpMonOP(BigDecimal teDFaImpMonOP) {
        this.teDFaImpMonOP = teDFaImpMonOP;
    }

    public String getTeDFaObs() {
        return teDFaObs;
    }

    public void setTeDFaObs(String teDFaObs) {
        this.teDFaObs = teDFaObs;
    }

    public Short getTeDFaTCoCod() {
        return teDFaTCoCod;
    }

    public void setTeDFaTCoCod(Short teDFaTCoCod) {
        this.teDFaTCoCod = teDFaTCoCod;
    }

    public BigDecimal getTeDFaImpRet() {
        return teDFaImpRet;
    }

    public void setTeDFaImpRet(BigDecimal teDFaImpRet) {
        this.teDFaImpRet = teDFaImpRet;
    }

    public BigDecimal getTeDFaImpRetMonOP() {
        return teDFaImpRetMonOP;
    }

    public void setTeDFaImpRetMonOP(BigDecimal teDFaImpRetMonOP) {
        this.teDFaImpRetMonOP = teDFaImpRetMonOP;
    }

    public BigDecimal getTeDFaImpSinIVA() {
        return teDFaImpSinIVA;
    }

    public void setTeDFaImpSinIVA(BigDecimal teDFaImpSinIVA) {
        this.teDFaImpSinIVA = teDFaImpSinIVA;
    }

    public BigDecimal getTeDFaImpSinIVAMonLoc() {
        return teDFaImpSinIVAMonLoc;
    }

    public void setTeDFaImpSinIVAMonLoc(BigDecimal teDFaImpSinIVAMonLoc) {
        this.teDFaImpSinIVAMonLoc = teDFaImpSinIVAMonLoc;
    }

    public BigDecimal getTeDFaImpIVA() {
        return teDFaImpIVA;
    }

    public void setTeDFaImpIVA(BigDecimal teDFaImpIVA) {
        this.teDFaImpIVA = teDFaImpIVA;
    }

    public Long getTeDFaImpIVAMonLoc() {
        return teDFaImpIVAMonLoc;
    }

    public void setTeDFaImpIVAMonLoc(Long teDFaImpIVAMonLoc) {
        this.teDFaImpIVAMonLoc = teDFaImpIVAMonLoc;
    }

    public Character getTeDFaAplRet() {
        return teDFaAplRet;
    }

    public void setTeDFaAplRet(Character teDFaAplRet) {
        this.teDFaAplRet = teDFaAplRet;
    }

    public Character getTeDFaDocOriAplRet() {
        return teDFaDocOriAplRet;
    }

    public void setTeDFaDocOriAplRet(Character teDFaDocOriAplRet) {
        this.teDFaDocOriAplRet = teDFaDocOriAplRet;
    }

    public BigDecimal getTeDFaImpNetPag() {
        return teDFaImpNetPag;
    }

    public void setTeDFaImpNetPag(BigDecimal teDFaImpNetPag) {
        this.teDFaImpNetPag = teDFaImpNetPag;
    }

    public Integer getTeDFaTimbrado() {
        return teDFaTimbrado;
    }

    public void setTeDFaTimbrado(Integer teDFaTimbrado) {
        this.teDFaTimbrado = teDFaTimbrado;
    }

    public Tetopg getTetopg() {
        return tetopg;
    }

    public void setTetopg(Tetopg tetopg) {
        this.tetopg = tetopg;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tetdfaPK != null ? tetdfaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tetdfa)) {
            return false;
        }
        Tetdfa other = (Tetdfa) object;
        if ((this.tetdfaPK == null && other.tetdfaPK != null) || (this.tetdfaPK != null && !this.tetdfaPK.equals(other.tetdfaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.Tetdfa[ tetdfaPK=" + tetdfaPK + " ]";
    }
    
}
