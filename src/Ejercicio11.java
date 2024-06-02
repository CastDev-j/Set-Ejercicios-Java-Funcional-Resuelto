/*
    Problema:
    Dado el arreglo de números, devuelve el producto de todos sus elementos.
 */

import java.util.Arrays;
import java.util.OptionalInt;

public class Ejercicio11 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        OptionalInt producto = Arrays.stream(arreglo)
            .reduce((numeroUno, numeroDos)-> numeroUno * numeroDos);

        System.out.println("El producto de los elementos del arreglo es: "+producto.orElseThrow());
            
    }
}