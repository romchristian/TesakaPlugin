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
@Table(name = "CMTPRV")
@NamedQueries({
    @NamedQuery(name = "Cmtprv.findAll", query = "SELECT c FROM Cmtprv c")})
public class Cmtprv implements Serializable {

    @OneToMany(mappedBy = "teOPgPrvCod")
    private List<Tetopg> tetopgList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cmtprv")
    private List<Cmtcom> cmtcomList;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmPrvCod")
    private Short cmPrvCod;
    @Size(max = 60)
    @Column(name = "CmPrvNom")
    private String cmPrvNom;
    @Size(max = 60)
    @Column(name = "CmPrvCon")
    private String cmPrvCon;
    @Size(max = 70)
    @Column(name = "CmPrvDir")
    private String cmPrvDir;
    @Size(max = 40)
    @Column(name = "CmPrvTel")
    private String cmPrvTel;
    @Size(max = 40)
    @Column(name = "CmPrvFax")
    private String cmPrvFax;
    @Size(max = 30)
    @Column(name = "CmPrvEMail")
    private String cmPrvEMail;
    @Size(max = 30)
    @Column(name = "CmPrvWWW")
    private String cmPrvWWW;
    @Size(max = 12)
    @Column(name = "CmPrvRUC")
    private String cmPrvRUC;
    @Column(name = "CmPrvRUCNue")
    private Long cmPrvRUCNue;
    @Column(name = "CmPrvNumTimAct")
    private Integer cmPrvNumTimAct;
    @Column(name = "CmPrvNumCue")
    private Short cmPrvNumCue;
    @Column(name = "CmPrvSeAplRet")
    private Character cmPrvSeAplRet;
    @Column(name = "CmPrvCargaComStock")
    private Character cmPrvCargaComStock;
    @Size(max = 12)
    @Column(name = "CmPrvIdentificacion")
    private String cmPrvIdentificacion;
    @Column(name = "CmTipoIdentId")
    private Short cmTipoIdentId;
    @Column(name = "NuPaiCod")
    private Short nuPaiCod;
    @Column(name = "CmSituacionProvTesakaId")
    private Short cmSituacionProvTesakaId;

    public Cmtprv() {
    }

    public Cmtprv(Short cmPrvCod) {
        this.cmPrvCod = cmPrvCod;
    }

    public Short getCmPrvCod() {
        return cmPrvCod;
    }

    public void setCmPrvCod(Short cmPrvCod) {
        this.cmPrvCod = cmPrvCod;
    }

    public String getCmPrvNom() {
        return cmPrvNom;
    }

    public void setCmPrvNom(String cmPrvNom) {
        this.cmPrvNom = cmPrvNom;
    }

    public String getCmPrvCon() {
        return cmPrvCon;
    }

    public void setCmPrvCon(String cmPrvCon) {
        this.cmPrvCon = cmPrvCon;
    }

    public String getCmPrvDir() {
        return cmPrvDir;
    }

    public void setCmPrvDir(String cmPrvDir) {
        this.cmPrvDir = cmPrvDir;
    }

    public String getCmPrvTel() {
        return cmPrvTel;
    }

    public void setCmPrvTel(String cmPrvTel) {
        this.cmPrvTel = cmPrvTel;
    }

    public String getCmPrvFax() {
        return cmPrvFax;
    }

    public void setCmPrvFax(String cmPrvFax) {
        this.cmPrvFax = cmPrvFax;
    }

    public String getCmPrvEMail() {
        return cmPrvEMail;
    }

    public void setCmPrvEMail(String cmPrvEMail) {
        this.cmPrvEMail = cmPrvEMail;
    }

    public String getCmPrvWWW() {
        return cmPrvWWW;
    }

    public void setCmPrvWWW(String cmPrvWWW) {
        this.cmPrvWWW = cmPrvWWW;
    }

    public String getCmPrvRUC() {
        return cmPrvRUC;
    }

    public void setCmPrvRUC(String cmPrvRUC) {
        this.cmPrvRUC = cmPrvRUC;
    }

    public Long getCmPrvRUCNue() {
        return cmPrvRUCNue;
    }

    public void setCmPrvRUCNue(Long cmPrvRUCNue) {
        this.cmPrvRUCNue = cmPrvRUCNue;
    }

    public Integer getCmPrvNumTimAct() {
        return cmPrvNumTimAct;
    }

    public void setCmPrvNumTimAct(Integer cmPrvNumTimAct) {
        this.cmPrvNumTimAct = cmPrvNumTimAct;
    }

    public Short getCmPrvNumCue() {
        return cmPrvNumCue;
    }

    public void setCmPrvNumCue(Short cmPrvNumCue) {
        this.cmPrvNumCue = cmPrvNumCue;
    }

    public Character getCmPrvSeAplRet() {
        return cmPrvSeAplRet;
    }

    public void setCmPrvSeAplRet(Character cmPrvSeAplRet) {
        this.cmPrvSeAplRet = cmPrvSeAplRet;
    }

    public Character getCmPrvCargaComStock() {
        return cmPrvCargaComStock;
    }

    public void setCmPrvCargaComStock(Character cmPrvCargaComStock) {
        this.cmPrvCargaComStock = cmPrvCargaComStock;
    }

    public String getCmPrvIdentificacion() {
        return cmPrvIdentificacion;
    }

    public void setCmPrvIdentificacion(String cmPrvIdentificacion) {
        this.cmPrvIdentificacion = cmPrvIdentificacion;
    }

    public Short getCmTipoIdentId() {
        return cmTipoIdentId;
    }

    public void setCmTipoIdentId(Short cmTipoIdentId) {
        this.cmTipoIdentId = cmTipoIdentId;
    }

    public Short getNuPaiCod() {
        return nuPaiCod;
    }

    public void setNuPaiCod(Short nuPaiCod) {
        this.nuPaiCod = nuPaiCod;
    }

    public Short getCmSituacionProvTesakaId() {
        return cmSituacionProvTesakaId;
    }

    public void setCmSituacionProvTesakaId(Short cmSituacionProvTesakaId) {
        this.cmSituacionProvTesakaId = cmSituacionProvTesakaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cmPrvCod != null ? cmPrvCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cmtprv)) {
            return false;
        }
        Cmtprv other = (Cmtprv) object;
        if ((this.cmPrvCod == null && other.cmPrvCod != null) || (this.cmPrvCod != null && !this.cmPrvCod.equals(other.cmPrvCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.Cmtprv[ cmPrvCod=" + cmPrvCod + " ]";
    }

    public List<Tetopg> getTetopgList() {
        return tetopgList;
    }

    public void setTetopgList(List<Tetopg> tetopgList) {
        this.tetopgList = tetopgList;
    }

    public List<Cmtcom> getCmtcomList() {
        return cmtcomList;
    }

    public void setCmtcomList(List<Cmtcom> cmtcomList) {
        this.cmtcomList = cmtcomList;
    }

}
