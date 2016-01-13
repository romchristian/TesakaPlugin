
package com.ideaspymes.tesakaplugin.importacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Datos de la transacción
 * 
 */
@Generated("org.jsonschema2pojo")
public class TransaccionImp {

    /**
     * Indica la condicion de compra 
     * (Required)
     * 
     */
    @SerializedName("condicionCompra")
    @Expose
    private TransaccionImp.CondicionCompra condicionCompra;
    /**
     * En caso de una condicion de compra CREDITO especificar la cantidad de cuotas
     * 
     */
    @SerializedName("cuotas")
    @Expose
    private Integer cuotas;
    /**
     * Codificacion de tipo de comprobante
     * (Required)
     * 
     */
    @SerializedName("tipoComprobante")
    @Expose
    private TransaccionImp.TipoComprobante tipoComprobante;
    /**
     * Indica el número del comprobante de venta sobre la cual se practicara la retención
     * (Required)
     * 
     */
    @SerializedName("numeroComprobanteVenta")
    @Expose
    private String numeroComprobanteVenta;
    /**
     * Indica la fecha del comprobante de venta sobre la cual se efectuó la retención
     * (Required)
     * 
     */
    @SerializedName("fecha")
    @Expose
    private String fecha;
    /**
     * Timbrado del comprobante de venta sobre la cual se practica la retención
     * (Required)
     * 
     */
    @SerializedName("numeroTimbrado")
    @Expose
    private String numeroTimbrado;
    /**
     * Nombre del tipo de comprobante
     * 
     */
    @SerializedName("tipoComprobanteNombre")
    @Expose
    private String tipoComprobanteNombre;

    /**
     * Indica la condicion de compra 
     * (Required)
     * 
     * @return
     *     The condicionCompra
     */
    public TransaccionImp.CondicionCompra getCondicionCompra() {
        return condicionCompra;
    }

    /**
     * Indica la condicion de compra 
     * (Required)
     * 
     * @param condicionCompra
     *     The condicionCompra
     */
    public void setCondicionCompra(TransaccionImp.CondicionCompra condicionCompra) {
        this.condicionCompra = condicionCompra;
    }

    /**
     * En caso de una condicion de compra CREDITO especificar la cantidad de cuotas
     * 
     * @return
     *     The cuotas
     */
    public Integer getCuotas() {
        return cuotas;
    }

    /**
     * En caso de una condicion de compra CREDITO especificar la cantidad de cuotas
     * 
     * @param cuotas
     *     The cuotas
     */
    public void setCuotas(Integer cuotas) {
        this.cuotas = cuotas;
    }

    /**
     * Codificacion de tipo de comprobante
     * (Required)
     * 
     * @return
     *     The tipoComprobante
     */
    public TransaccionImp.TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    /**
     * Codificacion de tipo de comprobante
     * (Required)
     * 
     * @param tipoComprobante
     *     The tipoComprobante
     */
    public void setTipoComprobante(TransaccionImp.TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    /**
     * Indica el número del comprobante de venta sobre la cual se practicara la retención
     * (Required)
     * 
     * @return
     *     The numeroComprobanteVenta
     */
    public String getNumeroComprobanteVenta() {
        return numeroComprobanteVenta;
    }

    /**
     * Indica el número del comprobante de venta sobre la cual se practicara la retención
     * (Required)
     * 
     * @param numeroComprobanteVenta
     *     The numeroComprobanteVenta
     */
    public void setNumeroComprobanteVenta(String numeroComprobanteVenta) {
        this.numeroComprobanteVenta = numeroComprobanteVenta;
    }

    /**
     * Indica la fecha del comprobante de venta sobre la cual se efectuó la retención
     * (Required)
     * 
     * @return
     *     The fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Indica la fecha del comprobante de venta sobre la cual se efectuó la retención
     * (Required)
     * 
     * @param fecha
     *     The fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Timbrado del comprobante de venta sobre la cual se practica la retención
     * (Required)
     * 
     * @return
     *     The numeroTimbrado
     */
    public String getNumeroTimbrado() {
        return numeroTimbrado;
    }

    /**
     * Timbrado del comprobante de venta sobre la cual se practica la retención
     * (Required)
     * 
     * @param numeroTimbrado
     *     The numeroTimbrado
     */
    public void setNumeroTimbrado(String numeroTimbrado) {
        this.numeroTimbrado = numeroTimbrado;
    }

    /**
     * Nombre del tipo de comprobante
     * 
     * @return
     *     The tipoComprobanteNombre
     */
    public String getTipoComprobanteNombre() {
        return tipoComprobanteNombre;
    }

    /**
     * Nombre del tipo de comprobante
     * 
     * @param tipoComprobanteNombre
     *     The tipoComprobanteNombre
     */
    public void setTipoComprobanteNombre(String tipoComprobanteNombre) {
        this.tipoComprobanteNombre = tipoComprobanteNombre;
    }

    @Generated("org.jsonschema2pojo")
    public static enum CondicionCompra {

        @SerializedName("CONTADO")
        CONTADO("CONTADO"),
        @SerializedName("CREDITO")
        CREDITO("CREDITO");
        private final String value;
        private final static Map<String, TransaccionImp.CondicionCompra> CONSTANTS = new HashMap<String, TransaccionImp.CondicionCompra>();

        static {
            for (TransaccionImp.CondicionCompra c: values()) {
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

        public static TransaccionImp.CondicionCompra fromValue(String value) {
            TransaccionImp.CondicionCompra constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum TipoComprobante {

        @SerializedName("1")
        _1("1"),
        @SerializedName("5")
        _5("5"),
        @SerializedName("11")
        _11("11"),
        @SerializedName("17")
        _17("17"),
        @SerializedName("18")
        _18("18");
        private final String value;
        private final static Map<String, TransaccionImp.TipoComprobante> CONSTANTS = new HashMap<String, TransaccionImp.TipoComprobante>();

        static {
            for (TransaccionImp.TipoComprobante c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoComprobante(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static TransaccionImp.TipoComprobante fromValue(String value) {
            TransaccionImp.TipoComprobante constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
