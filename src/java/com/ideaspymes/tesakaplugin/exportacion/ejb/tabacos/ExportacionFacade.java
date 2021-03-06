/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.exportacion.ejb.tabacos;

import com.ideaspymes.tesakaplugin.exportacion.ejb.IExportacionLocal;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Cmtcgr;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Cmtcom;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Cmtcomdetalleproductos;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Cmtprv;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Tetdfa;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Tetopg;
import com.ideaspymes.tesakaplugin.exportacion.json.AtributosExp;
import com.ideaspymes.tesakaplugin.exportacion.json.Detalle;
import com.ideaspymes.tesakaplugin.exportacion.json.Documento;
import com.ideaspymes.tesakaplugin.exportacion.json.Informado;
import com.ideaspymes.tesakaplugin.exportacion.json.Retencion;
import com.ideaspymes.tesakaplugin.exportacion.json.RetencionMasTipoCambio;
import com.ideaspymes.tesakaplugin.exportacion.json.Transaccion;
import com.ideaspymes.tesakaplugin.web.generico.Credencial;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class ExportacionFacade implements IExportacionLocal {

    @PersistenceContext(unitName = "TesakaPluginPU")
    private EntityManager em;
    @Inject
    private Credencial credencial;

    @Override
    public List<Documento> getDocumentos() {
        
        List<Tetopg> ops = em.createQuery("SELECT op FROM Tetopg op WHERE op.teOPgEst = 'E' and op.teOPgSucCod = ?1")
                .setParameter(1, getSucursal())
                .getResultList();

        //List<Cmtcom> facturas = new ArrayList<>();
        List<Documento> R = new ArrayList<>();

        for (Tetopg op : ops) {
            for (Tetdfa dop : op.getTetdfaList()) {
                if (dop.getTeDFaImpRet().compareTo(BigDecimal.ZERO) > 0) {
                    
                    Cmtcom f = buscaFactura(dop.getTetopg().getTeOPgPrvCod().getCmPrvCod(),
                            dop.getTeDFaSucPrv(),
                            dop.getTeDFaPunExp(),
                            dop.getTeDFaDocNum(),
                            dop.getTeDFaTCoCod(),
                            dop.getTeDFaTimbrado());
                    
                    
                    if (f != null) {
                        //facturas.add(f);
                        Documento doc = creaDocumento(f, op);
                        if (doc != null) {
                            R.add(doc);
                        }
                    }
                }

            }
        }

        return R;
    }

    private Cmtcom buscaFactura(Short teOPgPrvCod, Short teDFaSucPrv, Short teDFaPunExp, Integer teDFaDocNum, Short teDFaTCoCod, Integer teDFaTimbrado) {
        Cmtcom R = null;
        try {
            R = (Cmtcom) em.createQuery("SELECT f FROM Cmtcom f "
                    + " WHERE f.cmtcomPK.cmPrvCod = ?1"
                    + " AND f.cmtcomPK.cmComSucPrv = ?2 "
                    + " and f.cmtcomPK.cmComPunExp = ?3 "
                    + " and f.cmtcomPK.cmComNum = ?4 "
                    + " and f.cmtcomPK.cmTCoCod = ?5 "
                    + " and f.cmtcomPK.cmComTimNum = ?6")
                    .setParameter(1, teOPgPrvCod)
                    .setParameter(2, teDFaSucPrv)
                    .setParameter(3, teDFaPunExp)
                    .setParameter(4, teDFaDocNum)
                    .setParameter(5, teDFaTCoCod)
                    .setParameter(6, teDFaTimbrado)
                    .getSingleResult();

        } catch (Exception e) {
        }

        return R;
    }

    private Documento creaDocumento(Cmtcom f, Tetopg op) {

        AtributosExp atributos = creaAtributos();
        Informado informado = creaInformado(f);
        List<Detalle> detalles = creaDetalles(f);
        Retencion ret = creaRetencion(f, op);
        Transaccion trans = creaTransaccion(f);

        Documento R = new Documento(atributos, informado, trans, detalles, ret);

        return R;
    }

    private String completaCeros(String valor) {
        String R = "";
        switch (valor.length()) {
            case 1:
                R = "00" + valor;
                break;
            case 2:
                R = "0" + valor;
                break;
            case 3:
                R = valor;
                break;
            default:
                break;
        }

        return R;
    }

    private AtributosExp creaAtributos() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdfHora = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date fechaCreacion = new Date();
        AtributosExp atributos = new AtributosExp(sdf.format(fechaCreacion), sdfHora.format(fechaCreacion));
        return atributos;
    }

    private Informado creaInformado(Cmtcom f) {
        Cmtprv prov = f.getCmtprv();

        String situacion;
        switch (prov.getCmSituacionProvTesakaId()) {
            case 1:
                situacion = Informado.Situacion.CONTRIBUYENTE.toString();
                break;
            default:
                situacion = Informado.Situacion.CONTRIBUYENTE.toString();
        }

        String rucNum = prov.getCmPrvRUCNue() + "";
        System.out.println("RUCNUM: " + rucNum);
        String ruc = rucNum.substring(0, rucNum.length() - 1);
        String dv = rucNum.substring(rucNum.length() - 1, rucNum.length());
        System.out.println("RUC: " + ruc);
        System.out.println("DV: " + dv);

        Informado informado = new Informado(situacion, ruc, dv, "", "", prov.getCmPrvNom(), prov.getCmPrvDir(), "", prov.getCmPrvEMail(), "", ""); // Pais y telefono solo para no domiciliado

        return informado;
    }

    private List<Detalle> creaDetalles(Cmtcom f) {
        List<Detalle> detalles = new ArrayList<>();
        
        System.out.println("Detalles Productos: " + f.getCmtcomdetalleproductos());
        
        
        Boolean b = false;
        Boolean bExe = false; 
        
        for(Cmtcgr gr : f.getCmtcgrs()){
            BigDecimal impGrabOrig = gr.getCmCGrImp();
            BigDecimal impGrabFinal = gr.getCmCGrSal();
         System.out.println("bp 1");   
            if (impGrabOrig.compareTo(impGrabFinal) > 0) {
                 b = true;
                 System.out.println("bp 2");
                    break;
            }
        }
        
        BigDecimal impExentasOrig = f.getCmComExeTot();
        BigDecimal impExentasSaldo = f.getCmComExeSal();
        
        if (impExentasSaldo.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("bp 3");
            if (impExentasOrig.compareTo(impExentasSaldo) > 0) {
                System.out.println("bp 4");
                if (b == false){
                    System.out.println("bp 5");
                    b = true;
                }
            }
            bExe = true;
        }
        
        
        if (b == true) {
            System.out.println("bp 6");
            for(Cmtcgr gr : f.getCmtcgrs()){            
                String tasa = ""+ gr.getCmCGrPrcIVA().intValue();
                Detalle d = new Detalle( 1d, tasa, gr.getCmCGrSal().doubleValue(), "RETENCIÓN A PROVEEDOR");
                detalles.add(d);
            }
            
            if (bExe == true) {
                System.out.println("bp 7");
                String tasa = "0";
                Detalle d = new Detalle( 1d, tasa, impExentasSaldo.doubleValue(), "RETENCIÓN A PROVEEDOR");
                detalles.add(d);                
                
            }
        } else {
            System.out.println("bp 8");

            for (Cmtcomdetalleproductos df : f.getCmtcomdetalleproductos()) {
                String tasa = "" + df.getCmDetProPorIVA().intValue();
                Detalle d = new Detalle(df.getCmDetProCan().doubleValue(), tasa, df.getCmDetProPre().doubleValue(), df.getCmDetProProDes());
                detalles.add(d);
            }
        }
        
        
        return detalles;
    }

    private Retencion creaRetencion(Cmtcom f, Tetopg op) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String moneda;

        switch (f.getNuMndCod()) {
            case 1:
                moneda = Retencion.Moneda.PYG.toString();
                break;
            case 2:
                moneda = Retencion.Moneda.USD.toString();
                break;
            default:
                moneda = Retencion.Moneda.PYG.toString();
        }

        Retencion ret;

        if (f.getCmComCtz() != null && f.getCmComCtz().compareTo(BigDecimal.ZERO) > 0) {
            ret = new RetencionMasTipoCambio(sdf.format(op.getTeOPgFch()), moneda, f.getCmComCtz() == null ? 0 : f.getCmComCtz().doubleValue(),
                    Boolean.FALSE, "", Boolean.TRUE, "IVA.1", 0, 0, 0, 0, 0, 30, 30);
        } else {
            ret = new Retencion(sdf.format(op.getTeOPgFch()), moneda,
                    Boolean.FALSE, "", Boolean.TRUE, "IVA.1", 0, 0, 0, 0, 0, 30, 30);

        }

        return ret;
    }

    private Transaccion creaTransaccion(Cmtcom f) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String codSuc = completaCeros(f.getCmtcomPK().getCmComSucPrv() + "");
        String pexp = completaCeros(f.getCmtcomPK().getCmComPunExp() + "");
        String numero = codSuc + "-" + pexp + "-" + f.getCmtcomPK().getCmComNum();

        Transaccion trans = new Transaccion(f.getCmttco().getCmTCoDsc(),
                new Integer(f.getCmComCanCuo() + ""),
                new Integer(f.getCmttco().getCmTCoTipDocTesaka() + ""),
                numero,
                sdf.format(f.getCmComFch()),
                f.getCmtcomPK().getCmComTimNum() + "");

        return trans;
    }

    private Short getSucursal() {
        Short R = null;
        switch (credencial.getUsuario().getSucursal()) {
            case "ASU":
                R = new Short("1");
                break;
            case "CDE":
                R = new Short("2");
                break;
            case "PJC":
                R = new Short("5");
                break;
            case "ENC":
                R = new Short("3");
                break;
        }

        return R;
    }

}
