/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Video18 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        if(numero%10 == 0)
        {
            JOptionPane.showMessageDialog(null,"El numero " + numero + " es multiplo de 10");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El numero " + numero + " no es multiplo de 10");
        }
        
        //int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el primer numero: ");
        Integer num1 = entrada.nextInt();
        System.out.println("Digite el segundo numero: ");
        Integer num2 = entrada.nextInt();
        
        if(num1 > num2)
        {
            System.out.println("El numero: "+num1+" Es mayor que: "+num2);
        }
        else if(num1 < num2)
        {
            System.out.println("El numero: "+num2+" Es mayor que: "+num1);
        }
        else if(num1 == num2)
        {
            System.out.println("El numero: "+num1+" Es igual que: "+num2);
        }
        else if(num1 == null || num2 == null)
        {
            System.out.println("El numero: "+num1+" Es mayor que: "+num2);
        }
    }
}
