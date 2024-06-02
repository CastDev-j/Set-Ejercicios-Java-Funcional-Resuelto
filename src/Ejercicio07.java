/*
    Problema:
    Dada el arreglo de cadenas, mostrar solo las cadenas que empiezan con la letra a,
    posteriormente, ordenarlas alfabéticamente tanto en orden ascendente como descendente.
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ejercicio07 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul", "bob", "amelia", "aa"};


        Function<String, Predicate<String>> empiezaConLetra = letra -> nombre -> nombre.startsWith(letra);
        
        String letra = "a";

        final String[] nombresFiltrados = Arrays.stream(nombres)
            .filter(empiezaConLetra.apply(letra))
            .toArray(String[]::new);
            

        final String[] nombresOrdenAscendente = Arrays.stream(nombresFiltrados)
            .sorted()
            .toArray(String[]::new);

        final String[] nombresOrdenDescendente = Arrays.stream(nombresFiltrados)
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