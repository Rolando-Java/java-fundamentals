package org.aguzman.ejemplos.list;

import org.aguzman.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploLinkedList {

    public static void main(String[] args){
        //LinkedList es mas rapido que ArrayList a la hora de  manipular
        //los elementos de la coleccion
        List<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("esta vacia = " + enlazada.isEmpty());
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luci", 4));
        enlazada.add(new Alumno("Jano", 7));
        enlazada.add(new Alumno("Andres", 3));

        System.out.println(enlazada + ", size = " + enlazada.size());

        LinkedList<Alumno> linkedList = (LinkedList) enlazada;
        linkedList.addFirst(new Alumno("Zeus", 5));
        linkedList.addLast(new Alumno("Atenea", 6));
        System.out.println(enlazada + ", size = " + enlazada.size());

        System.out.println("Primero = " + linkedList.getFirst());
        System.out.println("Primero = " + linkedList.peekFirst());
        System.out.println("Ultimo = " + linkedList.getLast());
        System.out.println("Ultimo = " + linkedList.peekLast());
        System.out.println("Indice 2 = " + linkedList.get(2));

        Alumno zeus = linkedList.removeFirst();
        System.out.println("zeus = " + zeus);
        Alumno atenea = linkedList.pollLast();
        System.out.println("atenea = " + atenea);
        System.out.println(enlazada + ", size = " + enlazada.size());

        //Puede eliminar el elemento gracias al metodo equals
        //por el cual detetecta si es igual
        boolean eliminado = linkedList.remove(new Alumno("Jano", 7));
        System.out.println("eliminado = " + eliminado);
        System.out.println(enlazada + ", size = " + enlazada.size());

        Alumno a = new Alumno("Lucas", 5);
        linkedList.addLast(a);
        System.out.println("Indice de Lucas = " + linkedList.indexOf(a));

        Alumno posicionDos = linkedList.remove(2);
        System.out.println("Alumno posicioDos eliminado = " + posicionDos);
        System.out.println(enlazada + ", size = " + enlazada.size());
        System.out.println("Indice de Lucas = " + linkedList.indexOf(a));

        linkedList.set(3, new Alumno("Lalo", 7));
        System.out.println(enlazada + ", size = " + enlazada.size());

        ListIterator<Alumno> li = enlazada.listIterator();

        while(li.hasNext()){
            Alumno al = li.next();
            System.out.println(al);
        }

        System.out.println("============ Previous =========");
        while(li.hasPrevious()){
            Alumno al = li.previous();
            System.out.println(al);
        }




    }

}
