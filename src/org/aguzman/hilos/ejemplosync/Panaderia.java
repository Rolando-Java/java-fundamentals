package org.aguzman.hilos.ejemplosync;

public class Panaderia {

    private String pan;
    private boolean disponible;

    public synchronized void hornear(String masa){
        while(disponible){
            try{
                this.wait();
            } catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
        this.pan = masa;
        System.out.println("Panadero " + Thread.currentThread().getName() + " hornea: " + this.pan);
        this.disponible = true;
        this.notifyAll();
    }

    public synchronized String consumir(){
        while(!disponible){
            try{
                this.wait();
            } catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
        System.out.println("Cliente " + Thread.currentThread().getName() + " consume: " + this.pan);
        this.disponible = false;
        this.notifyAll();
        return this.pan;
    }
}
