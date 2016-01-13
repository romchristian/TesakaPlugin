package com.ideaspymes.tesakaplugin.importacion.json;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Información del cliente asociado al comprobante
 *
 */
@Generated("org.jsonschema2pojo")
public class InformadoImp {

    /**
     * Indica la situacion del proveedor (Required)
     *
     */
    @SerializedName("situacion")
    @Expose
    private String situacion;
    /**
     * Indica el RUC del proveedor informado
     *
     */
    @SerializedName("ruc")
    @Expose
    private String ruc;
    /**
     * Indica el dígito verificador del RUC del proveedor informado
     *
     */
    @SerializedName("dv")
    @Expose
    private String dv;
    /**
     * Indica el tipo documento de identificación del proveedor en caso que el
     * informado sea no contribuyente o no domiciliado
     *
     */
    @SerializedName("tipoIdentificacion")
    @Expose
    private InformadoImp.TipoIdentificacion tipoIdentificacion;
    /**
     * Indica el número de documento de identificación en caso que el informado
     * sea no contribuyente o no domiciliado (Required)
     *
     */
    @SerializedName("identificacion")
    @Expose
    private String identificacion;
    /**
     * Indica el nombre completo del informado (Required)
     *
     */
    @SerializedName("nombre")
    @Expose
    private String nombre;
    /**
     * Domicilio ingresado en caso de que el proveedor sea un contribuyente
     * (Required)
     *
     */
    @SerializedName("domicilio")
    @Expose
    private String domicilio;
    /**
     * Indica la dirección para un proveedor informado no contribuyente o no
     * domiciliado (Required)
     *
     */
    @SerializedName("direccion")
    @Expose
    private String direccion;
    /**
     * Dirección de correo electrónico para el caso de un informado no
     * contribuyente o no domiciliado (Required)
     *
     */
    @SerializedName("correoElectronico")
    @Expose
    private String correoElectronico;
    /**
     * País de origen cuando el informado es no domiciliado (Required)
     *
     */
    @SerializedName("pais")
    @Expose
    private String pais;
    /**
     * Indica el número de teléfono ingresado para el caso de un informado no
     * contribuyente o no domiciliado (Required)
     *
     */
    @SerializedName("telefono")
    @Expose
    private String telefono;
    /**
     * Nombre para el tipo de identificación
     *
     */
    @SerializedName("tipoIdentificacionNombre")
    @Expose
    private String tipoIdentificacionNombre;
    /**
     * Indica el nombre del país seleccionado
     *
     */
    @SerializedName("paisNombre")
    @Expose
    private String paisNombre;

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    /**
     * Indica el RUC del proveedor informado
     *
     * @return The ruc
     */
    public String getRuc() {
        return ruc;
    }

    /**
     * Indica el RUC del proveedor informado
     *
     * @param ruc The ruc
     */
    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    /**
     * Indica el dígito verificador del RUC del proveedor informado
     *
     * @return The dv
     */
    public String getDv() {
        return dv;
    }

    /**
     * Indica el dígito verificador del RUC del proveedor informado
     *
     * @param dv The dv
     */
    public void setDv(String dv) {
        this.dv = dv;
    }

    /**
     * Indica el tipo documento de identificación del proveedor en caso que el
     * informado sea no contribuyente o no domiciliado
     *
     * @return The tipoIdentificacion
     */
    public InformadoImp.TipoIdentificacion getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    /**
     * Indica el tipo documento de identificación del proveedor en caso que el
     * informado sea no contribuyente o no domiciliado
     *
     * @param tipoIdentificacion The tipoIdentificacion
     */
    public void setTipoIdentificacion(InformadoImp.TipoIdentificacion tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    /**
     * Indica el número de documento de identificación en caso que el informado
     * sea no contribuyente o no domiciliado (Required)
     *
     * @return The identificacion
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * Indica el número de documento de identificación en caso que el informado
     * sea no contribuyente o no domiciliado (Required)
     *
     * @param identificacion The identificacion
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * Indica el nombre completo del informado (Required)
     *
     * @return The nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Indica el nombre completo del informado (Required)
     *
     * @param nombre The nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Domicilio ingresado en caso de que el proveedor sea un contribuyente
     * (Required)
     *
     * @return The domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Domicilio ingresado en caso de que el proveedor sea un contribuyente
     * (Required)
     *
     * @param domicilio The domicilio
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * Indica la dirección para un proveedor informado no contribuyente o no
     * domiciliado (Required)
     *
     * @return The direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Indica la dirección para un proveedor informado no contribuyente o no
     * domiciliado (Required)
     *
     * @param direccion The direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Dirección de correo electrónico para el caso de un informado no
     * contribuyente o no domiciliado (Required)
     *
     * @return The correoElectronico
     */
    public String getCorreoElectronico() {
        return correoElectronico;
    }

    /**
     * Dirección de correo electrónico para el caso de un informado no
     * contribuyente o no domiciliado (Required)
     *
     * @param correoElectronico The correoElectronico
     */
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * País de origen cuando el informado es no domiciliado (Required)
     *
     * @return The pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * País de origen cuando el informado es no domiciliado (Required)
     *
     * @param pais The pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Indica el número de teléfono ingresado para el caso de un informado no
     * contribuyente o no domiciliado (Required)
     *
     * @return The telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Indica el número de teléfono ingresado para el caso de un informado no
     * contribuyente o no domiciliado (Required)
     *
     * @param telefono The telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Nombre para el tipo de identificación
     *
     * @return The tipoIdentificacionNombre
     */
    public String getTipoIdentificacionNombre() {
        return tipoIdentificacionNombre;
    }

    /**
     * Nombre para el tipo de identificación
     *
     * @param tipoIdentificacionNombre The tipoIdentificacionNombre
     */
    public void setTipoIdentificacionNombre(String tipoIdentificacionNombre) {
        this.tipoIdentificacionNombre = tipoIdentificacionNombre;
    }

    /**
     * Indica el nombre del país seleccionado
     *
     * @return The paisNombre
     */
    public String getPaisNombre() {
        return paisNombre;
    }

    /**
     * Indica el nombre del país seleccionado
     *
     * @param paisNombre The paisNombre
     */
    public void setPaisNombre(String paisNombre) {
        this.paisNombre = paisNombre;
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
        private final static Map<String, InformadoImp.Situacion> CONSTANTS = new HashMap<String, InformadoImp.Situacion>();

        static {
            for (InformadoImp.Situacion c : values()) {
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

        public static InformadoImp.Situacion fromValue(String value) {
            InformadoImp.Situacion constant = CONSTANTS.get(value);
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
        IDENTIFICACION_TRIBUTARIA("IDENTIFICACION_TRIBUTARIA"),
        @SerializedName("")
        __EMPTY__("");
        private final String value;
        private final static Map<String, InformadoImp.TipoIdentificacion> CONSTANTS = new HashMap<String, InformadoImp.TipoIdentificacion>();

        static {
            for (InformadoImp.TipoIdentificacion c : values()) {
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

        public static InformadoImp.TipoIdentificacion fromValue(String value) {
            InformadoImp.TipoIdentificacion constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
