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
public class ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            /*
        Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
        */
            Scanner read = new Scanner(System.in);
            int num;
            for (int i = 1; i <= 4; i++) {
                do {
                System.out.println("Ingrese un número comprendido entre 1 y 20");
                num = read.nextInt();
                } while(num > 20 || num < 1);
                System.out.print(num);
                for (int j = 1; j <= num; j++) {
                    if (j==num) {    
                        System.out.println(" *");
                    } else {
                    System.out.print(" *");
                    }
                }
        }
            
      }
    }
    

