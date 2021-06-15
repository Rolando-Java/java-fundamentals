package org.aguzman.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture {

    public static void main(String... args) throws InterruptedException {

        /*
         El metodo submit() de la clase ExecutorService, devuelve un
         Future: que representa la finalización pendiente de la tarea
         */
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre el thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
        };

        Future<?> future = executor.submit(tarea);
        executor.shutdown();

        //Devuelve true, si todos los subprocesos se han cerrado
        while (!future.isDone()) {
            System.out.println("Ejecutando tarea...");
            //Espera un tiempo especifco o hasta que los subprocesos se hayan
            //cerrado.
            executor.awaitTermination(2000, TimeUnit.MILLISECONDS);
        }

        System.out.println("Finaliza la tarea: " + future.isDone());//true

        /*
         future.get() : obtiene el resultado de la tarea. Por defecto, esperará
         hast
         */
        try {
            System.out.println("Obtenemos el resultado de la tarea: " + future.get());
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            ex.printStackTrace();
        } catch (ExecutionException ex) {
            ex.printStackTrace();
        }

        System.out.println("Continuamos...");

    }

}
