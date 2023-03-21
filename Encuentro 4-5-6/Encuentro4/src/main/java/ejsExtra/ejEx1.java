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
public class ejEx1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
equivalente: 1 día, 2 horas.

        */
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un tiempo en minutos");
        int min = read.nextInt();
        //int seg = 3600*min;
        int dia = (min/1440);
        int hora = (min/60)-(24*dia); //horas totales - horas q hacen un día
        System.out.println("El equivalente es: " + dia + " días, " + hora + " horas.");
        
    }
    
}
