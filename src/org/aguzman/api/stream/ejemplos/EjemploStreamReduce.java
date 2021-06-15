package org.aguzman.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {

    public static void main(String... args) {

        Stream<Integer> numeros = Stream.of(5, 10, 15, 20);

        int suma = numeros.reduce(0, Integer::sum);
        System.out.println("suma = " + suma);


    }

}
