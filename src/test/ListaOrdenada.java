package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListaOrdenada<T extends Comparable> {

    private List<T> listaOrdenada;

    public ListaOrdenada() {
        this.listaOrdenada = new ArrayList<>();
    }

    public void add(T elemento) {
        this.listaOrdenada.add(elemento);
        Collections.sort(this.listaOrdenada, Comparator.reverseOrder());
    }

    public T get(int posicion) {
        return this.listaOrdenada.get(posicion);
    }

    public int size() {
        return this.listaOrdenada.size();
    }

    public boolean isEmpty() {
        return this.listaOrdenada.isEmpty();
    }

    public boolean remove(T elemento) {
        return this.listaOrdenada.remove(elemento);
    }

    public int indexOf(T elemento) {
        return this.listaOrdenada.indexOf(elemento);
    }

    @Override
    public String toString() {
        return String.valueOf(this.listaOrdenada);
    }

}
