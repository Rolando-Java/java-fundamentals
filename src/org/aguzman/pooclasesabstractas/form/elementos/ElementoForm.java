package org.aguzman.pooclasesabstractas.form.elementos;

import org.aguzman.pooclasesabstractas.form.validador.LargoValidador;
import org.aguzman.pooclasesabstractas.form.validador.Validador;
import org.aguzman.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementoForm {

    private String valor;
    private String nombre;
    private List<Validador> validadores;
    private List<String> errores;

    protected ElementoForm(){
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    protected ElementoForm(String nombre){
        this();
        this.nombre = nombre;
    }

    public String getValor(){
        return this.valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<String> getErrores(){
        return this.errores;
    }

    public ElementoForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public boolean esValido(){
        this.validadores.forEach(v -> {
            if(!v.esValido(this.getValor())){
                if(v instanceof MensajeFormateable) this.errores.add(((MensajeFormateable) v)
                                                    .getMensajeFormateado(this.getNombre()));
            }
        });
        return this.errores.isEmpty();
    }

    public abstract String dibujarHtml();

}
