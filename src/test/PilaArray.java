package test;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class PilaArray<T> {

    private int contador;
    private T[] array;

    public PilaArray(int tan){
        this.array = (T[])(new Object[tan]);
    }

    public boolean estaVacia(){
        return (this.contador == 0);
    }

    public boolean aniadir(T elemento){
        if(this.contador < this.array.length){
            this.array[this.contador]=elemento;
            this.contador++;
            return true;
        } else {
            return false;
        }
    }

    public T primero(){
        if(!this.estaVacia()) return this.array[this.contador-1];
        else throw new NoSuchElementException();
    }

    public T extraer(){
        if(!this.estaVacia()) {
            T elemento = this.array[--this.contador];
            this.array = Arrays.copyOf(this.array, this.contador);
            return elemento;
        } else {
            throw new NoSuchElementException();
        }
    }

    @Override
    public String toString(){
        return Arrays.toString(this.array);
    }

}
