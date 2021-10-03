package org.aguzman.anotaciones.ejemplo.models;

import org.aguzman.anotaciones.ejemplo.Init;
import org.aguzman.anotaciones.ejemplo.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Persona {

    @JsonAtributo(value = "descripcion", removeBlanks = true)
    private String nombre;
    @JsonAtributo
    private Long precio;
    private LocalDate fecha;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return this.precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Init
    private void init() {
        this.nombre = Arrays.stream(String.valueOf(nombre).trim().split(" "))
                .map(s -> String.valueOf(s.charAt(0)).toUpperCase().concat(s.substring(1).toLowerCase()))
                .collect(Collectors.joining(" "));
    }

}
