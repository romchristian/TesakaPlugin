package com.ideaspymes.tesakaplugin.exportacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Detalle {

    /**
     * Cantidad de items (Required)
     *
     */
    @SerializedName("cantidad")
    @Expose
    private Double cantidad;
    /**
     * Se debe indicar la tasa que se aplica al item (exento(0), 5% o 10%)
     * (Required)
     *
     */
    @SerializedName("tasaAplica")
    @Expose
    private String tasaAplica;
    /**
     * Valor del Precio de un item (Required)
     *
     */
    @SerializedName("precioUnitario")
    @Expose
    private Double precioUnitario;
    /**
     * Descripción de la fila de detalle (Required)
     *
     */
    @SerializedName("descripcion")
    @Expose
    private String descripcion;

    /**
     * No args constructor for use in serialization
     *
     */
    public Detalle() {
    }

    /**
     *
     * @param precioUnitario
     * @param tasaAplica
     * @param cantidad
     * @param descripcion
     */
    public Detalle(Double cantidad, String tasaAplica, Double precioUnitario, String descripcion) {
        this.cantidad = cantidad;
        this.tasaAplica = tasaAplica;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
    }

    /**
     * Cantidad de items (Required)
     *
     * @return The cantidad
     */
    public Double getCantidad() {
        return cantidad;
    }

    /**
     * Cantidad de items (Required)
     *
     * @param cantidad The cantidad
     */
    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public String getTasaAplica() {
        return tasaAplica;
    }

    public void setTasaAplica(String tasaAplica) {
        this.tasaAplica = tasaAplica;
    }

    /**
     * Valor del Precio de un item (Required)
     *
     * @return The precioUnitario
     */
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    /**
     * Valor del Precio de un item (Required)
     *
     * @param precioUnitario The precioUnitario
     */
    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    /**
     * Descripción de la fila de detalle (Required)
     *
     * @return The descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Descripción de la fila de detalle (Required)
     *
     * @param descripcion The descripcion
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
        private final static Map<String, Detalle.TasaAplica> CONSTANTS = new HashMap<String, Detalle.TasaAplica>();

        static {
            for (Detalle.TasaAplica c : values()) {
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

        public static Detalle.TasaAplica fromValue(String value) {
            Detalle.TasaAplica constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
