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
public class Video13 {
    public static void main(String[] args) {
        // Ejercicio 3
        Scanner entrada = new Scanner(System.in);
        float guillermo, luis, juan, total;
        
        System.out.println("Digite la cantidad de dinero que tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        
        luis = guillermo/2;
        juan = (guillermo+luis)/2;
        
        total = guillermo+luis+juan;
        
        System.out.println("La cantidad de dinero entre los 3 es: "+total);
        // Ejercicio 4
        Scanner entrada1 = new Scanner(System.in);
        int salarioM, comisionventa, carro;
        double porcientoventa;
        
        salarioM = 1000;
        comisionventa = 150;
        
        System.out.println("Digite el valor de el carro vendido: ");
        carro = entrada1.nextInt();
        porcientoventa = carro * 0.05;
        int porciento = Double.valueOf(porcientoventa).intValue();
        
        total = salarioM + comisionventa + porciento;
        
        System.out.println("su salario equivale a: "+total);
    }
}
