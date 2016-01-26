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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
    
    public void buscar() {
        documentos = facade.getDocumentos();
        for (Documento d : documentos) {
            if (d.getTotal() == 0) {
                d.setRenderEnviar(false);
                d.setMensaje("No tiene detalles");
            }
        }
    }
    
    public String generaJson() throws IOException {
        
        if (documentos != null && !documentos.isEmpty()) {
            List<Documento> docsAEnviar = new ArrayList<>();
            for (Documento d : documentos) {
                if (d.getEnviar()) {
                    docsAEnviar.add(d);
                }
            }
            
            String json = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create().toJson(docsAEnviar);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss");
            String postfix = sdf.format(new Date());
            String filename = "documentosJson_"+postfix+".txt";
            
            HttpServletResponse response
                    = (HttpServletResponse) FacesContext.getCurrentInstance()
                    .getExternalContext().getResponse();
            
            response.setContentType("application/text");
            response.setHeader("Content-Disposition", "attachment; filename="+filename);
            
            response.getOutputStream().write(json.getBytes());
            response.getOutputStream().flush();
            response.getOutputStream().close();
            FacesContext.getCurrentInstance().responseComplete();
        } else {
            JsfUtil.addErrorMessage("No hay nada que generar!");
        }
        
        return null;
    }
    
    public void seleccionarTodos() {
        for (Documento d : documentos) {
            if (d.getRenderEnviar()) {
                d.setEnviar(Boolean.TRUE);
            }
        }
    }
    
    public void deseleccionarTodos() {
        for (Documento d : documentos) {
            if (d.getRenderEnviar()) {
                d.setEnviar(Boolean.FALSE);
            }
        }
    }
    
    
    public void invertirTodos() {
        for (Documento d : documentos) {
            if (d.getRenderEnviar()) {
                if(d.getEnviar()){
                    d.setEnviar(Boolean.FALSE);
                }else{
                    d.setEnviar(Boolean.TRUE);
                }
            }
        }
    }
}
