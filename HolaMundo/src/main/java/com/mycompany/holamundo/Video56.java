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
public class Video56 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumaCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        System.out.println("Digite la matriz: ");
        
        
        for (int i = 0; i < nFilas; i++) { //numero de filas
            for (int j = 0; j < nCol; j++) { //numero de columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("\nLa Matriz es: ");
        
        for (int i = 0; i < nFilas; i++) { //numero de filas
            for (int j = 0; j < nCol; j++) { //numero de columnas
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        
        //Ahora procedemos a sumar
        for (int i = 0; i < nFilas; i++) { //numero de filas
            sumaFilas = 0;
            for (int j = 0; j < nCol; j++) { //numero de columnas
                sumaFilas += matriz[i][j];
            }
            System.out.print("\nLa suma de la fila ["+i+"] es: "+sumaFilas);
        }
        System.out.println("");
        
        for (int j = 0; j < nCol; j++) { //numero de columnas
            sumaCol = 0;
            for (int i = 0; i < nFilas; i++) { //numero de filas
                sumaCol += matriz[i][j];
            }
            System.out.print("\nLa suma de la columna ["+j+"] es: "+sumaCol);
        }
        System.out.println("");
        */
        
        int[][] matrizOriginal = new int[5][9];
        int[][] matrizTranspuesta = new int[9][5];

        // Cargar la matriz original con valores (este es un ejemplo, puedes cargarla como desees)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matrizOriginal[i][j] = i * 10 + j; // Puedes cargar los valores según tus necesidades
            }
        }
        
        // Transponer la matriz original y almacenarla en la matriz transpuesta
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }
        
        //----------------------------------------------------------------------
        System.out.println("Matriz Original:");// opcional para verificar
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matrizOriginal[i][j] + "\t");
            }
            System.out.println();
        }
        //----------------------------------------------------------------------
        
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizTranspuesta[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
