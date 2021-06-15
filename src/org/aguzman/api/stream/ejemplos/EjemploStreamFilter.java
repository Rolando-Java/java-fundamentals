package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilter {

    public static void main(String... args) {

       Stream.of("Pato Guzman", "Pago Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .flatMap(user -> Stream.of(1)).forEach(System.out::println);


    }

}
