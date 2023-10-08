/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import javax.swing.JOptionPane;// importante importar

/**
 *
 * @author Usuario
 */
public class Video7EntradaysalidadedatosconJOptionPane {
    //VIDEO 7 Entrada y salida de datos con JOptionPane
        public static void main(String[] args) {
            String cadenaV7;
            int enteroV7;
            char letraV7;
            double decimalV7;
        
            cadenaV7 = JOptionPane.showInputDialog("Digite una cadena: ");
            enteroV7 = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero: "));
            letraV7 = JOptionPane.showInputDialog("Digite un caracter: ").charAt(0);
            decimalV7 = Double.parseDouble(JOptionPane.showInputDialog("Digite una decimal: "));
            //decimalV7 = Float.parseFloat(JOptionPane.showInputDialog("Digite una decimal: ")); // si fuera en float
            
            JOptionPane.showMessageDialog(null, "La cadena es: "+cadenaV7);
            JOptionPane.showMessageDialog(null, "El numero entero es: "+enteroV7);
            JOptionPane.showMessageDialog(null, "El caracter es: "+letraV7);
            JOptionPane.showMessageDialog(null, "El numero decimal es: "+decimalV7);
        }
        //------------------------------------------------------------------------------------------------
}
