/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.web.generico;

import com.ideaspymes.tesakaplugin.seguridad.ejb.GrupoFacade;
import com.ideaspymes.tesakaplugin.seguridad.ejb.UsuarioFacade;
import com.ideaspymes.tesakaplugin.seguridad.jpa.Grupo;
import com.ideaspymes.tesakaplugin.seguridad.jpa.Usuario;
import java.io.Serializable;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author christian.romero
 */
@Named
@ViewScoped
public class Registrador implements Serializable {

    private Usuario actual;
    @EJB
    private UsuarioFacade facade;
    @EJB
    private GrupoFacade facadeGrupo;
    private String password1;
    private String password2;

    public Usuario getActual() {
        if (actual == null) {
            actual = new Usuario();
        }
        return actual;
    }

    public void setActual(Usuario actual) {
        this.actual = actual;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String registra() {

        if (facade.existeUsername(actual.getUsername())) {
            JsfUtil.addErrorMessage("El usuario ya existe!");
            return null;
        }

        if (password1 == null || password2 == null || password1.compareTo(password2) != 0) {
            JsfUtil.addErrorMessage("No coinciden los passwords!");
            return null;
        }

        actual.setPassword(password1);
        
        Grupo g = facadeGrupo.find("contable");
        
        
        
        facade.create(actual,g);
        
        return "confirmacion.xhtml";
    }

}
