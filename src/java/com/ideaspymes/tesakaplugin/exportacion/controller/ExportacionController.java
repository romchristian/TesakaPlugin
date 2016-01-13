/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.controller;

import com.google.gson.GsonBuilder;
import com.ideaspymes.tesakaplugin.exportacion.ejb.IExportacionLocal;
import com.ideaspymes.tesakaplugin.exportacion.generico.JsfUtil;
import com.ideaspymes.tesakaplugin.exportacion.json.Documento;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author christian.romero
 */
@Named
@ViewScoped
public class ExportacionController implements Serializable {

    @EJB
    private IExportacionLocal facade;

    private List<Documento> documentos;

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public String generaJson() throws IOException {

        documentos = facade.getDocumentos();

        if (documentos != null && !documentos.isEmpty()) {
            String json = new GsonBuilder().setPrettyPrinting().create().toJson(documentos);

            HttpServletResponse response
                    = (HttpServletResponse) FacesContext.getCurrentInstance()
                    .getExternalContext().getResponse();

            response.setContentType("application/json");
            response.setHeader("Content-Disposition", "attachment; filename=facturas.json");

            response.getOutputStream().write(json.getBytes());
            response.getOutputStream().flush();
            response.getOutputStream().close();
            FacesContext.getCurrentInstance().responseComplete();
        }else{
            JsfUtil.addErrorMessage("No hay nada que generar!");
        }
        
        
        return null;
    }
}
