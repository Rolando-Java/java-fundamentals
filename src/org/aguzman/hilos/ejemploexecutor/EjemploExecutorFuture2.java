package org.aguzman.hilos.ejemploexecutor;

import java.util.concurrent.*;

public class EjemploExecutorFuture2 {

    public static void main(String... args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(2);
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executor;

        System.out.println("Tamaño del pool: " + threadPoolExecutor.getPoolSize());//0
        System.out.println("Cantidad de tareas en cola: " + threadPoolExecutor.getQueue().size());//0
        Callable<String> tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try{
                System.out.println("Nombre del Thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException ex){
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
            return "Algun resultado importante de la tarea";
        };

        Callable<Integer> tareaDos = () -> {
            try{
                System.out.println("Nombre del Thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch(InterruptedException ex){
                Thread.currentThread().interrupt();
                ex.printStackTrace();
            }
            return 10;
        };

        Future<String> resultado = executor.submit(tarea);
        Future<String> resultadoDos = executor.submit(tarea);
        Future<Integer> resultadoTres = executor.submit(tareaDos);

        System.out.println("Tamaño del pool: " + threadPoolExecutor.getPoolSize());//2
        System.out.println("Cantidad de tareas en cola: " + threadPoolExecutor.getQueue().size());//1

        executor.shutdown();

        System.out.println("Continuando con la ejecucion del metodo main");

        while(!(resultado.isDone() && resultadoDos.isDone() && resultadoTres.isDone())){
            System.out.printf("resultado1: %s, resultado2: %s, resultado3: %s",resultado.isDone() ? "finalizo" : "en proceso",
                    resultadoDos.isDone() ? "finalizo" : "en proceso", resultadoTres.isDone() ? "finalizo" : "en proceso\n");
            executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
        }

        System.out.println("Obtenemos resultado 1 de la tarea: " + resultado.get());
        System.out.println("Obtenemos resultado 2 de la tarea: " + resultadoDos.get());
        System.out.println("Obtenemos resultado 3 de la tarea: " + resultadoTres.get());

    }

}
