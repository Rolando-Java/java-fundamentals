package org.aguzman.poointerfaces.repositorio.lista;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.repositorio.AbstractaListRepositorio;
import org.aguzman.poointerfaces.repositorio.Direccion;
import org.aguzman.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    private int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch(campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }

    @Override
    public void editar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente cli = this.porId(cliente.getId());
        if(cli != null){
            cli.setNombre(cliente.getNombre());
            cli.setApellido(cliente.getApellido());
        }
    }

    @Override
    public List<Cliente> listar(final String campo, final Direccion dir) {
        List<Cliente> listaOrdenada = new ArrayList<>(this.listar());
        listaOrdenada.sort((Cliente o1, Cliente o2) -> {
                int resultado = 0;
                if(dir == Direccion.ASC){
                    resultado = this.ordenar(campo,o1, o2);
                } else if(dir == Direccion.DESC){
                    resultado = this.ordenar(campo, o2, o1);
                }
                return resultado;
        });
        return listaOrdenada;
    }

}
