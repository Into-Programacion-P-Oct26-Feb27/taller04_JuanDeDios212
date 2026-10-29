/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
            entrada.useLocale(Locale.US);
        // TODO code application logic here
        
        double cpuPrecio;
        double pantallaPrecio;
        double tecladoPrecio;
        double ratonPrecio;
        double valorBase;
        double costoOperacional;
        double valorTotal;
        String nombreCliente;
        
         System.out.println("Ingrese el nombre del cliente");
        nombreCliente = entrada.nextLine();
        System.out.println("Ingrese el precio del CPU");
        cpuPrecio = entrada.nextDouble();
        System.out.println("Ingrese el precio de la pantalla");
        pantallaPrecio = entrada.nextDouble();
        System.out.println("Ingrese el precio del teclado");
        tecladoPrecio = entrada.nextDouble();
        System.out.println("Ingrese el precio de la ratón");
        ratonPrecio = entrada.nextDouble();
       
        valorBase = cpuPrecio + pantallaPrecio + tecladoPrecio + ratonPrecio;
        
        costoOperacional = valorBase * 0.15;
        
        valorTotal = valorBase + costoOperacional;
        
        System.out.printf("Reporte:\nNombre del cliente: %s\n\n"
                + "Valores iniciales:\nCPU: %.2f\nTeclado: %.2f\nRatón: %.2f\n"
                + "Pantalla: %.2f\n\nCosto base: %.2f\nCosto adicional del 15: "
                + "%.2f\nCosto final: %.2f\n",
                nombreCliente,
                cpuPrecio,
                tecladoPrecio,
                ratonPrecio,
                pantallaPrecio,
                valorBase,
                costoOperacional,
                valorTotal);
        
        
        
                
    }
    
}
