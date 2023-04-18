/*
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.
 */
package Ej3ArraysMain;

import Ej3ArraysEntidad.ArrayService;

public class ArrayMain {

    public static void main(String[] args) {
        //Creo el objeto service
        ArrayService service = new ArrayService();
        
        //Creo los arrays con dimensión q va
        double [] arrayA = new double [50];
        double [] arrayB = new double [20];
        
        //Inicializo el arrayA
        service.ArrayCreator(arrayA);
        
        //Muestro el arrayA
        service.ArrayShower(arrayA);
        
        //Ordeno el arrayA
        service.ArraySorter(arrayA);
        
        //Inicializo el arrayB
        service.ArrayCopier(arrayB, arrayA);
        
        //Vuelvo a mostrar ambos arrays
        service.ArrayShower(arrayA);
        service.ArrayShower(arrayB);
        
    }
    
}
