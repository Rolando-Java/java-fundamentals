package test;

import java.util.Arrays;
import java.util.Iterator;

public class MatrizGenerica<T> implements Iterable<T[]> {

    private T[][] matriz;

    public MatrizGenerica(int filas, int columnas) {
        this.matriz = (T[][]) new Object[filas][columnas];
    }

    public void set(int fila, int columna, T elemento) {
        this.matriz[fila][columna] = elemento;
    }

    public T get(int fila, int columna) {
        return this.matriz[fila][columna];
    }

    public int columnas() {
        return this.matriz[0].length;
    }

    public int filas() {
        return this.matriz.length;
    }

    @Override
    public Iterator<T[]> iterator(){
        return Arrays.stream(this.matriz).iterator();
    }

    @Override
    public String toString() {
        int tan = this.filas();
        StringBuilder sb = new StringBuilder("[");
        for (T[] ts : matriz) {
            sb.append(Arrays.toString(ts));
            tan--;
            if(tan > 0) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

}
