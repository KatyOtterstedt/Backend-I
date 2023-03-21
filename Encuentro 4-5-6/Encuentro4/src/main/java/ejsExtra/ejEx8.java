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
public class ejEx8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
         Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben
sumarse. Nota: recordar el uso de la sentencia break.
        */
        Scanner read = new Scanner(System.in);
        int num;
        int cant = 0;
        int par = 0;
        int impar = 0;
        do {
            System.out.println("Ingrese un número entero");
            num = read.nextInt();
            if (1.0*num%2 == 0 && num>0) {
                par++;
            } else if (1.0*num%2 != 0 && num>0) {
                impar++;
            }
            
            cant++;
        } while((num%5)!=0); //LA MIERDA ESTA ERA CON % NO CON / Y ESO ME COSTÓ LA VIDA LPM
        
        System.out.println("La cantidad de números leídos es: " + cant);
        System.out.println("La cantidad de números pares es: " + par);
        System.out.println("La cantidad de números impares es: " + impar);
        
    }
    
}
