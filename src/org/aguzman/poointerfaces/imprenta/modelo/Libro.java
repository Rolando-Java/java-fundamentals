package org.aguzman.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible {

    private List<Imprimible> paginas;
    private Persona persona;
    private String titulo;
    private Genero genero;

    public Libro(Persona persona, String titulo, Genero genero) {
        this.persona = persona;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Libro addPagina(Imprimible pagina){
        this.paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb = new StringBuilder("Titulo: ")
                .append(this.getTitulo()).append(this.getPersona())
                .append("\nGenero: ").append(this.getGenero())
                .append("\n");

        this.paginas.forEach(pag -> {
            sb.append(pag.imprimir()).append("\n");
        });

        return sb.toString();
    }

}
