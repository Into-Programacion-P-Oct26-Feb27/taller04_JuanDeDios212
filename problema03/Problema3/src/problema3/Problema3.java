/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
            entrada.useLocale(Locale.US);     
    
    String titular;
    String direccion;
    int minutosConsumidos;
    double valorTotal;
            
    System.out.println("Ingrese nombre del titular");
    titular = entrada.nextLine();
    System.out.println("Ingrese la dirección");
    direccion = entrada.nextLine();
        
    System.out.println("Ingrese los minutos de llamada");
    minutosConsumidos = entrada.nextInt();
    System.out.println("Ingrese nota de asignatura 2");

  valorTotal = minutosConsumidos * 1.50;
  
  System.out.printf("Titular: %s\nDireccion: %s\n\nCosto por minutos: $1.50\n"
          + "Minutos consumidos: %s\n\nValor Total a pagar: %s\n",
          titular,
          direccion,
          minutosConsumidos,
          valorTotal);
    
    }
    
}
