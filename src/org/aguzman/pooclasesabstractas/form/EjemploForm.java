package org.aguzman.pooclasesabstractas.form;

import org.aguzman.pooclasesabstractas.form.elementos.*;
import org.aguzman.pooclasesabstractas.form.elementos.select.Opcion;
import org.aguzman.pooclasesabstractas.form.validador.*;

import java.util.*;

public class EjemploForm {

    public static void main(String[] args){

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1", "Java").setSelected())
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript"))
                .addOpcion(new Opcion("5", "PHP"));

        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name=\"" + this.getNombre() + "\" value=\"" + this.getValor() + "\"/>";
            }
        };

        saludar.setValor("Hola que tal, este campo esta deshabilitado");
        username.setValor("john.doe");
        password.setValor("a1b2c3");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 años de experiencia ...");

        List<ElementoForm> elementos = new ArrayList<>(Arrays
                .asList(username, password, email, edad,
                        experiencia, lenguaje, saludar));

        elementos.forEach(e -> System.out.println(e.dibujarHtml().concat("<br/>")));

        elementos.forEach(e -> {
            if(!e.esValido()) e.getErrores().
                    forEach(System.out::println);
        });

    }

}
