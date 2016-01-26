/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.web.generico;

import java.io.Serializable;
import java.util.Locale;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author christian.romero
 */
@Named
@SessionScoped
public class Formateador implements Serializable{
    
    private Locale locale = new Locale("es", "py");
    private String patternFecha = "dd/MM/yyyy";
    private String patternFechaHora = "dd/MM/yyyy HH:mm";

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }

    public String getPatternFecha() {
        return patternFecha;
    }

    public void setPatternFecha(String patternFecha) {
        this.patternFecha = patternFecha;
    }

    public String getPatternFechaHora() {
        return patternFechaHora;
    }

    public void setPatternFechaHora(String patternFechaHora) {
        this.patternFechaHora = patternFechaHora;
    }
    
    
}
