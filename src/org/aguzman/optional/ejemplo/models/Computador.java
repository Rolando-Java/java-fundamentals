package org.aguzman.optional.ejemplo.models;

import java.util.Optional;

public class Computador {

    private String nombre;
    private String modelo;
    private Procesador procesador;

    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Optional<Procesador> getProcesador() {
        return Optional.ofNullable(this.procesador);
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Nombre: " + this.nombre + ", Modelo: " + this.modelo;
    }

}
