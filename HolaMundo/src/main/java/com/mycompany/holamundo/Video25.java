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
public class Video25 {
    public static void main(String[] args) {
        //ciclo while
        
        //forma ascendente
        int i = 1;
        while (i<=10) {            
            System.out.println(i);
            i++;
        }
        System.out.println("\n");
        //forma descendente
        int d = 10;
        while (d>=1) {            
            System.out.println(d);
            d--;
        }
        
        Scanner entrada = new Scanner(System.in);
        int c = 1, contador;
        contador = entrada.nextInt();
        
        while (c<=contador) {            
            System.out.println(c);
            c++;
        }
    }
}
