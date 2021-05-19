package org.aguzman.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {

    public static void main(String[] args) {

        AtomicInteger contadorAtomico = new AtomicInteger(3);
        final Timer timer = new Timer();
        System.out.println("new Date() = " + new Date());

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                int cont = contadorAtomico.getAndDecrement();
                if (cont > 0) {
                    System.out.println("Tarea " + cont + " periodica en: " + new Date() + " nombre del Thread: " +
                            Thread.currentThread().getName());
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();
                }
            }
        }, 5000, 10000);

        System.out.println("Agendamos una tarea para 5 segundos y que luego se repite cada 10 segundos ...");

    }

}
