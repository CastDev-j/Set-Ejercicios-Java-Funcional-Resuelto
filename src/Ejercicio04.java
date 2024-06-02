/*
    Problema:
    Dada el arreglo de números, encontrar cuántas veces aparece el número 10.
 */

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Ejercicio04 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10};

        int valorABuscar = 10;

        Function<Integer, IntPredicate> isNumber = number -> value -> value == number;

        final long cantidadRepetidos = Arrays.stream(arreglo)
            .filter(isNumber.apply(valorABuscar)) 
            .count();

        System.out.println("Cantidad de veces que aparece el número " + valorABuscar + ": " + cantidadRepetidos);
    }


}