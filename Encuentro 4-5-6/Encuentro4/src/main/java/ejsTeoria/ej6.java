/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsTeoria;

import java.util.Scanner;

/**
 *
 * @author byb
 */
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
        */
       
       Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        int num1 = read.nextInt();
        System.out.println("Ingrese un número entero");
        int num2 = read.nextInt();
        
        if (num1>25 && num2>25) {
            System.out.println("Ambos números ingresados son mayores a 25");
            
    } else if (num1> 25) {
            System.out.println("El primer número ingresado es mayor a 25");
    } else if (num2>25) {
            System.out.println("El segundo nro ingresado es mayor a 25");
    }
    }
}
