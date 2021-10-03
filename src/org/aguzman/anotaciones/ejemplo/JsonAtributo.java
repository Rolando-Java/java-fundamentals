package org.aguzman.anotaciones.ejemplo;

import jdk.jfr.Description;

import java.lang.annotation.*;

//La anotacion se va a documentar en el api doc de java
@Documented
//Define en donde se va aplicar la anotacion(atributo, metodo, clase, etc)
@Target(ElementType.FIELD)
//En que contexto se va a ejecutar(tiempo de compilacion, ejecucion, etc)
@Retention(RetentionPolicy.RUNTIME)
//describe un elemento
@Description("Es es una anotacion creada y personalizada para volver json a un atributo")
public @interface JsonAtributo {

    //cuando colocas el atributo value, no es
    //necesario que cuando implementes esta anotacion
    //escribas el nombre de la propiedad para darle un valor
    String value() default "";

    boolean removeBlanks() default false;
}
