package test;

import java.util.concurrent.atomic.AtomicInteger;

public class Program {

    private boolean band;

    public static void main(String[] args) {

        Program program = new Program();

        final AtomicInteger numero = new AtomicInteger();
        final int tan = 5;
        Thread hiloUno = new Thread(() -> {
            for (int i = 0; i < tan; i++) {
                program.incrementarDoble(numero);
            }
        },"hiloUno");
        hiloUno.start();

        Thread hiloDos = new Thread(() -> {
            for (int i = 0; i < tan; i++) {
                program.incrementarTriple(numero);
            }
        },"hiloDos");
        hiloDos.start();

    }

    public synchronized void incrementarDoble(AtomicInteger numero){
        while(this.band){
            try{
                this.wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(Thread.currentThread().getName() + " " + numero.incrementAndGet());
        }
        this.band = true;
        this.notifyAll();
    }

    public synchronized void incrementarTriple(AtomicInteger numero){
        while(!this.band){
            try{
                this.wait();
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName() + " " + numero.incrementAndGet());
        }
        this.band = false;
        this.notifyAll();
    }

}