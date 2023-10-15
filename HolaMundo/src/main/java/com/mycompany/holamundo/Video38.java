/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Video38 {
    public static void main(String[] args) {
        /*int numeroNeg=0, numero;
        boolean hay_negativos = false;
        
        for (int i = 1; i <= 10; i++) {
            do
            {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Digite los numeros: "));
            }
            while (numero < 0 && numero > 0);
            
            if (numero < 0)
            {
                numeroNeg++;
                hay_negativos = true;
            }
            if (hay_negativos == true)
            {
                System.out.println("hay almenos uno o mas numeros negativos: "+hay_negativos);
            }
            else
            {
                System.out.println("no hay numeros negativos: ");
            }
        }
        System.out.println("se ingresaron: "+numeroNeg+" numeros negativos");*/
        
        float nota;
        int aprobados =0, condicionados=0, suspensos=0;
        boolean hay_suspensos = false;
        
        for (int i = 1; i <= 5; i++) {
            do
            {                
                nota = Integer.parseInt(JOptionPane.showInputDialog("Digite una nota de 0 a 10: "));
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
                hay_suspensos = true;
            }
        }
        if (hay_suspensos == true)
            {
                System.out.println("hay uno o mas suspendidos");
            }
            else
            {
                System.out.println("no hay ningun suspendido");
            }
        System.out.println("Cantidad de aprobados: "+aprobados);
        System.out.println("Cantidad de condicionales: "+condicionados);
        System.out.println("Cantidad de suspensos: "+suspensos);
    }
}
