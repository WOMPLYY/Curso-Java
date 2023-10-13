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
public class Video20 {

    public static void main(String[] args) {
        int horasTrabajadas;
        float salarioTotal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas trabajadas: "));

        if (horasTrabajadas <= 40) {
            salarioTotal = horasTrabajadas * 16;
        } else {
            salarioTotal = (40 * 16) + ((horasTrabajadas - 40) * 20);
        }
        JOptionPane.showMessageDialog(null, "El salario total es: " + salarioTotal);

        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero: "));

        if (numero1 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es par");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero1 + " es impar");
        }
        
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero: "));
        
        if (numero2 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es impar");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero " + numero2 + " es par");
        }
    }
}
