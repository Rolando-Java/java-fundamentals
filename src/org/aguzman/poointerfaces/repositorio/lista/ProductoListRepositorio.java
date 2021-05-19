package org.aguzman.poointerfaces.repositorio.lista;

import org.aguzman.poointerfaces.modelo.Producto;
import org.aguzman.poointerfaces.repositorio.AbstractaListRepositorio;
import org.aguzman.poointerfaces.repositorio.Direccion;
import org.aguzman.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto> {

    private int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "descripcion" ->
                    resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" ->
                    resultado = Double.valueOf(a.getPrecio()).compareTo(Double.valueOf(b.getPrecio()));
        }
        return resultado;
    }

    @Override
    public void editar(Producto elemento) throws LecturaAccesoDatoException {
        Producto producto = this.porId(elemento.getId());
        if(producto != null){
            producto.setDescripcion(elemento.getDescripcion());
            producto.setPrecio(elemento.getPrecio());
        }
    }

    @Override
    public List<Producto> listar(final String campo, final Direccion dir) {
        List<Producto> listaOrdenada = new ArrayList<>(this.listar());
        listaOrdenada.sort((o1, o2) -> {
            int resultado = 0;
            if(Direccion.ASC.equals(dir)) {
                resultado = this.ordenar(campo, o1, o2);
            } else if(Direccion.DESC.equals(dir)) {
                resultado = this.ordenar(campo, o2,o1);
            }
            return resultado;
        });
        return listaOrdenada;
    }
}
