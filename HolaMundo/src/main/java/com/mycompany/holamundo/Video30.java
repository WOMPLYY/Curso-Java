/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.net.ContentHandlerFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Video30 {
    public static void main(String[] args) {
        int numero, aleatorio, contador = 0;
        
        aleatorio = (int)(Math.random()*100);
        
        do
        {            
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if (aleatorio > numero)
            {
                System.out.println("Digite un numero mayor");
            }
            else
            {
                System.out.println("Digite un numero menor");
            }
            contador++;
        }
        while(numero != aleatorio);
        {
            System.out.println("\nadivinaste el numero :D");
        }
        //------------------------------------------------Ejemplo para el sumar y guardar un dato anterior-------------------------------------------------------------------------------------
        /*int n, suma = 0, anterior = 0;
        
        // Lee el primer número
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        
        // Almacena el primer número en la variable anterior
        anterior = n;
        
        // Bucle para leer números hasta que se ingrese 0
        do {
            // Acumula el número ingresado en la variable suma
            suma += n;
            
            // Lee el siguiente número
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        } while (n != 0);
        
        // Muestra la suma de los números ingresados
        System.out.println("La suma de los numeros introducidos es: " + suma);*/
        //------------------------------------------------Solucion abajo------------------------------------------------
        //Arriba esta el ejemplo
        int n, suma = 0, anterior = 0;
             n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
             anterior = n;
        do
        {            
            suma += n;
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        }
        while(n != 0);
        {
            System.out.println("\nla suma de los numeros introducidos es: "+suma );
        }
    }
}
