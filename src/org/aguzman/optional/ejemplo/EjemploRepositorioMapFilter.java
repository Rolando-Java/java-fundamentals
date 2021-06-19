package org.aguzman.optional.ejemplo;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.models.Fabricante;
import org.aguzman.optional.ejemplo.models.Procesador;
import org.aguzman.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.aguzman.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMapFilter {

    public static void main(String... args) {

        /*
         El operador filter: siempre un cuando cumpla la condicion
         El operador map : retorna otro tipo de Optional
         El operador mapFlat: retorna un Optional
         */

        /*
        OJO: tomar en cuenta que si en uno de los operadores diera
        NullPointerException, estaria controlado
         */

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String fabricante = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .map(Fabricante::getNombre)
                .filter(nomFab -> nomFab.toLowerCase().contains("intel"))
                .orElse("desconocido");
        System.out.println(fabricante);

    }

}
