package org.aguzman.hilos.ejemplos.runnable;

import static org.aguzman.hilos.ejemplos.EjemploSincronizacionThread.imprimirFrases;

public class ImprimirFrases implements Runnable {

    private String fraseUno;
    private String fraseDos;

    public ImprimirFrases(String fraseUno, String fraseDos){
        this.fraseUno = fraseUno;
        this.fraseDos = fraseDos;
    }

    @Override
    public void run(){
        imprimirFrases(this.fraseUno, this.fraseDos);
    }

}
