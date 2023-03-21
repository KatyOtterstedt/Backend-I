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
public class ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta
        */
        
        Scanner read = new Scanner(System.in);
        int nota;
        nota = 0;
        while(nota>= 10 || nota<=0) {
            System.out.println("Escriba una nota entre el 1 y el 10");
            nota = read.nextInt();
            
        }
        
    }
    
}
