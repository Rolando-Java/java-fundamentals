package org.aguzman.optional.ejemplo.repositorio;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<T> filtrar(String mombre);

}
