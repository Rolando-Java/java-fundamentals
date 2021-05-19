package org.aguzman.ejemplos.set;

import java.util.*;

public class EjemploTreeSet {

    public static void main(String[] args){
        /*
         TreeSet
         - ordena los elementos en funcion al metodo compareTo definido
         en la clase. Cabe mencionar que TreeSet solo acepta clases
         que hereden de la interface Comparable.
         -No agrega elementos repetidos.
         -No se puede agregar nulos
         */
        Set<String> ts = new TreeSet<>();
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        boolean b = ts.add("tres");
        System.out.println("No acepta elementos duplicados? " + b);//false
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);

        //se puede pasar un Comparator por el constructor
        //para de esta forma cambiar el orden de los elementos
        Set<Integer> numeros = new TreeSet<>((o1, o2) -> o2.compareTo(o1));
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("numeros = " + numeros);

        //Comparator.reverseOrder() : invierte le orden natural
        //de los elementos de la lista
        Set<Integer> numerosDos= new TreeSet<>(Comparator.reverseOrder());
        numerosDos.add(1);
        numerosDos.add(5);
        numerosDos.add(4);
        numerosDos.add(2);
        numerosDos.add(3);
        numerosDos.add(10);
        System.out.println("numerosDos = " + numerosDos);

        Set<Persona> personas = new TreeSet<>();
        personas.add(new Persona("susan"));
        personas.add(new Persona("pedro"));
        personas.add(new Persona("julio"));
        //No agrega la nueva persona, debido a que TreeSet
        //detecta la igualda a traves del compareto definido, ya sea
        //del Comprable o Comparator, lo que significa que cuando bote 0
        //sabra que son iguales
        boolean b1 = personas.add(new Persona("pedro"));
        System.out.println("b1 = " + b1);//false
        System.out.println("personas = " + personas);

    }

}

class Persona implements Comparable<Persona> {

    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public int compareTo(Persona persona){
        return this.nombre.compareTo(persona.getNombre());
    }

    @Override
    public String toString(){
        return this.nombre;
    }

}
