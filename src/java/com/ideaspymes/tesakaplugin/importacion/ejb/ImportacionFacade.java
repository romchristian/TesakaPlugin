/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.importacion.ejb;

import com.ideaspymes.tesakaplugin.importacion.jpa.RetencionGenerada;
import com.ideaspymes.tesakaplugin.importacion.json.Datos;
import com.ideaspymes.tesakaplugin.importacion.json.RecepcionImp;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian.romero
 */
@Stateless
public class ImportacionFacade {

    @PersistenceContext(unitName = "TesakaLocalPU")
    private EntityManager em;

    public RetencionGenerada persist(Datos d, RecepcionImp r) {
        RetencionGenerada rg = new RetencionGenerada(d, r);
        em.persist(rg);
        em.flush();
        em.refresh(rg);

        return rg;
    }

    
    public void marcaMigrado(RetencionGenerada r){
        r.setMigrado(true);
        em.merge(r);
    }
    public List<RetencionGenerada> getRetencionesNoMigradas() {
        return em.createQuery("SELECT r FROM RetencionGenerada r WHERE r.migrado = false").getResultList();
    }

}
