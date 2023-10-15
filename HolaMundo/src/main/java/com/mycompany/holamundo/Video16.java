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
public class Video16 {
      public static void main(String[] args) {
          int numero, dato = 5;
          
          numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
          
          if(numero == dato)
          {
              JOptionPane.showMessageDialog(null,"El numero es 5");
          }
          else
          {
              JOptionPane.showMessageDialog(null,"El numero es diferente de 5");
          }
      }
}
