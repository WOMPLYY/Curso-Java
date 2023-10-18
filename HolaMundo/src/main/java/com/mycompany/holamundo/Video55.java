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
public class Video55 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int matriz1[][] = new int[3][3];
        System.out.println("Digite una matriz: ");
        
        
        for (int i = 0; i < 3; i++) { //numero de filas
            for (int j = 0; j < 3; j++) { //numero de columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nMatriz original: ");
        
        for (int i = 0; i < 3; i++) { //numero de filas
            for (int j = 0; j < 3; j++) { //numero de columnas
                System.out.print(matriz1 [i][j]+" ");
            }
            System.out.println("");
        }
        //transponer la matriz
        int aux;
        for (int i = 0; i < 3; i++) { //numero de filas
            for (int j = 0; j < i; j++) { //numero de columnas
                aux = matriz1[i][j];
                matriz1[i][j] = matriz1[j][i];
                matriz1[j][i] = aux;
            }
        }
        System.out.println("\nLa matriz transpuesta es: ");
        for (int i = 0; i < 3; i++) { //numero de filas
            for (int j = 0; j < 3; j++) { //numero de columnas
                System.out.print(matriz1[i][j]+" ");
            }
            System.out.println("");
        }
        */
        
        // Crear una matriz de tamaño 7x7
        int[][] matriz = new int[7][7];
        
        // Rellenar la matriz con 1 en la diagonal principal y 0 en el resto
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                // Si estamos en la diagonal principal, poner 1, de lo contrario, poner 0
                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        
        // Mostrar la matriz en la consola
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
