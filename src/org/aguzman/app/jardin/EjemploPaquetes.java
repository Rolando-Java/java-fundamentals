package org.aguzman.app.jardin;

import org.aguzman.app.hogar.*;
import static java.lang.System.out;
import static org.aguzman.app.hogar.Persona.*;
import static org.aguzman.app.hogar.ColorPelo.*;

public class EjemploPaquetes {

    public static void main(String[] args){

        Persona persona = new Persona();
        persona.setNombre("Susan");
        persona.setApellido("Mendez");
        persona.setColorPelo(CAFE);
        out.println(persona);

        Perro perro = new Perro();
        perro.nombre = "tobby";
        perro.raza = "Bulldog";

        String jugando = perro.jugar(persona);
        out.println("jugando = " + jugando);

        String saludo = saludar();
        out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;

    }

}
