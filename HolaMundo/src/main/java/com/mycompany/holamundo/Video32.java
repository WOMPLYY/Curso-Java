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
public class Video32 {
    public static void main(String[] args) {
        /*for (int i = 100; i >= 0; i-=7) {
            System.out.println(i);
        }
        for (int i = 0; i <= 100; i+=7) {
            System.out.println(i);
        }
        */
        int n, suma = 0;
        
        //n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        for (int i = 0; i <= 10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            suma += n;
        }
        System.out.println(suma);
    }
}
