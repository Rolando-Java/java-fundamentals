package org.aguzman.java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class EjemploFunction {

    public static void main(String... args) {

        Function<String, String> f1 = cadena -> "Hola que tal! " + cadena;
        System.out.println(f1.apply("hola"));

        Function<String, String> f2 = String::toUpperCase;
        System.out.println(f2.apply("pedro"));

        BiFunction<String, String, String> f3 = String::concat;
        System.out.println(f3.apply("domingo", "perez"));

        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("ana", "ana2"));

    }

}
