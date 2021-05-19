package org.aguzman.poointerfaces.modelo;

public class ClientePremium extends Cliente implements Comparable<ClientePremium> {

    public ClientePremium(String nombre, String apellido){
        super(nombre, apellido);
    }

    @Override
    public int compareTo(ClientePremium cp) {
        return this.getNombre().compareTo(cp.getNombre());
    }
}
