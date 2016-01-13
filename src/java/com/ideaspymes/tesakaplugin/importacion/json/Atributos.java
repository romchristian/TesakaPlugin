
package com.ideaspymes.tesakaplugin.importacion.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Información adicional asociada al comprobante
 * 
 */
@Generated("org.jsonschema2pojo")
public class Atributos {

    /**
     * Fecha de creación del comprobante
     * (Required)
     * 
     */
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    /**
     * Fecha y hora de creación del comprobante
     * 
     */
    @SerializedName("fechaHoraCreacion")
    @Expose
    private String fechaHoraCreacion;
    /**
     * Identificador único del comprobante
     * 
     */
    @SerializedName("uuid")
    @Expose
    private String uuid;

    /**
     * Fecha de creación del comprobante
     * (Required)
     * 
     * @return
     *     The fechaCreacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Fecha de creación del comprobante
     * (Required)
     * 
     * @param fechaCreacion
     *     The fechaCreacion
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * Fecha y hora de creación del comprobante
     * 
     * @return
     *     The fechaHoraCreacion
     */
    public String getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     * Fecha y hora de creación del comprobante
     * 
     * @param fechaHoraCreacion
     *     The fechaHoraCreacion
     */
    public void setFechaHoraCreacion(String fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    /**
     * Identificador único del comprobante
     * 
     * @return
     *     The uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Identificador único del comprobante
     * 
     * @param uuid
     *     The uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
