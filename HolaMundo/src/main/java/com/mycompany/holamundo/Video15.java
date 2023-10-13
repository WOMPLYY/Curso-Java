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
public class Video15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales, semas, dias, horas;
        
        System.out.println("Digite el numero de horas: ");
        horasTotales = entrada.nextInt();
        
        semas = horasTotales / 168;
        dias = horasTotales%168 / 24;
        horas = horasTotales%24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("semanas: "+ semas);
        System.out.println("Dias: "+ dias);
        System.out.println("Horas: "+ horas);
        
        // Ejercicio 8
        
    }
}
