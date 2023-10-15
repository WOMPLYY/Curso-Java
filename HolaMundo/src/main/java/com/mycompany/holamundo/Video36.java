/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Video36 {
    public static void main(String[] args) {
        /*int codigo, litros, litroArticulo1=0, conteoMas600=0;
        float precioLitro, importeFactura, facturacionTotal = 0;
        
        for (int i = 1; i <= 5; i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite la cantidad en litros: "));
            precioLitro = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite el precio por litro: "));
            
            importeFactura = (float) litros * precioLitro;
            facturacionTotal += importeFactura;
            
            if (codigo == 1)
            {
                litroArticulo1 += litros;
            }
            if (importeFactura > 600)
            {
                conteoMas600++;
            }
            
            System.out.println("Resumen de ventas");
            System.out.println("Facturacion total: "+facturacionTotal);
            System.out.println("cantidad en litros vendidos del articulo 1: "+litroArticulo1);
            System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
        }*/
        
        int codigo, litros, litroArticulo1=0, conteoMas600=0;
        float precioLitro, importeFactura, facturacionTotal = 0;
        
        for (int i = 1; i <= 5; i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite el codigo: "));
            litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite la cantidad en litros: "));
            precioLitro = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+
                    "\nDigite el 1 si comprara 0.6$/litro: "+
                    "\nDigite el 2 si comprara 3$/litro: "+
                    "\nDigite el 3 si comprara 1.25$/litro: "));
            /*if (precioLitro <= 0 || precioLitro >= 4)
            {
                System.out.println("Vuelve a elejir correctamente");
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite el codigo: "));
                litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite la cantidad en litros: "));
                precioLitro = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+
                        "\nDigite el 1 si comprara 0.6$/litro: "+
                        "\nDigite el 2 si comprara 3$/litro: "+
                        "\nDigite el 3 si comprara 1.25$/litro: "));
            }*/
            do
            {                
                System.out.println("Vuelve a elejir correctamente");
                codigo = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite el codigo: "));
                litros = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+"\nDigite la cantidad en litros: "));
                precioLitro = Integer.parseInt(JOptionPane.showInputDialog("Articulo N "+i+
                        "\nDigite el 1 si comprara 0.6$/litro: "+
                        "\nDigite el 2 si comprara 3$/litro: "+
                        "\nDigite el 3 si comprara 1.25$/litro: "));
            } 
            while (precioLitro <= 0 || precioLitro >= 4);
            
            if (precioLitro == 1)
            {
                precioLitro = 0.6f;
            }
            else if (precioLitro == 2)
            {
                precioLitro = 3f;
            }
            else if (precioLitro == 3)
            {
                precioLitro = 1.25f;
            }
            
            importeFactura = (float) litros * precioLitro;
            facturacionTotal += importeFactura;
            
            if (codigo == 1)
            {
                litroArticulo1 += litros;
            }
            if (importeFactura > 600)
            {
                conteoMas600++;
            }
            
            System.out.println("Resumen de ventas");
            System.out.println("Facturacion total: "+facturacionTotal);
            System.out.println("cantidad en litros vendidos del articulo 1: "+litroArticulo1);
            System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
        }
    }
}
