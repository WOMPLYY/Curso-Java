/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Video14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer examen parcial: ");
        primerExamen = entrada.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial: ");
        segundoExamen = entrada.nextFloat();
        System.out.println("Digite la nota del examen final ");
        examenFinal = entrada.nextFloat();
        
        participacion *=  0.10f;
        primerExamen *=  0.25f;
        segundoExamen *=  0.25f;
        examenFinal *=  0.40f;
        
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
        
        System.out.println("\nLa nota final es: "+ notaFinal);
        
        //Ejercicio 6
        Scanner entrada1 = new Scanner(System.in);
        float a, b, multi, total;
        
        System.out.println("Digite el primer numero: ");
        a = entrada1.nextFloat();
        System.out.println("Digite el segundo numero: ");
        b = entrada1.nextFloat();
        
        multi = 2 * a * b;
        a *= a;
        b *= b;
        total = multi + a + b;
        
        
        
        System.out.println("\nEl cuadrado de la suma es: "+ total);
        
        
    }
}
