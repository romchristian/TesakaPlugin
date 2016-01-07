package com.ideaspymes.tesakaplugin.exportacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Retencion {

    /**
     * Aqui debe ingresar la fecha de la retencion (Required)
     *
     */
    @SerializedName("fecha")
    @Expose
    private String fecha;
    /**
     * Aquí debe informar en que moneda se encuentra la operación (Required)
     *
     */
    @SerializedName("moneda")
    @Expose
    private String moneda;

    /**
     * true / false indicando si se retiene renta (Required)
     *
     */
    @SerializedName("retencionRenta")
    @Expose
    private Boolean retencionRenta;
    /**
     * Aqui debe ingresar el concepto de la retencion (Ver tabla de sistema)
     *
     */
    @SerializedName("conceptoRenta")
    @Expose
    private String conceptoRenta;
    /**
     * Indica si se retiene el IVA (Required)
     *
     */
    @SerializedName("retencionIva")
    @Expose
    private Boolean retencionIva;
    /**
     * Aqui debe ingresar el concepto de la retencion para el IVA (Ver tabla de
     * sistema) (Required)
     *
     */
    @SerializedName("conceptoIva")
    @Expose
    private String conceptoIva;
    /**
     * Aqui va el porcentaje a ser aplicado sobre la base imponibe renta
     * (Required)
     *
     */
    @SerializedName("rentaPorcentaje")
    @Expose
    private Integer rentaPorcentaje;
    /**
     * Aqui debe indicar el monto de la retencion a ser aplicado sobre cada
     * cabeza (Required)
     *
     */
    @SerializedName("rentaCabezasBase")
    @Expose
    private Integer rentaCabezasBase;
    /**
     * Aqui debe indicar la cantidad de cabezas sobre la cual se aplicara la
     * retencion (Required)
     *
     */
    @SerializedName("rentaCabezasCantidad")
    @Expose
    private Integer rentaCabezasCantidad;
    /**
     * Aqui debe indicar el monto de la retencion a ser aplicado sobre cada
     * tonelada (Required)
     *
     */
    @SerializedName("rentaToneladasBase")
    @Expose
    private Integer rentaToneladasBase;
    /**
     * Aqui debe indicar la cantidad de toneladas sobre la cual se aplicara la
     * retencion (Required)
     *
     */
    @SerializedName("rentaToneladasCantidad")
    @Expose
    private Integer rentaToneladasCantidad;
    /**
     * Aqui va el porcentaje a ser aplicado sobre la base imponible del IVA 5
     * (Required)
     *
     */
    @SerializedName("ivaPorcentaje5")
    @Expose
    private Integer ivaPorcentaje5;
    /**
     * Aqui va el porcentaje a ser aplicado sobre la base imponibe del IVA 10
     * (Required)
     *
     */
    @SerializedName("ivaPorcentaje10")
    @Expose
    private Integer ivaPorcentaje10;

    /**
     * No args constructor for use in serialization
     *
     */
    public Retencion() {
    }

    /**
     *
     * @param rentaCabezasBase
     * @param fecha
     * @param retencionRenta
     * @param moneda
     * @param rentaPorcentaje
     * @param conceptoRenta
     * @param conceptoIva
     * @param rentaToneladasBase
     * @param rentaToneladasCantidad
     * @param ivaPorcentaje5
     * @param retencionIva
     * @param ivaPorcentaje10
     * @param rentaCabezasCantidad
     */
    public Retencion(String fecha, String moneda, Boolean retencionRenta, String conceptoRenta, Boolean retencionIva, String conceptoIva, Integer rentaPorcentaje, Integer rentaCabezasBase, Integer rentaCabezasCantidad, Integer rentaToneladasBase, Integer rentaToneladasCantidad, Integer ivaPorcentaje5, Integer ivaPorcentaje10) {
        this.fecha = fecha;
        this.moneda = moneda;
        this.retencionRenta = retencionRenta;
        this.conceptoRenta = conceptoRenta;
        this.retencionIva = retencionIva;
        this.conceptoIva = conceptoIva;
        this.rentaPorcentaje = rentaPorcentaje;
        this.rentaCabezasBase = rentaCabezasBase;
        this.rentaCabezasCantidad = rentaCabezasCantidad;
        this.rentaToneladasBase = rentaToneladasBase;
        this.rentaToneladasCantidad = rentaToneladasCantidad;
        this.ivaPorcentaje5 = ivaPorcentaje5;
        this.ivaPorcentaje10 = ivaPorcentaje10;
    }

    /**
     * Aqui debe ingresar la fecha de la retencion (Required)
     *
     * @return The fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Aqui debe ingresar la fecha de la retencion (Required)
     *
     * @param fecha The fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * true / false indicando si se retiene renta (Required)
     *
     * @return The retencionRenta
     */
    public Boolean getRetencionRenta() {
        return retencionRenta;
    }

    /**
     * true / false indicando si se retiene renta (Required)
     *
     * @param retencionRenta The retencionRenta
     */
    public void setRetencionRenta(Boolean retencionRenta) {
        this.retencionRenta = retencionRenta;
    }

    /**
     * Aqui debe ingresar el concepto de la retencion (Ver tabla de sistema)
     *
     * @return The conceptoRenta
     */
    public String getConceptoRenta() {
        return conceptoRenta;
    }

    /**
     * Aqui debe ingresar el concepto de la retencion (Ver tabla de sistema)
     *
     * @param conceptoRenta The conceptoRenta
     */
    public void setConceptoRenta(String conceptoRenta) {
        this.conceptoRenta = conceptoRenta;
    }

    /**
     * Indica si se retiene el IVA (Required)
     *
     * @return The retencionIva
     */
    public Boolean getRetencionIva() {
        return retencionIva;
    }

    /**
     * Indica si se retiene el IVA (Required)
     *
     * @param retencionIva The retencionIva
     */
    public void setRetencionIva(Boolean retencionIva) {
        this.retencionIva = retencionIva;
    }

    /**
     * Aqui debe ingresar el concepto de la retencion para el IVA (Ver tabla de
     * sistema) (Required)
     *
     * @return The conceptoIva
     */
    public String getConceptoIva() {
        return conceptoIva;
    }

    /**
     * Aqui debe ingresar el concepto de la retencion para el IVA (Ver tabla de
     * sistema) (Required)
     *
     * @param conceptoIva The conceptoIva
     */
    public void setConceptoIva(String conceptoIva) {
        this.conceptoIva = conceptoIva;
    }

    /**
     * Aqui debe indicar el monto de la retencion a ser aplicado sobre cada
     * cabeza (Required)
     *
     * @return The rentaCabezasBase
     */
    public Integer getRentaCabezasBase() {
        return rentaCabezasBase;
    }

    /**
     * Aqui debe indicar el monto de la retencion a ser aplicado sobre cada
     * cabeza (Required)
     *
     * @param rentaCabezasBase The rentaCabezasBase
     */
    public void setRentaCabezasBase(Integer rentaCabezasBase) {
        this.rentaCabezasBase = rentaCabezasBase;
    }

    /**
     * Aqui debe indicar la cantidad de cabezas sobre la cual se aplicara la
     * retencion (Required)
     *
     * @return The rentaCabezasCantidad
     */
    public Integer getRentaCabezasCantidad() {
        return rentaCabezasCantidad;
    }

    /**
     * Aqui debe indicar la cantidad de cabezas sobre la cual se aplicara la
     * retencion (Required)
     *
     * @param rentaCabezasCantidad The rentaCabezasCantidad
     */
    public void setRentaCabezasCantidad(Integer rentaCabezasCantidad) {
        this.rentaCabezasCantidad = rentaCabezasCantidad;
    }

    /**
     * Aqui debe indicar el monto de la retencion a ser aplicado sobre cada
     * tonelada (Required)
     *
     * @return The rentaToneladasBase
     */
    public Integer getRentaToneladasBase() {
        return rentaToneladasBase;
    }

    /**
     * Aqui debe indicar el monto de la retencion a ser aplicado sobre cada
     * tonelada (Required)
     *
     * @param rentaToneladasBase The rentaToneladasBase
     */
    public void setRentaToneladasBase(Integer rentaToneladasBase) {
        this.rentaToneladasBase = rentaToneladasBase;
    }

    /**
     * Aqui debe indicar la cantidad de toneladas sobre la cual se aplicara la
     * retencion (Required)
     *
     * @return The rentaToneladasCantidad
     */
    public Integer getRentaToneladasCantidad() {
        return rentaToneladasCantidad;
    }

    /**
     * Aqui debe indicar la cantidad de toneladas sobre la cual se aplicara la
     * retencion (Required)
     *
     * @param rentaToneladasCantidad The rentaToneladasCantidad
     */
    public void setRentaToneladasCantidad(Integer rentaToneladasCantidad) {
        this.rentaToneladasCantidad = rentaToneladasCantidad;
    }

    @Generated("org.jsonschema2pojo")
    public static enum IvaPorcentaje10 {

        @SerializedName("0")
        _0("0"),
        @SerializedName("100")
        _100("100"),
        @SerializedName("50")
        _50("50"),
        @SerializedName("30")
        _30("30"),
        @SerializedName("0.90909")
        _0_90909("0.90909");
        private final String value;
        private final static Map<String, Retencion.IvaPorcentaje10> CONSTANTS = new HashMap<String, Retencion.IvaPorcentaje10>();

        static {
            for (Retencion.IvaPorcentaje10 c : values()) {
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

        public static Retencion.IvaPorcentaje10 fromValue(String value) {
            Retencion.IvaPorcentaje10 constant = CONSTANTS.get(value);
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
        @SerializedName("100")
        _100("100"),
        @SerializedName("50")
        _50("50"),
        @SerializedName("30")
        _30("30"),
        @SerializedName("0.90909")
        _0_90909("0.90909");
        private final String value;
        private final static Map<String, Retencion.IvaPorcentaje5> CONSTANTS = new HashMap<String, Retencion.IvaPorcentaje5>();

        static {
            for (Retencion.IvaPorcentaje5 c : values()) {
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

        public static Retencion.IvaPorcentaje5 fromValue(String value) {
            Retencion.IvaPorcentaje5 constant = CONSTANTS.get(value);
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
        private final static Map<String, Retencion.Moneda> CONSTANTS = new HashMap<String, Retencion.Moneda>();

        static {
            for (Retencion.Moneda c : values()) {
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

        public static Retencion.Moneda fromValue(String value) {
            Retencion.Moneda constant = CONSTANTS.get(value);
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
        @SerializedName("30")
        _30("30"),
        @SerializedName("20")
        _20("20"),
        @SerializedName("15")
        _15("15"),
        @SerializedName("10")
        _10("10"),
        @SerializedName("4.5")
        _4_5("4.5"),
        @SerializedName("3")
        _3("3"),
        @SerializedName("2")
        _2("2"),
        @SerializedName("1.5")
        _1_5("1.5"),
        @SerializedName("1")
        _1("1");
        private final String value;
        private final static Map<String, Retencion.RentaPorcentaje> CONSTANTS = new HashMap<String, Retencion.RentaPorcentaje>();

        static {
            for (Retencion.RentaPorcentaje c : values()) {
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

        public static Retencion.RentaPorcentaje fromValue(String value) {
            Retencion.RentaPorcentaje constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
