package org.aguzman.hilos.ejemplos.threads;

public class NombreThread extends Thread {

    public NombreThread(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        System.out.println("se inicia el metodo run de hilo " + this.getName());
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.getName());
        }
        System.out.println("finaliza el hilo " + this.getName());
    }

}
