
package com.ideaspymes.tesakaplugin.importacion.json;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Información del informante asociado a los comprobantes emitidos
 * 
 */
@Generated("org.jsonschema2pojo")
public class InformanteImp {

    /**
     * Nombre del informante
     * 
     */
    @SerializedName("nombre")
    @Expose
    private String nombre;
    /**
     * Dígito verificador
     * 
     */
    @SerializedName("dv")
    @Expose
    private String dv;
    /**
     * Nombre de fantasía
     * 
     */
    @SerializedName("nombreFantasia")
    @Expose
    private String nombreFantasia;
    /**
     * Domicilio desde el cual emite los comprobantes
     * 
     */
    @SerializedName("domicilioEmision")
    @Expose
    private String domicilioEmision;
    /**
     * Número de teléfono
     * 
     */
    @SerializedName("telefono")
    @Expose
    private String telefono;
    /**
     * RUC
     * 
     */
    @SerializedName("ruc")
    @Expose
    private String ruc;
    /**
     * Código de su establecimiento
     * 
     */
    @SerializedName("codigoEstablecimiento")
    @Expose
    private String codigoEstablecimiento;
    /**
     * Número de timbrado para facturas
     * 
     */
    @SerializedName("timbradoFactura")
    @Expose
    private String timbradoFactura;
    /**
     * Punto de expedición de las facturas
     * 
     */
    @SerializedName("puntoExpedicionFactura")
    @Expose
    private String puntoExpedicionFactura;
    /**
     * Inicio de vigencia de las facturas
     * 
     */
    @SerializedName("inicioVigenciaFactura")
    @Expose
    private String inicioVigenciaFactura;
    /**
     * Número de timbrado para comprobantes
     * 
     */
    @SerializedName("timbradoComprobante")
    @Expose
    private String timbradoComprobante;
    /**
     * Punto de expedición de los comprobantes
     * 
     */
    @SerializedName("puntoExpedicionComprobante")
    @Expose
    private String puntoExpedicionComprobante;
    /**
     * Inicio de vigencia de los comprobantes
     * 
     */
    @SerializedName("inicioVigenciaComprobante")
    @Expose
    private String inicioVigenciaComprobante;
    /**
     * Identificador del establecimiento
     * 
     */
    @SerializedName("establecimiento")
    @Expose
    private String establecimiento;

    /**
     * Nombre del informante
     * 
     * @return
     *     The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Nombre del informante
     * 
     * @param nombre
     *     The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Dígito verificador
     * 
     * @return
     *     The dv
     */
    public String getDv() {
        return dv;
    }

    /**
     * Dígito verificador
     * 
     * @param dv
     *     The dv
     */
    public void setDv(String dv) {
        this.dv = dv;
    }

    /**
     * Nombre de fantasía
     * 
     * @return
     *     The nombreFantasia
     */
    public String getNombreFantasia() {
        return nombreFantasia;
    }

    /**
     * Nombre de fantasía
     * 
     * @param nombreFantasia
     *     The nombreFantasia
     */
    public void setNombreFantasia(String nombreFantasia) {
        this.nombreFantasia = nombreFantasia;
    }

    /**
     * Domicilio desde el cual emite los comprobantes
     * 
     * @return
     *     The domicilioEmision
     */
    public String getDomicilioEmision() {
        return domicilioEmision;
    }

    /**
     * Domicilio desde el cual emite los comprobantes
     * 
     * @param domicilioEmision
     *     The domicilioEmision
     */
    public void setDomicilioEmision(String domicilioEmision) {
        this.domicilioEmision = domicilioEmision;
    }

    /**
     * Número de teléfono
     * 
     * @return
     *     The telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Número de teléfono
     * 
     * @param telefono
     *     The telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * RUC
     * 
     * @return
     *     The ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * RUC
     * 
     * @param ruc
     *     The ruc
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * Código de su establecimiento
     * 
     * @return
     *     The codigoEstablecimiento
     */
    public String getCodigoEstablecimiento() {
        return codigoEstablecimiento;
    }

    /**
     * Código de su establecimiento
     * 
     * @param codigoEstablecimiento
     *     The codigoEstablecimiento
     */
    public void setCodigoEstablecimiento(String codigoEstablecimiento) {
        this.codigoEstablecimiento = codigoEstablecimiento;
    }

    /**
     * Número de timbrado para facturas
     * 
     * @return
     *     The timbradoFactura
     */
    public String getTimbradoFactura() {
        return timbradoFactura;
    }

    /**
     * Número de timbrado para facturas
     * 
     * @param timbradoFactura
     *     The timbradoFactura
     */
    public void setTimbradoFactura(String timbradoFactura) {
        this.timbradoFactura = timbradoFactura;
    }

    /**
     * Punto de expedición de las facturas
     * 
     * @return
     *     The puntoExpedicionFactura
     */
    public String getPuntoExpedicionFactura() {
        return puntoExpedicionFactura;
    }

    /**
     * Punto de expedición de las facturas
     * 
     * @param puntoExpedicionFactura
     *     The puntoExpedicionFactura
     */
    public void setPuntoExpedicionFactura(String puntoExpedicionFactura) {
        this.puntoExpedicionFactura = puntoExpedicionFactura;
    }

    /**
     * Inicio de vigencia de las facturas
     * 
     * @return
     *     The inicioVigenciaFactura
     */
    public String getInicioVigenciaFactura() {
        return inicioVigenciaFactura;
    }

    /**
     * Inicio de vigencia de las facturas
     * 
     * @param inicioVigenciaFactura
     *     The inicioVigenciaFactura
     */
    public void setInicioVigenciaFactura(String inicioVigenciaFactura) {
        this.inicioVigenciaFactura = inicioVigenciaFactura;
    }

    /**
     * Número de timbrado para comprobantes
     * 
     * @return
     *     The timbradoComprobante
     */
    public String getTimbradoComprobante() {
        return timbradoComprobante;
    }

    /**
     * Número de timbrado para comprobantes
     * 
     * @param timbradoComprobante
     *     The timbradoComprobante
     */
    public void setTimbradoComprobante(String timbradoComprobante) {
        this.timbradoComprobante = timbradoComprobante;
    }

    /**
     * Punto de expedición de los comprobantes
     * 
     * @return
     *     The puntoExpedicionComprobante
     */
    public String getPuntoExpedicionComprobante() {
        return puntoExpedicionComprobante;
    }

    /**
     * Punto de expedición de los comprobantes
     * 
     * @param puntoExpedicionComprobante
     *     The puntoExpedicionComprobante
     */
    public void setPuntoExpedicionComprobante(String puntoExpedicionComprobante) {
        this.puntoExpedicionComprobante = puntoExpedicionComprobante;
    }

    /**
     * Inicio de vigencia de los comprobantes
     * 
     * @return
     *     The inicioVigenciaComprobante
     */
    public String getInicioVigenciaComprobante() {
        return inicioVigenciaComprobante;
    }

    /**
     * Inicio de vigencia de los comprobantes
     * 
     * @param inicioVigenciaComprobante
     *     The inicioVigenciaComprobante
     */
    public void setInicioVigenciaComprobante(String inicioVigenciaComprobante) {
        this.inicioVigenciaComprobante = inicioVigenciaComprobante;
    }

    /**
     * Identificador del establecimiento
     * 
     * @return
     *     The establecimiento
     */
    public String getEstablecimiento() {
        return establecimiento;
    }

    /**
     * Identificador del establecimiento
     * 
     * @param establecimiento
     *     The establecimiento
     */
    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

}
