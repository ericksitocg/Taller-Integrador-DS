/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class PiePaginaDecorator extends ComprobanteDecorator{
    
    public PiePaginaDecorator(ComprobanteElectronico comprobante){
        super(comprobante);
    }
    
    public List<String> getDetallesEmisor() {
        List<String> detalles=comprobante.getDetallesEmisor();
        detalles.add("Pie de pagina");
        return detalles;
    }
}
