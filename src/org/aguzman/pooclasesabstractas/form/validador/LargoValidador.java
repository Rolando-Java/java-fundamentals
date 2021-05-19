package org.aguzman.pooclasesabstractas.form.validador;

import org.aguzman.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "el campo %s debe tener como minimo %d caracteres y maximo %d caracteres";

    private int min;
    private int max = Integer.MAX_VALUE;

    public LargoValidador() {

    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

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
        if (valor == null) return false;
        return (valor.length() >= this.min && valor.length() <= this.max);

    }

    @Override
    public String getMensajeFormateado(String campo){
        return String.format(this.getMensaje(), campo, this.getMin(), this.getMax());
    }

}
