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
public class TetopgPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "TeOPgNum")
    private long teOPgNum;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TeOPgEmpAuxCod")
    private short teOPgEmpAuxCod;

    public TetopgPK() {
    }

    public TetopgPK(long teOPgNum, short teOPgEmpAuxCod) {
        this.teOPgNum = teOPgNum;
        this.teOPgEmpAuxCod = teOPgEmpAuxCod;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) teOPgNum;
        hash += (int) teOPgEmpAuxCod;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TetopgPK)) {
            return false;
        }
        TetopgPK other = (TetopgPK) object;
        if (this.teOPgNum != other.teOPgNum) {
            return false;
        }
        if (this.teOPgEmpAuxCod != other.teOPgEmpAuxCod) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ideaspymes.tesakaplugin.exportacion.jpa.TetopgPK[ teOPgNum=" + teOPgNum + ", teOPgEmpAuxCod=" + teOPgEmpAuxCod + " ]";
    }
    
}
