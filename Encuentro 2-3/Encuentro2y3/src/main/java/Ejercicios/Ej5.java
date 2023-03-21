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
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().
        */
       
       Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num = read.nextInt();
        System.out.println("El doble del número es: " + 2*num);
        System.out.println("El triple del número es: " + 3*num);
        //Con el 1.0* también puedo hacer q el resultado sea como va sin hacer q el nro ingresado sea double
        System.out.println("La raíz cuadrada del número es " + 1.0*Math.sqrt(num));
       
    }
    
}
