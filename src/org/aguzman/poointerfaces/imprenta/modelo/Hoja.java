package org.aguzman.poointerfaces.imprenta.modelo;

public abstract class Hoja {

    private String contenido;

    protected Hoja(String contenido){
        this.contenido = contenido;
    }

    public String getContenido(){
        return this.contenido;
    }

    public abstract String imprimir();

}
