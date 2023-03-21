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
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*
        Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
        */
    Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int num1 = read.nextInt();
        System.out.println("Ingrese otro número entero positivo");
        int num2 = read.nextInt();
        String respuesta = "";
       
        do {
           System.out.println("MENÚ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");   
        System.out.println("Elija opción: ");
        
        int opcion = read.nextInt();
        
        switch(opcion) {
            case 1:
                System.out.println("La suma de los números es: " + (num1+num2));
                break;
            case 2:
                System.out.println("La resta de los dos números es: " + (num1-num2));
                break;
            case 3: 
                System.out.println("El producto de los dos números es: " + (num1*num2));
                break;
            case 4:
                System.out.println("El cociente de los dos números es: " + (1.0*num1/num2));
                break;
            case 5:
                System.out.println("Está seguro que desea salir del programa (S/N)?");
                respuesta = read.next();
                break;
            default:
                System.out.println("Esa no es una opción válida");
        }
        
        } while (!"S".equals(respuesta) && !"s".equals(respuesta)); //Acá me lo corrigió nomás el coso lo del !"s"
        
      
        
    
    }
    
}
