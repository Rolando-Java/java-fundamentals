package test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Profesor {

    private String nombre;
    private String curso;
    private CountDownLatch latch;

    public Profesor(String nombre, String curso) {
        this.nombre = nombre;
        this.curso = curso;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void run() {
        try{
            System.out.println("Inicio de la clase de " + this.curso + " con el profesor " + this.nombre);
            TimeUnit.SECONDS.sleep(ThreadLocalRandom.current().nextInt(1, 4));
            System.out.println("Fin de la clase de " + this.curso + " con el profesor " + this.nombre);
            this.latch.countDown();
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
            ex.printStackTrace();
        }
    }

}
