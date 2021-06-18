package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFlatMapFactura {

    public static void main(String... args) {

        Usuario usuario = new Usuario("John", "Doe");
        Usuario usuarioDos = new Usuario("Mateo", "Luck");

        List<Usuario> usuarioList = new ArrayList<>(Arrays.asList(usuario, usuarioDos));
        Stream.ofNullable(usuarioList)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }

}
