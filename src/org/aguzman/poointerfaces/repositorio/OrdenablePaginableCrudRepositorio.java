package org.aguzman.poointerfaces.repositorio;

import org.aguzman.poointerfaces.modelo.BaseEntity;

public interface OrdenablePaginableCrudRepositorio<T>  extends OrdenableRepositorio<T>,
        PaginableRepositorio<T>, CrudRepositorio<T>, ContableRepositorio {

}
