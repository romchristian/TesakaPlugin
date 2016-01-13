/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.importacion.controller;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.reflect.TypeToken;
import com.ideaspymes.tesakaplugin.importacion.ejb.IMigracionFacade;
import com.ideaspymes.tesakaplugin.importacion.ejb.ImportacionFacade;
import com.ideaspymes.tesakaplugin.importacion.jpa.RetencionGenerada;
import com.ideaspymes.tesakaplugin.importacion.json.Datos;
import com.ideaspymes.tesakaplugin.importacion.json.DocumentoGenerado;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.apache.commons.io.IOUtils;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author christian.romero
 */
@Named
@ViewScoped
public class ImportacionController implements Serializable {
    
    private UploadedFile file;
    @EJB
    private ImportacionFacade facade;
    @EJB
    private IMigracionFacade facadeMigracion;
    private List<RetencionGenerada> retenciones;
    
    public UploadedFile getFile() {
        return file;
    }
    
    public void setFile(UploadedFile file) {
        this.file = file;
    }
    
    public List<RetencionGenerada> getRetenciones() {
        return retenciones;
    }
    
    public void setRetenciones(List<RetencionGenerada> retenciones) {
        this.retenciones = retenciones;
    }
    
    public void handleFileUpload(FileUploadEvent event) throws IOException {
        if (event.getFile() != null) {
            StringWriter writer = new StringWriter();
            IOUtils.copy(event.getFile().getInputstream(), writer, "UTF-8");
            
            String json = writer.toString();
            
            System.out.println(json);
            
            Gson gson = new Gson();
            
            Type listType = new TypeToken<ArrayList<DocumentoGenerado>>() {
            }.getType();
            List<DocumentoGenerado> datos = gson.fromJson(json, listType);
            
            System.out.println("datos: " + datos.size());
            
            retenciones = new ArrayList<>();
            
            for (DocumentoGenerado dg : datos) {
                Datos d = dg.getDatos();
                System.out.println("Recepcion: " + dg.getEstado());
                System.out.println("Atributos: " + d.getAtributos());
                System.out.println("Informante: " + d.getInformante());
                System.out.println("Informado: " + d.getInformado());
                System.out.println("Transaccion: " + d.getTransaccion());
                System.out.println("Retencion: " + d.getRetencion());
                System.out.println("Recepcion: " + dg.getRecepcion());
                System.out.println("Totales: " + d.getTotales());
                System.out.println("Id: " + d.getId());
                
                if (dg.getEstado().compareToIgnoreCase("borrador") == 0) {
                    facade.persist(d, dg.getRecepcion());
                } else {
                    FacesMessage message = new FacesMessage("Error", " La retencion no esta en borrador!");
                    FacesContext.getCurrentInstance().addMessage(null, message);
                }
                
            }
            
            FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
            FacesContext.getCurrentInstance().addMessage(null, message);
            
            retenciones = facade.getRetencionesNoMigradas();
        }
    }
    
    public void migrar() {
        List<RetencionGenerada> retencionesMigradas = facadeMigracion.migra(retenciones);
        for (RetencionGenerada r : retencionesMigradas) {
            facade.marcaMigrado(r);
        }
        
        retenciones = facade.getRetencionesNoMigradas();
        
    }
}
