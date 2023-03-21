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
public class ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Realizar un programa que simule el funcionamiento de un dispositivo
RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las
cadenas deben llegar con un formato fijo: tienen que ser de un máximo
de 5 caracteres de largo, el primer carácter tiene que ser X y el último
tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas,
la secuencia especial “&&&&&” marca el final de los envíos (llamémosla
FDE), y toda secuencia distinta de FDE, que no respete el formato se
considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de
lecturas correctas e incorrectas recibidas. Para resolver el ejercicio
deberá investigar cómo se utilizan las siguientes funciones de Java
Substring(), Length(), equals().
        */
    Scanner read = new Scanner(System.in);
    
    
    int incorrecto = 0;
    int correcto = 0; 
    String cadena = "";
        do {
            System.out.println("Ingrese una cadena con máximo de 5 caracteres, que comience con X y termine en O");
            cadena = read.next();
            int largo = cadena.length();
            if (!"&&&&&".equals(cadena)) {
                if (largo!=5) {
                    incorrecto = incorrecto + 1;
                } else if (!"X".equalsIgnoreCase(cadena.substring(0,1))) {
                    incorrecto = incorrecto +1;
                } else if (!"O".equalsIgnoreCase(cadena.substring(largo-1,largo))) {
                    incorrecto = incorrecto +1;
                } else {
                    correcto = correcto + 1;
                }
            }
        } while (!"&&&&&".equals(cadena));
        
        System.out.println("La cantidad de lecturas correctas es: " + correcto);
        System.out.println("La cantidad de lecturas incorectas es: " + incorrecto);
    }
    
}
