/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class Video11ClaseMath {
    public static void main(String[] args) {
        //sacar la base de eñ cuadrado
        double raiz = Math.sqrt(9);
        int raiz1 = (int)Math.sqrt(9);// asi se agrega para definir int a una variable que potencialmente nos dara valores double
        
        System.out.println(raiz);
        System.out.println(raiz1);
        // elevar un numero a la potencia
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
        
        System.out.println(resultado);
        //redondear double
        double numero = 4.56;
        long resultado1 = Math.round(numero);
        
        System.out.println(resultado1);
        //float
        float numero2 = 4.56f;
        int resultado2 = Math.round(numero2);
        
        System.out.println(resultado1);
        //ramdom
        double numero3 = Math.random();
        
        System.out.println(numero3);
    }
}
