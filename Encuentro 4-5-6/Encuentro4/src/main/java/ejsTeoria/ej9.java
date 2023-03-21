/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsTeoria;

import java.util.Scanner;

/**
 *
 * @author byb
 */
public class ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
        */
        
        Scanner read = new Scanner(System.in);
        int num;
        int cant = 0;
        int suma = 0;
        do {
            System.out.println("Ingrese un número");
            num = read.nextInt();
            if (num == 0) {
                System.out.println("Se capturó el número cero");
                break;
            } else if (num>0) {
                suma = suma + num;
            }
            
            cant ++;
        } while (cant<=20);
        System.out.println("La suma de los números ingresados es: " + suma);
    }
    
}
