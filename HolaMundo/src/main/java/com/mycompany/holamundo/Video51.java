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
public class Video51 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos, pos, aux;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de elementos de el arreglo: "));
        
        arreglo = new int[nElementos];
        
        System.out.println("Digite el arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        // Ordenamiento por insercion
        for (int i = 0; i < nElementos; i++) {
            pos = i;
            aux = arreglo[i];
            
            while ((pos>0) && (arreglo[pos-1] > aux)) {                
                arreglo[pos] = arreglo[pos-1];
                pos--;
            }
            arreglo[pos] = aux;
        }
        System.out.println("\nOrden Asendente:");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("\nOrden Descendente:");
        for (int i = (nElementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
    }
}
