package org.aguzman.pooherencia.ejemplo;

import org.aguzman.pooherencia.*;

public class EjemploHerenciaConstructores {

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
        EjemploHerenciaConstructores.imprimir(alumno);
        EjemploHerenciaConstructores.imprimir(alumnoInt);
        EjemploHerenciaConstructores.imprimir(profesor);

    }

    public static void imprimir(Persona persona){
        System.out.println("nombre: " + persona.getNombre() +
                ", apellido: " + persona.getApellido() +
                ", edad: " + persona.getEdad() +
                ", email: " + persona.getEmail());

        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno:");
            System.out.println("institucion: " + ((Alumno)persona).getInstitucion());
            System.out.println("notaMatematica: " + ((Alumno)persona).getNotaMatematica());
            System.out.println("notaCastellano: " + ((Alumno)persona).getNotaCastellano());
            System.out.println("notaHistoria: " + ((Alumno)persona).getNotaHistoria());

            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo AlumnoInternacional:");
                System.out.println("pais: " + ((AlumnoInternacional)persona).getPais());
                System.out.println("notaIdiomas: " + ((AlumnoInternacional)persona).getNotaIdiomas());
            }
            System.out.println("======================== sobre escritura promedio ========================");
            System.out.println("Promedio: " + ((Alumno) persona).calcularPromedio());
            System.out.println("======================== sobre escritura promedio ========================");
        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor:");
            System.out.println("asignatura: " + ((Profesor)persona).getAsignatura());
        }
        System.out.println("======================== sobre escritura saludar ========================");
        System.out.println(persona.saludar());
        System.out.println("========================");

    }

}
