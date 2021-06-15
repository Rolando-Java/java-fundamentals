package org.aguzman.hilos.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class EjemploExecutor {

    public static void main(String... args) throws InterruptedException {

        //Se instancia un solo hilo
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                //Realiza un Thread.sleep utilizando esta unidad de tiempo
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException ex) {
                //Es opcional interrumpir el hilo actual
                //, pero asegura que este hilo se libere
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
            System.out.println("Finaliza la tarea...");
        };

        //Se asigna la tarea a ejecutar
        executor.submit(tarea);
        //Inicia un cierre ordenador de las subprocesos, a medida
        //que se van completando las tareas. Sin embargo, no espera
        //a que se cierre, para ejcutar las siguientes instruciones de codigo.
        //Para ello, mejor usar awaitTermination
        executor.shutdown();

        //Devuelve true, si todos los subprocesos se han cerrado.
        while(!executor.isTerminated()){
            //Espera un tiempo especifco o hasta que los subprocesos se hayan
            //cerrado.
            executor.awaitTermination(2000, TimeUnit.MILLISECONDS);
        }
        System.out.println("Termino con la ejecucion del main");

    }

}
