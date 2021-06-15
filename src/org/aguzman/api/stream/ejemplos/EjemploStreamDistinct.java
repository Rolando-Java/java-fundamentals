package org.aguzman.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class EjemploStreamDistinct {

    public static void main(String... args) {

        List<Persona> personas = new ArrayList<>(Arrays.asList(new Persona[]{
                new Persona("Pato", "Guzman"), new Persona("Paco", "Gonzalez"),
                new Persona("Pepa", "Gutierrez"), new Persona("Pepe","Mena"),
                new Persona("Pepe", "Garcia"), new Persona("Paco", "Gonzalez"),
                new Persona("Paco", "Gonzalez"), new Persona("Paco", "Gonzalez")
        }));

        personas.stream().distinct().forEach(System.out::println);

    }

}

class Persona {

    private String nombre;
    private String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre() {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido() {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || !(object instanceof Persona)) return false;
        Persona persona = (Persona) object;
        return Objects.equals(this.nombre, persona.nombre) &&
                Objects.equals(this.apellido, persona.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

}
