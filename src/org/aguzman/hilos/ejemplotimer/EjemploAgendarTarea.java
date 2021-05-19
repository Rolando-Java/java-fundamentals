package org.aguzman.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTarea {

    public static void main(String[] args){

        final Timer timer = new Timer();
        System.out.println("new Date() = " + new Date());
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en: " + new Date() + " nombre del Thread: " +
                        Thread.currentThread().getName());
                System.out.println("Finaliza el tiempo");
                timer.cancel();
            }
        }, 5000);

        System.out.println("Agendamos una tarea para 5 segundos mas ...");

    }

}
