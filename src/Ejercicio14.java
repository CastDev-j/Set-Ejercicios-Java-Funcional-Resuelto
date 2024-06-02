/*
    Problema:
    Dado la matriz de números, aplana la misma, posteriormente deberás obtener:
    1. El menor
    2. El mayor
    3. La suma de todos sus elementos
    4. El promedio
    5. El producto.
 */

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Ejercicio14 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        final int[] matrizPlana = Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();

        final OptionalInt menor = Arrays.stream(matrizPlana)
                .min();

        final OptionalInt mayor = Arrays.stream(matrizPlana)
                .max();

        final OptionalInt suma = Arrays.stream(matrizPlana)
                .reduce(Integer::sum);

        final OptionalDouble promedio = Arrays.stream(matrizPlana)
                .average();

        final OptionalInt producto = Arrays.stream(matrizPlana)
                .reduce((numeroA, numeroB) -> numeroA * numeroB);

        System.out.println("El menor es: " + menor.orElseThrow());
        System.out.println("El mayor es: " + mayor.orElseThrow());
        System.out.println("La suma de todos los elementos es: " + suma.orElseThrow());
        System.out.println("El promedio es: " + promedio.orElseThrow());
        System.out.println("El producto es: " + producto.orElseThrow());
        

    }
}