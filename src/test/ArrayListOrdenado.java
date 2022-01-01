package test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOrdenado<E extends Comparable> extends ArrayList<E> {

    @Override
    public boolean add(E elemento) {
        Collections.sort(this);
        return super.add(elemento);
    }

}
