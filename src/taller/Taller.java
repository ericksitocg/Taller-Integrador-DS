/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

import facturador.comportamental.AutorizadorSRI;
import facturador.comportamental.EsquemaOffline;
import facturador.comportamental.EsquemaOnline;
import facturador.creacional.ComprobanteElectronico;
import facturador.creacional.ComprobantesFactory;
import facturador.creacional.Factura;
import facturador.creacional.GuiaRemision;
import facturador.creacional.NotaCredito;
import facturador.estructural.LogoDecorator;
import facturador.estructural.PiePaginaDecorator;
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
        AutorizadorSRI autorizadorOffline = new AutorizadorSRI(new EsquemaOffline());
        AutorizadorSRI autorizadorOnline = new AutorizadorSRI(new EsquemaOnline());
        
        ComprobanteElectronico comp_fact =(Factura) director.getComprobante("factura");
        ComprobanteElectronico comp_nota_cred = (NotaCredito)director.getComprobante("notacredito");
        ComprobanteElectronico comp_guia_rem = (GuiaRemision)director.getComprobante("guiaremision");
        
        //Dando detalles a la factura
        comp_fact.setClaveAcceso("12345");
              
        System.out.println(comp_fact);
        System.out.println(comp_nota_cred);
        //realizando la autorizacion con los diferentes esquemas
        
        autorizadorOffline.autorizar(comp_fact);
        autorizadorOnline.autorizar(comp_guia_rem);
        
        System.out.println("El numero de autorizacion de factura ahora es: " +comp_fact.getNumeroAutorizacion());
        System.out.println("El numero de autorizacion de la guia de remision ahora es: " + comp_guia_rem.getNumeroAutorizacion());

        
        comp_fact= new LogoDecorator(new PiePaginaDecorator(comp_fact));
        System.out.println("--------\nSe ha personalizado el comprobante");
        System.out.println(comp_fact.getDetallesEmisor());
        
    }
    
}
