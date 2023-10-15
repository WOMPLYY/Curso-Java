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
public class Video43 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        float suma_positivos = 0, suma_negativos = 0, media_positivos, media_negativos;
        int conteo_positivos = 0, conteo_negativos = 0, conteo_ceros = 0;
        
        System.out.println("Guardando los numeros en el arreglo");
        
        for (int i = 0; i < 5; i++)
        {
            System.out.print((i+1)+". Digite un numero ");
            numeros[i] = entrada.nextFloat();
            
            if (numeros[i] == 0)
            {
                conteo_ceros++;
            }
            else if (numeros[i] > 0)
            {
                suma_positivos += numeros[i];
                conteo_positivos++;
            }
            else
            {
                suma_negativos += numeros[i];
                conteo_negativos++;
            }
        }
        
        if (conteo_positivos == 0)
        {
            System.out.println("No se puede sacar la medida de los numeros positivos");
        }
        else
        {
            media_positivos = suma_positivos/conteo_positivos;
            System.out.println("La media de los numeros positivos es: "+media_positivos);
        }
        
        if (conteo_negativos == 0)
        {
            System.out.println("No se puede sacar la medida de los numeros negativos");
        }
        else
        {
            media_negativos = suma_negativos/conteo_negativos;
            System.out.println("La media de los numeros negativos es: "+media_negativos);
        }
        
        System.out.println("La cantidad de ceros es: "+conteo_ceros);
        */
        
        
        
        Scanner entrada1 = new Scanner(System.in);
        float numeros1[] = new float[10];
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1)+". Digite un numero ");
            numeros1[i] = entrada1.nextFloat();
        }
        // Arreglo de índices en el orden especificado
        int[] orden = {0,9,1,8,2,7,3,6,4,5};
        
        // Crear un nuevo arreglo para almacenar los elementos en el orden específico
        float numerosOrdenados[] = new float[10];
        
        // Asignar los valores del arreglo original en el orden especificado
        for (int i = 0; i < 10; i++) {
            numerosOrdenados[i] = numeros1[orden[i]];
        }
        // Imprimir el arreglo en el orden especificado
        System.out.println("\nImprimir lo1s elementos del arreglo en el orden (0, 9, 1, 8, 2, 7, 3, 6, 4, 5):");
        for (float numero : numerosOrdenados) {
            System.out.println(numero);
        }
    }
}
