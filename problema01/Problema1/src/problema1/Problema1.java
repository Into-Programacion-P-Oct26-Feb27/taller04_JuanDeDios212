/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALASC
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.useLocale(Locale.US);
    
    String proyecto1;
    String proyecto2;
    String proyecto3;
    double monto1;
    double monto2;
    double monto3;
    double montoTotal;
    
    System.out.println("Ingrese el nombre del proyecto 1");
    proyecto1 = entrada.nextLine();
    System.out.println("Ingrese el gasto mensual");
    monto1 = entrada.nextDouble();
    entrada.nextLine();
    
    System.out.println("Ingrese el nombre del proyecto 2");
    proyecto2 = entrada.nextLine();
    System.out.println("Ingrese el gasto mensual");
    monto2 = entrada.nextDouble();
    entrada.nextLine();
    
    System.out.println("Ingrese el nombre del proyecto 3");
    proyecto3 = entrada.nextLine();
    System.out.println("Ingrese el gasto mensual");
    monto3 = entrada.nextDouble();
    entrada.nextLine();
  
    montoTotal = monto1 + monto2 + monto3;
    
    System.out.printf("CONTROL DE GASTOS \n\nProyectos:\n1. %s: %.2f\n"
            + "2. %s: %.2f\n3. %s: %.2f\nGasto Mensual Total: %.2f\n",
    proyecto1,
    monto1,
    proyecto2,
    monto2,
    proyecto3,
    monto3,
    montoTotal);
    }
    
}
