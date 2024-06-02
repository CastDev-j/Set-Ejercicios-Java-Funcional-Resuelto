/*
    Problema:
    Dada el arreglo de cadenas, imprimir cada nombre de tal forma que estén en mayúsculas,
    y que cada vocal sea reemplazada por una "X", ejemplo:
    "XNX", "FXRNXNDX" ... etc.
 */

import java.util.Arrays;

public class Ejercicio05 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul"};

        Arrays.stream(nombres)
            .map(Ejercicio05::replaceVowels)
            .map(String::toUpperCase)
            .forEach(System.out::println);


        // String cadenaEjemplo = "asdasd";
        // System.out.println(cadenaEjemplo.replaceAll("[d]", "s"));

    }

    public static String replaceVowels(String name){
        return name.replaceAll("[aeiou]", "X");
    }
}