package org.aguzman.poointerfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible {

    private Persona persona;
    private String revisor;

    public Informe(Persona persona, String revisor, String contenido){
        super(contenido);
        this.persona = persona;
        this.revisor = revisor;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setAutor(Persona persona) {
        this.persona = persona;
    }

    public String getRevisor() {
        return revisor;
    }

    public void setRevisor(String revisor) {
        this.revisor = revisor;
    }

    @Override
    public String imprimir(){
        return "Informe escrito por: ".concat(String.valueOf(this.getPersona()))
                .concat(" Revisado por: ").concat(this.getRevisor())
                .concat("\n").concat(this.getContenido());
    }



}
