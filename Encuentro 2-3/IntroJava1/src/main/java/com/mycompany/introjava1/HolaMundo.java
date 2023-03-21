/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.introjava1;

//Importo la clase Java q fue creada por los creadores de Java
import java.util.Scanner;

/**
 *
 * @author byb
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //se crea una variable Scanner q se utiliza para leer datos del usuario
        //Primero digo el timpo de variable q es scanner
        //Después digo el nombre de la variable q es leer
        //Después le asigno un objeto mediante system.in q significa q se ingresa por teclado
        Scanner leer = new Scanner(System.in);
        //Se crea una variable string para leer datos 
        String nombre;
        //Muestra un mensaje por pantalla
        //System.out es la salida
        //Println es para q imprima con salto de línea
        System.out.println("Ingresa tu nombre:");
        //Leemos el nombre de la persona en la variable nombre
        //La variable leer invoca a la función next y q el resultado se asigna a la variable nombre
            nombre = leer.next();
        //Mostrar el saludo
        System.out.println("Hola mundo! Soy " + nombre + " y estoy programando en Java!");
        
    }
    
}
