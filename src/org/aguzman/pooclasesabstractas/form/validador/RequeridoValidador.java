package org.aguzman.pooclasesabstractas.form.validador;

import org.aguzman.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

public class RequeridoValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "el campo %s es requerido";

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
        return (valor != null && !valor.isEmpty());
    }

    @Override
    public String getMensajeFormateado(String campo){
        return String.format(this.getMensaje(), campo);
    }

}
