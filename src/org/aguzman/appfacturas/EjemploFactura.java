package org.aguzman.appfacturas;

import org.aguzman.appfacturas.modelo.*;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args){

        Cliente cliente = new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Andres");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la descripcion de la factura: ");
        Factura factura = new Factura(scanner.nextLine(), cliente);

        Producto producto;

        System.out.println();

        for (int i = 0; i < 5; i++) {
            producto = new Producto();
            System.out.print("Imgrese producto n° " + producto.getCodigo() + " : ");
            producto.setNombre(scanner.nextLine());

            System.out.print("Ingrese el precio: ");
            producto.setPrecio(Float.parseFloat(scanner.nextLine()));

            System.out.print("Ingrese la cantidad: ");
            factura.addItemFactura(new ItemFactura(Integer.parseInt(scanner.nextLine()), producto));

            System.out.println();
        }

        System.out.println(factura);

    }

}
