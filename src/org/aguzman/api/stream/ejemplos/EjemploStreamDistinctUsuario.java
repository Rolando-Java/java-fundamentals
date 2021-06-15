package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuario {

    public static void main(String... args) {
        /*
         mapToInt(): metodo que al igual que mapToDouble() o
         map ToFloat(), sirve para retornar un Stream primitivo

         mapToInt() : retorna un IntStream
         mapToDouble() : retorna un DoubleStream
         mapToFloat() : retorna un FloatStream
         */

        IntStream largoNombres = Stream.of("Pato Guzman", "Paco Gonzalez", "Pepa gutierrez",
                "Pepe Mena", "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(user -> user.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics statistics = largoNombres.summaryStatistics();
        System.out.println("total: " + statistics.getSum());
        System.out.println("max: " + statistics.getMax());
        System.out.println("min: " + statistics.getMin());
        System.out.println("promedio: " + statistics.getAverage());

    }

}
