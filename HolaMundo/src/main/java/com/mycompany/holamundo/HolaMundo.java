/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.holamundo;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class HolaMundo {

    public static void main(String[] args) {
        // VIDEO 1 Hola Mundo
        System.out.println("Hola Mundo :)");//el hoola mundo solo es esta linea :)
        //------------------------------------------------------------------------------------------------
        // VIDEO 2 Comentarios
        //comentario simple en una linea = // + cometario
        //comentario de varias lineas = /* comentarios */
        /*
        comentario 1
        comentario 2
        comentario 3
        */
        //------------------------------------------------------------------------------------------------
        // VIDEO 3 Tipos de datos primitivos
        /*
        Numeros Enteros
        |Nombre|Tamaño|Rango|
         long  =  64  =  -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
         int  =  32  =  -2,147,483,648 a 2,147,483,647
         short  =  16  =  -32,768 a 32,767
         byte  =  8  =  -128 a 127
        Numeros Decimales
        |Nombre|Tamaño|Rango|
         double =  64  =  4.9e-324 a 1.8e+308
         float  =  32  =  1.4e-045 a 3.4e+038
        */
        //Ejemplo=
        int entero = 1245656;
        System.out.println("Numero entero: "+entero);
        float decimal = 1245.656f; // el double no necesita la f eje: 1245.656 sin la f
        System.out.println("Numero decimal: "+decimal);
        // char es la que almacena valores tipo caracter
        char caracter = 'a';
        System.out.println("el caracter es: "+caracter);
        // boolean es el encargado de decir verdadreo y flaso
        boolean desicion = true;
        System.out.println("la desicion es: "+desicion);
        //------------------------------------------------------------------------------------------------
        // VIDEO 4 Tipos de datos no primitivos y cadenas
        //no primitivo ejemplo
        Integer integer = null;// Integer es un dato no primitivp
        System.out.println("Numero entero: "+integer);
        //cadenas de caracteres
        String palabra = "Hola que tal";
        System.out.println(palabra);
        //------------------------------------------------------------------------------------------------
        // VIDEO 5 Constantes
        final int numeroc = 10;//constante = valor intocable osea que no puede cambiar  en el proceso
        
        //numeroc = 15; manda error esta linea porque es un valor que no puede cambiar
        
        System.out.println(numeroc);
        //------------------------------------------------------------------------------------------------
        // VIDEO 6 Entrada y salida de datos por consola
        //1. Guardar numeros
        // no olvidar colocar antes de el public class esto (import java.util.Scanner;)
        Scanner entrada = new Scanner(System.in);
        int numeroscanner;
         
        System.out.print("Digite un numero: ");
         numeroscanner = entrada.nextInt();
         //numeroscanner = entrada.nextFloat();
         
        System.out.println("El numero es: "+numeroscanner);
         //2. Guardar cadenas
        Scanner entrada1 = new Scanner(System.in);
        String cadenascanner;
        
         System.out.print("Digite una cadena: ");
         cadenascanner = entrada1.next();//este next guarda texto hasta encontrar un espacio
         //cadenascanner = entrada1.nextLine();//este next guarda texto completo asi hallan espacios
         
         System.out.println("La cadena es: "+cadenascanner);
         //3. Guardar una letra
        Scanner entrada2 = new Scanner(System.in);
        char letrascanner;
        
         System.out.print("Digite una cadena: ");
         letrascanner = entrada2.next().charAt(0);// el numero indica la poscicion de va aguardar osea Hola guardaria la H si el 0 de el charAt fuera 1 guardaria la letra o
         
         System.out.println("La cadena es: "+letrascanner);
        //------------------------------------------------------------------------------------------------
        //VIDEO 7 Entrada y salida de datos con JOptionPane
        // se hizo en una nueva clase llamada video 7...
        //------------------------------------------------------------------------------------------------
        //VIDEO 8 Operadores Aritméticos
        // se hizo en una nueva clase llamada video 8... 
        //------------------------------------------------------------------------------------------------

    }
}
