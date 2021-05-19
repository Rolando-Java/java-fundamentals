package org.aguzman.ejemplos.set;

import java.util.*;
import java.util.stream.Collectors;

public class EjemploHashSetAgregar {

    public static void main(String[] args){
        /*
         HashSet
         - no hay un orden a la hora de agregar los elementos a la lista,
         además puedes insertarle nulos
         - no se puede agregar valores duplicados
         */
        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println("hs = " + hs);

        boolean b = hs.add("tres");
        System.out.println("Permite elementos duplicados? " + b);//false
        System.out.println("hs = " + hs);

        Set<Empleado> empleados = new HashSet<>();
        empleados.add(new Empleado("susan"));
        empleados.add(new Empleado("pedro"));
        empleados.add(new Empleado("julio"));
        //No agrega al nuevo empleado, debido a que HashSet
        //detecta la igualdad a traves del mettodo hasCode e equals definido
        boolean b1 = empleados.add(new Empleado("pedro"));
        System.out.println("b1 = " + b1);//false
        System.out.println("empleados = " + empleados);

        //Transformado un hashSet a List para ordenarlo
        List<String> lista = new ArrayList<>(hs);//se puede agregar al constructor
                                                //la clase que herede de Collection
        Collections.sort(lista);
        System.out.println("lista = " + lista);

    }

}

class Empleado {

    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleado empleado = (Empleado) o;
        return Objects.equals(nombre, empleado.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString(){
        return this.nombre;
    }

}