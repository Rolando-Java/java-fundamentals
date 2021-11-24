package org.aguzman.javadocs.ejemplo;

import org.aguzman.javadocs.ejemplo.models.Operacion;
import org.aguzman.javadocs.ejemplo.models.Suma;

import java.util.Locale;

public class Ejemplo {

    public static void main(String... args) {
        Ejemplo.pruebaSumar();
    }

    public static void pruebaSumar() {
        try {
            Operacion<Integer> operacion = new Suma();
            Suma sumaObj = new Suma();
            sumaObj.operar(3, 4);
            System.out.println(String.format(Locale.ENGLISH, "resultado: %1$s", sumaObj.getResultado()));
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }
    }

}
