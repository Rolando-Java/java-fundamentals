package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {

    public static Computador valorDefeto() {
        System.out.println("Obteniendo valor por defecto");
        return new Computador("HP Omen", "LA0001");
    }

    public static void main(String... args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP Omen", "LA0001");
        Computador pc = repositorio.filtrar("rog").orElse(EjemploRepositorioMetodosOrElse.valorDefeto());
        System.out.println(pc);

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefeto);
        System.out.println(pc);

    }

}
