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
public class Video52 {
    public static void main(String[] args) {
        int arreglo[] = {4,1,5,2,3};
        int dato;
        boolean band = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero a buscar: "));
        
        //Busqueda secuencuial
        int i = 0;
        while (i<5 && band == false) {            
            if (arreglo[i] == dato) {
                band = true;
            }
            i++;
        }
        
        if (band == false) {
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en el arreglo");
        }
        else {
            JOptionPane.showMessageDialog(null,"El numero a sido encontrado en la posicion: "+(i-1));
        }
        
    }
}
