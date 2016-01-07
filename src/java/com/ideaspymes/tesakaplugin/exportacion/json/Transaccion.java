package com.ideaspymes.tesakaplugin.exportacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Transaccion {

    /**
     * Aqui debe informar la condicion de compra (Required)
     *
     */
    @SerializedName("condicionCompra")
    @Expose
    private String condicionCompra;
    /**
     * En caso de una condicion de compra CREDITO especificar la cantidad de
     * cuotas
     *
     */
    @SerializedName("cuotas")
    @Expose
    private Integer cuotas;
    /**
     * Codificacion de tipo de comprobante (Solicite la tabla de referencia a la
     * Institucion) (Required)
     *
     */
    @SerializedName("tipoComprobante")
    @Expose
    private Integer tipoComprobante;
    /**
     * Aqui debe ingresar en numero del comprobante de venta sobre la cual se
     * practicara la retencion (Required)
     *
     */
    @SerializedName("numeroComprobanteVenta")
    @Expose
    private String numeroComprobanteVenta;
    /**
     * Aqui debe ingresar la fecha del comprobante de venta (Required)
     *
     */
    @SerializedName("fecha")
    @Expose
    private String fecha;
    /**
     * Aqui debe ingresar en numero de timbrado del comprobante de venta
     * (Required)
     *
     */
    @SerializedName("numeroTimbrado")
    @Expose
    private String numeroTimbrado;

    /**
     * No args constructor for use in serialization
     *
     */
    public Transaccion() {
    }

    /**
     *
     * @param cuotas
     * @param fecha
     * @param tipoComprobante
     * @param numeroTimbrado
     * @param condicionCompra
     * @param numeroComprobanteVenta
     */
    public Transaccion(String condicionCompra, Integer cuotas, Integer tipoComprobante, String numeroComprobanteVenta, String fecha, String numeroTimbrado) {
        this.condicionCompra = condicionCompra;
        this.cuotas = cuotas;
        this.tipoComprobante = tipoComprobante;
        this.numeroComprobanteVenta = numeroComprobanteVenta;
        this.fecha = fecha;
        this.numeroTimbrado = numeroTimbrado;
    }

    public String getCondicionCompra() {
        return condicionCompra;
    }

    public void setCondicionCompra(String condicionCompra) {
        this.condicionCompra = condicionCompra;
    }

    /**
     * En caso de una condicion de compra CREDITO especificar la cantidad de
     * cuotas
     *
     * @return The cuotas
     */
    public Integer getCuotas() {
        return cuotas;
    }

    /**
     * En caso de una condicion de compra CREDITO especificar la cantidad de
     * cuotas
     *
     * @param cuotas The cuotas
     */
    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * Codificacion de tipo de comprobante (Solicite la tabla de referencia a la
     * Institucion) (Required)
     *
     * @return The tipoComprobante
     */
    public Integer getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Codificacion de tipo de comprobante (Solicite la tabla de referencia a la
     * Institucion) (Required)
     *
     * @param tipoComprobante The tipoComprobante
     */
    public void setTipoComprobante(Integer tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    /**
     * Aqui debe ingresar en numero del comprobante de venta sobre la cual se
     * practicara la retencion (Required)
     *
     * @return The numeroComprobanteVenta
     */
    public String getNumeroComprobanteVenta() {
        return numeroComprobanteVenta;
    }

    /**
     * Aqui debe ingresar en numero del comprobante de venta sobre la cual se
     * practicara la retencion (Required)
     *
     * @param numeroComprobanteVenta The numeroComprobanteVenta
     */
    public void setNumeroComprobanteVenta(String numeroComprobanteVenta) {
        this.numeroComprobanteVenta = numeroComprobanteVenta;
    }

    /**
     * Aqui debe ingresar la fecha del comprobante de venta (Required)
     *
     * @return The fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Aqui debe ingresar la fecha del comprobante de venta (Required)
     *
     * @param fecha The fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Aqui debe ingresar en numero de timbrado del comprobante de venta
     * (Required)
     *
     * @return The numeroTimbrado
     */
    public String getNumeroTimbrado() {
        return numeroTimbrado;
    }

    /**
     * Aqui debe ingresar en numero de timbrado del comprobante de venta
     * (Required)
     *
     * @param numeroTimbrado The numeroTimbrado
     */
    public void setNumeroTimbrado(String numeroTimbrado) {
        this.numeroTimbrado = numeroTimbrado;
    }

    @Generated("org.jsonschema2pojo")
    public static enum CondicionCompra {

        @SerializedName("CONTADO")
        CONTADO("CONTADO"),
        @SerializedName("CREDITO")
        CREDITO("CREDITO");
        private final String value;
        private final static Map<String, Transaccion.CondicionCompra> CONSTANTS = new HashMap<String, Transaccion.CondicionCompra>();

        static {
            for (Transaccion.CondicionCompra c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private CondicionCompra(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static Transaccion.CondicionCompra fromValue(String value) {
            Transaccion.CondicionCompra constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
