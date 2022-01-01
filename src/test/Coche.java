package test;

public class Coche extends Vehiculo {

    private int cantPuertas;

    public Coche(String matricula, int cantPuertas) {
        super(matricula);
        this.cantPuertas = cantPuertas;
    }

    public int getCantPuertas() {
        return this.cantPuertas;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
