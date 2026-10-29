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
        precioMensualYouTube = entrada.nextint();
        System.out.println("Ingrese la mensualidad de DropBox");
        precioMensualDropBox = entrada.nextint();
        System.out.println("Ingrese la mensualidad de Spotify");
        precioMensualSpotify = entrada.nextint();
  
        
        
    }
    
}
