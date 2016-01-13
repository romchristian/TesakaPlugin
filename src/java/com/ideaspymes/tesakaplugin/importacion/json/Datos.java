
package com.ideaspymes.tesakaplugin.importacion.json;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Datos {

    /**
     * Información adicional asociada al comprobante
     * (Required)
     * 
     */
    @SerializedName("atributos")
    @Expose
    private Atributos atributos;
    /**
     * Identificador numérico del comprobante
     * 
     */
    @SerializedName("id")
    @Expose
    private String id;
    /**
     * Información del informante asociado a los comprobantes emitidos
     * 
     */
    @SerializedName("informante")
    @Expose
    private InformanteImp informante;
    /**
     * Información del cliente asociado al comprobante
     * (Required)
     * 
     */
    @SerializedName("informado")
    @Expose
    private InformadoImp informado;
    /**
     * Datos de la transacción
     * (Required)
     * 
     */
    @SerializedName("transaccion")
    @Expose
    private TransaccionImp transaccion;
    /**
     * Lista de detalle de articulos que conforman el comprobante
     * (Required)
     * 
     */
    @SerializedName("detalle")
    @Expose
    private List<DetalleImp> detalle = new ArrayList<DetalleImp>();
    /**
     * Totales asociados al detalle del comprobante
     * 
     */
    @SerializedName("totales")
    @Expose
    private TotalesImp totales;
    /**
     * Información de las retenciones asociadas al comprobante
     * (Required)
     * 
     */
    @SerializedName("retencion")
    @Expose
    private RetencionImp retencion;
    /**
     * Datos de la recepción por parte del sistema
     * 
     */
    

    /**
     * Información adicional asociada al comprobante
     * (Required)
     * 
     * @return
     *     The atributos
     */
    public Atributos getAtributos() {
        return atributos;
    }

    /**
     * Información adicional asociada al comprobante
     * (Required)
     * 
     * @param atributos
     *     The atributos
     */
    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    /**
     * Identificador numérico del comprobante
     * 
     * @return
     *     The id
     */
    public String getId() {
        return id;
    }

    /**
     * Identificador numérico del comprobante
     * 
     * @param id
     *     The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Información del informante asociado a los comprobantes emitidos
     * 
     * @return
     *     The informante
     */
    public InformanteImp getInformante() {
        return informante;
    }

    /**
     * Información del informante asociado a los comprobantes emitidos
     * 
     * @param informante
     *     The informante
     */
    public void setInformante(InformanteImp informante) {
        this.informante = informante;
    }

    /**
     * Información del cliente asociado al comprobante
     * (Required)
     * 
     * @return
     *     The informado
     */
    public InformadoImp getInformado() {
        return informado;
    }

    /**
     * Información del cliente asociado al comprobante
     * (Required)
     * 
     * @param informado
     *     The informado
     */
    public void setInformado(InformadoImp informado) {
        this.informado = informado;
    }

    /**
     * Datos de la transacción
     * (Required)
     * 
     * @return
     *     The transaccion
     */
    public TransaccionImp getTransaccion() {
        return transaccion;
    }

    /**
     * Datos de la transacción
     * (Required)
     * 
     * @param transaccion
     *     The transaccion
     */
    public void setTransaccion(TransaccionImp transaccion) {
        this.transaccion = transaccion;
    }

    /**
     * Lista de detalle de articulos que conforman el comprobante
     * (Required)
     * 
     * @return
     *     The detalle
     */
    public List<DetalleImp> getDetalle() {
        return detalle;
    }

    /**
     * Lista de detalle de articulos que conforman el comprobante
     * (Required)
     * 
     * @param detalle
     *     The detalle
     */
    public void setDetalle(List<DetalleImp> detalle) {
        this.detalle = detalle;
    }

    /**
     * Totales asociados al detalle del comprobante
     * 
     * @return
     *     The totales
     */
    public TotalesImp getTotales() {
        return totales;
    }

    /**
     * Totales asociados al detalle del comprobante
     * 
     * @param totales
     *     The totales
     */
    public void setTotales(TotalesImp totales) {
        this.totales = totales;
    }

    /**
     * Información de las retenciones asociadas al comprobante
     * (Required)
     * 
     * @return
     *     The retencion
     */
    public RetencionImp getRetencion() {
        return retencion;
    }

    /**
     * Información de las retenciones asociadas al comprobante
     * (Required)
     * 
     * @param retencion
     *     The retencion
     */
    public void setRetencion(RetencionImp retencion) {
        this.retencion = retencion;
    }

   

}
