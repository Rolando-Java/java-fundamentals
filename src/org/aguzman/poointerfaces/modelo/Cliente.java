package org.aguzman.poointerfaces.modelo;

import java.util.Objects;

public class Cliente extends BaseEntity {

    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido){
        super();
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object object){
        return super.equals(object);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public String toString(){
        return super.toString() + " Nombre: " + this.getNombre() + " Apellido: " + this.getApellido();
    }

}
