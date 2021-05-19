package org.aguzman.poointerfaces.repositorio;

import org.aguzman.poointerfaces.modelo.BaseEntity;
import org.aguzman.poointerfaces.repositorio.excepciones.*;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntity> implements OrdenablePaginableCrudRepositorio<T> {

    private List<T> dataSource;

    protected AbstractaListRepositorio(){
        this.dataSource = new ArrayList<>();
    }

    @Override
    public void crear(T elemento) throws EscrituraAccesoDatoException {
        if(elemento == null) throw new EscrituraAccesoDatoException("Error al insertar un objeto null");
        if(this.dataSource.contains(elemento)) throw new RegistroDuplicadoAccesoDatosException("Error el objeto con id "
                + elemento.getId() + " existe en el repositorio");
        this.dataSource.add(elemento);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        this.dataSource.remove(this.porId(id));
    }

   @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {
        if(id == null || id <= 0){
            throw new LecturaAccesoDatoException("Id invalido, debe ser > 0");
        }
        T elementoBuscado = null;
        for(T elemento : this.dataSource){
            if(elemento.getId() != null && elemento.getId().equals(id)){
                elementoBuscado = elemento;
                break;
            }
        }
        if(elementoBuscado == null) throw new LecturaAccesoDatoException("No exite el registro con el id " + id);
        return elementoBuscado;
    }

    @Override
    public List<T> listar() {
        return this.dataSource;
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return this.dataSource.subList(desde, hasta);
    }

    @Override
    public int total(){
        return this.dataSource.size();
    }

}
