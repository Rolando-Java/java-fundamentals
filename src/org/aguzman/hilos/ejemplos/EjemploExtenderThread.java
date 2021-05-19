package org.aguzman.hilos.ejemplos;

import org.aguzman.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {

    public static void main(String[] args){

        Thread hiloHijo = new NombreThread("Jhon Doe");
        System.out.println(hiloHijo.getState());
        hiloHijo.start();

        Thread hiloDos = new NombreThread("Maria");
        hiloDos.start();

        Thread hiloTres = new NombreThread("Pepe");
        hiloTres.start();
        System.out.println(hiloHijo.getState());

    }

}
