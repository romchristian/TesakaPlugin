/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.seguridad.ejb;

import com.ideaspymes.tesakaplugin.seguridad.jpa.Grupo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian.romero
 */
@Stateless
public class GrupoFacade extends AbstractFacade<Grupo> {

    @PersistenceContext(unitName = "TesakaLocalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GrupoFacade() {
        super(Grupo.class);
    }
    
    public Grupo find(String nombre){
        Grupo R = null;
        try {
            R = (Grupo) em.createQuery("SELECT g FROM Grupo g WHERE g.nombre = ?1")
                    .setParameter(1, nombre)
                    .getSingleResult();
            
        } catch (Exception e) {
        }
        
        return R;
    }
}
