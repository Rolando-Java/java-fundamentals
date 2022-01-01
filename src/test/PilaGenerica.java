package test;

import java.util.Iterator;
import java.util.LinkedList;

public class PilaGenerica<T> implements Iterable<T> {

    private LinkedList<T> lista;

    public PilaGenerica(){
        this.lista = new LinkedList<>();
    }

    public boolean estaVacia(){
        return this.lista.isEmpty();
    }

    public T extraer(){
        return this.lista.removeFirst();
    }

    public T primero(){
        return this.lista.getFirst();
    }

    public PilaGenerica<T> aniadir(T elemento){
        this.lista.addFirst(elemento);
        return this;
    }

    @Override
    public Iterator<T> iterator(){
        return this.lista.iterator();
    }

    @Override
    public String toString(){
        return this.lista.toString();
    }

}
