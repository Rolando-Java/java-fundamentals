package paqueteDos;

public class Motor {

    private double cilindrada;
    private TipoMotor tipoMotor;

    public Motor(){

    }

    public Motor(double cilindrada, TipoMotor tipoMotor){
        this.cilindrada = cilindrada;
        tipoMotor = tipoMotor;
    }

    public double getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public TipoMotor getTipoMotor() {
        return this.tipoMotor;
    }

    public void setTipoMotor(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
}
