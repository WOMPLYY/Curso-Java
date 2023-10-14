/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Video33 {
    public static void main(String[] args) {
        /*long producto = 1;
        
        for (int i = 1; i < 20; i+=2) {
            producto *= i;
        }
        System.out.println("El producto es: "+producto);
        */
        //20!=2432902008176640000.
        long factorial, calcular = 1;
        factorial = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for (int i = 1; i <= factorial; i++) {
            calcular *= i;
        }
        System.out.println("El factorial es: "+calcular);
    }
}
