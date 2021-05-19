package org.aguzman.ejemplos.set;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComprable {

    public static void main(String[] args){

        Set<Alumno> sa = new TreeSet<>(Comparator.comparing(Alumno::getNombre));
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 7));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 8));

        System.out.println("sa = " + sa);

    }

}
