package com.ideaspymes.tesakaplugin.importacion.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class DocumentoGenerado {

    /**
     *
     * (Required)
     *
     */
    @SerializedName("datos")
    @Expose
    private Datos datos;

    @SerializedName("recepcion")
    @Expose
    private RecepcionImp recepcion;

    @SerializedName("estado")
    @Expose
    private String estado;

    /**
     *
     * (Required)
     *
     * @return The datos
     */
    public Datos getDatos() {
        return datos;
    }

    /**
     *
     * (Required)
     *
     * @param datos The datos
     */
    public void setDatos(Datos datos) {
        this.datos = datos;
    }

    /**
     * Datos de la recepción por parte del sistema
     *
     * @return The recepcion
     */
    public RecepcionImp getRecepcion() {
        return recepcion;
    }

    /**
     * Datos de la recepción por parte del sistema
     *
     * @param recepcion The recepcion
     */
    public void setRecepcion(RecepcionImp recepcion) {
        this.recepcion = recepcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
