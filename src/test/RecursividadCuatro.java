package test;

import java.time.Duration;
import java.time.Instant;
import java.time.Period;

public class RecursividadCuatro {

    private int posicionElementoRecursivo(int[] numeros, int elemento, int pos) {
        if(pos < numeros.length) {
            if(numeros[pos] == elemento) {
                return pos;
            } else {
                return posicionElementoRecursivo(numeros, elemento, pos + 1);
            }
        } else {
            return -1;
        }
    }

    public static void main(String... args) {
        //Buscar un elemento de un array de forma recursiva
        RecursividadCuatro recursividadCuatroObj = new RecursividadCuatro();
        int[] numeros = new int[]{23, 45, 15, 20};

        int pos = recursividadCuatroObj.
                posicionElementoRecursivo(new int[]{1, 2, 3, 4, 5}, 4, 0);
        System.out.println("posicion: " + pos);

    }

}
