/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.importacion.jpa;

import com.ideaspymes.tesakaplugin.importacion.json.Datos;
import com.ideaspymes.tesakaplugin.importacion.json.DetalleImp;
import com.ideaspymes.tesakaplugin.importacion.json.RecepcionImp;
import com.ideaspymes.tesakaplugin.importacion.json.RetencionImp;
import com.ideaspymes.tesakaplugin.importacion.json.TransaccionImp;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Temporal;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author christian.romero
 */
@Entity
public class RetencionGenerada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String uuid;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaCreacion;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date fechaHoraCreacion;

    private String codigoEstablecimiento;
    private String timbradoComprobante;
    private String puntoExpedicionComprobante;
    private String establecimiento;

    //factura
    @Enumerated(EnumType.STRING)
    private TransaccionImp.CondicionCompra condicionCompra;
    @Enumerated(EnumType.STRING)
    private TransaccionImp.TipoComprobante tipoComprobante;
    private String numeroTimbradoFactura;
    private String numeroComprobanteVenta;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaFactura;
    private String proveedorRuc;
    private String proveedorDv;
    private String proveedorNombre;
    private String proveedorSituacion;
    private String proveedorDomicilio;
    private String proveedorCorreo;
    private String proveedorTipoIdentificacion;
    private String proveedorIdentificacion;
    private Double totalFactura;

    //retencion
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaRetencion;
    @Enumerated(EnumType.STRING)
    private RetencionImp.Moneda moneda;
    private Integer tipoCambio;
    private Boolean retencionIva;
    private Boolean retencionRenta;
    private String conceptoRenta;
    private String conceptoIva;
    private Boolean habilitadoRentaCabezas;
    private Boolean habilitadoRentaToneladas;
    private Double ivaBase5;
    private Double ivaTotal5;
    private Double ivaBase10;
    private Double ivaTotal10;
    private Double ivaTotal;
    private Double rentaBase;
    private Double rentaTotal;
    private Integer rentaCabezasBase;
    private Integer rentaCabezasCantidad;
    private Integer rentaCabezasTotal;
    private Integer rentaToneladasBase;
    private Integer rentaToneladasCantidad;
    private Integer rentaToneladasTotal;
    private Integer retencionIvaTotal;
    private Integer retencionRentaTotal;
    private Integer retencionTotal;
    private RetencionImp.RentaPorcentaje rentaPorcentaje;
    private String conceptoIvaNombre;
    private String conceptoRentaNombre;
    @Enumerated(EnumType.STRING)
    private RetencionImp.IvaPorcentaje5 ivaPorcentaje5;
    @Enumerated(EnumType.STRING)
    private RetencionImp.IvaPorcentaje10 ivaPorcentaje10;
    private String monedaNombre;

    //totales
    private Double impuestoTotalExento;
    private Double impuestoTotalAl5;
    private Double impuestoTotalAl10;
    private Double valorTotalExento;
    private Double valorTotalAl5;
    private Double valorTotalAl10;
    private Double impuestoTotal;
    private Double valorTotal;

    //recepcion
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaProceso;
    private String numeroComprobante;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaEmision;
    private String cadenaControl;
    private String numero;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fechaRecepcion;
    private String hashString;
    private Boolean recepcionCorrecta;
    private String mensajeRecepcion;
    private Boolean procesamientoCorrecto;
    private String mensajeProcesamiento;
    private Boolean migrado;

    public RetencionGenerada() {
    }

    public RetencionGenerada(Datos d, RecepcionImp r) {

        this.uuid = d.getAtributos().getUuid();

        this.fechaCreacion = DateTime.parse(d.getAtributos().getFechaCreacion(),
                DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();
        this.fechaHoraCreacion = DateTime.parse(d.getAtributos().getFechaHoraCreacion(),
                DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss")).toDate();;

        this.codigoEstablecimiento = d.getInformante().getCodigoEstablecimiento();
        this.timbradoComprobante = d.getInformante().getTimbradoComprobante();
        this.puntoExpedicionComprobante = d.getInformante().getPuntoExpedicionComprobante();
        this.establecimiento = d.getInformante().getEstablecimiento();

        this.condicionCompra = d.getTransaccion().getCondicionCompra();
        this.tipoComprobante = d.getTransaccion().getTipoComprobante();
        this.numeroTimbradoFactura = d.getTransaccion().getNumeroTimbrado();
        this.numeroComprobanteVenta = d.getTransaccion().getNumeroComprobanteVenta();
        this.fechaFactura = DateTime.parse(d.getTransaccion().getFecha(),
                DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();;
        this.proveedorRuc = d.getInformado().getRuc();
        this.proveedorDv = d.getInformado().getDv();
        this.proveedorNombre = d.getInformado().getNombre();
        this.proveedorTipoIdentificacion = d.getInformado().getTipoIdentificacionNombre();
        this.proveedorIdentificacion = d.getInformado().getIdentificacion();
        this.proveedorSituacion = d.getInformado().getSituacion();
        this.proveedorCorreo = d.getInformado().getCorreoElectronico();
        this.proveedorDomicilio = d.getInformado().getDomicilio() == null ? d.getInformado().getDireccion() : d.getInformado().getDomicilio();

        Double total = 0d;
        for (DetalleImp dt : d.getDetalle()) {
            total += (dt.getPrecioUnitario() * dt.getCantidad());
        }

        this.totalFactura = total;

        this.fechaRetencion = DateTime.parse(d.getRetencion().getFecha(),
                DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();
        this.moneda = d.getRetencion().getMoneda();
        this.tipoCambio = d.getRetencion().getTipoCambio();
        this.retencionIva = d.getRetencion().getRetencionIva();
        this.retencionRenta = d.getRetencion().getRetencionRenta();
        this.conceptoRenta = d.getRetencion().getConceptoRenta();
        this.conceptoIva = d.getRetencion().getConceptoIva();
        this.habilitadoRentaCabezas = d.getRetencion().getHabilitadoRentaCabezas();
        this.habilitadoRentaToneladas = d.getRetencion().getHabilitadoRentaToneladas();
        this.ivaBase5 = d.getRetencion().getIvaBase5();
        this.ivaTotal5 = d.getRetencion().getIvaTotal5();
        this.ivaBase10 = d.getRetencion().getIvaBase10();
        this.ivaTotal10 = d.getRetencion().getIvaTotal10();
        this.ivaTotal = d.getRetencion().getIvaTotal();
        this.rentaBase = d.getRetencion().getRentaBase();
        this.rentaTotal = d.getRetencion().getRentaTotal();
        this.rentaCabezasBase = d.getRetencion().getRentaCabezasBase();
        this.rentaCabezasCantidad = d.getRetencion().getRentaCabezasCantidad();
        this.rentaCabezasTotal = d.getRetencion().getRentaCabezasTotal();
        this.rentaToneladasBase = d.getRetencion().getRentaToneladasBase();
        this.rentaToneladasCantidad = d.getRetencion().getRentaToneladasCantidad();
        this.rentaToneladasTotal = d.getRetencion().getRentaToneladasTotal();
        this.retencionIvaTotal = d.getRetencion().getRetencionIvaTotal();
        this.retencionRentaTotal = d.getRetencion().getRetencionRentaTotal();
        this.retencionTotal = d.getRetencion().getRetencionTotal();
        this.rentaPorcentaje = d.getRetencion().getRentaPorcentaje();
        this.conceptoIvaNombre = d.getRetencion().getConceptoIvaNombre();
        this.conceptoRentaNombre = d.getRetencion().getConceptoRentaNombre();
        this.ivaPorcentaje5 = d.getRetencion().getIvaPorcentaje5();
        this.ivaPorcentaje10 = d.getRetencion().getIvaPorcentaje10();
        this.monedaNombre = d.getRetencion().getMonedaNombre();
        //totales
        this.impuestoTotalExento = d.getTotales().getImpuestoTotalExento();
        this.impuestoTotalAl5 = d.getTotales().getImpuestoTotalAl5();
        this.impuestoTotalAl10 = d.getTotales().getImpuestoTotalAl10();
        this.valorTotalExento = d.getTotales().getValorTotalExento();
        this.valorTotalAl5 = d.getTotales().getValorTotalAl5();
        this.valorTotalAl10 = d.getTotales().getValorTotalAl10();
        this.impuestoTotal = d.getTotales().getImpuestoTotal();
        this.valorTotal = d.getTotales().getValorTotal();

        this.fechaProceso = DateTime.parse(r.getFechaProceso(),
                DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();
        this.numeroComprobante = r.getNumeroComprobante();
        this.fechaEmision = DateTime.parse(r.getFechaEmision(),
                DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();
        this.cadenaControl = r.getCadenaControl();
        this.numero = r.getNumero();
        this.fechaRecepcion = DateTime.parse(r.getFechaRecepcion(),
                DateTimeFormat.forPattern("yyyy-MM-dd")).toDate();
        this.hashString = r.getHash();
        this.recepcionCorrecta = r.getRecepcionCorrecta();
        this.mensajeRecepcion = r.getMensajeRecepcion();
        this.procesamientoCorrecto = r.getProcesamientoCorrecto();
        this.mensajeProcesamiento = r.getMensajeProcesamiento();
        this.migrado = false;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaHoraCreacion() {
        return fechaHoraCreacion;
    }

    public void setFechaHoraCreacion(Date fechaHoraCreacion) {
        this.fechaHoraCreacion = fechaHoraCreacion;
    }

    public String getCodigoEstablecimiento() {
        return codigoEstablecimiento;
    }

    public void setCodigoEstablecimiento(String codigoEstablecimiento) {
        this.codigoEstablecimiento = codigoEstablecimiento;
    }

    public String getTimbradoComprobante() {
        return timbradoComprobante;
    }

    public void setTimbradoComprobante(String timbradoComprobante) {
        this.timbradoComprobante = timbradoComprobante;
    }

    public String getPuntoExpedicionComprobante() {
        return puntoExpedicionComprobante;
    }

    public void setPuntoExpedicionComprobante(String puntoExpedicionComprobante) {
        this.puntoExpedicionComprobante = puntoExpedicionComprobante;
    }

    public String getEstablecimiento() {
        return establecimiento;
    }

    public void setEstablecimiento(String establecimiento) {
        this.establecimiento = establecimiento;
    }

    public TransaccionImp.CondicionCompra getCondicionCompra() {
        return condicionCompra;
    }

    public void setCondicionCompra(TransaccionImp.CondicionCompra condicionCompra) {
        this.condicionCompra = condicionCompra;
    }

    public TransaccionImp.TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TransaccionImp.TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getNumeroTimbradoFactura() {
        return numeroTimbradoFactura;
    }

    public void setNumeroTimbradoFactura(String numeroTimbradoFactura) {
        this.numeroTimbradoFactura = numeroTimbradoFactura;
    }

    public String getNumeroComprobanteVenta() {
        return numeroComprobanteVenta;
    }

    public void setNumeroComprobanteVenta(String numeroComprobanteVenta) {
        this.numeroComprobanteVenta = numeroComprobanteVenta;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getProveedorRuc() {
        return proveedorRuc;
    }

    public void setProveedorRuc(String proveedorRuc) {
        this.proveedorRuc = proveedorRuc;
    }

    public Double getTotalFactura() {
        return totalFactura;
    }

    public void setTotalFactura(Double totalFactura) {
        this.totalFactura = totalFactura;
    }

    public Date getFechaRetencion() {
        return fechaRetencion;
    }

    public void setFechaRetencion(Date fechaRetencion) {
        this.fechaRetencion = fechaRetencion;
    }

    public RetencionImp.Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(RetencionImp.Moneda moneda) {
        this.moneda = moneda;
    }

    public Integer getTipoCambio() {
        return tipoCambio;
    }

    public void setTipoCambio(Integer tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    public Boolean getRetencionIva() {
        return retencionIva;
    }

    public void setRetencionIva(Boolean retencionIva) {
        this.retencionIva = retencionIva;
    }

    public Boolean getRetencionRenta() {
        return retencionRenta;
    }

    public void setRetencionRenta(Boolean retencionRenta) {
        this.retencionRenta = retencionRenta;
    }

    public String getConceptoRenta() {
        return conceptoRenta;
    }

    public void setConceptoRenta(String conceptoRenta) {
        this.conceptoRenta = conceptoRenta;
    }

    public String getConceptoIva() {
        return conceptoIva;
    }

    public void setConceptoIva(String conceptoIva) {
        this.conceptoIva = conceptoIva;
    }

    public Boolean getHabilitadoRentaCabezas() {
        return habilitadoRentaCabezas;
    }

    public void setHabilitadoRentaCabezas(Boolean habilitadoRentaCabezas) {
        this.habilitadoRentaCabezas = habilitadoRentaCabezas;
    }

    public Boolean getHabilitadoRentaToneladas() {
        return habilitadoRentaToneladas;
    }

    public void setHabilitadoRentaToneladas(Boolean habilitadoRentaToneladas) {
        this.habilitadoRentaToneladas = habilitadoRentaToneladas;
    }

    public Double getIvaBase5() {
        return ivaBase5;
    }

    public void setIvaBase5(Double ivaBase5) {
        this.ivaBase5 = ivaBase5;
    }

    public Double getIvaTotal5() {
        return ivaTotal5;
    }

    public void setIvaTotal5(Double ivaTotal5) {
        this.ivaTotal5 = ivaTotal5;
    }

    public Double getIvaBase10() {
        return ivaBase10;
    }

    public void setIvaBase10(Double ivaBase10) {
        this.ivaBase10 = ivaBase10;
    }

    public Double getIvaTotal10() {
        return ivaTotal10;
    }

    public void setIvaTotal10(Double ivaTotal10) {
        this.ivaTotal10 = ivaTotal10;
    }

    public Double getIvaTotal() {
        return ivaTotal;
    }

    public void setIvaTotal(Double ivaTotal) {
        this.ivaTotal = ivaTotal;
    }

    public Double getRentaBase() {
        return rentaBase;
    }

    public void setRentaBase(Double rentaBase) {
        this.rentaBase = rentaBase;
    }

    public Double getRentaTotal() {
        return rentaTotal;
    }

    public void setRentaTotal(Double rentaTotal) {
        this.rentaTotal = rentaTotal;
    }

    public Integer getRentaCabezasBase() {
        return rentaCabezasBase;
    }

    public void setRentaCabezasBase(Integer rentaCabezasBase) {
        this.rentaCabezasBase = rentaCabezasBase;
    }

    public Integer getRentaCabezasCantidad() {
        return rentaCabezasCantidad;
    }

    public void setRentaCabezasCantidad(Integer rentaCabezasCantidad) {
        this.rentaCabezasCantidad = rentaCabezasCantidad;
    }

    public Integer getRentaCabezasTotal() {
        return rentaCabezasTotal;
    }

    public void setRentaCabezasTotal(Integer rentaCabezasTotal) {
        this.rentaCabezasTotal = rentaCabezasTotal;
    }

    public Integer getRentaToneladasBase() {
        return rentaToneladasBase;
    }

    public void setRentaToneladasBase(Integer rentaToneladasBase) {
        this.rentaToneladasBase = rentaToneladasBase;
    }

    public Integer getRentaToneladasCantidad() {
        return rentaToneladasCantidad;
    }

    public void setRentaToneladasCantidad(Integer rentaToneladasCantidad) {
        this.rentaToneladasCantidad = rentaToneladasCantidad;
    }

    public Integer getRentaToneladasTotal() {
        return rentaToneladasTotal;
    }

    public void setRentaToneladasTotal(Integer rentaToneladasTotal) {
        this.rentaToneladasTotal = rentaToneladasTotal;
    }

    public Integer getRetencionIvaTotal() {
        return retencionIvaTotal;
    }

    public void setRetencionIvaTotal(Integer retencionIvaTotal) {
        this.retencionIvaTotal = retencionIvaTotal;
    }

    public Integer getRetencionRentaTotal() {
        return retencionRentaTotal;
    }

    public void setRetencionRentaTotal(Integer retencionRentaTotal) {
        this.retencionRentaTotal = retencionRentaTotal;
    }

    public Integer getRetencionTotal() {
        return retencionTotal;
    }

    public void setRetencionTotal(Integer retencionTotal) {
        this.retencionTotal = retencionTotal;
    }

    public RetencionImp.RentaPorcentaje getRentaPorcentaje() {
        return rentaPorcentaje;
    }

    public void setRentaPorcentaje(RetencionImp.RentaPorcentaje rentaPorcentaje) {
        this.rentaPorcentaje = rentaPorcentaje;
    }

    public String getConceptoIvaNombre() {
        return conceptoIvaNombre;
    }

    public void setConceptoIvaNombre(String conceptoIvaNombre) {
        this.conceptoIvaNombre = conceptoIvaNombre;
    }

    public String getConceptoRentaNombre() {
        return conceptoRentaNombre;
    }

    public void setConceptoRentaNombre(String conceptoRentaNombre) {
        this.conceptoRentaNombre = conceptoRentaNombre;
    }

    public RetencionImp.IvaPorcentaje5 getIvaPorcentaje5() {
        return ivaPorcentaje5;
    }

    public void setIvaPorcentaje5(RetencionImp.IvaPorcentaje5 ivaPorcentaje5) {
        this.ivaPorcentaje5 = ivaPorcentaje5;
    }

    public RetencionImp.IvaPorcentaje10 getIvaPorcentaje10() {
        return ivaPorcentaje10;
    }

    public void setIvaPorcentaje10(RetencionImp.IvaPorcentaje10 ivaPorcentaje10) {
        this.ivaPorcentaje10 = ivaPorcentaje10;
    }

    public String getMonedaNombre() {
        return monedaNombre;
    }

    public void setMonedaNombre(String monedaNombre) {
        this.monedaNombre = monedaNombre;
    }

    public Double getImpuestoTotalExento() {
        return impuestoTotalExento;
    }

    public void setImpuestoTotalExento(Double impuestoTotalExento) {
        this.impuestoTotalExento = impuestoTotalExento;
    }

    public Double getImpuestoTotalAl5() {
        return impuestoTotalAl5;
    }

    public void setImpuestoTotalAl5(Double impuestoTotalAl5) {
        this.impuestoTotalAl5 = impuestoTotalAl5;
    }

    public Double getImpuestoTotalAl10() {
        return impuestoTotalAl10;
    }

    public void setImpuestoTotalAl10(Double impuestoTotalAl10) {
        this.impuestoTotalAl10 = impuestoTotalAl10;
    }

    public Double getValorTotalExento() {
        return valorTotalExento;
    }

    public void setValorTotalExento(Double valorTotalExento) {
        this.valorTotalExento = valorTotalExento;
    }

    public Double getValorTotalAl5() {
        return valorTotalAl5;
    }

    public void setValorTotalAl5(Double valorTotalAl5) {
        this.valorTotalAl5 = valorTotalAl5;
    }

    public Double getValorTotalAl10() {
        return valorTotalAl10;
    }

    public void setValorTotalAl10(Double valorTotalAl10) {
        this.valorTotalAl10 = valorTotalAl10;
    }

    public Double getImpuestoTotal() {
        return impuestoTotal;
    }

    public void setImpuestoTotal(Double impuestoTotal) {
        this.impuestoTotal = impuestoTotal;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Date getFechaProceso() {
        return fechaProceso;
    }

    public void setFechaProceso(Date fechaProceso) {
        this.fechaProceso = fechaProceso;
    }

    public String getNumeroComprobante() {
        return numeroComprobante;
    }

    public void setNumeroComprobante(String numeroComprobante) {
        this.numeroComprobante = numeroComprobante;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getCadenaControl() {
        return cadenaControl;
    }

    public void setCadenaControl(String cadenaControl) {
        this.cadenaControl = cadenaControl;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public String getHashString() {
        return hashString;
    }

    public void setHashString(String hashString) {
        this.hashString = hashString;
    }

    public Boolean getRecepcionCorrecta() {
        return recepcionCorrecta;
    }

    public void setRecepcionCorrecta(Boolean recepcionCorrecta) {
        this.recepcionCorrecta = recepcionCorrecta;
    }

    public String getMensajeRecepcion() {
        return mensajeRecepcion;
    }

    public void setMensajeRecepcion(String mensajeRecepcion) {
        this.mensajeRecepcion = mensajeRecepcion;
    }

    public Boolean getProcesamientoCorrecto() {
        return procesamientoCorrecto;
    }

    public void setProcesamientoCorrecto(Boolean procesamientoCorrecto) {
        this.procesamientoCorrecto = procesamientoCorrecto;
    }

    public String getMensajeProcesamiento() {
        return mensajeProcesamiento;
    }

    public void setMensajeProcesamiento(String mensajeProcesamiento) {
        this.mensajeProcesamiento = mensajeProcesamiento;
    }

    public Boolean getMigrado() {
        return migrado;
    }

    public void setMigrado(Boolean migrado) {
        this.migrado = migrado;
    }

    public String getProveedorDv() {
        return proveedorDv;
    }

    public void setProveedorDv(String proveedorDv) {
        this.proveedorDv = proveedorDv;
    }

    public String getProveedorNombre() {
        return proveedorNombre;
    }

    public void setProveedorNombre(String proveedorNombre) {
        this.proveedorNombre = proveedorNombre;
    }

    public String getProveedorSituacion() {
        return proveedorSituacion;
    }

    public void setProveedorSituacion(String proveedorSituacion) {
        this.proveedorSituacion = proveedorSituacion;
    }

    public String getProveedorDomicilio() {
        return proveedorDomicilio;
    }

    public void setProveedorDomicilio(String proveedorDomicilio) {
        this.proveedorDomicilio = proveedorDomicilio;
    }

    public String getProveedorCorreo() {
        return proveedorCorreo;
    }

    public void setProveedorCorreo(String proveedorCorreo) {
        this.proveedorCorreo = proveedorCorreo;
    }

    public String getProveedorTipoIdentificacion() {
        return proveedorTipoIdentificacion;
    }

    public void setProveedorTipoIdentificacion(String proveedorTipoIdentificacion) {
        this.proveedorTipoIdentificacion = proveedorTipoIdentificacion;
    }

    public String getProveedorIdentificacion() {
        return proveedorIdentificacion;
    }

    public void setProveedorIdentificacion(String proveedorIdentificacion) {
        this.proveedorIdentificacion = proveedorIdentificacion;
    }

    
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.uuid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RetencionGenerada other = (RetencionGenerada) obj;
        if (!Objects.equals(this.uuid, other.uuid)) {
            return false;
        }
        return true;
    }

}
