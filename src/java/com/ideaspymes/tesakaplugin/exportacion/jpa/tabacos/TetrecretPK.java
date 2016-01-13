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
public class TetrecretPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "NuEmpCod")
    private short nuEmpCod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeRecRetEst")
    private short teRecRetEst;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeRecRetPunExp")
    private short teRecRetPunExp;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeRecRetNumSec")
    private int teRecRetNumSec;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeRecRetTimNum")
    private int teRecRetTimNum;

    public TetrecretPK() {
    }

    public TetrecretPK(short nuEmpCod, short teRecRetEst, short teRecRetPunExp, int teRecRetNumSec, int teRecRetTimNum) {
        this.nuEmpCod = nuEmpCod;
        this.teRecRetEst = teRecRetEst;
        this.teRecRetPunExp = teRecRetPunExp;
        this.teRecRetNumSec = teRecRetNumSec;
        this.teRecRetTimNum = teRecRetTimNum;
    }

    public short getNuEmpCod() {
        return nuEmpCod;
    }

    public void setNuEmpCod(short nuEmpCod) {
        this.nuEmpCod = nuEmpCod;
    }

    public short getTeRecRetEst() {
        return teRecRetEst;
    }

    public void setTeRecRetEst(short teRecRetEst) {
        this.teRecRetEst = teRecRetEst;
    }

    public short getTeRecRetPunExp() {
        return teRecRetPunExp;
    }

    public void setTeRecRetPunExp(short teRecRetPunExp) {
        this.teRecRetPunExp = teRecRetPunExp;
    }

    public int getTeRecRetNumSec() {
        return teRecRetNumSec;
    }

    public void setTeRecRetNumSec(int teRecRetNumSec) {
        this.teRecRetNumSec = teRecRetNumSec;
    }

    public int getTeRecRetTimNum() {
        return teRecRetTimNum;
    }

    public void setTeRecRetTimNum(int teRecRetTimNum) {
        this.teRecRetTimNum = teRecRetTimNum;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) nuEmpCod;
        hash += (int) teRecRetEst;
        hash += (int) teRecRetPunExp;
        hash += (int) teRecRetNumSec;
        hash += (int) teRecRetTimNum;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TetrecretPK)) {
            return false;
        }
        TetrecretPK other = (TetrecretPK) object;
        if (this.nuEmpCod != other.nuEmpCod) {
            return false;
        }
        if (this.teRecRetEst != other.teRecRetEst) {
            return false;
        }
        if (this.teRecRetPunExp != other.teRecRetPunExp) {
            return false;
        }
        if (this.teRecRetNumSec != other.teRecRetNumSec) {
            return false;
        }
        if (this.teRecRetTimNum != other.teRecRetTimNum) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.TetrecretPK[ nuEmpCod=" + nuEmpCod + ", teRecRetEst=" + teRecRetEst + ", teRecRetPunExp=" + teRecRetPunExp + ", teRecRetNumSec=" + teRecRetNumSec + ", teRecRetTimNum=" + teRecRetTimNum + " ]";
    }
    
}
