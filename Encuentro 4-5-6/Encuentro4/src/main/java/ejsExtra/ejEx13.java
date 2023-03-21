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
public class ejEx13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se
ingresa el número 3:
1
12
123

        */
        
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera");
        int altura = read.nextInt();
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                if (j<i) {
                    System.out.print(j);
                } else {
                    System.out.println(j);
                }
                
            }
        }
    }
    
}
