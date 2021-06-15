package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {

    public static void main(String... args) {

        Optional<Usuario> usuarioOptional = Stream.of("Pato Guzman", "Pago Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(user -> user.getId().equals(9))
                .findFirst();

        System.out.println((usuarioOptional.isPresent()) ? usuarioOptional.get() : "No se encontro usuario");

    }

}
