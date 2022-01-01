package test;

public interface IColeccionSimpleGenerica<T> {

    boolean estaVacia();

    T extraer();

    T primero();

    void aniadir(T elemento);

}
