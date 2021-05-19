package org.aguzman.hilos.ejemplosync.runnnable;

import org.aguzman.hilos.ejemplosync.Panaderia;
import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable {

    private Panaderia panaderia;

    public Panadero(Panaderia panaderia){
        this.panaderia = panaderia;
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            this.panaderia.hornear("Pan n°: " + i);
            //Mejor forma de obtener aleatorio, cuando se trate
            //de multiprocesos
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            }catch(InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }

}
