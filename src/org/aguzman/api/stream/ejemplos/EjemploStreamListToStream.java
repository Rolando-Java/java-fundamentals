package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Factura;
import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamListToStream {

    public static void main(String... args) {
        List<Usuario> usuarioList = new ArrayList<>(Arrays.asList(new Usuario[]{
                new Usuario("Andres", "Guzman"), new Usuario("Luci", "Martinez"),
                new Usuario("Pepe", "Fernandez"), new Usuario("Cata", "Perez"),
                new Usuario("Lalo", "Mena"), new Usuario("Exequiel", "Doe"),
                new Usuario("bruce", "Lee"), new Usuario("bruce", "Willis")
        }));

        Stream<String> nombres = Stream.ofNullable(usuarioList)
                .flatMap(List::stream)
                .map(user -> user.getNombre().toUpperCase().concat(" ").concat(user.getApellido().toUpperCase()))
                .filter(cad -> cad.contains("bruce".toUpperCase()))
                .map(String::toLowerCase)
                .peek(System.out::println);

        System.out.println(nombres.count());

    }

}
