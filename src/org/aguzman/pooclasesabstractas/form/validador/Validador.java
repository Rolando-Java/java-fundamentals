package org.aguzman.pooclasesabstractas.form.validador;

public abstract class Validador {

    protected String mensaje;

    protected Validador(){

    }

    public abstract String getMensaje();
    public abstract void setMensaje(String mensaje);
    public abstract boolean esValido(String valor);

}
