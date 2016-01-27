/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.seguridad.ejb;

import com.ideaspymes.tesakaplugin.seguridad.jpa.Grupo;
import com.ideaspymes.tesakaplugin.seguridad.jpa.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian.romero
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "TesakaLocalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public boolean existeUsername(String username) {
        boolean R = false;
        try {
            Usuario u = (Usuario) em.createQuery("SELECT u FROM Usuario u WHERE UPPER( u.username ) = ?1")
                    .setParameter(1, username.trim().toUpperCase()).getSingleResult();

            if (u != null) {
                R = true;
            }
        } catch (Exception e) {

        }

        return R;
    }

    public Usuario find(String username) {
        Usuario R = null;
        try {
            R = (Usuario) em.createQuery("SELECT u FROM Usuario u WHERE UPPER( u.username ) = ?1")
                    .setParameter(1, username.trim().toUpperCase()).getSingleResult();

        } catch (Exception e) {

        }

        return R;
    }

    
    public void create(Usuario entity, Grupo g) {
        em.persist(entity);
        em.flush();
        em.refresh(entity);
        
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(entity);
        g.setUsuarios(usuarios);
        
        em.merge(g);
        
        
        
        
    }

    
    
}
