/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.awt.datatransfer.FlavorListener;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Video47 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, sitio_num = 0, j = 0;
        
        System.out.println("Llenar el arreglo");
        do
        {   
            //llenando el arreglo
            for (int i = 0; i < 5; i++)
            {
                System.out.println((i+1)+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }
            
            //comprobar si el arreglo esta ordenado en orden creciente
            for (int i = 0; i < 4; i++)
            {
                if (arreglo[i] < arreglo[i+1])
                {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i+1])
                {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo no esta ordenado de forma creciente, vuelva a digitar:\n");
            }
        }
        while(creciente == false);
        
        //pedimos un numero que desee el usuario
        System.out.println("\nDigite un elemento a insertar: ");
        numero = entrada.nextInt();
        
        //esto es para darnos cuenta en que posicion va el numero
        while (arreglo[j]<numero && j<5)
        {            
            sitio_num++;
            j++;
        }
        
        //por ultimo, trasladamos una posicion en el arreglo a los elementos que van detras de numero
        for (int i = 4; i >= sitio_num; i--) {
            arreglo[i+1] = arreglo[i];
        }
        
        //insertamos el numero que el usuario puso
        arreglo[sitio_num] = numero;
        
        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++)
        {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println();
        */
        
        Scanner entrada = new Scanner(System.in);
        int[] tabla = new int[10];

        // Leer 10 números desde el teclado
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            tabla[i] = entrada.nextInt();
        }

        // Pedir al usuario la posición a eliminar
        System.out.print("Ingrese la posición (entre 0 y 9) del elemento a eliminar: ");
        int posicion = entrada.nextInt();

        // Verificar si la posición es válida
        if (posicion >= 0 && posicion < 10) {
            // Eliminar el elemento en la posición dada sin dejar huecos
            for (int i = posicion; i < 9; i++) {
                tabla[i] = tabla[i + 1];
            }
            tabla[9] = 0; // Establecer el último elemento como 0 (opcional)

            // Mostrar el nuevo arreglo después de la eliminación
            System.out.println("El nuevo arreglo después de eliminar el elemento en la posición " + posicion + " es:");
            for (int i = 0; i < 9; i++) {
                System.out.print(tabla[i] + " ");
            }
        } else {
            System.out.println("La posición ingresada no es válida.");
        }
    }
}
