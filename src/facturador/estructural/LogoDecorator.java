package facturador.estructural;

import facturador.creacional.ComprobanteElectronico;
import java.util.*;

/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @author Palacios
 */
public class LogoDecorator extends ComprobanteDecorator {

    
    public LogoDecorator(ComprobanteElectronico comprobante){
        super(comprobante);
    }
    
    public List<String> getDetallesEmisor() {
        List<String> detalles=super.getDetallesEmisor();
        detalles.add("Logo");
        return detalles;
    }

}