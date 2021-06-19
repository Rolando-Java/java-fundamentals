package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {

    public static void main(String... args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        Optional<Computador> pc = repositorio.filtrar("asus rog");
        pc.ifPresentOrElse(comp -> System.out.println(comp.getNombre()), () -> System.out.println("No se encontro computadora"));

    }

}
