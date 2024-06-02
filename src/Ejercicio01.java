/*
    Problema:
    Dada el arreglo de números, filtrar sólo los números pares.
 */

import java.util.Arrays;

public class Ejercicio01 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        final int[] pares = Arrays.stream(arreglo)
            .filter(Ejercicio01::isEven)
            .toArray();

        System.out.println(Arrays.toString(pares));
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }
}