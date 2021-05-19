package org.aguzman.ejemplos.list;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploArrayList {

    public static void main(String[] args){

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("esta vacia = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));

        System.out.println(al + ", size = " + al.size());

        //Puede eliminar el elemento gracias al metodo equals
        //por el cual detetecta si es igual
        boolean eliminado = al.remove(new Alumno("Jano", 7));
        System.out.println("eliminado = " + eliminado);
//        al.remove(2);
        System.out.println(al +", size = " + al.size());

        //Puede saber si contiene el elemento gracias al metodo equals
        //por el cual detetecta si es igual
        boolean b = al.contains(new Alumno("Cata", 6));
        System.out.println("La lista contiene a Cata = " + b);

        Alumno[] alumnos = al.toArray(new Alumno[0]);
        Arrays.stream(alumnos).forEach(System.out::println);

    }

}
