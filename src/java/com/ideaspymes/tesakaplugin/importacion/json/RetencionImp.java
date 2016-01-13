
package com.ideaspymes.tesakaplugin.importacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


/**
 * Información de las retenciones asociadas al comprobante
 * 
 */
@Generated("org.jsonschema2pojo")
public class RetencionImp {

    /**
     * Indica la fecha de la retencion
     * (Required)
     * 
     */
    @SerializedName("fecha")
    @Expose
    private String fecha;
    /**
     * Indica en que moneda se encuentra la operación
     * (Required)
     * 
     */
    @SerializedName("moneda")
    @Expose
    private RetencionImp.Moneda moneda;
    /**
     * Indica el tipo de cambio a utilizado cuando la moneda informada sea distinta a PYG
     * 
     */
    @SerializedName("tipoCambio")
    @Expose
    private Integer tipoCambio;
    /**
     * true/false Indica si se retiene iva
     * 
     */
    @SerializedName("retencionIva")
    @Expose
    private Boolean retencionIva;
    /**
     * true/false Indica si se retiene renta
     * 
     */
    @SerializedName("retencionRenta")
    @Expose
    private Boolean retencionRenta;
    /**
     * Indica el código ingresado para el concepto de la retención
     * 
     */
    @SerializedName("conceptoRenta")
    @Expose
    private String conceptoRenta;
    /**
     * Indica el código ingresado para el concepto de la retención
     * 
     */
    @SerializedName("conceptoIva")
    @Expose
    private String conceptoIva;
    /**
     * Indica si se encuentra habilitada la retención por cabezas de ganado
     * 
     */
    @SerializedName("habilitadoRentaCabezas")
    @Expose
    private Boolean habilitadoRentaCabezas;
    /**
     * Indica si se encuentra habilitada la retención por toneladas
     * 
     */
    @SerializedName("habilitadoRentaToneladas")
    @Expose
    private Boolean habilitadoRentaToneladas;
    /**
     * Proviene de la sumatoria de impuesto al 5
     * 
     */
    @SerializedName("ivaBase5")
    @Expose
    private Double ivaBase5;
    /**
     * Proviene de ivaBase5 por ivaPorcentaje5
     * 
     */
    @SerializedName("ivaTotal5")
    @Expose
    private Double ivaTotal5;
    /**
     * Proviene de la sumatoria de impuestoAl10
     * 
     */
    @SerializedName("ivaBase10")
    @Expose
    private Double ivaBase10;
    /**
     * Proviene de ivaBase10 por ivaPorcentaje10
     * 
     */
    @SerializedName("ivaTotal10")
    @Expose
    private Double ivaTotal10;
    /**
     * Proviene de la sumatoria de ivaTotal5 e ivaTotal10
     * 
     */
    @SerializedName("ivaTotal")
    @Expose
    private Double ivaTotal;
    /**
     * Proviene de la sumatoria (precioTotalimpuestoAl5 – impuestoAl10)
     * 
     */
    @SerializedName("rentaBase")
    @Expose
    private Double rentaBase;
    /**
     * Proviene de rentaBase*rentaPorcentaje
     * 
     */
    @SerializedName("rentaTotal")
    @Expose
    private Double rentaTotal;
    /**
     * Indica el monto a retener sobre cada cabeza
     * (Required)
     * 
     */
    @SerializedName("rentaCabezasBase")
    @Expose
    private Integer rentaCabezasBase;
    /**
     * Indica la cantidad de cabezas sobre las cuales se aplicará la retención
     * (Required)
     * 
     */
    @SerializedName("rentaCabezasCantidad")
    @Expose
    private Integer rentaCabezasCantidad;
    /**
     * Proviene de rentaCabezasBase* rentaCabezasCantidad
     * 
     */
    @SerializedName("rentaCabezasTotal")
    @Expose
    private Integer rentaCabezasTotal;
    /**
     * Indica el monto de la retención a ser aplicada por cada tonelada
     * (Required)
     * 
     */
    @SerializedName("rentaToneladasBase")
    @Expose
    private Integer rentaToneladasBase;
    /**
     *  Indica la cantidad de cabezas sobre las cuales se aplica la retención
     * (Required)
     * 
     */
    @SerializedName("rentaToneladasCantidad")
    @Expose
    private Integer rentaToneladasCantidad;
    /**
     * Proviene de rentaToneladasBase * rentaToneladasCantidad
     * 
     */
    @SerializedName("rentaToneladasTotal")
    @Expose
    private Integer rentaToneladasTotal;
    /**
     * Proviene de ivaTotal
     * 
     */
    @SerializedName("retencionIvaTotal")
    @Expose
    private Integer retencionIvaTotal;
    /**
     * Proviene de la sumatoria de rentaTotal + rentaCabezaTotal + rentaToneladasTotal
     * 
     */
    @SerializedName("retencionRentaTotal")
    @Expose
    private Integer retencionRentaTotal;
    /**
     * Proviene de la sumatoria de retencionIvaTotal + retencionRentaTotal
     * 
     */
    @SerializedName("retencionTotal")
    @Expose
    private Integer retencionTotal;
    /**
     * Indica el porcentaje aplicado sobre la base imponible renta
     * (Required)
     * 
     */
    @SerializedName("rentaPorcentaje")
    @Expose
    private RetencionImp.RentaPorcentaje rentaPorcentaje;
    /**
     * Nombre del conceptoIva seleccionado (Ver descripción del concepto en Tablas de Sistema)
     * 
     */
    @SerializedName("conceptoIvaNombre")
    @Expose
    private String conceptoIvaNombre;
    /**
     * Nombre del conceptoRenta seleccionado (Ver descripción del concepto en Tablas de Sistema)
     * 
     */
    @SerializedName("conceptoRentaNombre")
    @Expose
    private String conceptoRentaNombre;
    /**
     *  Porcentaje a ser aplicado sobre la base imponible del IVA 5
     * (Required)
     * 
     */
    @SerializedName("ivaPorcentaje5")
    @Expose
    private RetencionImp.IvaPorcentaje5 ivaPorcentaje5;
    /**
     *  Porcentaje a ser aplicado sobre la base imponible del IVA 10
     * (Required)
     * 
     */
    @SerializedName("ivaPorcentaje10")
    @Expose
    private RetencionImp.IvaPorcentaje10 ivaPorcentaje10;
    /**
     * Nombre de la moneda seleccionada
     * 
     */
    @SerializedName("monedaNombre")
    @Expose
    private String monedaNombre;

    /**
     * Indica la fecha de la retencion
     * (Required)
     * 
     * @return
     *     The fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Indica la fecha de la retencion
     * (Required)
     * 
     * @param fecha
     *     The fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Indica en que moneda se encuentra la operación
     * (Required)
     * 
     * @return
     *     The moneda
     */
    public RetencionImp.Moneda getMoneda() {
        return moneda;
    }

    /**
     * Indica en que moneda se encuentra la operación
     * (Required)
     * 
     * @param moneda
     *     The moneda
     */
    public void setMoneda(RetencionImp.Moneda moneda) {
        this.moneda = moneda;
    }

    /**
     * Indica el tipo de cambio a utilizado cuando la moneda informada sea distinta a PYG
     * 
     * @return
     *     The tipoCambio
     */
    public Integer getTipoCambio() {
        return tipoCambio;
    }

    /**
     * Indica el tipo de cambio a utilizado cuando la moneda informada sea distinta a PYG
     * 
     * @param tipoCambio
     *     The tipoCambio
     */
    public void setTipoCambio(Integer tipoCambio) {
        this.tipoCambio = tipoCambio;
    }

    /**
     * true/false Indica si se retiene iva
     * 
     * @return
     *     The retencionIva
     */
    public Boolean getRetencionIva() {
        return retencionIva;
    }

    /**
     * true/false Indica si se retiene iva
     * 
     * @param retencionIva
     *     The retencionIva
     */
    public void setRetencionIva(Boolean retencionIva) {
        this.retencionIva = retencionIva;
    }

    /**
     * true/false Indica si se retiene renta
     * 
     * @return
     *     The retencionRenta
     */
    public Boolean getRetencionRenta() {
        return retencionRenta;
    }

    /**
     * true/false Indica si se retiene renta
     * 
     * @param retencionRenta
     *     The retencionRenta
     */
    public void setRetencionRenta(Boolean retencionRenta) {
        this.retencionRenta = retencionRenta;
    }

    /**
     * Indica el código ingresado para el concepto de la retención
     * 
     * @return
     *     The conceptoRenta
     */
    public String getConceptoRenta() {
        return conceptoRenta;
    }

    /**
     * Indica el código ingresado para el concepto de la retención
     * 
     * @param conceptoRenta
     *     The conceptoRenta
     */
    public void setConceptoRenta(String conceptoRenta) {
        this.conceptoRenta = conceptoRenta;
    }

    /**
     * Indica el código ingresado para el concepto de la retención
     * 
     * @return
     *     The conceptoIva
     */
    public String getConceptoIva() {
        return conceptoIva;
    }

    /**
     * Indica el código ingresado para el concepto de la retención
     * 
     * @param conceptoIva
     *     The conceptoIva
     */
    public void setConceptoIva(String conceptoIva) {
        this.conceptoIva = conceptoIva;
    }

    /**
     * Indica si se encuentra habilitada la retención por cabezas de ganado
     * 
     * @return
     *     The habilitadoRentaCabezas
     */
    public Boolean getHabilitadoRentaCabezas() {
        return habilitadoRentaCabezas;
    }

    /**
     * Indica si se encuentra habilitada la retención por cabezas de ganado
     * 
     * @param habilitadoRentaCabezas
     *     The habilitadoRentaCabezas
     */
    public void setHabilitadoRentaCabezas(Boolean habilitadoRentaCabezas) {
        this.habilitadoRentaCabezas = habilitadoRentaCabezas;
    }

    /**
     * Indica si se encuentra habilitada la retención por toneladas
     * 
     * @return
     *     The habilitadoRentaToneladas
     */
    public Boolean getHabilitadoRentaToneladas() {
        return habilitadoRentaToneladas;
    }

    /**
     * Indica si se encuentra habilitada la retención por toneladas
     * 
     * @param habilitadoRentaToneladas
     *     The habilitadoRentaToneladas
     */
    public void setHabilitadoRentaToneladas(Boolean habilitadoRentaToneladas) {
        this.habilitadoRentaToneladas = habilitadoRentaToneladas;
    }

    /**
     * Proviene de la sumatoria de impuesto al 5
     * 
     * @return
     *     The ivaBase5
     */
    public Double getIvaBase5() {
        return ivaBase5;
    }

    /**
     * Proviene de la sumatoria de impuesto al 5
     * 
     * @param ivaBase5
     *     The ivaBase5
     */
    public void setIvaBase5(Double ivaBase5) {
        this.ivaBase5 = ivaBase5;
    }

    /**
     * Proviene de ivaBase5 por ivaPorcentaje5
     * 
     * @return
     *     The ivaTotal5
     */
    public Double getIvaTotal5() {
        return ivaTotal5;
    }

    /**
     * Proviene de ivaBase5 por ivaPorcentaje5
     * 
     * @param ivaTotal5
     *     The ivaTotal5
     */
    public void setIvaTotal5(Double ivaTotal5) {
        this.ivaTotal5 = ivaTotal5;
    }

    /**
     * Proviene de la sumatoria de impuestoAl10
     * 
     * @return
     *     The ivaBase10
     */
    public Double getIvaBase10() {
        return ivaBase10;
    }

    /**
     * Proviene de la sumatoria de impuestoAl10
     * 
     * @param ivaBase10
     *     The ivaBase10
     */
    public void setIvaBase10(Double ivaBase10) {
        this.ivaBase10 = ivaBase10;
    }

    /**
     * Proviene de ivaBase10 por ivaPorcentaje10
     * 
     * @return
     *     The ivaTotal10
     */
    public Double getIvaTotal10() {
        return ivaTotal10;
    }

    /**
     * Proviene de ivaBase10 por ivaPorcentaje10
     * 
     * @param ivaTotal10
     *     The ivaTotal10
     */
    public void setIvaTotal10(Double ivaTotal10) {
        this.ivaTotal10 = ivaTotal10;
    }

    /**
     * Proviene de la sumatoria de ivaTotal5 e ivaTotal10
     * 
     * @return
     *     The ivaTotal
     */
    public Double getIvaTotal() {
        return ivaTotal;
    }

    /**
     * Proviene de la sumatoria de ivaTotal5 e ivaTotal10
     * 
     * @param ivaTotal
     *     The ivaTotal
     */
    public void setIvaTotal(Double ivaTotal) {
        this.ivaTotal = ivaTotal;
    }

    /**
     * Proviene de la sumatoria (precioTotalimpuestoAl5 – impuestoAl10)
     * 
     * @return
     *     The rentaBase
     */
    public Double getRentaBase() {
        return rentaBase;
    }

    /**
     * Proviene de la sumatoria (precioTotalimpuestoAl5 – impuestoAl10)
     * 
     * @param rentaBase
     *     The rentaBase
     */
    public void setRentaBase(Double rentaBase) {
        this.rentaBase = rentaBase;
    }

    /**
     * Proviene de rentaBase*rentaPorcentaje
     * 
     * @return
     *     The rentaTotal
     */
    public Double getRentaTotal() {
        return rentaTotal;
    }

    /**
     * Proviene de rentaBase*rentaPorcentaje
     * 
     * @param rentaTotal
     *     The rentaTotal
     */
    public void setRentaTotal(Double rentaTotal) {
        this.rentaTotal = rentaTotal;
    }

    /**
     * Indica el monto a retener sobre cada cabeza
     * (Required)
     * 
     * @return
     *     The rentaCabezasBase
     */
    public Integer getRentaCabezasBase() {
        return rentaCabezasBase;
    }

    /**
     * Indica el monto a retener sobre cada cabeza
     * (Required)
     * 
     * @param rentaCabezasBase
     *     The rentaCabezasBase
     */
    public void setRentaCabezasBase(Integer rentaCabezasBase) {
        this.rentaCabezasBase = rentaCabezasBase;
    }

    /**
     * Indica la cantidad de cabezas sobre las cuales se aplicará la retención
     * (Required)
     * 
     * @return
     *     The rentaCabezasCantidad
     */
    public Integer getRentaCabezasCantidad() {
        return rentaCabezasCantidad;
    }

    /**
     * Indica la cantidad de cabezas sobre las cuales se aplicará la retención
     * (Required)
     * 
     * @param rentaCabezasCantidad
     *     The rentaCabezasCantidad
     */
    public void setRentaCabezasCantidad(Integer rentaCabezasCantidad) {
        this.rentaCabezasCantidad = rentaCabezasCantidad;
    }

    /**
     * Proviene de rentaCabezasBase* rentaCabezasCantidad
     * 
     * @return
     *     The rentaCabezasTotal
     */
    public Integer getRentaCabezasTotal() {
        return rentaCabezasTotal;
    }

    /**
     * Proviene de rentaCabezasBase* rentaCabezasCantidad
     * 
     * @param rentaCabezasTotal
     *     The rentaCabezasTotal
     */
    public void setRentaCabezasTotal(Integer rentaCabezasTotal) {
        this.rentaCabezasTotal = rentaCabezasTotal;
    }

    /**
     * Indica el monto de la retención a ser aplicada por cada tonelada
     * (Required)
     * 
     * @return
     *     The rentaToneladasBase
     */
    public Integer getRentaToneladasBase() {
        return rentaToneladasBase;
    }

    /**
     * Indica el monto de la retención a ser aplicada por cada tonelada
     * (Required)
     * 
     * @param rentaToneladasBase
     *     The rentaToneladasBase
     */
    public void setRentaToneladasBase(Integer rentaToneladasBase) {
        this.rentaToneladasBase = rentaToneladasBase;
    }

    /**
     *  Indica la cantidad de cabezas sobre las cuales se aplica la retención
     * (Required)
     * 
     * @return
     *     The rentaToneladasCantidad
     */
    public Integer getRentaToneladasCantidad() {
        return rentaToneladasCantidad;
    }

    /**
     *  Indica la cantidad de cabezas sobre las cuales se aplica la retención
     * (Required)
     * 
     * @param rentaToneladasCantidad
     *     The rentaToneladasCantidad
     */
    public void setRentaToneladasCantidad(Integer rentaToneladasCantidad) {
        this.rentaToneladasCantidad = rentaToneladasCantidad;
    }

    /**
     * Proviene de rentaToneladasBase * rentaToneladasCantidad
     * 
     * @return
     *     The rentaToneladasTotal
     */
    public Integer getRentaToneladasTotal() {
        return rentaToneladasTotal;
    }

    /**
     * Proviene de rentaToneladasBase * rentaToneladasCantidad
     * 
     * @param rentaToneladasTotal
     *     The rentaToneladasTotal
     */
    public void setRentaToneladasTotal(Integer rentaToneladasTotal) {
        this.rentaToneladasTotal = rentaToneladasTotal;
    }

    /**
     * Proviene de ivaTotal
     * 
     * @return
     *     The retencionIvaTotal
     */
    public Integer getRetencionIvaTotal() {
        return retencionIvaTotal;
    }

    /**
     * Proviene de ivaTotal
     * 
     * @param retencionIvaTotal
     *     The retencionIvaTotal
     */
    public void setRetencionIvaTotal(Integer retencionIvaTotal) {
        this.retencionIvaTotal = retencionIvaTotal;
    }

    /**
     * Proviene de la sumatoria de rentaTotal + rentaCabezaTotal + rentaToneladasTotal
     * 
     * @return
     *     The retencionRentaTotal
     */
    public Integer getRetencionRentaTotal() {
        return retencionRentaTotal;
    }

    /**
     * Proviene de la sumatoria de rentaTotal + rentaCabezaTotal + rentaToneladasTotal
     * 
     * @param retencionRentaTotal
     *     The retencionRentaTotal
     */
    public void setRetencionRentaTotal(Integer retencionRentaTotal) {
        this.retencionRentaTotal = retencionRentaTotal;
    }

    /**
     * Proviene de la sumatoria de retencionIvaTotal + retencionRentaTotal
     * 
     * @return
     *     The retencionTotal
     */
    public Integer getRetencionTotal() {
        return retencionTotal;
    }

    /**
     * Proviene de la sumatoria de retencionIvaTotal + retencionRentaTotal
     * 
     * @param retencionTotal
     *     The retencionTotal
     */
    public void setRetencionTotal(Integer retencionTotal) {
        this.retencionTotal = retencionTotal;
    }

    /**
     * Indica el porcentaje aplicado sobre la base imponible renta
     * (Required)
     * 
     * @return
     *     The rentaPorcentaje
     */
    public RetencionImp.RentaPorcentaje getRentaPorcentaje() {
        return rentaPorcentaje;
    }

    /**
     * Indica el porcentaje aplicado sobre la base imponible renta
     * (Required)
     * 
     * @param rentaPorcentaje
     *     The rentaPorcentaje
     */
    public void setRentaPorcentaje(RetencionImp.RentaPorcentaje rentaPorcentaje) {
        this.rentaPorcentaje = rentaPorcentaje;
    }

    /**
     * Nombre del conceptoIva seleccionado (Ver descripción del concepto en Tablas de Sistema)
     * 
     * @return
     *     The conceptoIvaNombre
     */
    public String getConceptoIvaNombre() {
        return conceptoIvaNombre;
    }

    /**
     * Nombre del conceptoIva seleccionado (Ver descripción del concepto en Tablas de Sistema)
     * 
     * @param conceptoIvaNombre
     *     The conceptoIvaNombre
     */
    public void setConceptoIvaNombre(String conceptoIvaNombre) {
        this.conceptoIvaNombre = conceptoIvaNombre;
    }

    /**
     * Nombre del conceptoRenta seleccionado (Ver descripción del concepto en Tablas de Sistema)
     * 
     * @return
     *     The conceptoRentaNombre
     */
    public String getConceptoRentaNombre() {
        return conceptoRentaNombre;
    }

    /**
     * Nombre del conceptoRenta seleccionado (Ver descripción del concepto en Tablas de Sistema)
     * 
     * @param conceptoRentaNombre
     *     The conceptoRentaNombre
     */
    public void setConceptoRentaNombre(String conceptoRentaNombre) {
        this.conceptoRentaNombre = conceptoRentaNombre;
    }

    /**
     *  Porcentaje a ser aplicado sobre la base imponible del IVA 5
     * (Required)
     * 
     * @return
     *     The ivaPorcentaje5
     */
    public RetencionImp.IvaPorcentaje5 getIvaPorcentaje5() {
        return ivaPorcentaje5;
    }

    /**
     *  Porcentaje a ser aplicado sobre la base imponible del IVA 5
     * (Required)
     * 
     * @param ivaPorcentaje5
     *     The ivaPorcentaje5
     */
    public void setIvaPorcentaje5(RetencionImp.IvaPorcentaje5 ivaPorcentaje5) {
        this.ivaPorcentaje5 = ivaPorcentaje5;
    }

    /**
     *  Porcentaje a ser aplicado sobre la base imponible del IVA 10
     * (Required)
     * 
     * @return
     *     The ivaPorcentaje10
     */
    public RetencionImp.IvaPorcentaje10 getIvaPorcentaje10() {
        return ivaPorcentaje10;
    }

    /**
     *  Porcentaje a ser aplicado sobre la base imponible del IVA 10
     * (Required)
     * 
     * @param ivaPorcentaje10
     *     The ivaPorcentaje10
     */
    public void setIvaPorcentaje10(RetencionImp.IvaPorcentaje10 ivaPorcentaje10) {
        this.ivaPorcentaje10 = ivaPorcentaje10;
    }

    /**
     * Nombre de la moneda seleccionada
     * 
     * @return
     *     The monedaNombre
     */
    public String getMonedaNombre() {
        return monedaNombre;
    }

    /**
     * Nombre de la moneda seleccionada
     * 
     * @param monedaNombre
     *     The monedaNombre
     */
    public void setMonedaNombre(String monedaNombre) {
        this.monedaNombre = monedaNombre;
    }

    @Generated("org.jsonschema2pojo")
    public static enum IvaPorcentaje10 {

        @SerializedName("0")
        _0("0"),
        @SerializedName("0.90909")
        _0_90909("0.90909"),
        @SerializedName("30")
        _30("30"),
        @SerializedName("50")
        _50("50"),
        @SerializedName("100")
        _100("100");
        private final String value;
        private final static Map<String, RetencionImp.IvaPorcentaje10> CONSTANTS = new HashMap<String, RetencionImp.IvaPorcentaje10>();

        static {
            for (RetencionImp.IvaPorcentaje10 c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private IvaPorcentaje10(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static RetencionImp.IvaPorcentaje10 fromValue(String value) {
            RetencionImp.IvaPorcentaje10 constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum IvaPorcentaje5 {

        @SerializedName("0")
        _0("0"),
        @SerializedName("0.90909")
        _0_90909("0.90909"),
        @SerializedName("30")
        _30("30"),
        @SerializedName("50")
        _50("50"),
        @SerializedName("100")
        _100("100");
        private final String value;
        private final static Map<String, RetencionImp.IvaPorcentaje5> CONSTANTS = new HashMap<String, RetencionImp.IvaPorcentaje5>();

        static {
            for (RetencionImp.IvaPorcentaje5 c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private IvaPorcentaje5(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static RetencionImp.IvaPorcentaje5 fromValue(String value) {
            RetencionImp.IvaPorcentaje5 constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum Moneda {

        @SerializedName("EUR")
        EUR("EUR"),
        @SerializedName("PYG")
        PYG("PYG"),
        @SerializedName("USD")
        USD("USD"),
        @SerializedName("BRL")
        BRL("BRL");
        private final String value;
        private final static Map<String, RetencionImp.Moneda> CONSTANTS = new HashMap<String, RetencionImp.Moneda>();

        static {
            for (RetencionImp.Moneda c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Moneda(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static RetencionImp.Moneda fromValue(String value) {
            RetencionImp.Moneda constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum RentaPorcentaje {

        @SerializedName("0")
        _0("0"),
        @SerializedName("1")
        _1("1"),
        @SerializedName("1.5")
        _1_5("1.5"),
        @SerializedName("2")
        _2("2"),
        @SerializedName("3")
        _3("3"),
        @SerializedName("4.5")
        _4_5("4.5"),
        @SerializedName("15")
        _15("15"),
        @SerializedName("20")
        _20("20"),
        @SerializedName("30")
        _30("30");
        private final String value;
        private final static Map<String, RetencionImp.RentaPorcentaje> CONSTANTS = new HashMap<String, RetencionImp.RentaPorcentaje>();

        static {
            for (RetencionImp.RentaPorcentaje c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private RentaPorcentaje(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static RetencionImp.RentaPorcentaje fromValue(String value) {
            RetencionImp.RentaPorcentaje constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
