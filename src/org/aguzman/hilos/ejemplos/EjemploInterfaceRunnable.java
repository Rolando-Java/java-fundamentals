package org.aguzman.hilos.ejemplos;

import org.aguzman.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploInterfaceRunnable {

    public static void main(String[] args){
        Runnable runnable = new ViajeTarea("Isla de Pascua");
        Thread hijoHijo = new Thread(runnable);
        hijoHijo.start();

        runnable = new ViajeTarea("Robinson Crusoe");
        Thread hijoHijoDos = new Thread(runnable);
        hijoHijoDos.start();

        runnable = new ViajeTarea("Juan Fernandez");
        Thread hijoHijoTres = new Thread(runnable);
        hijoHijoTres.start();

        runnable = new ViajeTarea("Isla de Chiloe");
        Thread hiloHijoCuatro = new Thread(runnable);
        hiloHijoCuatro.start();

    }

}
