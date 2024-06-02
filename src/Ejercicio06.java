/*
    Problema:
    Dada el arreglo de cadenas, ordenarlo alfabéticamente y mostrarlo en pantalla.
    Ordenarlo primero de manera ascendente, posteriormente en orden inverso.
 */

import java.util.Arrays;
import java.util.Comparator;

public class Ejercicio06 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul", "bob", "amelia"};

        final String[] nombresOrdenAscendente = Arrays.stream(nombres)
            .sorted()
            .toArray(String[]::new);

        final String[] nombresOrdenDescendente = Arrays.stream(nombres)
            .sorted(Comparator.reverseOrder())
            .toArray(String[]::new);

        

    

        System.out.println("Orden ascendente: ");
        Arrays.stream(nombresOrdenAscendente)
            .forEach(System.out::println);

        System.out.println();
        System.out.println("Orden descendente: ");
        Arrays.stream(nombresOrdenDescendente)
            .forEach(System.out::println);

    }
}