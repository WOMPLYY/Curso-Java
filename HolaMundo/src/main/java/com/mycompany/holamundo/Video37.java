/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Video37 {
    public static void main(String[] args) {
        /*float nota;
        int aprobados =0, condicionados=0, suspensos=0;
        
        for (int i = 1; i <= 6; i++) {
            do
            {                
                nota = Integer.parseInt(JOptionPane.showInputDialog("Digite una nota: "));
            } 
            while (nota < 0 || nota > 10);
            
            if (nota == 4)
            {
                condicionados++;
            }
            else if (nota >= 5)
            {
                aprobados++;
            }
            else
            {
                suspensos++;
            }
        }
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de condicionales: "+condicionados);
        System.out.println("Cantidad de suspensos: "+suspensos);*/
        
        float n;
        int sueldoMaximo=0, sueldo;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite una numero: "));
        
        for (int i = 1; i <= n; i++) {
            do
            {                
                sueldo = Integer.parseInt(JOptionPane.showInputDialog("Digite los sueldos: "));
            } 
            while (sueldo < 0);
            
            if (sueldo > sueldoMaximo)
            {
                sueldoMaximo = sueldo;
            }
        }
        System.out.println("El sueldo maximo es: "+sueldoMaximo);
        
       /*Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de sueldos a comparar: ");
        int numeroSueldos = scanner.nextInt();

        if (numeroSueldos <= 0) {
            System.out.println("Por favor, ingrese un número válido y mayor que cero.");
            return;
        }

        double sueldoMasGrande = 0;

        for (int i = 1; i <= numeroSueldos; i++) {
            System.out.print("Ingrese el sueldo " + i + ": $");
            double sueldo = scanner.nextDouble();

            if (sueldo > sueldoMasGrande) {
                sueldoMasGrande = sueldo;
            }
        }

        System.out.println("El sueldo más grande es: $" + sueldoMasGrande);*/

    }
}
