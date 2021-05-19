package org.aguzman.hilos.ejemplos.runnable;

import java.util.Random;

public class ViajeTarea implements Runnable {

    private String nombre;

    public ViajeTarea(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " - " + this.getNombre());
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("finalmente me voy de viaje a: " + this.getNombre());
    }

    @Override
    public String toString(){
        return this.nombre;
    }

}
