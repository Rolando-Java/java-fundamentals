package org.aguzman.ejemplos.map;

import java.util.*;

public class EjemploTreeMap {

    public static void main(String[] args){
        /*
         TreeMap: ordena de forma natural, a traves de la llave
         -no se puede guardar en la llave un valor null
         */
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());

        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("Calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);

    }

}
