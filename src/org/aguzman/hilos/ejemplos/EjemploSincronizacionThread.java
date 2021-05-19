package org.aguzman.hilos.ejemplos;

import org.aguzman.hilos.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {

    public static void main(String[] args) throws InterruptedException {

        Thread hiloHijoUno = new Thread(new ImprimirFrases("Hola ","que tal!"));
        hiloHijoUno.start();

        Thread hiloHijoDos = new Thread(new ImprimirFrases("Quien eres ", "tu?"));
        hiloHijoDos.start();

        Thread hiloHijoTres = new Thread(new ImprimirFrases("Muchas ", "gracias amigo!"));
        hiloHijoTres.start();
        Thread.sleep(100);

        System.out.println(hiloHijoTres.getState());

    }

    public synchronized static void imprimirFrases(String fraseUno, String fraseDos){
        System.out.print(fraseUno);
        try {
            Thread.sleep(500);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println(fraseDos);
    }

}
