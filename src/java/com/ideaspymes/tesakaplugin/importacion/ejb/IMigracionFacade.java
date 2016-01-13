/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.importacion.ejb;

import com.ideaspymes.tesakaplugin.importacion.jpa.RetencionGenerada;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author christian.romero
 */
@Local
public interface IMigracionFacade {
    List<RetencionGenerada> migra(List<RetencionGenerada> retenciones);
}
