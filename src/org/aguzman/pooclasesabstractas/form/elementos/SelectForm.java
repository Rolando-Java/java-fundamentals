package org.aguzman.pooclasesabstractas.form.elementos;

import org.aguzman.pooclasesabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm {

    private List<Opcion> opciones;

    public SelectForm(String nombre){
        super(nombre);
        this.opciones = new ArrayList<>();
    }

    public SelectForm(String nombre, List<Opcion> opciones){
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml(){
        StringBuilder sb = new StringBuilder("<select ")
                .append("name=\"").append(this.getNombre()).append("\">");

        this.opciones.forEach(o -> {
            sb.append("\n\t<option value=\"").append(o.getValor()).append("\"");
            if(o.isSelected()){
                sb.append(" selected");
                this.setValor(o.getValor());
            }
            sb.append(">")
                    .append(o.getNombre())
                    .append("</option>");
        });
        sb.append("\n</select>");
        return sb.toString();
    }

}
