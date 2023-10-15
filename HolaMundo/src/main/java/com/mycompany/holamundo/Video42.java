/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Video42 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            numeros[i] = entrada.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");
        for(float i: numeros)
        {
            System.out.println(i);
        }
        */
        
        Scanner entrada1 = new Scanner(System.in);
        float numeros1[] = new float[5];
        
        System.out.println("Guardando los datos en el arreglo");
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            numeros1[i] = entrada1.nextFloat();
        }
        
        System.out.println("\nImprimir los elementos del arreglo");

        /*
        System.out.println("\nImprimir los elementos del arreglo en orden inverso");
        for (int i = 4; i >= 0; i--)
        {
            System.out.println(numeros1[i]);
        }
        */

        // Invertir el arreglo usando un bucle for-each metodo 2
        // Crear un nuevo arreglo para almacenar los elementos invertidos
        float numerosInvertidos[] = new float[5];
        
        int index = 0;
        for (float numero : numeros1) {
            numerosInvertidos[4 - index] = numero;
            index++;
        }
        
        System.out.println("\nImprimir los elementos del arreglo en orden inverso usando for-each");
        for (float numero : numerosInvertidos) {
            System.out.println(numero);
        }
        
    }
}
