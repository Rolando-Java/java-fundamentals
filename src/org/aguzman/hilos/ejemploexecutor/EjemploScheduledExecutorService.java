package org.aguzman.hilos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploScheduledExecutorService {

    public static void main(String... args){

        //Ejecuta una tarea despues de 5 segundos
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        System.out.println("Alguna tarea del main");

        executor.schedule(() -> {
            System.out.println("Hola mundo tarea...");
        }, 5, TimeUnit.SECONDS);

        executor.shutdown();

        System.out.println("Alguna otra tarea del main");

    }

}
