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
public class Video12ejercicio1 {
    public static void main(String[] args) {
    // VIDEO 9 Operadores Aritméticos combinados con asignación 
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3, suma, div;
        
        System.out.println("Digite 3 calificaciones: ");
        //Guardamos las 3 notas
        nota1 = entrada.nextFloat();
        nota2 = entrada.nextFloat();
        nota3 = entrada.nextFloat();
        
        suma = nota1 + nota2 + nota3;
        System.out.println("\nLa suma de las notas es: "+suma);
        div = suma/3;
        
        System.out.println(div);
        
        // ejhercicio 2 salario de un empleado
        Scanner entrada1 = new Scanner(System.in);
        int horas, salarioH, mult;
        
        System.out.println("Digite las horas trabajadas: ");
        horas = entrada1.nextInt();
        
        System.out.println("Digite su salario por hora: ");
        salarioH = entrada1.nextInt();
        
        mult = horas * salarioH;
        
        System.out.println("su salario semanal es de: "+mult);
        
    }
    //------------------------------------------------------------------------------------------------
}
