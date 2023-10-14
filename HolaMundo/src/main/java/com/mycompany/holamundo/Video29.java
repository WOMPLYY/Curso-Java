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
public class Video29 {
    public static void main(String[] args) {
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while (n != 0)
        {            
            if (n %2 == 0)
            {
                System.out.println("El numero "+n+" es PAR");
            }
            else
            {
                System.out.println("El numero "+n+" es IMPAR");
            }
            
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        
        int a, contador=0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        while (a>=0)
        {      
            contador++;
            System.out.println("El numero: "+a+" es el "+contador+" numero en agregarse");
            a = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        JOptionPane.showMessageDialog(null, "Bay :D en total agregaste "+contador+" numeros en total");
    }
}
