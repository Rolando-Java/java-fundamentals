package org.aguzman.optional.ejemplo.models;

public class Fabricante {

    private String nombre;

    public Fabricante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Fabricante: " + this.nombre;
    }

}
