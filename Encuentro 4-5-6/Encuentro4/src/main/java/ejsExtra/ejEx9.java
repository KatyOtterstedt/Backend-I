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
public class ejEx9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el
residuo usando sólo restas. Método: Restar el dividendo del divisor hasta
obtener un resultado menor que el divisor, este resultado es el residuo, y
el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es
3.

        */
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el dividendo");
        int dividendo = read.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor = read.nextInt();
        int residuo = dividendo;
        int cociente = 0;
        while (residuo >= divisor) {
             residuo = residuo - divisor;
             cociente++; //Con esto solo ya se hace el incremento=> no necesito agregar más cosas
             
         }
        System.out.println("El residuo es: " + residuo + " y el cociente es: " + cociente);
    }
    
}
