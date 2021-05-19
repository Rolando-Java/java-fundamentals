package org.aguzman.genericsclass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Camion<T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public Camion(){
        this.objetos = new ArrayList<>();
    }

    public Camion(int max){
        this();
        this.max = max;
    }

    public void add(T objeto){
        if(this.objetos.size() < this.max) this.objetos.add(objeto);
        else throw new RuntimeException("no hay mas espacio");
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }

}
