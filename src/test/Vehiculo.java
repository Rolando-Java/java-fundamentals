package test;

public class Vehiculo {

    private String matricula;
    private double velocidad;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public void acelerar(int cantVelocidad) throws DemasiadoRapidoException {
        this.velocidad += cantVelocidad;
    }

    @Override
    public String toString() {
        return "Matricula: " + this.matricula + " Velocidad: " + this.velocidad;
    }

}
