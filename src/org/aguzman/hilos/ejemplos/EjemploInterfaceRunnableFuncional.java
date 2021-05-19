package org.aguzman.hilos.ejemplos;

import java.util.Random;

public class EjemploInterfaceRunnableFuncional {

    public static void main(String[] args) throws InterruptedException {

        final Thread main = Thread.currentThread();

        Runnable viaje = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + Thread.currentThread().getName());
                try{
                    Thread.sleep(new Random().nextInt(1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("finalmente me voy de viaje a: " + Thread.currentThread().getName());
            System.out.println("Estado thread main: " + main.getState());
        };

        Thread hijoHijo = new Thread(viaje, "Robinson Crusoe");
        hijoHijo.start();

        Thread hijoHijoDos = new Thread(viaje, "Robinson Crusoe");
        hijoHijoDos.start();

        Thread hijoHijoTres = new Thread(viaje, "Juan Fernandez");
        hijoHijoTres.start();

        Thread hiloHijoCuatro = new Thread(viaje, "Isla de Chiloe");
        hiloHijoCuatro.start();

        //El metodo join indica que no se va a ejecutar la siguiente instruccion hasta que el hilo
        //se encuentre en estado terminado
        hijoHijo.join();
        hijoHijoDos.join();
        hijoHijoTres.join();
        hiloHijoCuatro.join();

        System.out.println("Estado thread main: " + main.getState());
        System.out.println("Continuando con la ejecucion del metodo main: " + main.getName());

    }

}
