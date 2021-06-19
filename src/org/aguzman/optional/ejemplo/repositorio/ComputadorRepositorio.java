package org.aguzman.optional.ejemplo.repositorio;

import org.aguzman.optional.ejemplo.models.Computador;
import org.aguzman.optional.ejemplo.models.Fabricante;
import org.aguzman.optional.ejemplo.models.Procesador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        Procesador proc = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus Rog", "Strix G512");
        asus.setProcesador(proc);

        Computador hp = new Computador("HP Alynware", "OMEN");

        this.dataSource = new ArrayList<>(Arrays.asList(asus, hp));
    }

    @Override
    public Optional<Computador> filtrar(final String nombre) {
        return Stream.ofNullable(this.dataSource)
                .flatMap(List::stream)
                .filter(comp -> comp.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findAny();
    }

}
