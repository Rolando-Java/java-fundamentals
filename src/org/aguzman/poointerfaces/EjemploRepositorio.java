package org.aguzman.poointerfaces;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.repositorio.*;
import org.aguzman.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.aguzman.poointerfaces.repositorio.excepciones.EscrituraAccesoDatoException;
import org.aguzman.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.aguzman.poointerfaces.repositorio.excepciones.RegistroDuplicadoAccesoDatosException;
import org.aguzman.poointerfaces.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repositorio = new ClienteListRepositorio();
            repositorio.crear(new Cliente("Jano", "Perez"));
            repositorio.crear(new Cliente("Bea", "Gonzales"));
            repositorio.crear(new Cliente("Luci", "Martinez"));
            Cliente andres = new Cliente("Andres", "Guzman");
            repositorio.crear(andres);
            repositorio.crear(andres);

            System.out.println("Listando clientes");
            List<Cliente> clientes = repositorio.listar();
            clientes.forEach(System.out::println);

            System.out.println("====== paginable ======");
            List<Cliente> paginable = repositorio.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("======= ordenar =======");
            List<Cliente> clientesOrdenAsc = repositorio.listar("id", Direccion.DESC);
            clientesOrdenAsc.forEach(System.out::println);

            System.out.println("====== editar ======");
            Cliente beaActualizar = new Cliente("Bea", "Mena");
            beaActualizar.setId(2);
            repositorio.editar(beaActualizar);
            Cliente bea = repositorio.porId(beaActualizar.getId());
            System.out.println(bea);

            System.out.println("====== eliminar ======");
            repositorio.eliminar(2);
            repositorio.listar().forEach(System.out::println);

            System.out.println("====== total ======");
            System.out.println("Total registros: " + repositorio.total());
        } catch (LecturaAccesoDatoException ex) {
            System.err.println("Letura: " + ex.getMessage());
            ex.printStackTrace();
        } catch (RegistroDuplicadoAccesoDatosException ex) {
            System.err.println("Registro Duplicado: " + ex.getMessage());
            ex.printStackTrace();
        } catch (EscrituraAccesoDatoException ex) {
            System.err.println("Escritura: " + ex.getMessage());
            ex.printStackTrace();
        } catch (AccesoDatoException ex) {
            System.err.println("Generica: " + ex.getMessage());
        }

    }

}
