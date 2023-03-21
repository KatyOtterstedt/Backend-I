/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejsExtra;

/**
 *
 * @author byb
 */
public class ejEx12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
números del 0-0-0 al 9-9-9, con la particularidad que cada vez que
aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
        */
        
        String contador = "";
        
        for (int i = 0; i < 1000; i++) {
            if (i<10) {
                if (i==3) {
                  System.out.println("0-0-E");
                } else {
                    System.out.println("0-0-" + i);
                }
                
            } else if (i>=10 && i <100) {
                contador = String.valueOf(i); //Esta función para pasar de int a string
                String new_contador = contador.replace("3", "E"); //Esta función para pasar de un caracter a otro dentro de una string
                System.out.println("0-" + new_contador.substring(0,1) + "-" + new_contador.substring(1,2));
            } else if (i>=100 && i < 1000) {
                contador = String.valueOf(i);
                String new_contador = contador.replace("3", "E");
                System.out.println(new_contador.substring(0,1) + "-" + new_contador.substring(1,2) + "-" + new_contador.substring(2,3));
            }
            
            
        }
    }
    
}
