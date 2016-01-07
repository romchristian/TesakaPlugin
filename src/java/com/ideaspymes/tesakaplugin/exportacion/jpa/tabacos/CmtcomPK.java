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
public class CmtcomPK implements Serializable {

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

    public CmtcomPK() {
    }

    public CmtcomPK(short cmPrvCod, short cmComSucPrv, short cmComPunExp, int cmComNum, short cmTCoCod, int cmComTimNum) {
        this.cmPrvCod = cmPrvCod;
        this.cmComSucPrv = cmComSucPrv;
        this.cmComPunExp = cmComPunExp;
        this.cmComNum = cmComNum;
        this.cmTCoCod = cmTCoCod;
        this.cmComTimNum = cmComTimNum;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) cmPrvCod;
        hash += (int) cmComSucPrv;
        hash += (int) cmComPunExp;
        hash += (int) cmComNum;
        hash += (int) cmTCoCod;
        hash += (int) cmComTimNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CmtcomPK)) {
            return false;
        }
        CmtcomPK other = (CmtcomPK) object;
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
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.CmtcomPK[ cmPrvCod=" + cmPrvCod + ", cmComSucPrv=" + cmComSucPrv + ", cmComPunExp=" + cmComPunExp + ", cmComNum=" + cmComNum + ", cmTCoCod=" + cmTCoCod + ", cmComTimNum=" + cmComTimNum + " ]";
    }
    
}
