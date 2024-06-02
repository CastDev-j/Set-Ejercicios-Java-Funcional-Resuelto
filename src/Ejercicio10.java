/*
    Problema:
    Dada el arreglo de cadenas, devolver el primer elemento que inicia con j.
 */

import java.util.Arrays;
import java.util.Optional;

public class Ejercicio10 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "ana", "fernando", "joaquin", "jorge", "jorge", "diana", "raul", "bob", "amelia", "aa"};


        final Optional<String> nombreConJ = Arrays.stream(nombres)
            .filter(nombre -> nombre.startsWith("j"))
            .findFirst();


        System.out.println("El primer nombre con j "+nombreConJ.orElseThrow());
    }
}