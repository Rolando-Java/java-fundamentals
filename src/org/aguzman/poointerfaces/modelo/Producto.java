package org.aguzman.poointerfaces.modelo;

public class Producto extends BaseEntity {

    private String descripcion;
    private double precio;

    public Producto(String descripcion, double precio){
        super();
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    @Override
    public boolean equals(Object object){ return super.equals(object); }

    @Override
    public int hashCode(){ return super.hashCode(); }

    @Override
    public String toString(){
        return super.toString() + " Descripcion: " + this.getDescripcion() + " Precio: " + this.getPrecio();
    }

}
