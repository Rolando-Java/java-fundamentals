package org.aguzman.api.stream.ejemplos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class EjemploStream {

    public static void main(String... args) {

        /*
          Tomar en cuenta que la instancia Stream solo se usa una vez.
          En otras palabras, la solución consiste en crear un nuevo Stream
          cada vez que lo necesitemos.
         */

        //Primera forma de instanciar un Stream
        Stream<String> streamStringUno = Stream.of("susan", "pepe", "ana");
        streamStringUno.forEach(System.out::println);

        //Segunda forma de instanciar un Stream
        Stream<String> streamStringDos = Arrays.stream(new String[]{"susna", "pedro", "ana"});
        streamStringDos.forEach(System.out::println);

        //Tercera forma de instanciar un Stream
        Stream.Builder<String> builder = Stream.builder();
        builder.add("pedro").add("luck").add("susan");
        Stream<String> streamStringTres = builder.build();
        streamStringTres.forEach(System.out::println);

        //Cuarta forma de instanciar un Stream
        Set<String> set = new HashSet<>();
        set.add("susan");
        set.add("pedro");
        set.add("ana");

        Stream<String> streamStringCuatro = set.stream();
        streamStringCuatro.forEach(System.out::println);

    }

}
