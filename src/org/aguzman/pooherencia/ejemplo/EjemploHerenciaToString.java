package org.aguzman.pooherencia.ejemplo;

import org.aguzman.pooherencia.Alumno;
import org.aguzman.pooherencia.AlumnoInternacional;
import org.aguzman.pooherencia.Persona;
import org.aguzman.pooherencia.Profesor;

public class EjemploHerenciaToString {

    public static void main(String[] args){

        System.out.println("====== Creando la instancia objeto de Alumno ======");
        Alumno alumno = new Alumno("Andres", "Guzman", 13,
                "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("andres@correo.com");

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional ======");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");

        System.out.println("====== Creando la instancia de la clase Profesor ======");
        Profesor profesor = new Profesor("Luci", "Perez", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("profesor.luci@colegio.com");

        System.out.println("====== - ======");
        EjemploHerenciaToString.imprimir(alumno);
        EjemploHerenciaToString.imprimir(alumnoInt);
        EjemploHerenciaToString.imprimir(profesor);


    }

    public static void imprimir(Persona persona){
        System.out.println("========================");
        System.out.println(persona);
    }

}
