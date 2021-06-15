package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {

    public static void main(String... args) {

        boolean existe = Stream.of("Pato Guzman", "Pago Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(user -> user.getId().equals(1));

        System.out.println("existe = " + existe);

        List<Usuario> usuarios = new ArrayList<>(Arrays.asList(new Usuario[]{
                new Usuario("Pato", "Guzman"), new Usuario("Pago", "Gonzalez"),
                new Usuario("Pepa", "Gutierrez"), new Usuario("Pepe", "Mena"),
                new Usuario("Pepe", "Garcia")
        }));

        existe = usuarios.stream().anyMatch(usuario -> usuario.getId().equals(4));
        System.out.println("existe = " + existe);


    }

}
