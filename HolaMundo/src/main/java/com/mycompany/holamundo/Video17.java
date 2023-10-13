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
public class Video17 {
    public static void main(String[] args) {
          int dato;
          
          dato = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 5: "));
          
          switch(dato)
          {
              case 1:
                  JOptionPane.showMessageDialog(null,"Es el numero 1");
              break;
              case 2:
                  JOptionPane.showMessageDialog(null,"Es el numero 2");
              break;
              case 3:
                  JOptionPane.showMessageDialog(null,"Es el numero 3");
              break;
              case 4:
                  JOptionPane.showMessageDialog(null,"Es el numero 4");
              break;
              case 5:
                  JOptionPane.showMessageDialog(null,"Es el numero 5");
              break;
              
              default:
                  JOptionPane.showMessageDialog(null,"Es el numero no esta en el rango de 1 a 5");
              break;
          }
      }
}
