package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {

    public static void main(String... args) {

        Stream<Usuario> nombres = Stream.of("Pato Guzman", "Pago Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(usuario -> usuario.getNombre().equals("Pepex"));

        Optional<Usuario> usuarioOptional = nombres.findFirst();
        System.out.println(usuarioOptional.orElse(new Usuario("John", "Doe")));
        System.out.println(usuarioOptional.orElseGet(() -> new Usuario("John", "Doe")));
//        System.out.println(usuarioOptional.orElseThrow(() -> new NoSuchElementException("No se econtro valor")));
        System.out.println((usuarioOptional.isPresent()) ? usuarioOptional.get() : "No se encontro usuario");

    }

}
