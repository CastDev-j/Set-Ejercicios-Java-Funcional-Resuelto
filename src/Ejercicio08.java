/*
    Problema:
    Dada el arreglo de cadenas, separar a través de una serie de filtros (reutilizando lambdas),
    de tal forma que podamos separar todas las que empiezan con "a", "f", "j", "d", "r", "b".
    Recordar como generar una función que devuelve predicados.
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Ejercicio08 {
    public static void main(String[] args) {
        String[] nombres = { "ana", "fernando", "jorge", "diana", "raul", "bob", "amelia", "aa" };

        Function<String, Predicate<String>> empiezaConLetra = letra -> nombre -> nombre.startsWith(letra);

        String[] letras = { "a", "f", "j", "d", "r", "b" };

        List<String[]> nombresPorLetra = Arrays.stream(letras)
                .map(
                        letra -> Arrays.stream(nombres)
                                .filter(empiezaConLetra.apply(letra))
                                .toArray(String[]::new))
                .toList();

        IntStream.range(0, letras.length).forEach(posicion -> {
            System.out.println();
            System.out.println("Orden ascendente de nombres que empiezan con " + letras[posicion] + ": ");
            Arrays.stream(nombresPorLetra.get(posicion))
                    .sorted()
                    .forEach(System.out::println);
        });

        
    }

}