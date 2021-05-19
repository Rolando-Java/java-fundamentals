package org.aguzman.hilos.ejemplosync;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidor {

    public static void main(String[] args){
        final Panaderia panaderia = new Panaderia();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                panaderia.hornear("Pan n°: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        },"hiloPanadero").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                panaderia.consumir();
            }
        },"hiloConsumidor").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                panaderia.hornear("Pan n°: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                }catch(InterruptedException ex){
                    ex.printStackTrace();
                }
            }
        },"hiloPanaderoDos").start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                panaderia.consumir();
            }
        },"hiloConsumidorDos").start();

    }

}
