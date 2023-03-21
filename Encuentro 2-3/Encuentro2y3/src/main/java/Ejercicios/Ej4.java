/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author byb
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
         Dada una cantidad de grados centígrados se debe mostrar su
        equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
        + (9 * C / 5).
        */
       
       Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una cantidad de grados centígrados");
        /*Tengo q hacer q grados sea double tmb o sino no me da el resultado con coma
        sino q me agrega el .0 al final en lugar de poner el resultado q debería
        */
      
       double grados = read.nextInt();
       double faren = 32 + grados * 9/5;
        System.out.println("El equivalente en grados Fahrenheit es: " + faren);
       //Redondea para abajo porq da 93.2 y me tira 93 (supongo q será porq le puse int)
       
    }
    
}
