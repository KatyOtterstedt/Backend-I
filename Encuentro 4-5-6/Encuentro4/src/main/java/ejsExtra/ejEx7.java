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
public class ejEx7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realice un programa que calcule y visualice el valor máximo, el valor
mínimo y el promedio de n números (n>0). El valor de n se solicitará al
principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra
con el bucle “do - while”.
        */
      Scanner read = new Scanner(System.in);
      
      //VERSIÓN USANDO WHILE
        System.out.println("Ingrese la cantidad de números a ingresar");
      int n = read.nextInt();
      int contador = 0;
      int min = 10^50;
      int max = 0;
      int promedio = 0;
      int num;
      
      while (contador<n) {
          System.out.println("Ingrese un número");
          num = read.nextInt();
          promedio = promedio + num;
          if (num < min) {
              min = num;
          }
          if (num > max) {
              max = num;
          }
          contador++;
      }
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + (1.0*promedio/n));
        
        
        //VERSIÓN USANDO DO-WHILE
           System.out.println("Ingrese la cantidad de números a ingresar");
      n = read.nextInt();
      contador = 0;
      min = 10^50;
      max = 0;
      promedio = 0;
            
      do {
          System.out.println("Ingrese un número");
          num = read.nextInt();
          promedio = promedio + num;
          if (num < min) {
              min = num;
          }
          if (num > max) {
              max = num;
          }
          contador++;
      } while (contador<n);
        System.out.println("El valor máximo es: " + max);
        System.out.println("El valor mínimo es: " + min);
        System.out.println("El promedio es: " + (1.0*promedio/n));
     
    }
    
}
