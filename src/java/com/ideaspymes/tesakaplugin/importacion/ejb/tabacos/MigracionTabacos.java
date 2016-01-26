/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ideaspymes.tesakaplugin.importacion.ejb.tabacos;

import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Cmtcom;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.CmtcomPK;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Tetdfa;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.Tetrecret;
import com.ideaspymes.tesakaplugin.exportacion.jpa.tabacos.TetrecretPK;
import com.ideaspymes.tesakaplugin.importacion.ejb.IMigracionFacade;
import com.ideaspymes.tesakaplugin.importacion.jpa.RetencionGenerada;
import com.ideaspymes.tesakaplugin.importacion.json.TransaccionImp;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author christian.romero
 */
@Stateless
public class MigracionTabacos implements IMigracionFacade {

    @PersistenceContext(unitName = "TesakaPluginPU")
    private EntityManager em;

    @Override
    public List<RetencionGenerada> migra(List<RetencionGenerada> retenciones) {
        List<RetencionGenerada> R = new ArrayList<>();
        for (RetencionGenerada r : retenciones) {
            Tetrecret ret = creaRetencion(r);
            if (ret != null) {
                
                

                //busco la factura y la asocio con su retencion
                Cmtcom f = buscaFactura(ret.getCmPrvCod(),
                        ret.getTeRecRetPrvEst(),
                        ret.getTeRecRetPrvPunExp(),
                        ret.getTeRecRetPrvDocNum(),
                        ret.getTeRecRetTpoDoc(),
                        ret.getTeRecRetPrvTimbrado());

                if (f != null) {
                    Tetdfa dop = buscaDetOP(f);
                    ret.setTeRecRetOPgNum(dop.getTetopg().getTetopgPK().getTeOPgNum());
                
                    //Verificar si los montos son iguales
                    dop.setTeDFaImpRet(ret.getTeRecRetImpRet());
                    dop.setTeDFaImpRetMonOP(ret.getTeRecRetImpRet());
                    
                    dop.setTeDFaEstado('G');
                    em.merge(dop);
                    dop.getTetopg().setTeOPgEst('G');
                    em.merge(dop.getTetopg());
                }

                //Creo Comprobante de retención
                em.persist(ret);
               
                R.add(r);
            }
        }

        return R;
    }

    private Tetrecret creaRetencion(RetencionGenerada r) {
        Tetrecret R = new Tetrecret();
        TetrecretPK pk = new TetrecretPK(new Short("1"),
                new Short(r.getCodigoEstablecimiento()),
                new Short(r.getPuntoExpedicionComprobante()),
                new Integer(r.getNumero()),
                new Integer(r.getTimbradoComprobante()));

        R.setTetrecretPK(pk);

        R.setTeRecRetEdo('I');
        R.setTeRecRetFec(r.getFechaRetencion());
        R.setTeRecRetIVAIncTra(getMontoUSS(r.getIvaTotal(),r.getTipoCambio()));
        R.setTeRecRetIVAIncluidoGs(new BigDecimal(r.getIvaTotal()));
        R.setTeRecRetImpRet(getMontoUSS(r.getRetencionTotal(),r.getTipoCambio()));
        R.setTeRecRetImporteRetenidoGs(new BigDecimal(r.getRetencionTotal()));
        R.setTeRecRetOPgNum(null);//Nro OP
        R.setTeRecRetPrjIVARet(getPorcentaje(r.getIvaPorcentaje10().toString()));
        //Factura de proveedor

        R.setCmPrvCod(getCodProveedor(r.getProveedorRuc(), r.getProveedorDv()));

        String numerosFactura[] = r.getNumeroComprobanteVenta().split("-");
        R.setTeRecRetPrvTimbrado(new Integer(r.getNumeroTimbradoFactura()));
        R.setTeRecRetPrvEst(new Short(numerosFactura[0]));
        R.setTeRecRetPrvPunExp(new Short(numerosFactura[1]));
        R.setTeRecRetPrvDocNum(new Integer(numerosFactura[2]));
        R.setTeRecRetTpoDoc(Short.MIN_VALUE);

        if (r.getCondicionCompra() != null && r.getCondicionCompra() == TransaccionImp.CondicionCompra.CONTADO) {
            R.setTeRecRetTpoDoc(new Short("1")); //Buscar desde la base de datos
        } else if (r.getCondicionCompra() != null && r.getCondicionCompra() == TransaccionImp.CondicionCompra.CREDITO) {
            R.setTeRecRetTpoDoc(new Short("2"));//Buscar desde la base de datos
        }
        R.setTeRecRetUltNumLinDet(new Short("0"));
        R.setTeRecRetValTotTra(getMontoUSS(r.getValorTotal(),r.getTipoCambio()));
        R.setTeRecRetValTraSinIVA(getMontoUSS(r.getValorTotal() - r.getImpuestoTotal(),r.getTipoCambio()));
        R.setTeRecRetValorTotalSinIVAGs(new BigDecimal(r.getValorTotal() - r.getImpuestoTotal()));
        R.setTeRecRetValorTotalTranGs(new BigDecimal(r.getValorTotal()));

        return R;

    }

    public BigDecimal getMontoUSS(Double monto, Integer tipoCambio) {
        if (tipoCambio == null || tipoCambio == 0) {
            return new BigDecimal(monto);
        } else {
            return new BigDecimal(monto).divide(new BigDecimal(tipoCambio),2,RoundingMode.HALF_EVEN);
        }

    }

    public BigDecimal getMontoUSS(Integer monto, Integer tipoCambio) {
        if (tipoCambio == null || tipoCambio == 0) {
            return new BigDecimal(monto);
        } else {
            return new BigDecimal(monto).divide(new BigDecimal(tipoCambio),2,RoundingMode.HALF_EVEN);
        }
    }

    public BigDecimal getPorcentaje(String p) {
        return new BigDecimal(p.replace("_", ""));
    }

    private Short getCodProveedor(String proveedorRuc, String proveedorDv) {
        Short R = 0;
        try {
            Integer ruc = new Integer(proveedorRuc + proveedorDv);
            R = ((Integer) em.createNativeQuery("select cmprvcod from cmtprv where cmPrvRucNue = " + ruc)
                    .getSingleResult()).shortValue();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return R;
    }

    private Cmtcom buscaFactura(Short cmPrvCod, Short teRecRetPrvEst, Short teRecRetPrvPunExp, Integer teRecRetPrvDocNum, Short teRecRetTpoDoc, Integer teRecRetPrvTimbrado) {
        Cmtcom R = null;
        try {
            R = em.find(Cmtcom.class, new CmtcomPK(cmPrvCod, teRecRetPrvEst, teRecRetPrvPunExp, teRecRetPrvDocNum, teRecRetTpoDoc, teRecRetPrvTimbrado));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return R;
    }

    private Tetdfa buscaDetOP(Cmtcom f) {
        Tetdfa R = null;

        try {
            
            R = (Tetdfa) em.createQuery("SELECT d from Tetdfa d "
                    + " WHERE d.teDFaEstado = 'E' "
                    + " AND d.tetopg.teOPgPrvCod.cmPrvCod = ?1 "
                    + " AND d.teDFaSucPrv = ?2 "
                    + " AND d.teDFaPunExp = ?3 "
                    + " AND d.teDFaDocNum = ?4 "
                    + " AND d.teDFaTCoCod = ?5 "
                    + " AND d.teDFaTimbrado = ?6")
                    .setParameter(1, f.getCmtcomPK().getCmPrvCod())
                    .setParameter(2, f.getCmtcomPK().getCmComSucPrv())
                    .setParameter(3, f.getCmtcomPK().getCmComPunExp())
                    .setParameter(4, f.getCmtcomPK().getCmComNum())
                    .setParameter(5, f.getCmtcomPK().getCmTCoCod())
                    .setParameter(6, f.getCmtcomPK().getCmComTimNum())
                    .getSingleResult();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return R;
    }

}
