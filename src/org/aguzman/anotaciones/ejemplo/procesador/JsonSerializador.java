package org.aguzman.anotaciones.ejemplo.procesador;

import org.aguzman.anotaciones.ejemplo.Init;
import org.aguzman.anotaciones.ejemplo.JsonAtributo;
import org.aguzman.anotaciones.ejemplo.excepcions.JsonSerializerException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public class JsonSerializador {

    public static void inicializarObejto(final Object object) {
        if(Objects.isNull(object)) throw new JsonSerializerException("Error de nulidad al serializar!");

        Method[] methods = object.getClass().getDeclaredMethods();
        Arrays.stream(methods)
                .filter(method -> method.isAnnotationPresent(Init.class))
                .forEach(method -> {
                    method.setAccessible(Boolean.TRUE);
                    try {
                        method.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                });
    }

    public static String convertirJson(final Object object) {

        if (Objects.isNull(object)) throw new JsonSerializerException("Error de nulidad al serializar!");

        JsonSerializador.inicializarObejto(object);

        Field[] atributos = object.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(field -> field.isAnnotationPresent(JsonAtributo.class))
                .map(field -> {
                    field.setAccessible(Boolean.TRUE);
                    String nombreAtributo = (field.getAnnotation(JsonAtributo.class).value().isEmpty()) ?
                            field.getName() :
                            field.getAnnotation(JsonAtributo.class).value();

                    Object valorAtributo;
                    try {
                        if(field.getAnnotation(JsonAtributo.class).removeBlanks() &&
                                field.getType().equals(String.class)) {
                            String nuevoValor = String.valueOf(field.get(object))
                                    .replaceAll(" ","");
                            field.set(object, nuevoValor);
                        }
                        valorAtributo = field.get(object);
                    } catch (IllegalAccessException ex) {
                        throw new JsonSerializerException("Error de nulidad al serializar!");
                    }
                    return  "\"" + nombreAtributo + "\":\"" + valorAtributo + "\"";
                })
                .reduce("{", (o, o2) -> {
                    if (o.equals("{")) {
                        return o.concat(o2);
                    } else {
                        return o.concat(",").concat(o2);
                    }
                }).concat("}");
    }

}
