package Ej1CadenaServicio;

import Ej1Entidad.Cadena;
import java.util.Scanner;

//VOY A SER HONESTA, NO LO TERMINÉ PORQ ME DIO PAJA

public class CadenaServicio {
static Scanner read = new Scanner(System.in);
    public void invertirFrase(Cadena cadena) {
        String inversa = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {

            inversa += cadena.getFrase().substring(i, i + 1);
        }
        System.out.println(inversa);
    }
    
    public void vecesRepetido(Cadena cadena) {
        System.out.println("Ingrese el caracter que desea contabilizar");
        String caracter = read.next();
        int veces = 0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if ((cadena.getFrase().substring(i, i + 1)).equalsIgnoreCase(caracter)) {
                veces++;
            }
        }
        
}
}


