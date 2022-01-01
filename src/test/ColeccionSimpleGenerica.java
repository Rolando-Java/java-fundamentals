package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ColeccionSimpleGenerica<T> implements IColeccionSimpleGenerica<T> {

    private List<T> lista;

    public ColeccionSimpleGenerica() {
        this.lista = new LinkedList<>();
    }

    @Override
    public boolean estaVacia() {
        return this.lista.isEmpty();
    }

    @Override
    public T extraer() {
        return ((LinkedList<T>)this.lista).removeLast();
    }

    @Override
    public T primero() {
        return ((LinkedList<T>)this.lista).getFirst();
    }

    @Override
    public void aniadir(T elemento) {
        this.lista.add(elemento);
    }

    @Override
    public String toString() {
        return String.valueOf(this.lista);
    }

}
