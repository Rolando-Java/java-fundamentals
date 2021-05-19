package org.aguzman.appfacturas.modelo;

public class Producto {

    private int codigo;
    private String nombre;
    private float precio;
    private static int ultimoCodigo;

    public Producto(){
        this.codigo = ++Producto.ultimoCodigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString(){
        return this.codigo + "\t" + this.nombre + "\t" + this.precio;
    }

}
