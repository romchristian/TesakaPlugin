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
public class TetdfaPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "TeOPgNum")
    private long teOPgNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeOPgEmpAuxCod")
    private short teOPgEmpAuxCod;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeDFaItm")
    private short teDFaItm;

    public TetdfaPK() {
    }

    public TetdfaPK(long teOPgNum, short teOPgEmpAuxCod, short teDFaItm) {
        this.teOPgNum = teOPgNum;
        this.teOPgEmpAuxCod = teOPgEmpAuxCod;
        this.teDFaItm = teDFaItm;
    }

    public long getTeOPgNum() {
        return teOPgNum;
    }

    public void setTeOPgNum(long teOPgNum) {
        this.teOPgNum = teOPgNum;
    }

    public short getTeOPgEmpAuxCod() {
        return teOPgEmpAuxCod;
    }

    public void setTeOPgEmpAuxCod(short teOPgEmpAuxCod) {
        this.teOPgEmpAuxCod = teOPgEmpAuxCod;
    }

    public short getTeDFaItm() {
        return teDFaItm;
    }

    public void setTeDFaItm(short teDFaItm) {
        this.teDFaItm = teDFaItm;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) teOPgNum;
        hash += (int) teOPgEmpAuxCod;
        hash += (int) teDFaItm;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TetdfaPK)) {
            return false;
        }
        TetdfaPK other = (TetdfaPK) object;
        if (this.teOPgNum != other.teOPgNum) {
            return false;
        }
        if (this.teOPgEmpAuxCod != other.teOPgEmpAuxCod) {
            return false;
        }
        if (this.teDFaItm != other.teDFaItm) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.TetdfaPK[ teOPgNum=" + teOPgNum + ", teOPgEmpAuxCod=" + teOPgEmpAuxCod + ", teDFaItm=" + teDFaItm + " ]";
    }
    
}
