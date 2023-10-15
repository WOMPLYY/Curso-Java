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
public class Video34 {
    public static void main(String[] args) {
        int numero, suma_post = 0, conteo_post = 0, suma_neg = 0, conteo_neg = 0, conteo_ceros = 0;
        float media_post = 0, media_neg = 0;
        
        for (int i = 1; i <= 10; i++) {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            
            if (numero == 0)
            {
                conteo_ceros++;
            }
            else if (numero > 0)
            {
                suma_post+= numero;
                conteo_post++;
            }
            else
            {
                suma_neg+= numero;
                conteo_neg++;
            }
        }
        
        // sacar media de los positivos
        if (conteo_post == 0)
        {
            System.out.println("No se puede sacar la media de los positivos");
        }
        else
        {
            media_post = (float) suma_post/conteo_post;
            System.out.println("La media de los numeros positivos es: "+ media_post);
        }
        
        if (conteo_neg == 0)
        {
            System.out.println("No se puede sacar la media de los negativos");
        }
        else
        {
            media_neg = (float) suma_neg/conteo_neg;
            System.out.println("La media de los numeros positivos es: "+ media_neg);
        }
        
        System.out.println("La cantidad de veros es: "+conteo_ceros);
        
        int suma_sueldos = 0, conteo_mayor = 0, n;
        
        for (int i = 1; i <= 10; i++) {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite los sueldos"));
            if (n >= 1)
            {
                suma_sueldos+= n;
            }
            else
            {
                System.out.println("El sueldo es menor o igual a cero"); 
            }
            if (n >= 1000)
            {
                conteo_mayor++;
            }
            
        }
        System.out.println("La suma de los sueldos ingresados es: "+suma_sueldos);
        System.out.println("\n hay "+conteo_mayor+" sueldos mayores o iguales a 1000");
    }
}
