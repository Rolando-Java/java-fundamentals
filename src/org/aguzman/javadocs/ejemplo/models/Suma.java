package org.aguzman.javadocs.ejemplo.models;

/**
 * Clase Suma para la operacion suma.
 * <p>Clase que define el metodo para realizar
 * la operacion aritmetica de suma.</p>
 */
public final class Suma extends Operacion<Integer> {

    /**
     * Constructor vacio.
     * <p>Constructor vacio de la clase Suma</p>
     */
    public Suma() {
        super();
    }

    @Override
    public final void operar(int a, int b) throws ArithmeticException {
        int resultado = a + b;
        this.setResultado(resultado);
    }

}
