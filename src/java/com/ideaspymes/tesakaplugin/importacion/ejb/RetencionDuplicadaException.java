/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.importacion.ejb;

/**
 *
 * @author christian.romero
 */
public class RetencionDuplicadaException extends Exception{

    public RetencionDuplicadaException(String message) {
        super("Retencion duplicada: " + message);
    }
    
    
}
