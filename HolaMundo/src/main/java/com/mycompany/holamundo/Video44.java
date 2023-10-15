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
public class Video44 {
    public static void main(String[] args) {
        /*
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        
        //pedimos el arreglo a
        
        System.out.println("Digite el primer arreglo: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            a[i] = entrada.nextInt();
        }
        
        System.out.println("\nDigite el segundo arreglo: ");
        for (int i = 0; i < 10; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            b[i] = entrada.nextInt();
        }
        
        // haora mesclaremos los dos arreglos a y b
        //usaremos el iterador i para a y b,  y el iterador j para el c
        int j=0;
        for (int i = 0; i < 10; i++)
        {
            c[j] = a[i]; //1*A y cada que avance seguira 2*A, 3*A ETC
            j++;
            c[j] = b[i]; //1*B y cada que avance seguira 2*B, 3*B ETC
            j++;
        }
        
        System.out.println("\nEl tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
        */    
        
        Scanner entrada1 = new Scanner(System.in);
        int aa[] = new int[12];
        int bb[] = new int[12];
        int cc[] = new int[24];
        
        //pedimos el arreglo a
        System.out.println("Digite el primer arreglo: ");
        for (int i = 0; i < 12; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            aa[i] = entrada1.nextInt();
        }
        
        System.out.println("\nDigite el segundo arreglo: ");
        for (int i = 0; i < 12; i++)
        {
            System.out.print((i+1)+". Digite un numero: ");
            bb[i] = entrada1.nextInt();
        }
        
        // haora mesclaremos los dos arreglos a y b
        //usaremos el iterador i para a y b,  y el iterador j para el c
        int j=0;
        //1
        for (int i = 0; i < 3; i++)
        {
            cc[j] = aa[i]; //1*A y cada que avance seguira 2*A, 3*A ETC
            j++;
            
        }
        for (int i = 0; i < 3; i++)
        {
            cc[j] = bb[i]; //1*B y cada que avance seguira 2*B, 3*B ETC
            j++;
        }
        //2
        for (int i = 3; i < 6; i++)
        {
            cc[j] = aa[i]; //1*A y cada que avance seguira 2*A, 3*A ETC
            j++;
            
        }
        for (int i = 3; i < 6; i++)
        {
            cc[j] = bb[i]; //1*B y cada que avance seguira 2*B, 3*B ETC
            j++;
        }
        //3
        for (int i = 6; i < 9; i++)
        {
            cc[j] = aa[i]; //1*A y cada que avance seguira 2*A, 3*A ETC
            j++;
            
        }
        for (int i = 6; i < 9; i++)
        {
            cc[j] = bb[i]; //1*B y cada que avance seguira 2*B, 3*B ETC
            j++;
        }
        //4
        for (int i = 9; i < 12; i++)
        {
            cc[j] = aa[i]; //1*A y cada que avance seguira 2*A, 3*A ETC
            j++;
            
        }
        for (int i = 9; i < 12; i++)
        {
            cc[j] = bb[i]; //1*B y cada que avance seguira 2*B, 3*B ETC
            j++;
        }
        
        System.out.println("\nEl tercer arreglo es: ");
        for (int i = 0; i < 24; i++) {
            System.out.print(cc[i]+" ");
        }
        System.out.println();
    }
}
