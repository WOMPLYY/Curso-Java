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
public class Video19 {
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        
        if(Character.isUpperCase(letra))
        {
            JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Es una letra minuscula");
        }
        
        int compra, total;
        float descuento;
        
        compra = Integer.parseInt(JOptionPane.showInputDialog("Digite el total de la compra: "));
        
        if(compra >= 300000)
        {
            descuento = compra*0.20f;
            int descuento1 = Float.valueOf(descuento).intValue();
            total = compra - descuento1;
            JOptionPane.showMessageDialog(null, "Su total a pagar es: "+total);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Su total a pagar es: "+compra);
        }
    }
}
