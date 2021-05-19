package org.aguzman.poointerfaces;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.modelo.Producto;
import org.aguzman.poointerfaces.repositorio.Direccion;
import org.aguzman.poointerfaces.repositorio.OrdenablePaginableCrudRepositorio;
import org.aguzman.poointerfaces.repositorio.excepciones.AccesoDatoException;
import org.aguzman.poointerfaces.repositorio.excepciones.LecturaAccesoDatoException;
import org.aguzman.poointerfaces.repositorio.lista.ClienteListRepositorio;
import org.aguzman.poointerfaces.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {

    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Producto> repositorio = new ProductoListRepositorio();
            repositorio.crear(new Producto("mesa", 50.52));
            repositorio.crear(new Producto("silla", 18));
            repositorio.crear(new Producto("lampara", 15.5));
            repositorio.crear(new Producto("notebook", 400.89));

            System.out.println("Listando clientes");
            List<Producto> productos = repositorio.listar();
            productos.forEach(System.out::println);

            System.out.println("====== paginable ======");
            List<Producto> paginable = repositorio.listar(1, 4);
            paginable.forEach(System.out::println);

            System.out.println("======= ordenar =======");
            List<Producto> productosOrdenAsc = repositorio.listar("id", Direccion.DESC);
            productosOrdenAsc.forEach(System.out::println);

            System.out.println("====== editar ======");
            Producto lamparaActualizar = new Producto("lampara escritorio", 23);
            lamparaActualizar.setId(3);
            repositorio.editar(lamparaActualizar);
            Producto lampara = repositorio.porId(lamparaActualizar.getId());
            System.out.println(lampara);

            System.out.println("====== eliminar ======");
            repositorio.eliminar(2);
            repositorio.listar().forEach(System.out::println);

            System.out.println("====== total ======");
            System.out.println("Total registros: " + repositorio.total());
        } catch (LecturaAccesoDatoException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        } catch (AccesoDatoException ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }

    }

}
