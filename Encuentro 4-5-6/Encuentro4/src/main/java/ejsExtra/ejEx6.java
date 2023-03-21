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
public class ejEx6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        . Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en
general.
        */
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el número de personas");
        int N = read.nextInt();
        float altura;
        float promedioMenor = 0;
        float promedio = 0;
        int contador = 0;
        for (int i = 1; i <= N; i++) {
            System.out.println("Ingrese la altura de la persona número " + i + " en mts");
            altura = read.nextFloat();
            promedio = promedio + altura;
            if (altura < 1.6) {
                promedioMenor = promedioMenor + altura;
                contador++;
            }
        }
        System.out.println("El promedio de estaturas que se encuentran por debajo de 1.60 mts es: " + (promedioMenor/contador));
        System.out.println("El promedio de estaturas en general es: " + (promedio/N));
    }
    
}
