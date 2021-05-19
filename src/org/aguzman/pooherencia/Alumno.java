package org.aguzman.pooherencia;

public class Alumno extends Persona {

    private String institucion;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno(){
        System.out.println("Alumno: inicializando constructor");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String institucion){
        this(nombre, apellido, edad);
        this.institucion = institucion;
    }

    public Alumno(String nombre, String apellido, int edad, String institucion,
                  double notaMatematica, double notaCastellano, double notaHistoria){
        this(nombre, apellido, edad, institucion);
        this.notaMatematica = notaMatematica;
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
    }

    public String getInstitucion() {
        return this.institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return this.notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return this.notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return this.notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    public double calcularPromedio(){
        System.out.println("calcularPromedio " + Alumno.class.getSimpleName());
        return (this.notaHistoria + this.notaCastellano + this.notaMatematica) / 3;
    }

    @Override
    public String saludar(){
        return super.saludar() + " Soy un alumno y mi nombre es " + this.getNombre();
    }

    @Override
    public String toString(){
        return super.toString() + " institucion: " + this.institucion
                + " notaMatematica: " + this.notaMatematica + " notaCastellano: " + this.notaCastellano
                + " notaHistoria: " + this.notaHistoria
                + " promedio: " + this.calcularPromedio();
    }

}
