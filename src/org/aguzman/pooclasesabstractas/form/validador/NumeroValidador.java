package org.aguzman.pooclasesabstractas.form.validador;

import org.aguzman.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.Arrays;

public class NumeroValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "el campo %s debe ser un numero";

    @Override
    public String getMensaje() {
        return this.mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try{
            Integer.parseInt(valor);
            return true;
        }catch(NumberFormatException ex){
            return false;
        }
    }

    @Override
    public String getMensajeFormateado(String campo){
        return String.format(this.getMensaje(), campo);
    }

}
