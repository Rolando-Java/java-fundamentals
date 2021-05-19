package org.aguzman.pooclasesabstractas.form.validador;

import org.aguzman.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

public class EmailValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "el campo %s tiene un formato de correo invalido";

    private static final String EMAIL_REGEX = "^.+@.+$";

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
        if(valor == null) return false;
        return valor.matches(EmailValidador.EMAIL_REGEX);
    }

    @Override
    public String getMensajeFormateado(String campo){
        return String.format(this.getMensaje(), campo);
    }

}
