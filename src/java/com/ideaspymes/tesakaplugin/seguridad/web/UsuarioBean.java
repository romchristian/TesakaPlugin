/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.seguridad.web;

import com.ideaspymes.tesakaplugin.seguridad.ejb.UsuarioFacade;
import com.ideaspymes.tesakaplugin.seguridad.jpa.Usuario;
import com.ideaspymes.tesakaplugin.web.generico.Credencial;
import com.ideaspymes.tesakaplugin.web.generico.JsfUtil;
import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author christian.romero
 */
@Named
@ViewScoped
public class UsuarioBean implements Serializable {

    @Inject
    private Credencial credencial;
    @EJB
    private UsuarioFacade facade;

    private List<Usuario> usuarios;
    private Usuario actual;

    private String password1;
    private String password2;

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

    public Usuario getActual() {
        return actual;
    }

    public void setActual(Usuario actual) {
        this.actual = actual;
    }

    public List<Usuario> getUsuarios() {
        if (usuarios == null) {
            usuarios = facade.findAll();
        }
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String cambiarClave() {
        if (password1 == null || password2 == null || password1.compareTo(password2) != 0) {
            JsfUtil.addErrorMessage("No coinciden los passwords!");
            return null;
        }

        credencial.getUsuario().setPassword(password1);
        facade.edit(credencial.getUsuario());
        JsfUtil.addSuccessMessage("Se actualizó correctamente!");
        return "/main/home";
    }

    public String toogleEstado() {
        if (actual.getPermitido()) {
            actual.setPermitido(Boolean.FALSE);
        } else {
            actual.setPermitido(Boolean.TRUE);

        }

        facade.edit(actual);
        actual = null;
        return null;
    }

}
