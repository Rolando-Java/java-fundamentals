package org.aguzman.api.stream.ejemplos.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {

    private String nombre;
    private String apellido;
    private Integer id;
    private static int ultimoId;

    private List<Factura> facturas;

    public Usuario(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = ++Usuario.ultimoId;
        this.facturas = new ArrayList<>();
    }

    public void addFactura(Factura factura) {
        factura.setUsuario(this);
        this.facturas.add(factura);
    }

    public List<Factura> getFacturas() {
        return this.facturas;
    }

    public Integer getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public boolean equals(Object object) {
        if(this == object) return true;
        if(object == null || !(object instanceof Usuario)) return false;
        Usuario usuario = (Usuario) object;
        return Objects.equals(this.nombre,usuario.nombre) && Objects.equals(this.apellido, usuario.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nombre, this.apellido);
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido;
    }

}
