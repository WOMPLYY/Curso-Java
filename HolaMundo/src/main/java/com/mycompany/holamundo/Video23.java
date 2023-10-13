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
public class Video23 {
    public static void main(String[] args) {
        int numero1, numero2, suma, resta, mult, div;
        char operacion;
        
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        operacion = JOptionPane.showInputDialog("Digite un numero: ").charAt(0);
        
        switch (operacion) {
            case 's':
            case 'S':
                suma = numero1+numero2;
                JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                break;
            case 'r':
            case 'R':
                resta = numero1-numero2;
                JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                break;
            case 'm':
            case 'M':
                mult = numero1*numero2;
                JOptionPane.showMessageDialog(null, "La multiplicacion es: "+mult);
                break;
            case 'd':
            case 'D':
                div = numero1/numero2;
                JOptionPane.showMessageDialog(null, "La division es: "+div);
                break;
            default: JOptionPane.showMessageDialog(null, "Error se equivoco de operacion: ");
        }
        //-------------------------------------------------------------------------------------------------------------------------------------------------
        int n1;
        char notas;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        
        switch (n1) {
            case 0:
            case 1:
            case 2:
                if(n1 >= 0 && n1 <= 2)
                {
                    JOptionPane.showMessageDialog(null, "La nota es insuficiente ");
                }
                break;
            case 3:
            case 4:
                if(n1 >= 3 && n1 <= 4)
                {
                    JOptionPane.showMessageDialog(null, "La nota es suficiente ");
                }
                break;
            case 5:
            case 6:
                if(n1 >= 5 && n1 <= 6)
                {
                    JOptionPane.showMessageDialog(null, "La nota es  buena ");
                }
                break;
            case 7:
            case 8:
                if(n1 >= 7 && n1 <= 8)
                {
                    JOptionPane.showMessageDialog(null, "La nota es Notable ");
                }
                break;
            case 9:
            case 10:
                if(n1 >= 9 && n1 <= 10)
                {
                    JOptionPane.showMessageDialog(null, "La nota es exelente ");
                }
                break;
            default: JOptionPane.showMessageDialog(null, "Error se equivoco de nota es de 0 a 10: ");
        }
    }
}
