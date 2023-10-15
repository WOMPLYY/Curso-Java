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
public class Video49 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int arreglo[], numero;
        boolean creciente= true;
        
        arreglo = new int[10];
        
        do
        {
            System.out.println("Rellene el arreglo: ");
            for (int i = 0; i < 10; i++)
            {
                System.out.println(i+". Digite un numero:");
                arreglo[i] = entrada.nextInt();
            }
            for (int i = 0; i < 9; i++) {
                if (arreglo[i] < arreglo[i+1])
                {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i+1])
                {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("El arreglo esta desordenado, digite nuevamente: \n");
            }
        }
        while (creciente == false);
        
        System.out.println("\nDigite el numero a buscar en el arreglo: ");
        numero = entrada.nextInt();
        
        int i = 0;
        
        while (i<10 && arreglo[i]<numero)
        {            
            i++;
        }
        
        if (i == 10)
        {
            System.out.println("\nNumero no encontrado: ");
        }
        else
        {
            if (arreglo[i] == numero)
            {
                System.out.println("\nNumero encontrado, en la posición: "+i);
            }
            else
            {
                System.out.println("\nNumero no encontrado: ");
            }
        }
        */
        
        Scanner entrada = new Scanner(System.in);
        final int NUM_ALUMNOS = 5;
        final int NUM_TRIMESTRES = 3;

        // Declarar un array bidimensional para almacenar las notas de los alumnos
        double[][] notas = new double[NUM_ALUMNOS][NUM_TRIMESTRES];

        // Leer las notas de los alumnos para cada trimestre
        for (int trimestre = 0; trimestre < NUM_TRIMESTRES; trimestre++) {
            System.out.println("Ingrese las notas del trimestre " + (trimestre + 1) + " para los " + NUM_ALUMNOS + " alumnos:");
            for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {
                System.out.print("Nota del alumno " + (alumno + 1) + ": ");
                notas[alumno][trimestre] = entrada.nextDouble();
            }
        }

        // Calcular y mostrar la nota media del grupo en cada trimestre
        for (int trimestre = 0; trimestre < NUM_TRIMESTRES; trimestre++) {
            double sumaNotas = 0;
            for (int alumno = 0; alumno < NUM_ALUMNOS; alumno++) {
                sumaNotas += notas[alumno][trimestre];
            }
            double mediaTrimestre = sumaNotas / NUM_ALUMNOS;
            System.out.println("Nota media del grupo en el trimestre " + (trimestre + 1) + ": " + mediaTrimestre);
        }

        // Leer la posición N y calcular y mostrar la media del alumno en esa posición
        System.out.print("Ingrese la posición del alumno (entre 1 y " + NUM_ALUMNOS + "): ");
        int posicion = entrada.nextInt();
        if (posicion >= 1 && posicion <= NUM_ALUMNOS) {
            double sumaNotasAlumno = 0;
            for (int trimestre = 0; trimestre < NUM_TRIMESTRES; trimestre++) {
                sumaNotasAlumno += notas[posicion - 1][trimestre];
            }
            double mediaAlumno = sumaNotasAlumno / NUM_TRIMESTRES;
            System.out.println("Nota media del alumno en la posición " + posicion + ": " + mediaAlumno);
        } else {
            System.out.println("La posición ingresada no es válida.");
        }
    }
}
