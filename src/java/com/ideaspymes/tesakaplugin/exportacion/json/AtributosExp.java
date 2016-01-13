
package com.ideaspymes.tesakaplugin.exportacion.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class AtributosExp {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("fechaCreacion")
    @Expose
    private String fechaCreacion;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("fechaHoraCreacion")
    @Expose
    private String fechaHoraCreacion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AtributosExp() {
    }

    /**
     * 
     * @param fechaHoraCreacion
     * @param fechaCreacion
     */
    public AtributosExp(String fechaCreacion, String fechaHoraCreacion) {
        this.fechaCreacion = fechaCreacion;
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fechaCreacion
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * 
     * (Required)
     * 
     * @param fechaCreacion
     *     The fechaCreacion
     */
    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The fechaHoraCreacion
     */
    public String getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    /**
     * 
     * (Required)
     * 
     * @param fechaHoraCreacion
     *     The fechaHoraCreacion
     */
    public void setFechaHoraCreacion(String fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

}
