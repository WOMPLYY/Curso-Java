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
public class Video53 {
    public static void main(String[] args) {
        /*
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i = 0; i < 3; i++) { //numero de filas
            for (int j = 0; j < 3; j++) { //numero de columnas
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        */
        
        Scanner entrada = new Scanner(System.in);
        int matriz1[][],nFilas,nCol;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        
        matriz1 = new int[nFilas][nCol];
        
        for (int i = 0; i < nFilas; i++) { //numero de filas
            for (int j = 0; j < nCol; j++) { //numero de columnas
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j] = entrada.nextInt();
            }
            System.out.println("");
        }
        System.out.println("\nLa matriz es: ");
        
        for (int i = 0; i < nFilas; i++) { //numero de filas
            for (int j = 0; j < nCol; j++) { //numero de columnas
                System.out.print(matriz1[i][j]);
            }
            System.out.println("");
        }
        
        
        
        
        
        
        
    }
}
