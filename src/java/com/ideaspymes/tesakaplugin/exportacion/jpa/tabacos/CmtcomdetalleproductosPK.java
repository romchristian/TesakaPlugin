/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author christian.romero
 */
@Embeddable
public class CmtcomdetalleproductosPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "CmPrvCod")
    private short cmPrvCod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmComSucPrv")
    private short cmComSucPrv;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmComPunExp")
    private short cmComPunExp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmComNum")
    private int cmComNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmTCoCod")
    private short cmTCoCod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmComTimNum")
    private int cmComTimNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CmDetProItm")
    private short cmDetProItm;

    public CmtcomdetalleproductosPK() {
    }

    public CmtcomdetalleproductosPK(short cmPrvCod, short cmComSucPrv, short cmComPunExp, int cmComNum, short cmTCoCod, int cmComTimNum, short cmDetProItm) {
        this.cmPrvCod = cmPrvCod;
        this.cmComSucPrv = cmComSucPrv;
        this.cmComPunExp = cmComPunExp;
        this.cmComNum = cmComNum;
        this.cmTCoCod = cmTCoCod;
        this.cmComTimNum = cmComTimNum;
        this.cmDetProItm = cmDetProItm;
    }

    public short getCmPrvCod() {
        return cmPrvCod;
    }

    public void setCmPrvCod(short cmPrvCod) {
        this.cmPrvCod = cmPrvCod;
    }

    public short getCmComSucPrv() {
        return cmComSucPrv;
    }

    public void setCmComSucPrv(short cmComSucPrv) {
        this.cmComSucPrv = cmComSucPrv;
    }

    public short getCmComPunExp() {
        return cmComPunExp;
    }

    public void setCmComPunExp(short cmComPunExp) {
        this.cmComPunExp = cmComPunExp;
    }

    public int getCmComNum() {
        return cmComNum;
    }

    public void setCmComNum(int cmComNum) {
        this.cmComNum = cmComNum;
    }

    public short getCmTCoCod() {
        return cmTCoCod;
    }

    public void setCmTCoCod(short cmTCoCod) {
        this.cmTCoCod = cmTCoCod;
    }

    public int getCmComTimNum() {
        return cmComTimNum;
    }

    public void setCmComTimNum(int cmComTimNum) {
        this.cmComTimNum = cmComTimNum;
    }

    public short getCmDetProItm() {
        return cmDetProItm;
    }

    public void setCmDetProItm(short cmDetProItm) {
        this.cmDetProItm = cmDetProItm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cmPrvCod;
        hash += (int) cmComSucPrv;
        hash += (int) cmComPunExp;
        hash += (int) cmComNum;
        hash += (int) cmTCoCod;
        hash += (int) cmComTimNum;
        hash += (int) cmDetProItm;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmtcomdetalleproductosPK)) {
            return false;
        }
        CmtcomdetalleproductosPK other = (CmtcomdetalleproductosPK) object;
        if (this.cmPrvCod != other.cmPrvCod) {
            return false;
        }
        if (this.cmComSucPrv != other.cmComSucPrv) {
            return false;
        }
        if (this.cmComPunExp != other.cmComPunExp) {
            return false;
        }
        if (this.cmComNum != other.cmComNum) {
            return false;
        }
        if (this.cmTCoCod != other.cmTCoCod) {
            return false;
        }
        if (this.cmComTimNum != other.cmComTimNum) {
            return false;
        }
        if (this.cmDetProItm != other.cmDetProItm) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.CmtcomdetalleproductosPK[ cmPrvCod=" + cmPrvCod + ", cmComSucPrv=" + cmComSucPrv + ", cmComPunExp=" + cmComPunExp + ", cmComNum=" + cmComNum + ", cmTCoCod=" + cmTCoCod + ", cmComTimNum=" + cmComTimNum + ", cmDetProItm=" + cmDetProItm + " ]";
    }
    
}
