/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 
        
        String nombreCliente;
        //precio base
        int precioMensualNetflix;
        int precioMensualYouTube;
        int precioMensualDropBox;
        int precioMensualSpotify;
        // Dinero que se descuenta
        double descuentoNetflix;
        double descuentoYouTube;
        double descuentoDropBox;
        double descuentoSpotify;
        // Valor despues del descuento
        double precioFinalNetflix;
        double precioFinalYouTube;
        double precioFinalDropBox;
        double precioFinalSpotify;
        
        int costoTotal;
        double dineroAhorrado;
        double costoTotalDescuento;
        
        System.out.println("Ingrese nombre del cliente");
        nombreCliente = entrada.nextLine();
        
        System.out.println("Ingrese la mensualidad de Netflix");
        precioMensualNetflix = entrada.nextInt();
        System.out.println("Ingrese la mensualidad de YouTube");
        precioMensualYouTube = entrada.nextInt();
        System.out.println("Ingrese la mensualidad de DropBox");
        precioMensualDropBox = entrada.nextInt();
        System.out.println("Ingrese la mensualidad de Spotify");
        precioMensualSpotify = entrada.nextInt();
        // calcular el dinero que no tiene que pagar, que se  descuenta
        descuentoNetflix = 0.23 * precioMensualNetflix;
        descuentoYouTube = 0.23 * precioMensualYouTube;
        descuentoDropBox = 0.45 * precioMensualDropBox;
        descuentoSpotify = 0 * precioMensualSpotify;
        // Calcular lo que tiene que pagar despues del descuento
        precioFinalNetflix = precioMensualNetflix - descuentoNetflix;
        precioFinalYouTube = precioMensualYouTube - descuentoYouTube;
        precioFinalDropBox = precioMensualDropBox - descuentoDropBox;
        precioFinalSpotify = precioMensualSpotify -descuentoSpotify;
        // Calcula el valor total a pagar sin descuento
        costoTotal = precioMensualNetflix + precioMensualYouTube + precioMensualDropBox + precioMensualSpotify;
        // Calcula el valor a pagar con descuento
        costoTotalDescuento = precioFinalNetflix + precioFinalYouTube + precioFinalDropBox + precioFinalSpotify;
        // Dinero ahorrado
        dineroAhorrado = costoTotal - costoTotalDescuento;
        
        System.out.printf("Nombre del cliente Precio mensual de Netflix "
                + "Precio mensual de YouTube "
                + "Precio mensual de DropBox"
                + "Precio mensual de Spotify"
                + "");
                
                
    }
    
}
