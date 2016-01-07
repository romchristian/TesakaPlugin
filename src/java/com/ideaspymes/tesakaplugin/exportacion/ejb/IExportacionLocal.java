/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.ejb;

import com.ideaspymes.tesakaplugin.exportacion.json.Documento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author christian.romero
 */
@Local
public interface IExportacionLocal {

    List<Documento> getDocumentos();
}
