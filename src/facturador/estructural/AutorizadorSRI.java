/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;

/**
 *
 * @author Palacios
 */
public class AutorizadorSRI {
    
    private final Esquema esquema_de_autorizacion;

 
    public AutorizadorSRI(Esquema esquema_de_autorizacion) {
        this.esquema_de_autorizacion = esquema_de_autorizacion;
    }
    
    public void autorizar(ComprobanteElectronico comprobante){
        esquema_de_autorizacion.autorizar(comprobante);
    }
    
}
