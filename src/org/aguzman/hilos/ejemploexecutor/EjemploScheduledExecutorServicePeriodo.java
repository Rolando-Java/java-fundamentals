package org.aguzman.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploScheduledExecutorServicePeriodo {

    public static void main(String... args) throws InterruptedException {
        /*
         ejecuta una tarea despues de 1 segundo y de ahi cada 2 segundos, hasta
         que es CountDownLatch llegue a cero, y cancelar la tarea mediante el future,
         porque sino correra indefinidamente
         */
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        System.out.println("Alguna tarea del main");

        CountDownLatch lock = new CountDownLatch(5);
        Future<?> future = executor.scheduleWithFixedDelay(() -> {
            System.out.println("Hola mundo tarea...");
            try{
                TimeUnit.MILLISECONDS.sleep(1000);
                lock.countDown();
            } catch(InterruptedException ex){
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
        }, 1, 2, TimeUnit.SECONDS);

        lock.await();
        future.cancel(true);
        System.out.println(future.isDone() + " " + future.isCancelled());
        System.out.println(executor.isTerminated());
        executor.shutdown();
        System.out.println(future.isDone() + " " + future.isCancelled());
        System.out.println(executor.isTerminated());

        System.out.println("Alguna otra tarea del main");
    }
}
