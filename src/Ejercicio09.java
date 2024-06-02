/*
    Problema:
    Dada el arreglo de cadenas, elimina los elementos duplicados.
 */
import java.util.Arrays;

public class Ejercicio09 {
    public static void main(String[] args) {
        String[] nombres = {"ana", "ana", "fernando", "jorge", "jorge", "diana", "raul", "bob", "amelia", "aa"};


        final String[] nombresSinDuplicados = Arrays.stream(nombres)
            .distinct()
            .toArray(String[]::new);

        System.out.println("Nombres sin duplicados: ");
        System.out.println(Arrays.toString(nombresSinDuplicados));

                
    }
}