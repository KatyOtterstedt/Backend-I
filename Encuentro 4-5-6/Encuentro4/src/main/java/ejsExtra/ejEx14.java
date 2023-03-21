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
public class ejEx14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Se dispone de un conjunto de N familias, cada una de las cuales tiene
una M cantidad de hijos. Escriba un programa que pida la cantidad de
familias y para cada familia la cantidad de hijos para averiguar la media
de edad de los hijos de todas las familias.
        */
        
        Scanner read = new Scanner(System.in);
        int sumaEdades = 0;
        int cantHijos = 0;
        System.out.println("Ingrese el número de familias");
        int N = read.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese el número de hijos para la familia número " + i);
            int M = read.nextInt();
                cantHijos += M; //El += es como si hiciera cantHijos = cantHijos + M
                for (int j = 1; j <= M; j++) {
                    System.out.println("Ingrese la edad del hijo número " + j + " de la familia número " + i);
                    int edad = read.nextInt();
                    sumaEdades += edad;
            }
        }
        System.out.println("La media de la edad de los hijos de todas las familias es: " + (sumaEdades/cantHijos));
    
    }
    
}
