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
public class Video31 {
    public static void main(String[] args) {
        int numero, suma = 0, elementos = 0;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while(numero >= 0)
        {
            suma += numero;
            elementos++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        if(elementos == 0)
        {
            System.out.println("Error la division entre 0 no existe");
        }
        else
        {
            media = (float)suma/elementos;
            System.out.println("La media es: "+media);
        }
        
        int n, i = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (i<=n)
        {            
            System.out.println(i);
            i++;
        }
    }
}
