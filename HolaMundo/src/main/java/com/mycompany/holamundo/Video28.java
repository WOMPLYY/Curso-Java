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
public class Video28 {
    public static void main(String[] args) {
        int numero, cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (numero >= 0)
        {            
            cuadrado = (int)Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El numero "+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        
        int n1;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (n1 == 0) 
        {
            JOptionPane.showMessageDialog(null, "El numero es "+n1+" adios :D");
        }
        
        while (n1 <= -1 || n1 >= 1)
        {        
            if (n1 >= 1)
            {
                JOptionPane.showMessageDialog(null, "El numero "+n1+" es positivo");
            }
            else if (n1 <= -1)
            {
                JOptionPane.showMessageDialog(null, "El numero "+n1+" es negativo");
            }

            n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
    }
}
