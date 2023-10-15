/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.Scanner;
import javax.swing.plaf.multi.MultiComboBoxUI;

/**
 *
 * @author Usuario
 */
public class Video46 {
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int ultimo;
        
        System.out.println("Llenar el arreglo");
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        ultimo = arreglo[9];// guardamos el ultimo elemento del arreglo
        
        for (int i = 8; i >= 0; i--)
        {
             arreglo[i+1] = arreglo[i];
        }
        arreglo[0] = ultimo;
        
        System.out.println("\nEl nuevo arreglo es: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" Numero: "+arreglo[i]);
        }*/
        
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[10];
        int[] nuevaTabla = new int[10];

        // Leer 10 números desde el teclado
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            tabla[i] = entrada.nextInt();
        }

        // Pedir al usuario el número de posiciones a desplazar
        System.out.print("Ingrese el número de posiciones a desplazar: ");
        int desplazar = entrada.nextInt();

        // Desplazar N posiciones en el arreglo
        for (int i = 0; i < 10; i++) {
            int nuevaPosicion = (i + desplazar) % 10;
            nuevaTabla[nuevaPosicion] = tabla[i];
        }

        // Mostrar el nuevo arreglo después del desplazamiento
        System.out.println("El nuevo arreglo después de desplazar " + desplazar + " posiciones es:");
        for (int i = 0; i < 10; i++) {
            System.out.print(nuevaTabla[i] + " ");
        }
    }
}
