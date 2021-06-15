package org.aguzman.api.stream.ejemplos;

import org.aguzman.api.stream.ejemplos.models.Factura;
import org.aguzman.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFlatMapFactura {

    public static void main(String... args) {

        /*
         El operador flatMap, permite retornar un Stream,
         esto nos ayuda a por ejemplo en este caso bifurcar un Stream
         de la clase Usuario en Stream de la clase Factura. De esta forma recorremos
         todas las facturas de cada usuario.
         */
        Usuario usuario = new Usuario("John", "Doe");
        Usuario usuarioDos = new Usuario("Pepe", "Perez");

        usuario.addFactura(new Factura("compras tecnologias"));
        usuarioDos.addFactura(new Factura("bicicleta"));
        usuarioDos.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarioList = new ArrayList<>(Arrays.asList(usuario, usuarioDos));

        Stream.ofNullable(usuarioList)
                .flatMap(List::stream)
                .flatMap(user -> user.getFacturas().stream())
                .forEach(System.out::println);

    }

}
