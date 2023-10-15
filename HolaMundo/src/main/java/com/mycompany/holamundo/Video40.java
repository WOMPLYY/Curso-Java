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
public class Video40 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de elementos para el arreglo"));
        
        char[] letras = new char[nElementos];
        
        System.out.println("Digite los elementos de el arreglo: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.println((i+1)+"Digite un caracter: ");
            letras[i] = entrada.next().charAt(0);
        }
        
        System.out.println("\nLos caracteres de el arreglo son: ");
        for (int i = 0; i < nElementos; i++) {
            System.out.print(letras[i]+" ");
        }
    }
}
