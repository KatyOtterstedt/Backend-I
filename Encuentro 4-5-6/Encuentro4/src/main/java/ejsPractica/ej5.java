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
public class ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
 Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
        */
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un valor límite positivo");
        int lim = read.nextInt();
        int suma =0;
        do {
            System.out.println("Ingrese un número");
            int num = read.nextInt();
            suma = suma + num;
        } while (suma<=lim);
        System.out.println("Usted ha superado el límite");
        
    }
    
}
