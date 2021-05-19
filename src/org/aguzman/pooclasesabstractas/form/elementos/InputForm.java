package org.aguzman.pooclasesabstractas.form.elementos;

public class InputForm extends ElementoForm {

    private String tipo = "texto";

    public InputForm(String nombre){
        super(nombre);
    }

    public InputForm(String nombre, String tipo){
        this(nombre);
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public String dibujarHtml() {
        return "<input type=\"" + this.getTipo() +  "\" name=\"" + this.getNombre()
                + "\" value=\"" + this.getValor() + "\"/>";
    }

}
