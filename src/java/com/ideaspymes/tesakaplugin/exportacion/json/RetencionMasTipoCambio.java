package com.ideaspymes.tesakaplugin.exportacion.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class RetencionMasTipoCambio extends Retencion {

    @SerializedName("tipoCambio")
    @Expose
    private Double tipoCambio;

    public RetencionMasTipoCambio() {
    }

    /**
     *
     * @param rentaCabezasBase
     * @param fecha
     * @param retencionRenta
     * @param moneda
     * @param rentaPorcentaje
     * @param conceptoRenta
     * @param conceptoIva
     * @param rentaToneladasBase
     * @param rentaToneladasCantidad
     * @param ivaPorcentaje5
     * @param retencionIva
     * @param ivaPorcentaje10
     * @param rentaCabezasCantidad
     * @param tipoCambio
     */
    public RetencionMasTipoCambio(String fecha, String moneda, Double tipoCambio, Boolean retencionRenta, String conceptoRenta, Boolean retencionIva, String conceptoIva, Integer rentaPorcentaje, Integer rentaCabezasBase, Integer rentaCabezasCantidad, Integer rentaToneladasBase, Integer rentaToneladasCantidad, Integer ivaPorcentaje5, Integer ivaPorcentaje10) {
        super(fecha, moneda, retencionRenta, conceptoRenta, retencionIva, conceptoIva, rentaPorcentaje, rentaCabezasBase, rentaCabezasCantidad, rentaToneladasBase, rentaToneladasCantidad, ivaPorcentaje5, ivaPorcentaje10);
        this.tipoCambio = tipoCambio;
    }

    public Double getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Double tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

}
