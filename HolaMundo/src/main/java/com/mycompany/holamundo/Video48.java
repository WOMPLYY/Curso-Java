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
public class Video48 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int[] arreglo = new int[10];
        int conteo_pares=0, conteo_impares=0;

        // Leer 10 números desde el teclado
        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
            
            if (arreglo[i] % 2 == 0)
            {
                conteo_pares++;
            }
            else
            {
                conteo_impares++;
            }
        }
        
        int par[] = new int[conteo_pares];
        int impar[] = new int[conteo_impares];
        
        conteo_pares=0;
        conteo_impares=0;
        
        for (int i = 0; i < 10; i++)
        {
            if (arreglo[i] % 2 == 0)
            {
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            }
            else
            {
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }
        
        System.out.println("\nArreglo pares: ");
        for (int i = 0; i < conteo_pares; i++)
        {
            System.out.print(par[i]+" - ");
        }
        System.out.println("");
        
        System.out.println("\nArreglo impares: ");
        for (int i = 0; i < conteo_impares; i++)
        {
            System.out.print(impar[i]+" - ");
        }
        System.out.println("");
        */
        
        Scanner entrada = new Scanner(System.in);
        int[] serie1 = new int[10];
        int[] serie2 = new int[10];
        int[] resultado = new int[20];
        
        // Leer la primera serie ordenada crecientemente
        System.out.println("Ingrese la primera serie de 10 enteros ordenados crecientemente:");
        for (int i = 0; i < 10; i++) {
            serie1[i] = entrada.nextInt();
        }

        // Leer la segunda serie ordenada crecientemente
        System.out.println("Ingrese la segunda serie de 10 enteros ordenados crecientemente:");
        for (int i = 0; i < 10; i++) {
            serie2[i] = entrada.nextInt();
        }

        // Fusionar las dos series ordenadas en una tercera tabla
        int i = 0, j = 0, k = 0;
        while (i < 10 && j < 10) {
            if (serie1[i] < serie2[j]) {
                resultado[k++] = serie1[i++];
            } else {
                resultado[k++] = serie2[j++];
            }
        }
        
        // Si quedan elementos en la primera serie
        while (i < 10) {
            resultado[k++] = serie1[i++];
        }

        // Si quedan elementos en la segunda serie
        while (j < 10) {
            resultado[k++] = serie2[j++];
        }

        // Mostrar la tercera tabla fusionada y ordenada
        System.out.println("La tabla fusionada y ordenada es:");
        for (int l = 0; l < 20; l++)
        {
            System.out.print(resultado[l] + " ");
        }
    }
}
