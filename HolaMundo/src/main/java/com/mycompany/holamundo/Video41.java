/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

/**
 *
 * @author Usuario
 */
public class Video41 {
    public static void main(String[] args) {
        String[] nombres = {"Alejandro", "Maria", "Luisa", "Juan", "Narcisa", "Luis", "Roberto", "Flor", "Jessica"};
        
        /*
        for (int i = 0; i < nombres.length; i++)//el length transforma a int la cantidad de datos de el arreglo asi imprimira no importa cuantos datos halla
        {
            System.out.println(nombres[i]);
        }
        */
        
        for (String i: nombres)//for each acorta la muestra de datos
        {
            System.out.println("Nombres: "+i);
        }
    }
}
