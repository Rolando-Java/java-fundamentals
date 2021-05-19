package org.aguzman.generics;

import org.aguzman.poointerfaces.modelo.Cliente;
import org.aguzman.poointerfaces.modelo.ClientePremium;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploGenericos {

    public static void main(String[] args){

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres", "Guzman"));

        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArray = new Cliente[]{
                new Cliente("Luci", "Martinez"),
                new Cliente("Andres", "Guzman")
        };

        Integer[] enterosArreglo = new Integer[]{1, 2, 3};

        List<Cliente> clientesLista = EjemploGenericos.fromArrayToList(clientesArray);
        List<Integer> enterosLista = EjemploGenericos.fromArrayToList(enterosArreglo);

        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = EjemploGenericos.fromArrayToList(new String[]{"Andre", "Pepe",
                "Luci", "Bea", "John"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientePremiumLista = EjemploGenericos.fromArrayToList(new ClientePremium[]{
                new ClientePremium("Paco", "Fernandez")
        });

        EjemploGenericos.imprimirClientes(clientes);
        EjemploGenericos.imprimirClientes(clientesLista);
        EjemploGenericos.imprimirClientes(clientePremiumLista);

        System.out.println("Maximo de 1, 9 y 4 es: " + EjemploGenericos.maximo(1, 9, 4));
        System.out.println("Maximo de 3.9, 11.6, 7.78 es " + EjemploGenericos.maximo(3.9, 11.6, 7.78));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: " +
                maximo("zanahoria","arandanos", "manzana"));

    }

    /*
     Sobrecarga de metodos genericos
     */
    public static <T> List<T> fromArrayToList(T[] array){
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T extends Number> List<T> fromArrayToList(T[] array){
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T extends Cliente & Comparable<T>> List<T> fromArrayToList(T[] array){
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static <T, G> List<T> fromArrayToList(T[] array, G[] arrayPrint){
        for(G elemento : arrayPrint){
            System.out.println(elemento);
        }
        return Arrays.stream(array).collect(Collectors.toList());
    }

    public static void imprimirClientes(List<? extends Cliente> clienteList){
        clienteList.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T maximo(T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if(c.compareTo(max) > 0) max = c;
        return max;
    }

}