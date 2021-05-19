package org.aguzman.ejemplos.list;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploListComparableComparator {

    public static void main(String[] args){

        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luci", 4));
        sa.add(new Alumno("Jano", 7));
        sa.add(new Alumno("Andres", 7));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 2));
//        Collections.sort(sa, (o1, o2) -> o1.getNota().compareTo(o2.getNota()));
//        sa.sort((o1, o2) -> o1.getNota().compareTo(o2.getNota()));
//        sa.sort(Comparator.comparing(Alumno::getNota).);
        sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        System.out.println("sa = " + sa);



        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }

}
