/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsPractica;

import java.util.Scanner;

/**
 *
 * @author byb
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
         Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
        */
       Scanner read = new Scanner(System.in);
       String frase = "eureka";
        System.out.println("Ingrese una frase");
        String frase2 = read.next();
        if (frase.equals(frase2)) { //NO deja q se comparen si tienen dist case
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
       
    }
    
}
