package org.aguzman.ejemplos.set;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploHasSetUnicidad {

    public static void main(String[] args){

        Set<Alumno> sa = new HashSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 7));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
        System.out.println("sa = " + sa);

        System.out.println("Iterando usando foreach");
        for(Alumno a : sa){
            System.out.println("a = " + a.getNombre());
        }

        System.out.println("Iterando usando while y iterator");
        Iterator<Alumno> alumnoIterator = sa.iterator();
        while(alumnoIterator.hasNext()){
            Alumno alumno = alumnoIterator.next();
            System.out.println("alumno.getNota() = " + alumno.getNota());
        }

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }

}
