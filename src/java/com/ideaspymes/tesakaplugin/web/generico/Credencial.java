/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.web.generico;


import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;






/**
 *
 * @author cromero
 */
@Named
@SessionScoped
public class Credencial implements Serializable {

    private Usuario usuario;

    @Produces
    @UsuarioLogueado
    public Usuario getUsuario() {
        if (usuario == null) {
            usuario = new Usuario();
        }
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
