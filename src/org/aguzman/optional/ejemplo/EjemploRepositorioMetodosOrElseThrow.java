package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploRepositorioMetodosOrElseThrow {

    public static Computador valorDefeto() {
        System.out.println("Obteniendo valor por defecto");
        return new Computador("HP Omen", "LA0001");
    }

    public static void main(String... args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        try {
            Computador pc = repositorio.filtrar("rog").orElseThrow(IllegalArgumentException::new);
            System.out.println(pc);

            String archivo = "documento.pdf";
            String extension = Optional.ofNullable(archivo)
                    .filter(a -> a.contains("."))
                    .map(a -> a.substring(a.lastIndexOf(".") + 1))
                    .orElseThrow();
            System.out.println(extension);
        } catch(Exception ex){
            System.err.println("Error");
            ex.printStackTrace();
        }

    }

}
