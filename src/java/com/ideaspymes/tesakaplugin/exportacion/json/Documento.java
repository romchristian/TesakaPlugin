
package com.ideaspymes.tesakaplugin.exportacion.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Documento {

    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("atributos")
    @Expose
    private AtributosExp atributos;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("informado")
    @Expose
    private Informado informado;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("transaccion")
    @Expose
    private Transaccion transaccion;
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("detalle")
    @Expose
    private List<Detalle> detalle = new ArrayList<Detalle>();
    /**
     * 
     * (Required)
     * 
     */
    @SerializedName("retencion")
    @Expose
    private Retencion retencion;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Documento() {
    }

    /**
     * 
     * @param transaccion
     * @param informado
     * @param atributos
     * @param detalle
     * @param retencion
     */
    public Documento(AtributosExp atributos, Informado informado, Transaccion transaccion, List<Detalle> detalle, Retencion retencion) {
        this.atributos = atributos;
        this.informado = informado;
        this.transaccion = transaccion;
        this.detalle = detalle;
        this.retencion = retencion;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The atributos
     */
    public AtributosExp getAtributos() {
        return atributos;
    }

    /**
     * 
     * (Required)
     * 
     * @param atributos
     *     The atributos
     */
    public void setAtributos(AtributosExp atributos) {
        this.atributos = atributos;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The informado
     */
    public Informado getInformado() {
        return informado;
    }

    /**
     * 
     * (Required)
     * 
     * @param informado
     *     The informado
     */
    public void setInformado(Informado informado) {
        this.informado = informado;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The transaccion
     */
    public Transaccion getTransaccion() {
        return transaccion;
    }

    /**
     * 
     * (Required)
     * 
     * @param transaccion
     *     The transaccion
     */
    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The detalle
     */
    public List<Detalle> getDetalle() {
        return detalle;
    }

    /**
     * 
     * (Required)
     * 
     * @param detalle
     *     The detalle
     */
    public void setDetalle(List<Detalle> detalle) {
        this.detalle = detalle;
    }

    /**
     * 
     * (Required)
     * 
     * @return
     *     The retencion
     */
    public Retencion getRetencion() {
        return retencion;
    }

    /**
     * 
     * (Required)
     * 
     * @param retencion
     *     The retencion
     */
    public void setRetencion(Retencion retencion) {
        this.retencion = retencion;
    }

}
