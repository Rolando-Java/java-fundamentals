package org.aguzman.ejemplos.map;

import serializacion.Persona;

import java.util.*;

public class EjemploHashMap {

    public static void main(String[] args){

        Map<String, Object> persona = new HashMap<>();
        System.out.println("contiene elementos = " + !persona.isEmpty());

        persona.put(null, "12345");
        persona.put(null, "12345");
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "john.doe@email.com");
        persona.put("edad", "30");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("Calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);

        System.out.println("persona = " + persona);

        String nombre = (String) persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = (String) persona.get("apellido");
        System.out.println("apellido = " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        System.out.println("El pais de John es: " + pais);
        String ciudad = direccionPersona.get("ciudad");
        System.out.println("La ciudad de John es: " + ciudad);
        String barrio = direccionPersona.getOrDefault("barrio","La playa");
        System.out.println("El barrio de John es: " + barrio);

        String valorApellidoPaterno = (String) persona.remove("apellidoPaterno");
        System.out.println("eliminado = " + valorApellidoPaterno);
        System.out.println("persona = " + persona);

        boolean eliminado = persona.remove("apellidoPaterno","Doe");
        System.out.println("eliminado = " + eliminado);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("john.doe@email.com");
        System.out.println("b2 = " + b2);

        Collection<Object> valores = persona.values();
        valores.forEach(valor -> System.out.println("valor: " + valor));

        Set<String> llaves = persona.keySet();
        llaves.forEach(llave -> System.out.println("llave: " + llave));

        System.out.println("========================== entrySet");
        for(Map.Entry<String, Object> elementoMap : persona.entrySet()){
            Object valor= elementoMap.getValue();
            if(valor instanceof Map) {
                Map<String, String> direccionMap = (Map<String, String>) valor;
                String nom = (String) persona.get("nombre");
                direccionMap.forEach((key, value) -> System.out.println(key + " => " + value));
            } else{
                System.out.println(elementoMap.getKey() + " => " + valor);
            }
        }

        System.out.println("========================== keySet");
        for(String llave : persona.keySet()){
            Object valor = persona.get(llave);
            if(valor instanceof Map) {
                Map<String, String> direccionMap = (Map<String, String>) valor;
                String nom = (String) persona.get("nombre");
                System.out.println("El pais de " + nom + ": " +
                        direccionMap.get("pais"));
                System.out.println("Es estado de " + nom + ": " +
                        direccionMap.get("estado"));
                System.out.println("La ciudad de " + nom + ": " +
                        direccionMap.get("ciudad"));
            } else{
                System.out.println(llave + " => " + valor);
            }
        }

        System.out.println("========================== forEach");
        persona.forEach((llave, valor) -> System.out.println(llave + " => " + valor));

        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos = " + !persona.isEmpty());

        Object valorReemplazado = persona.replace("nombre", "Susana");
        System.out.println("valorReemplazado = " + valorReemplazado);
        System.out.println("persona = " + persona);

        boolean b3 = persona.replace("nombre", "Susana", "Susan");
        System.out.println("b3 = " + b3);
        System.out.println("persona = " + persona);

    }

}
