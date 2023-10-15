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
public class Video45 {
    public static void main(String[] args) {
        /*Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = false, decreciente = false;
        
        System.out.println("Llenar el areglo");
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        for (int i = 0; i < 9; i++)
        {
            if (arreglo[i] < arreglo[i+1])
            {
                creciente = true;
            }
            if (arreglo[i] > arreglo[i+1])
            {
                decreciente = true;
            }
        }
        
        if (creciente == true && decreciente == false)
        {
            System.out.println("\nEl arreglo esta en forma creciente");
        }
        else if (creciente == false && decreciente == true)
        {
            System.out.println("\nEl arreglo esta en forma decreciente");
        }
        else if (creciente == true && decreciente == true)
        {
            System.out.println("\nEl arreglo esta desordenado");
        }
        else if (creciente == false && decreciente == false)
        {
            System.out.println("\nTodos los numeros de el arreglo son iguales");
        }
        */
        int tabla[] = new int[10];
        Scanner entrada1 = new Scanner(System.in);
        
        for (int i = 0; i < 8; i++)
        {
            System.out.println((i+1)+". Digite un numero: ");
            tabla[i] = entrada1.nextInt();
        }
        
        // Pedir un número y una posición
        System.out.print("Introduce un número: ");
        int numero = entrada1.nextInt();
        System.out.print("Introduce una posición (entre 1 y 10): ");
        int posicion = entrada1.nextInt();
        
        // Insertar el número en la posición indicada, desplazando los elementos detrás
        for (int i = 8; i >= posicion - 1; i--) {
            tabla[i] = tabla[i - 1];
        }
        tabla[posicion - 1] = numero;

        // Mostrar la tabla después de la inserción
        System.out.println("La tabla después de la inserción es:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tabla[i] + " ");
        }
    }
}
