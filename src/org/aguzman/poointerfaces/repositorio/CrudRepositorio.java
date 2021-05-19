package org.aguzman.poointerfaces.repositorio;

import org.aguzman.poointerfaces.repositorio.excepciones.AccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {

   List<T> listar();
   T porId(Integer id) throws AccesoDatoException;
   void crear(T elemento) throws AccesoDatoException;
   void editar(T elemento) throws AccesoDatoException;
   void eliminar(Integer id) throws AccesoDatoException;

}
