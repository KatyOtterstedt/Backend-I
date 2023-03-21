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
public class ejEx5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben
descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo
al descuento) y determine el importe en efectivo a pagar por dicho
socio.
        */
        
        
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una clase de socio (A/B/C)");
        String clase = read.next();
        System.out.println("Ingrese el costo del tratamiento");
        float costo = read.nextFloat();
        switch (clase.toUpperCase()){
            case "A":
                System.out.println("Usted tiene 50% de descuento en tratamientos");
                System.out.println("El importe en efectivo a pagar es: " + (0.5*costo));
                break;
            case "B":
                System.out.println("Usted tiene 35% de descuento en tratamientos");
                System.out.println("El importe en efectivo a pagar es: " + (0.35*costo));
                break;
            case "C":
                System.out.println("Usted no tiene descuento en tratamientos");
                System.out.println("El importe en efectivo a pagar es: " + costo);
                break;
            default:
                System.out.println("Usted no ha ingresado una clase de socio existente");
        }
        
        
    }
    
}
