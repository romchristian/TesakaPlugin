
package com.ideaspymes.tesakaplugin.importacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Cantidad de items
 * 
 */
@Generated("org.jsonschema2pojo")
public class DetalleImp {

    /**
     * Cantidad de items
     * (Required)
     * 
     */
    @SerializedName("cantidad")
    @Expose
    private Double cantidad;
    /**
     * Tasa que se aplica al item (exento(0), 5% o 10%)
     * (Required)
     * 
     */
    @SerializedName("tasaAplica")
    @Expose
    private DetalleImp.TasaAplica tasaAplica;
    /**
     * Valor del Precio de un item
     * (Required)
     * 
     */
    @SerializedName("precioUnitario")
    @Expose
    private Double precioUnitario;
    /**
     * Precio Total
     * 
     */
    @SerializedName("precioTotal")
    @Expose
    private Double precioTotal;
    /**
     * Impuesto Exento
     * 
     */
    @SerializedName("impuestoExento")
    @Expose
    private Double impuestoExento;
    /**
     * Impuesto al 5%
     * 
     */
    @SerializedName("impuestoAl5")
    @Expose
    private Double impuestoAl5;
    /**
     * Impuesto al 10%
     * 
     */
    @SerializedName("impuestoAl10")
    @Expose
    private Double impuestoAl10;
    /**
     * Precio total exento
     * 
     */
    @SerializedName("precioTotalExento")
    @Expose
    private Double precioTotalExento;
    /**
     * Precio total al 5%
     * 
     */
    @SerializedName("precioTotalAl5")
    @Expose
    private Double precioTotalAl5;
    /**
     * Precio total al 10%
     * 
     */
    @SerializedName("precioTotalAl10")
    @Expose
    private Double precioTotalAl10;
    /**
     * Descripción de la fila de detalle
     * (Required)
     * 
     */
    @SerializedName("descripcion")
    @Expose
    private String descripcion;

    /**
     * Cantidad de items
     * (Required)
     * 
     * @return
     *     The cantidad
     */
    public Double getCantidad() {
        return cantidad;
    }

    /**
     * Cantidad de items
     * (Required)
     * 
     * @param cantidad
     *     The cantidad
     */
    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Tasa que se aplica al item (exento(0), 5% o 10%)
     * (Required)
     * 
     * @return
     *     The tasaAplica
     */
    public DetalleImp.TasaAplica getTasaAplica() {
        return tasaAplica;
    }

    /**
     * Tasa que se aplica al item (exento(0), 5% o 10%)
     * (Required)
     * 
     * @param tasaAplica
     *     The tasaAplica
     */
    public void setTasaAplica(DetalleImp.TasaAplica tasaAplica) {
        this.tasaAplica = tasaAplica;
    }

    /**
     * Valor del Precio de un item
     * (Required)
     * 
     * @return
     *     The precioUnitario
     */
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Valor del Precio de un item
     * (Required)
     * 
     * @param precioUnitario
     *     The precioUnitario
     */
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Precio Total
     * 
     * @return
     *     The precioTotal
     */
    public Double getPrecioTotal() {
        return precioTotal;
    }

    /**
     * Precio Total
     * 
     * @param precioTotal
     *     The precioTotal
     */
    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    /**
     * Impuesto Exento
     * 
     * @return
     *     The impuestoExento
     */
    public Double getImpuestoExento() {
        return impuestoExento;
    }

    /**
     * Impuesto Exento
     * 
     * @param impuestoExento
     *     The impuestoExento
     */
    public void setImpuestoExento(Double impuestoExento) {
        this.impuestoExento = impuestoExento;
    }

    /**
     * Impuesto al 5%
     * 
     * @return
     *     The impuestoAl5
     */
    public Double getImpuestoAl5() {
        return impuestoAl5;
    }

    /**
     * Impuesto al 5%
     * 
     * @param impuestoAl5
     *     The impuestoAl5
     */
    public void setImpuestoAl5(Double impuestoAl5) {
        this.impuestoAl5 = impuestoAl5;
    }

    /**
     * Impuesto al 10%
     * 
     * @return
     *     The impuestoAl10
     */
    public Double getImpuestoAl10() {
        return impuestoAl10;
    }

    /**
     * Impuesto al 10%
     * 
     * @param impuestoAl10
     *     The impuestoAl10
     */
    public void setImpuestoAl10(Double impuestoAl10) {
        this.impuestoAl10 = impuestoAl10;
    }

    /**
     * Precio total exento
     * 
     * @return
     *     The precioTotalExento
     */
    public Double getPrecioTotalExento() {
        return precioTotalExento;
    }

    /**
     * Precio total exento
     * 
     * @param precioTotalExento
     *     The precioTotalExento
     */
    public void setPrecioTotalExento(Double precioTotalExento) {
        this.precioTotalExento = precioTotalExento;
    }

    /**
     * Precio total al 5%
     * 
     * @return
     *     The precioTotalAl5
     */
    public Double getPrecioTotalAl5() {
        return precioTotalAl5;
    }

    /**
     * Precio total al 5%
     * 
     * @param precioTotalAl5
     *     The precioTotalAl5
     */
    public void setPrecioTotalAl5(Double precioTotalAl5) {
        this.precioTotalAl5 = precioTotalAl5;
    }

    /**
     * Precio total al 10%
     * 
     * @return
     *     The precioTotalAl10
     */
    public Double getPrecioTotalAl10() {
        return precioTotalAl10;
    }

    /**
     * Precio total al 10%
     * 
     * @param precioTotalAl10
     *     The precioTotalAl10
     */
    public void setPrecioTotalAl10(Double precioTotalAl10) {
        this.precioTotalAl10 = precioTotalAl10;
    }

    /**
     * Descripción de la fila de detalle
     * (Required)
     * 
     * @return
     *     The descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Descripción de la fila de detalle
     * (Required)
     * 
     * @param descripcion
     *     The descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Generated("org.jsonschema2pojo")
    public static enum TasaAplica {

        @SerializedName("0")
        _0("0"),
        @SerializedName("5")
        _5("5"),
        @SerializedName("10")
        _10("10");
        private final String value;
        private final static Map<String, DetalleImp.TasaAplica> CONSTANTS = new HashMap<String, DetalleImp.TasaAplica>();

        static {
            for (DetalleImp.TasaAplica c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TasaAplica(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static DetalleImp.TasaAplica fromValue(String value) {
            DetalleImp.TasaAplica constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
