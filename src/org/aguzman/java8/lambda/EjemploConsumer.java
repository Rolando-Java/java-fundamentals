package org.aguzman.java8.lambda;

import org.aguzman.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {

    public static void main(String[] args) {

        Consumer<Date> consumidor = fecha -> {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(sdf.format(fecha));
        };
        consumidor.accept(new Date());

        BiConsumer<String, Integer> consumerBi = (nombre, edad) ->
                System.out.println(nombre + ", tiene " + edad + " años.");
        consumerBi.accept("susan", 15);

        Consumer<String> consumidorDos = System.out::println;
        consumidorDos.accept("Hola mundo lambda");

        List<String> nombres = new ArrayList<>(Arrays.asList("susan", "pedro", "ana"));
        nombres.forEach(consumidorDos);

        Supplier<Usuario> instanciarUsuario = Usuario::new;
        Usuario usuario = instanciarUsuario.get();

        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "susan");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proveedor = () -> "Hola mundo";
        System.out.println(proveedor.get());

        BooleanSupplier booleanSupplier = () -> {
            String nombre = "susan";
            String nombreDos = "pedro";
            return nombre.equals(nombreDos);
        };
        System.out.println(booleanSupplier.getAsBoolean());

    }

}