/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesYObjetos;

/**
 *
 * @author Usuario
 */
public class Video59Coche {
    String color;
    String marca;
    int km;
    
    //Metodo
    public static void main(String[] args) {
        Video59Coche coche1 = new Video59Coche();
        
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("El color del coche 1 es: "+coche1.color);
        System.out.println("La marca del coche 1 es: "+coche1.marca);
        System.out.println("El kilometraje del coche 1 es: "+coche1.km);
        
        Video59Coche coche2 = new Video59Coche();
        
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 100;
        
        System.out.println("\nEl color del coche 1 es: "+coche2.color);
        System.out.println("La marca del coche 1 es: "+coche2.marca);
        System.out.println("El kilometraje del coche 1 es: "+coche2.km);
    }
}
