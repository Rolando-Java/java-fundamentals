package org.aguzman.poointerfaces.imprenta;

import org.aguzman.poointerfaces.imprenta.modelo.*;
import static org.aguzman.poointerfaces.imprenta.modelo.Genero.*;
import static org.aguzman.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("John", "Doe"), "Ingeniero de Sistemas", "Resumen laboral...");
        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("angular");

        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de disenios: Elem. Reusables POO",
                PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singleton"))
                .addPagina(new Pagina("Patron Observador"))
                .addPagina(new Pagina("Patron Factory"))
                .addPagina(new Pagina("Patron Composite"))
                .addPagina(new Pagina("Patron Facade"));

        Informe imforme = new Informe(new Persona("Martin", "Fowler"), "James", "Estudio sobre microservicios");

        imprimir(cv);
        imprimir(imforme);
        imprimir(libro);

        imprimir(new Imprimible() {
            @Override
            public String imprimir(){
                return "Estoy imprimiendo ...";
            }
        });

        System.out.println(Imprimible.TEXTO_DEFECTO);

    }

}
