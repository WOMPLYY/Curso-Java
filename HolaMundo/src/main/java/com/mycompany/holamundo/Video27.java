/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Video27 {
    public static void main(String[] args) {
        for (int i = 1; i<=10 ; i++)
        {
            System.out.println(i);
        }
        
        for (int i = 10; i>=1 ; i--)
        {
            System.out.println(i);
        }
        
        int contador;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite cuantos numeros quiere ver");
        contador = entrada.nextInt();
        
        for (int i = 1; i<=contador ; i++)
        {
            System.out.println(i);
        }
        //numeros pares
        for (int i = 2; i<=20 ; i+=2)
        {
            System.out.println(i);
        }
    }
}
