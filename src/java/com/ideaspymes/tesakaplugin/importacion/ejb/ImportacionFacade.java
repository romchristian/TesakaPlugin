/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.importacion.ejb;

import com.ideaspymes.tesakaplugin.importacion.jpa.RetencionGenerada;
import com.ideaspymes.tesakaplugin.importacion.json.Datos;
import com.ideaspymes.tesakaplugin.importacion.json.RecepcionImp;
import com.ideaspymes.tesakaplugin.web.generico.Credencial;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
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
    @Inject
    private Credencial credencial;

    public RetencionGenerada persist(Datos d, RecepcionImp r) throws RetencionDuplicadaException {
        RetencionGenerada rg = new RetencionGenerada(d, r);
        try {
            em.persist(rg);
            em.flush();
            em.refresh(rg);
        } catch (Exception e) {
            throw new RetencionDuplicadaException(e.getMessage());
        }

        return rg;
    }

    public void marcaMigrado(RetencionGenerada r) {
        r.setMigrado(true);
        em.merge(r);
    }

    public List<RetencionGenerada> getRetencionesNoMigradas() {

        return em.createQuery("SELECT r FROM RetencionGenerada r WHERE r.migrado = false and r.timbradoComprobante = ?1 and r.puntoExpedicionComprobante = ?2 and r.establecimiento = ?3")
                .setParameter(1, credencial.getUsuario().getTimbrado() + "")
                .setParameter(2, credencial.getUsuario().getPuntoExpedicion())
                .setParameter(3, credencial.getUsuario().getEstablecimiento())
                .getResultList();
    }

}
