/*
    Problema:
    Dada el arreglo de números, calcular la suma de todos los elementos.
    Posteriormente, también buscar la suma de solo los elementos pares.
 */

import java.util.Arrays;

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        final int sumaTotal = Arrays.stream(arreglo)
            .sum();

        final int[] pares = Arrays.stream(arreglo)
            .filter(Ejercicio02::isEven)
            .toArray();

        final int sumaPares = Arrays.stream(pares)
            .sum();

        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma de pares: " + sumaPares);
        

            
    }

    public static boolean isEven(int value){
        return value % 2 == 0;
    }
}