package org.aguzman.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private Integer nota;

    public Alumno(){}

    public Alumno(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer getNota(){
        return nota;
    }

    public void setNota(Integer nota){
        this.nota = nota;
    }

    @Override
    public int compareTo(Alumno alumno) {
        if(this.getNombre() == null) return 0;
        return this.getNombre().compareTo(alumno.getNombre());
    }

    @Override
    public boolean equals(Object object){
        if(this == object) return true;
        if(object == null || !(object instanceof Alumno)) return false;
        Alumno alumno = (Alumno) object;
        return Objects.equals(this.getNombre(), alumno.getNombre()) &&
                Objects.equals(this.getNota(), alumno.getNota());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getNombre(), this.getNota());
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Nota: " + this.nota;
    }

}
