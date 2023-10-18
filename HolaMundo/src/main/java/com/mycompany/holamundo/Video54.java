/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.awt.datatransfer.FlavorListener;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Video54 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int matriz1[][],nFilas,nCol;
        boolean simetrica = true;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz1 = new int[nFilas][nCol];
        
        System.out.println("Digite una matriz: ");
        
        for (int i = 0; i < nFilas; i++) { //numero de filas
            for (int j = 0; j < nCol; j++) { //numero de columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        
        if (nFilas == nCol) {
            int i, j;
            i=0;
            while (i<nFilas && simetrica == true) {                
                j=0;
                while (j<i && simetrica == true) {                    
                    if (matriz1[i][j] != matriz1[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            if (simetrica==true) {
                JOptionPane.showMessageDialog(null,"La matriz es simetrica");
            }
            else{
                JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"La matriz no es simetrica");
        }
        */
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         // Crear y cargar la primera matriz de 3x3
        int[][] matriz1 = {{1, 2, 3},
                           {4, 5, 6},
                           {7, 8, 9}};
        
        // Crear y cargar la segunda matriz de 3x3
        int[][] matriz2 = {{9, 8, 7},
                           {6, 5, 4},
                           {3, 2, 1}};
        
        // Inicializar una matriz para almacenar la suma
        int[][] sumaMatriz = new int[3][3];
        
        // Sumar las matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaMatriz[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        
        // Mostrar la suma de las matrices
        System.out.println("Matriz 1:");
        imprimirMatriz(matriz1);
        
        System.out.println("Matriz 2:");
        imprimirMatriz(matriz2);
        
        System.out.println("Suma de las matrices:");
        imprimirMatriz(sumaMatriz);
    }
    
    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
