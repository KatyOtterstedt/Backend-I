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
public class ejEx10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta. En
caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
        */
        Scanner read = new Scanner(System.in);
        int num1 = (int) (Math.random() * 10);
        int num2 = (int) (Math.random() * 10);
        int producto = num1 * num2;
        int respuesta;
        do {
            System.out.println("Intente adivinar el resultado");
            respuesta = read.nextInt();
            if (producto>respuesta) {
                System.out.println("El resultado ingresado es menor al producto a adivinar");
            } else if (producto<respuesta) {
                System.out.println("El resultado ingresado es mayor al producto a adivinar");
            } else  {
                System.out.println("Usted ha adivinado el producto");
            }
            
        } while (respuesta != producto);
        
                
    
    
    }
    
}
