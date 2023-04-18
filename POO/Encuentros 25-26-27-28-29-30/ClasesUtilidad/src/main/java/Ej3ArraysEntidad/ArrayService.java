package Ej3ArraysEntidad;

//El arreglo A de 50 números reales y el arreglo B de 20 números reales
import java.util.Arrays;
import java.util.Scanner;

//LE TUVE Q PONER ARRAY SOLO PORQ ARRAYS ES LA CLASE DE JAVA Y SINO NO ME DEJABA
public class ArrayService {
//    double [] array1;
//    double [] array2;

    static Scanner read = new Scanner(System.in);

    public double[] ArrayCreator(double[] array) {
//        System.out.println("Ingrese la cantidad de arrays a generar");
//        int cantArrays = read.nextInt();
//        for (int i = 0; i < cantArrays; i++) {
        for (int i = 0; i < array.length; i++) {
            double nro = Math.random();
            //Este para llenarlo fácil usando la clase Arrays
            //Hay q ponerle índice para q llene un sólo lugar con el nro random y después genere otro valor random
            // Para poner en el sig índice
            Arrays.fill(array, i, i+1, nro); 
        }
        //}
        return array;
    }

    public void ArrayShower(double[] array) {
        System.out.println(Arrays.toString(array)); //usando la clase Arrays está para mostrarlo fácil
    }

    public double[] ArraySorter(double[] array) {
        Arrays.sort(array); //Así ordeno el array en forma ascendente
        double[] arrayDescendente = new double[array.length]; //Genero un array de igual dimension
        for (int i = 0; i < array.length; i++) {
            arrayDescendente[i] = array[array.length - 1 - i]; //le asigno los valores invertidps
        }
        array = arrayDescendente; //Le asigno el valor del array ya ordenado en forma descendente al array original para q quede ordenado

        return array;
    }

    /*
     Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
     */
    public double[] ArrayCopier(double[] arrayLlenar, double[] arrayMolde) {
        System.arraycopy(arrayMolde, 0, arrayLlenar, 0, 10); //Este coso me copia el array molde 
        Arrays.fill(arrayLlenar, 10, arrayLlenar.length, 0);
        /*
        Parámetros del System.arraycopy
        El array de origen
        El índice de inicio: elemento en el array de origen donde se iniciará la copia.
        El array de destino
        El índice de destino: elemento en el array de destino donde se iniciará la copia.
        La cantidad de elementos a copiar
         */
        return arrayLlenar;
    }
}
