/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.util.Scanner;
/*
Me hace importar paquetes para las funciones q cambian de mayus a minus
*/
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author byb
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /* Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.        
        */
    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = read.next();
        System.out.println(frase.toLowerCase());
        System.out.println(frase.toUpperCase());
    //LA FUNCIÓN DE UPPER O LOWER CASE LLEVA EL ARGUMENTO ADELANTE, NO ADENTRO
    
    
    }
    
}
