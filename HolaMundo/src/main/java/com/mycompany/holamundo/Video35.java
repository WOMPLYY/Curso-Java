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
public class Video35 {
    public static void main(String[] args) {
        int edad, sumaEdad = 0, conteoMayor18= 0, contadorMayor175=0;
        float altura, sumaAltura=0, mediaEdad, mediaAltura;
        
        for (int i = 1; i <= 5; i++)
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su edad: "));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Alumno "+i+"\nDigite su estatura "));
            
            sumaEdad += edad;
            sumaAltura += altura;
            
            if (edad > 18)
            {
                conteoMayor18++;
            }
            if (altura > 1.75)
            {
                contadorMayor175++;
            }
        }
        mediaEdad = (float) sumaEdad/5;
        mediaAltura = (float) sumaAltura/5;
        
        System.out.println("La edad promedio es: "+mediaEdad);
        System.out.println("La estatura promedio es: "+mediaAltura);
        System.out.println("Cantidad de alumnos mayores a 18 es: "+conteoMayor18);
        System.out.println("Cantidad de alumnos que miden mas de 1.75: "+contadorMayor175);
        
        int n;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1 y 10"));
        
        if (n > 0 && n <= 10)
        {
            for (int i = n; i <= n*10; i+=n)
            {
                System.out.println(i);
            }
        }
        else
        {
            System.out.println("el numero que digito no esta en el primedio indicado");
        }
    }
}
