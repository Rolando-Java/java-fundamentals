package org.aguzman.pooherencia;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String email;

    public Persona(){
        System.out.println("Persona: inicializando constructor");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal!";
    }

    @Override
    public String toString(){
        return "nombre: " + this.nombre + " apellido: " + this.apellido +
                " edad: " + this.edad + " email: " + this.email
                + ", saludo: " + this.saludar();
    }

}
