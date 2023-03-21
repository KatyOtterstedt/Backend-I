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
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
        */
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la longitud de lado"); 
           int lado = read.nextInt();
              for (int i = 1; i <= lado; i++) { //La condición de terminación sería se hace hasta q=> si pongo == lado va a ser dist siempre
                 for (int j = 1; j <= lado; j++) { //=> no entra al bucle jamás
                     if(i == 1 && j != lado || i == lado && j != lado || j == 1) {
                         System.out.print("*");
                         } else if (j == lado) {
                              System.out.println("*");
                         } else {
                              System.out.print(" ");
                         }
                     }

                 }
    }
    
}
