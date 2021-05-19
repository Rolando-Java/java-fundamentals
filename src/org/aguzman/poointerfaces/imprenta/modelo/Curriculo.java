package org.aguzman.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible {

    private Persona persona;
    private String carrera;
    private List<String> experiencias;

    public Curriculo(Persona persona, String carrera, String contenido){
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Curriculo addExperiencia(String experiencia){
        this.experiencias.add(experiencia);
        return this;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder()
                .append(this.getPersona())
                .append("\nResumen: ").append(this.getContenido())
                .append("\nProfesion: ").append(this.getCarrera())
                .append("\nExperiencias: ")
                .append("\n");

        this.experiencias.forEach(exp -> {
            sb.append("- ").append(exp).append("\n");
        });

        return sb.toString();
    }
}
