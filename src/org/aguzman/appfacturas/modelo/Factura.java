package org.aguzman.appfacturas.modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;
    private int indiceItems;

    private static int ultimoFolio;

    public static final int MAX_ITEMS = 10;

    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.fecha = new Date();
        this.items = new ItemFactura[Factura.MAX_ITEMS];
        this.folio = ++Factura.ultimoFolio;
    }

    public int getFolio() {
        return this.folio;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ItemFactura[] getItems() {
        return this.items;
    }

    public void addItemFactura(ItemFactura itemFactura) {
        if (this.indiceItems < Factura.MAX_ITEMS) {
            this.items[indiceItems++] = itemFactura;
        }
    }

    public float calcularTotal() {
        float total = 0F;
        for (int i = 0; i < this.indiceItems; i++) {
            total += this.items[i].calcularImporte();
        }
        return total;
    }

    public String generarDetalle() {
        StringBuilder sb = new StringBuilder()
                .append("Factura N: ").append(this.folio)
                .append("\nCliente: ").append(this.cliente.getNombre())
                .append("\tNIF: ").append(this.cliente.getNif())
                .append("\nDescripcion: ").append(this.descripcion)
                .append("\n");

        SimpleDateFormat sdf = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        sb.append("Fecha Emision: ").append(sdf.format(this.fecha))
                .append("\n")
                .append("\n")
                .append("#\tNombre\t$\tCant\tTotal\n");;

        for (int i = 0; i < this.indiceItems; i++) {
            sb.append(this.items[i]).
                    append("\n");
        }

        sb.append("\nGran Total: ")
                .append(this.calcularTotal());

        return sb.toString();
    }

    @Override
    public String toString(){
        return this.generarDetalle();
    }

}
