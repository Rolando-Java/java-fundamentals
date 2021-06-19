package org.aguzman.optional.ejemplo.models;

import java.util.Optional;

public class Procesador {

    private String nombre;
    private Fabricante fabricante;

    public Procesador(String nombre, Fabricante fabricante){
        this.nombre = nombre;
        this.fabricante = fabricante;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Optional<Fabricante> getFabricante() {
        return Optional.ofNullable(this.fabricante);
    }

    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + " " + this.fabricante.toString();
    }

}
