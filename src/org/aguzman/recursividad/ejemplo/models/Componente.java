package org.aguzman.recursividad.ejemplo.models;

import java.util.ArrayList;
import java.util.List;

public class Componente {

    private String nombre;
    private List<Componente> hijos;
    private int nivel;

    public Componente(String nombre) {
        this.nombre = nombre;
        this.hijos = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public List<Componente> getHijos() {
        return this.hijos;
    }

    public void setHijos(List<Componente> hijos) {
        this.hijos = hijos;
    }

    public Componente addComponente(Componente hijo) {
        this.hijos.add(hijo);
        return this;
    }

    public boolean tieneHijos() {
        return !this.hijos.isEmpty();
    }

    @Override
    public String toString() {
        return "\t".repeat(this.nivel).concat(". ").concat(this.nombre);
    }

}
