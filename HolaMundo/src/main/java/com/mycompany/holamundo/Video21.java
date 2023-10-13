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
public class Video21 {

    public static void main(String[] args) {
        int n1, n2, n3;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        if(n1>n2 && n2>n3)
        {
            JOptionPane.showMessageDialog(null, "Orfen: " +n1+ " - " +n2+ " - " +n3);
        }
        else if(n1>n3 && n3>n2)
        {
            JOptionPane.showMessageDialog(null, "Orfen: " +n1+ " - " +n3+ " - " +n2);
        }
        else if(n2>n1 && n1>n3)
        {
            JOptionPane.showMessageDialog(null, "Orfen: " +n2+ " - " +n1+ " - " +n3);
        }
        else if(n2>n3 && n3>n1)
        {
            JOptionPane.showMessageDialog(null, "Orfen: " +n2+ " - " +n3+ " - " +n1);
        }
        else if(n3>n1 && n1>n2)
        {
            JOptionPane.showMessageDialog(null, "Orfen: " +n3+ " - " +n1+ " - " +n2);
        }
        else if(n3>n2 && n2>n1)
        {
            JOptionPane.showMessageDialog(null, "Orfen: " +n3+ " - " +n2+ " - " +n1);
        }
        
        int n4;
        
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if (n4 >= 0 && n4 <= 99999)
        {
            if(n4 >= 0 && n4 <= 9)
            {
                JOptionPane.showMessageDialog(null, "El numero: "+n4+" tiene una cifra");
            }
            else if(n4 >= 10 && n4 <= 99)
            {
                JOptionPane.showMessageDialog(null, "El numero: "+n4+" tiene dos cifras");
            }
            else if(n4 >= 100 && n4 <= 999)
            {
                JOptionPane.showMessageDialog(null, "El numero: "+n4+" tiene tres cifras");
            }
            else if(n4 >= 1000 && n4 <= 9999)
            {
                JOptionPane.showMessageDialog(null, "El numero: "+n4+" tiene cuatro cifras");
            }
            else if(n4 >= 10000 && n4 <= 99999)
            {
                JOptionPane.showMessageDialog(null, "El numero: "+n4+" tiene cinco cifras");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero: "+n4+" es menor que cero(0) o exede (99999) ");
        }
    }
}
