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
public class Video26 {
    public static void main(String[] args) {
        int i = 1;
        
        do
        {            
            System.out.println(i);
            i++;
        }
        while (i<=10);
        
        int a = 10;
        
        do
        {            
            System.out.println(a);
            a--;
        }
        while (a>=1);
        
        Scanner entrada = new Scanner(System.in);
        int b = 1, contador;
        System.out.println("Digite la cantidad de terminos: ");
        contador = entrada.nextInt();
        
        do
        {            
            System.out.println(b);
            b++;
        }
        while (b<=contador);
    }
}
