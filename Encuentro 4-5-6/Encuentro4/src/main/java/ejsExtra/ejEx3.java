/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsExtra;

import java.util.Scanner;

/**
 *
 * @author byb
 */
public class ejEx3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se
trata de una vocal. Caso contrario mostrar un mensaje. Nota: investigar
la función equals() de la clase String.
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String letra = read.next();
        if ("a".equalsIgnoreCase(letra) || "e".equalsIgnoreCase(letra) || "i".equalsIgnoreCase(letra) || 
            "o".equalsIgnoreCase(letra) || "u".equalsIgnoreCase(letra)) {
            System.out.println("La letra ingresada es una vocal");
        } else {
            System.out.println("La letra ingresada no es una vocal");
        }
        
        //equalsIgnoreCase
    }
    
}
