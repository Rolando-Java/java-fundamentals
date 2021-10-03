package org.aguzman.anotaciones.ejemplo;

import org.aguzman.anotaciones.ejemplo.models.Persona;
import org.aguzman.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotacion {

    public static void main(String... args) throws IllegalAccessException {

        Persona persona = new Persona();
        persona.setFecha(LocalDate.now());
        persona.setNombre(" susan ROMAN ");
        persona.setPrecio(1000L);

        String json = JsonSerializador.convertirJson(persona);
        System.out.println("json: " + json);

    }

}
