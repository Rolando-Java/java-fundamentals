package org.aguzman.datetime.ejemplos;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class EjemploLocalTime {

    public static void main(String... args) {

        /*
         La clase LocalTime trabaja con una hora de presicion
         em nanosegundos, mas no con fechas
         */

        //Obteniendo el tiempo actual
        LocalTime tiempoActual = LocalTime.now();
        System.out.println("tiempoActual = " + tiempoActual);//18:25:22.862946100

        //Formas de instanciar un LocalTime
        tiempoActual = LocalTime.of(6, 30,  15);
        System.out.println("tiempoActual = " + tiempoActual);//06:30:15

        tiempoActual = LocalTime.parse("06:30:15");
        System.out.println("tiempoActual = " + tiempoActual);//06:30:15

        //Cambiando la hora del tiempo
        tiempoActual = tiempoActual.withHour(2);
        System.out.println("tiempoActual = " + tiempoActual);//02:30:15

        //Cambiando el minuto del tiempo
        tiempoActual = tiempoActual.withMinute(10);
        System.out.println("tiempoActual = " + tiempoActual);//02:10:15

        //aumentando un minutos
        tiempoActual = tiempoActual.plusMinutes(1);
        System.out.println("tiempoActual = " + tiempoActual);//02:11:15

        //aumentando una hora
        tiempoActual = tiempoActual.plusHours(1);
        System.out.println("tiempoActual = " + tiempoActual);//03:11:15

        //disminuyendo un segundo
        tiempoActual = tiempoActual.minus(1, ChronoUnit.SECONDS);
        System.out.println("tiempoActual = " + tiempoActual);//03:11:14

        //Comparando fechas
        boolean esAnterior = LocalTime
                .of(7,29, 59).isBefore(LocalTime.parse("07:30"));
        System.out.println("esAnterior: " + esAnterior);//true

        boolean esDespues = LocalTime
                .of(9,45).isAfter(LocalTime.of(8,30));
        System.out.println("esDespues = " + esDespues);//true

        //Descomponiendo los datos del tiempo
        System.out.println("tiempoActual = " + tiempoActual);//03:11:14
        System.out.println("hora: = " + tiempoActual.getHour());//3
        System.out.println("minuto = " + tiempoActual.getMinute());//11
        System.out.println("segundo = " + tiempoActual.getSecond());//14
        System.out.println("nano = " + tiempoActual.getNano());//0

        //Tiempo maximo
        LocalTime max = LocalTime.MAX;
        System.out.println("max = " + max);//23:59:59.999999999

        //Tiempo minimo
        LocalTime min = LocalTime.MIN;
        System.out.println("min = " + min);//00:00

    }

}
