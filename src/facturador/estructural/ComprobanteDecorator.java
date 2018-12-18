/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Administrador
 */
public class ComprobanteDecorator extends ComprobanteElectronico{
    ComprobanteElectronico comprobante;
    
    public ComprobanteDecorator(ComprobanteElectronico comprobante){
        this.comprobante=comprobante;
    }
    
    public List<String> getDetallesEmisor() {
        return comprobante.getDetallesEmisor();
    }
    
}
