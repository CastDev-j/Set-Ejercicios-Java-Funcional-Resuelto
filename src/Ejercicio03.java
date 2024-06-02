/*
    Problema:
    Dada el arreglo de números, encontrar el número más grande y el más pequeño.
 */

import java.util.Arrays;

public class Ejercicio03 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        final int max = Arrays.stream(arreglo)
            .max()
            .getAsInt();

        final int min = Arrays.stream(arreglo)
            .min()
            .getAsInt();

        System.out.println("Número más grande: " + max);
        System.out.println("Número más pequeño: " + min);
    }
}