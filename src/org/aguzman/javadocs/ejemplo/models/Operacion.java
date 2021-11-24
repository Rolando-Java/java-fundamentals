package org.aguzman.javadocs.ejemplo.models;

/**
 * Clase abstracta para operaciones aritmeticas.
 * <p>Clase que define el metodo para las 4
 * operaciones aritmeticas.</p>
 *
 * @param <T> Este describe el tipo que devolvera la operacion aritmetica
 */
public abstract class Operacion<T> {

    private T resultado;

    /**
     * Constructor vacio.
     * <p>Constructor vacio de la clase Asbtracta Operacion.</p>
     */
    protected Operacion() {
        super();
    }

    /**
     * Metodo generico de la operacion arimetica.
     * <p>Este metodo generico permitira realizar las diferentes operaciones
     * aritmeticas segun lo definan las subclases.</p>
     *
     * @param a El primer sumando
     * @param b El segundo sumando
     * @throws ArithmeticException if la operacion aritemtica a realizar sea invalida
     */
    protected abstract void operar(int a, int b) throws ArithmeticException;

    public T getResultado() {
        return this.resultado;
    }

    public void setResultado(T resultado) {
        this.resultado = resultado;
    }

}
