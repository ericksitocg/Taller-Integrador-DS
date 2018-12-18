/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.comportamental;

import facturador.creacional.ComprobanteElectronico;

/**
 *
 * @author casa
 */
public class EsquemaOnline implements Esquema {

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        String nAutorizacion = Integer.toString((int)(Math.random() * 10000) + 1);
        comprobante.setNumeroAutorizacion(nAutorizacion);
    }
    
}
