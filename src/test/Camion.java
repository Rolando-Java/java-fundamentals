package test;

public class Camion extends Vehiculo {

    private Remolque remolque;

    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    public void quitaRemolque() {
        this.remolque = null;
    }

    @Override
    public void acelerar(int cantVelocidad) throws DemasiadoRapidoException {
        if(this.remolque != null && (this.getVelocidad() + cantVelocidad) > 100)
            throw new DemasiadoRapidoException("El camion va demasiado rapido para la carga que tiene");
       super.acelerar(cantVelocidad);
    }

    @Override
    public String toString() {
        return super.toString() + ((this.remolque != null) ? " " + this.remolque.toString() : "");
    }

}
