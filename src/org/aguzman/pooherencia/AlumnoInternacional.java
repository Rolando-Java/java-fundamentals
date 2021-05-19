package org.aguzman.pooherencia;

public final class AlumnoInternacional extends Alumno {

    private String pais;
    private double notaIdiomas;

    public AlumnoInternacional(){
        System.out.println("AlumnoInternacional: inicializando constructor");
    }

    public AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        this(nombre, apellido);
        this.pais = pais;
    }

    public String getPais() {
        return this.pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return this.notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }

    @Override
    public String saludar() {
        return super.saludar() + ", soy extranjero del pais " + this.getPais();
    }

    @Override
    public double calcularPromedio() {
        System.out.println("calcularPromedio " + AlumnoInternacional.class.getSimpleName());
        return ((super.calcularPromedio() * 3) + this.notaIdiomas) / 4;
    }

    @Override
    public String toString(){
        return super.toString() + " pais: " + this.pais + " notaIdiomas: " + this.notaIdiomas;
    }

}
