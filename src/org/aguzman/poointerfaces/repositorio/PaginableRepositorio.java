package org.aguzman.poointerfaces.repositorio;

import org.aguzman.poointerfaces.modelo.Cliente;
import java.util.List;

public interface PaginableRepositorio<T> {

    List<T> listar(int desde, int hasta);

}
