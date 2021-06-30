package org.aguzman.enumerables.ejemplos;

import java.util.Arrays;

import static org.aguzman.enumerables.ejemplos.Constantes.Framework.SPRING;
public class EjemploEnumerable {

    public static void main(String... args) {

        final Constantes.Framework framework = SPRING;

        Constantes.Lenguaje[] lenguajes = Constantes.Lenguaje.values();
        Arrays.stream(lenguajes).filter(l -> l.getFramework().equals(SPRING))
                .forEach(System.out::println);

    }

}
