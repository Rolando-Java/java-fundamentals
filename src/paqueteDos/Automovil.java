package paqueteDos;

import paqueteUno.Color;
import paqueteUno.TipoAutomovil;

public class Automovil {

    private int id;
    private String fabricante;
    private String modelo;
    private Color color = Color.GRIS;
    private Motor motor;
    private Estanque estanque;
    private TipoAutomovil tipo;
    private Persona conductor;
    private Rueda[] ruedas;
    private int indiceRuedas;

    private static Color colorPatente = Color.NARANJO;
    private static int capacidadEstanqueEstatico = 30;
    private static int ultimoId;

    public static final Integer VELOCIDAD_MAX_CARRETERA = 120;
    public static final int VELOCIDAD_MAX_CIUDAD = 60;

    public static final String COLOR_ROJO = "Rojo";
    public static final String COLOR_AMARILLO = "Amarillo";
    public static final String COLOR_AZUL = "Azul";
    public static final String COLOR_BLANCO = "Blanco";
    public static final String COLOR_GRIS_OSCURO = "Gris Oscuro";

    public Automovil(){
        this.id = ++ultimoId;
        this.ruedas = new Rueda[5];
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public Automovil(String fabricante, String modelo, Color color) {
        this(fabricante, modelo);
        this.color = color;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor) {
        this(fabricante, modelo, color);
        this.motor = motor;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque) {
        this(fabricante, modelo, color, motor);
        this.estanque = estanque;
    }

    public Automovil(String fabricante, String modelo, Color color, Motor motor, Estanque estanque,
                     Persona conductor) {
        this(fabricante, modelo, color, motor, estanque);
        this.conductor = conductor;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Estanque getEstanque() {
        if(this.estanque == null){
            this.estanque = new Estanque();
        }
        return this.estanque;
    }

    public void setEstanque(Estanque estanque) {
        this.estanque = estanque;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    public Persona getConductor() {
        return conductor;
    }

    public void setConductor(Persona conductor) {
        this.conductor = conductor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public Automovil addRueda(Rueda rueda){
        if(this.indiceRuedas < this.ruedas.length){
            this.ruedas[this.indiceRuedas++] = rueda;
        }
        return this;
    }

    public static Color getColorPatente(){
        return Automovil.colorPatente;
    }

    public static void setColorPatente(Color colorPatente){
        Automovil.colorPatente = colorPatente;
    }

    public static int getCapacidadEstanqueEstatico() {
        return Automovil.capacidadEstanqueEstatico;
    }

    public static void setCapacidadEstanqueEstatico(int capacidadEstanqueEstatico) {
        Automovil.capacidadEstanqueEstatico = capacidadEstanqueEstatico;
    }

    public String verDetalle(){
        String detalle =  ("auto.id = " + this.getId())
                .concat("\nauto.fabricante = " + this.getFabricante())
                .concat("\nauto.modelo = " + this.getModelo());

        if(this.getTipo() != null){
            detalle = detalle.concat("\nauto.tipo = " + this.getTipo().getDescripcion());
        }

        detalle = detalle.concat("\nauto.color = " + this.getColor())
                .concat("\nauto.patenteColor = " + Automovil.colorPatente);

        if(this.getMotor() != null) {
            detalle = detalle.concat("\nauto.cilindrada = " + this.getMotor().getCilindrada());
        }

        if(this.getConductor() != null) {
            detalle = detalle.concat("\nauto.conductor = " + this.getConductor());
        }
        if(this.getRuedas() != null){
            detalle = detalle.concat("\n del Automovil: ");
            for(Rueda rueda : this.getRuedas()){
                detalle = detalle.concat("\n" + rueda.getFabricante() + ", " + rueda.getAro() + ", " +
                        rueda.getAncho());
            }
        }

        return detalle;
    }

    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + " rpm.";
    }

    public String frenar(){
        return this.fabricante + " " + this.modelo + " frenando!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + System.lineSeparator() + frenar;
    }

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (porcentajeBencina * this.getEstanque().getCapacidad());
    }

    public float calcularConsumo(int Km, int porcentajeBencina){
        return Km / ((porcentajeBencina / 100F) * this.getEstanque().getCapacidad());
    }

    public static float calcularConsumoEstatico(int Km, int porcentajeBencina){
       return Km / ((porcentajeBencina / 100F) * Automovil.capacidadEstanqueEstatico);
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Automovil)) {
            return false;
        }
        Automovil a = (Automovil) obj;
        return this.fabricante != null && this.modelo != null &&
                this.fabricante.equalsIgnoreCase(a.fabricante) &&
                this.modelo.equalsIgnoreCase(a.modelo);
    }

    @Override
    public String toString() {
        return this.id + " " + this.fabricante + " " + this.modelo;
    }
}
