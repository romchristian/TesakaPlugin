package com.ideaspymes.tesakaplugin.exportacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Informado {

    /**
     * Aqui debe informar la situacion del proveedor (Required)
     *
     */
    @SerializedName("situacion")
    @Expose
    private String situacion;
    /**
     * Aqui debe ingresar el RUC del contribuyente
     *
     */
    @SerializedName("ruc")
    @Expose
    private String ruc;
    /**
     * Aqui debe ingresar el digito verificador el ruc
     *
     */
    @SerializedName("dv")
    @Expose
    private String dv;
    /**
     * En caso que el informado sea no contribuyente o no domiciliado aqui debe
     * informar que tipo de documento de identificacion utilizara
     *
     */
    @SerializedName("tipoIdentificacion")
    @Expose
    private String tipoIdentificacion;
    /**
     * En caso que el informado sea no contribuyente o no domiciliado aqui debe
     * informar su numero de documento de identificacion (Required)
     *
     */
    @SerializedName("identificacion")
    @Expose
    private String identificacion;
    /**
     * Nombre completo del informado (Required)
     *
     */
    @SerializedName("nombre")
    @Expose
    private String nombre;
    /**
     * Para el caso de un informado contribuyente, aqui debe especificar cual es
     * su domicilio (Required)
     *
     */
    @SerializedName("domicilio")
    @Expose
    private String domicilio;
    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su direccion (Required)
     *
     */
    @SerializedName("direccion")
    @Expose
    private String direccion;
    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su direccion de correo electronico (Required)
     *
     */
    @SerializedName("correoElectronico")
    @Expose
    private String correoElectronico;
    /**
     * Para un caso de un informado no domiciliado, aqui debe especificar su
     * pais de origen (Required)
     *
     */
    @SerializedName("pais")
    @Expose
    private String pais;
    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su numero de telefono (Required)
     *
     */
    @SerializedName("telefono")
    @Expose
    private String telefono;

    /**
     * No args constructor for use in serialization
     *
     */
    public Informado() {
    }

    /**
     *
     * @param nombre
     * @param direccion
     * @param identificacion
     * @param correoElectronico
     * @param dv
     * @param tipoIdentificacion
     * @param pais
     * @param domicilio
     * @param situacion
     * @param ruc
     * @param telefono
     */
    public Informado(String situacion, String ruc, String dv, String tipoIdentificacion, String identificacion, String nombre, String domicilio, String direccion, String correoElectronico, String pais, String telefono) {
        this.situacion = situacion;
        this.ruc = ruc;
        this.dv = dv;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.direccion = direccion;
        this.correoElectronico = correoElectronico;
        this.pais = pais;
        this.telefono = telefono;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    /**
     * Aqui debe ingresar el RUC del contribuyente
     *
     * @return The ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Aqui debe ingresar el RUC del contribuyente
     *
     * @param ruc The ruc
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * Aqui debe ingresar el digito verificador el ruc
     *
     * @return The dv
     */
    public String getDv() {
        return dv;
    }

    /**
     * Aqui debe ingresar el digito verificador el ruc
     *
     * @param dv The dv
     */
    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    /**
     * En caso que el informado sea no contribuyente o no domiciliado aqui debe
     * informar su numero de documento de identificacion (Required)
     *
     * @return The identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * En caso que el informado sea no contribuyente o no domiciliado aqui debe
     * informar su numero de documento de identificacion (Required)
     *
     * @param identificacion The identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Nombre completo del informado (Required)
     *
     * @return The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Nombre completo del informado (Required)
     *
     * @param nombre The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Para el caso de un informado contribuyente, aqui debe especificar cual es
     * su domicilio (Required)
     *
     * @return The domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Para el caso de un informado contribuyente, aqui debe especificar cual es
     * su domicilio (Required)
     *
     * @param domicilio The domicilio
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su direccion (Required)
     *
     * @return The direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su direccion (Required)
     *
     * @param direccion The direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su direccion de correo electronico (Required)
     *
     * @return The correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su direccion de correo electronico (Required)
     *
     * @param correoElectronico The correoElectronico
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * Para un caso de un informado no domiciliado, aqui debe especificar su
     * pais de origen (Required)
     *
     * @return The pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Para un caso de un informado no domiciliado, aqui debe especificar su
     * pais de origen (Required)
     *
     * @param pais The pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su numero de telefono (Required)
     *
     * @return The telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Para un caso de un informado no contribuyente o no domiciliado, aqui debe
     * especificar su numero de telefono (Required)
     *
     * @param telefono The telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Generated("org.jsonschema2pojo")
    public static enum Situacion {

        @SerializedName("contribuyente")
        CONTRIBUYENTE("contribuyente"),
        @SerializedName("no contribuyente")
        NO_CONTRIBUYENTE("no contribuyente"),
        @SerializedName("no domiciliado")
        NO_DOMICILIADO("no domiciliado");
        private final String value;
        private final static Map<String, Informado.Situacion> CONSTANTS = new HashMap<String, Informado.Situacion>();

        static {
            for (Informado.Situacion c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Situacion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static Informado.Situacion fromValue(String value) {
            Informado.Situacion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

    @Generated("org.jsonschema2pojo")
    public static enum TipoIdentificacion {

        @SerializedName("CEDULA")
        CEDULA("CEDULA"),
        @SerializedName("CARNE_RESIDENCIA")
        CARNE_RESIDENCIA("CARNE_RESIDENCIA"),
        @SerializedName("PASAPORTE")
        PASAPORTE("PASAPORTE"),
        @SerializedName("IDENTIFICACION_TRIBUTARIA")
        IDENTIFICACION_TRIBUTARIA("IDENTIFICACION_TRIBUTARIA");
        private final String value;
        private final static Map<String, Informado.TipoIdentificacion> CONSTANTS = new HashMap<String, Informado.TipoIdentificacion>();

        static {
            for (Informado.TipoIdentificacion c : values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private TipoIdentificacion(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        public static Informado.TipoIdentificacion fromValue(String value) {
            Informado.TipoIdentificacion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
