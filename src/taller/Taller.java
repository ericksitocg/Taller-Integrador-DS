/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;
import facturador.creacional.Factura;
import facturador.creacional.GuiaRemision;
import facturador.creacional.NotaCredito;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        ArrayList<String> productos = new ArrayList();
        productos.add("jabon");
        productos.add("deja");
        //

        ComprobantesFactory director = new ComprobantesFactory();
        ComprobanteElectronico comp_fact =(Factura) director.getComprobante("factura");
        ComprobanteElectronico comp_nota_cred = (NotaCredito)director.getComprobante("notacredito");
        ComprobanteElectronico comp_guia_rem = (GuiaRemision)director.getComprobante("guiaremision");
        
        System.out.println(comp_fact);
        System.out.println(comp_nota_cred);
        System.out.println(comp_guia_rem);

    }
    
}
