
package com.ideaspymes.tesakaplugin.importacion.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Datos de la recepción por parte del sistema
 * 
 */
@Generated("org.jsonschema2pojo")
public class RecepcionImp {

    /**
     *  Fecha en que se procesa la información del comprobante
     * 
     */
    @SerializedName("fechaProceso")
    @Expose
    private String fechaProceso;
    /**
     * Número del comprobante
     * 
     */
    @SerializedName("numeroComprobante")
    @Expose
    private String numeroComprobante;
    /**
     * Fecha en que se emite el comprobante
     * 
     */
    @SerializedName("fechaEmision")
    @Expose
    private String fechaEmision;
    /**
     * Cadena de Control
     * 
     */
    @SerializedName("cadenaControl")
    @Expose
    private String cadenaControl;
    /**
     * Numero de Comprobante (copia de numeroComprobante)
     * 
     */
    @SerializedName("numero")
    @Expose
    private String numero;
    /**
     * Fecha en que fue recibido el comprobante en Marangatu
     * 
     */
    @SerializedName("fechaRecepcion")
    @Expose
    private String fechaRecepcion;
    /**
     * Valor que identifica los datos recibidos
     * 
     */
    @SerializedName("hash")
    @Expose
    private String hash;
    /**
     * Verdadero, en caso de recibir y procesar los datos sin observaciones
     * 
     */
    @SerializedName("recepcionCorrecta")
    @Expose
    private Boolean recepcionCorrecta;
    /**
     * Si existen errores en la recepción y procesamiento, el detalle de lo ocurrido
     * 
     */
    @SerializedName("mensajeRecepcion")
    @Expose
    private String mensajeRecepcion;
    /**
     * Verdadero, en caso de recibir y procesar los datos sin observaciones
     * 
     */
    @SerializedName("procesamientoCorrecto")
    @Expose
    private Boolean procesamientoCorrecto;
    /**
     * Si existen errores en la recepción y procesamiento, el detalle de lo ocurrido
     * 
     */
    @SerializedName("mensajeProcesamiento")
    @Expose
    private String mensajeProcesamiento;

    /**
     *  Fecha en que se procesa la información del comprobante
     * 
     * @return
     *     The fechaProceso
     */
    public String getFechaProceso() {
        return fechaProceso;
    }

    /**
     *  Fecha en que se procesa la información del comprobante
     * 
     * @param fechaProceso
     *     The fechaProceso
     */
    public void setFechaProceso(String fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    /**
     * Número del comprobante
     * 
     * @return
     *     The numeroComprobante
     */
    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    /**
     * Número del comprobante
     * 
     * @param numeroComprobante
     *     The numeroComprobante
     */
    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    /**
     * Fecha en que se emite el comprobante
     * 
     * @return
     *     The fechaEmision
     */
    public String getFechaEmision() {
        return fechaEmision;
    }

    /**
     * Fecha en que se emite el comprobante
     * 
     * @param fechaEmision
     *     The fechaEmision
     */
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    /**
     * Cadena de Control
     * 
     * @return
     *     The cadenaControl
     */
    public String getCadenaControl() {
        return cadenaControl;
    }

    /**
     * Cadena de Control
     * 
     * @param cadenaControl
     *     The cadenaControl
     */
    public void setCadenaControl(String cadenaControl) {
        this.cadenaControl = cadenaControl;
    }

    /**
     * Numero de Comprobante (copia de numeroComprobante)
     * 
     * @return
     *     The numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Numero de Comprobante (copia de numeroComprobante)
     * 
     * @param numero
     *     The numero
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Fecha en que fue recibido el comprobante en Marangatu
     * 
     * @return
     *     The fechaRecepcion
     */
    public String getFechaRecepcion() {
        return fechaRecepcion;
    }

    /**
     * Fecha en que fue recibido el comprobante en Marangatu
     * 
     * @param fechaRecepcion
     *     The fechaRecepcion
     */
    public void setFechaRecepcion(String fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    /**
     * Valor que identifica los datos recibidos
     * 
     * @return
     *     The hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Valor que identifica los datos recibidos
     * 
     * @param hash
     *     The hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Verdadero, en caso de recibir y procesar los datos sin observaciones
     * 
     * @return
     *     The recepcionCorrecta
     */
    public Boolean getRecepcionCorrecta() {
        return recepcionCorrecta;
    }

    /**
     * Verdadero, en caso de recibir y procesar los datos sin observaciones
     * 
     * @param recepcionCorrecta
     *     The recepcionCorrecta
     */
    public void setRecepcionCorrecta(Boolean recepcionCorrecta) {
        this.recepcionCorrecta = recepcionCorrecta;
    }

    /**
     * Si existen errores en la recepción y procesamiento, el detalle de lo ocurrido
     * 
     * @return
     *     The mensajeRecepcion
     */
    public String getMensajeRecepcion() {
        return mensajeRecepcion;
    }

    /**
     * Si existen errores en la recepción y procesamiento, el detalle de lo ocurrido
     * 
     * @param mensajeRecepcion
     *     The mensajeRecepcion
     */
    public void setMensajeRecepcion(String mensajeRecepcion) {
        this.mensajeRecepcion = mensajeRecepcion;
    }

    /**
     * Verdadero, en caso de recibir y procesar los datos sin observaciones
     * 
     * @return
     *     The procesamientoCorrecto
     */
    public Boolean getProcesamientoCorrecto() {
        return procesamientoCorrecto;
    }

    /**
     * Verdadero, en caso de recibir y procesar los datos sin observaciones
     * 
     * @param procesamientoCorrecto
     *     The procesamientoCorrecto
     */
    public void setProcesamientoCorrecto(Boolean procesamientoCorrecto) {
        this.procesamientoCorrecto = procesamientoCorrecto;
    }

    /**
     * Si existen errores en la recepción y procesamiento, el detalle de lo ocurrido
     * 
     * @return
     *     The mensajeProcesamiento
     */
    public String getMensajeProcesamiento() {
        return mensajeProcesamiento;
    }

    /**
     * Si existen errores en la recepción y procesamiento, el detalle de lo ocurrido
     * 
     * @param mensajeProcesamiento
     *     The mensajeProcesamiento
     */
    public void setMensajeProcesamiento(String mensajeProcesamiento) {
        this.mensajeProcesamiento = mensajeProcesamiento;
    }

}
