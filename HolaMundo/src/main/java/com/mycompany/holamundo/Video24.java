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
public class Video24 {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int opcion;
        float ingreso, saldoActual, retiro;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico:\n "
        + "1. Ingresar dinero a la cuenta\n" 
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir"));
        
        switch (opcion) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea ingresar"));
                saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "Dinero en cuenta: "+saldoActual);
                break;
            case 2:
                saldoActual = saldo_inicial;
                retiro = Float.parseFloat(JOptionPane.showInputDialog("usted cuenta con "+ saldoActual +" de dinero en su cuenta\n"
                        +"Digite la cantidad que desea retirar"));
                if (retiro>saldo_inicial)
                {
                    JOptionPane.showMessageDialog(null, "No cuenta con el saldo suficiente para este retiro: ");
                }
                else
                {
                    saldoActual = saldo_inicial - retiro;
                    JOptionPane.showInputDialog(null, "Dinero en cuenta: "+saldoActual);
                }
                break;
            case 3:
                break;
            default:
                JOptionPane.showInputDialog(null, "Se equivoco de opcion de menu");
                break;
        }
        
        int opcion1;
        float kg, g, arroba, libra;
        
        opcion1 = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a su cajero automatico:\n "
        + "1. Pasar a gramos\n" 
        + "2. Pasar a arroba\n"
        + "3. Pasar a libra"));
        
        switch (opcion1) {
            case 1:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de Kilogramos que desea ver en gramos"));
                g = 1000 * kg;
                int kg1 = Float.valueOf(kg).intValue();
                JOptionPane.showMessageDialog(null, kg1 + " kilogramos equivalen a: "+g+" gramos");
                break;
            case 2:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de Kilogramos que desea ver en arrobas"));
                arroba = 0.09f * kg;
                int kg2 = Float.valueOf(kg).intValue();
                JOptionPane.showMessageDialog(null, kg2 + " kilogramos equivalen a: "+arroba+" libras");
                break;
            case 3:
                kg = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de Kilogramos que desea ver en libras"));
                libra = 2.20462f * kg;
                int kg3 = Float.valueOf(kg).intValue();
                JOptionPane.showMessageDialog(null, kg3 + " kilogramos equivalen a: "+libra+" libras");
                break;
            default:
                JOptionPane.showInputDialog(null, "Se equivoco de opcion de menu");
                break;
        }
        
    }
}
