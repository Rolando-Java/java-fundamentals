package org.aguzman.datetime.ejemplos;

import java.time.*;
import java.time.format.TextStyle;
import java.util.Locale;

public class EjemploLocalDateTime {

    public static void main(String... args) {

        /*
         La clase LocalDateTime te permite trabajar con la fecha
         y tiempo. Comparte tanto las caracterisitcas de la clase
         LocalDate y LocalTime
         */

        //Obteniendo fecha actual
        LocalDateTime fechaTiempoActual = LocalDateTime.now();
        System.out.println("fechaTiempoActual = " + fechaTiempoActual);//2021-06-20T18:38:07.091558700

        //Formas de instanciar un LocalDateTime
        fechaTiempoActual = LocalDateTime.of(2020, 5, 14, 8, 45, 35);
        System.out.println("fechaTiempoActual = " + fechaTiempoActual);

        fechaTiempoActual = LocalDateTime.of(2020, Month.MAY, 14, 8, 45, 35);
        System.out.println("fechaTiempoActual = " + fechaTiempoActual);

        fechaTiempoActual = LocalDateTime.parse("2020-05-14T08:45:35");
        System.out.println("fechaTiempoActual = " + fechaTiempoActual);

        //Cambiando el mes de la fecha
        fechaTiempoActual = fechaTiempoActual.withMonth(7);
        System.out.println("fechaTiempoActual = " + fechaTiempoActual);

        //Cambiando la hora de la fecha
        fechaTiempoActual = fechaTiempoActual.withHour(5);
        System.out.println("fechaTiempoActual = " + fechaTiempoActual);

        //Comparando fechas
        boolean esAntes = LocalDateTime.of(2020, Month.MAY, 14, 8, 45, 35)
                .isBefore(LocalDateTime.of(2020, Month.MAY, 15, 8, 45, 35));
                System.out.println("esAntes = " + esAntes);//true

        boolean esDespues = LocalDateTime.of(2020, Month.MAY, 14, 8, 45, 35)
                .isAfter(LocalDateTime.of(2020, Month.MAY, 15, 8, 45, 35));
        System.out.println("esDespues = " + esDespues);//true

        //Descomponiendo los datos de la fecha
        System.out.println("fechaTiempoActual: " + fechaTiempoActual);//2020-07-14T05:45:35
        System.out.println("Dia del mes: " + fechaTiempoActual.getDayOfMonth());//14
        System.out.println("Mes: " + fechaTiempoActual.getMonth());//JULY
        System.out.println("Anio: " + fechaTiempoActual.getYear());//2020
        System.out.println("Dia del anio: " + fechaTiempoActual.getDayOfYear());//196
        System.out.println("tiempoActual = " + fechaTiempoActual);//2020-07-14T05:45:35
        System.out.println("hora: = " + fechaTiempoActual.getHour());//5
        System.out.println("minuto = " + fechaTiempoActual.getMinute());//45
        System.out.println("segundo = " + fechaTiempoActual.getSecond());//35
        System.out.println("nano = " + fechaTiempoActual.getNano());//0

        //Obteniendo el mes en un idioma en especifico
        Month month = fechaTiempoActual.getMonth();
        System.out.println("Nombre del mes: " + month.name());//JULY
        //TextStyle.FULL: me brinda el nombre completo
        System.out.println("Mes español: " + month
                .getDisplayName(TextStyle.FULL, new Locale("es", "ES")));//julio
        System.out.println("Dia del mes: " + month.getValue());//7
        //Obteniendo el dia de semana en un idioma en especifico
        DayOfWeek dayOfWeek = fechaTiempoActual.getDayOfWeek();
        System.out.println("Dia de semana español: " + dayOfWeek
                .getDisplayName(TextStyle.FULL, new Locale("es", "ES")));//martes
        System.out.println("Numero del dia: " + dayOfWeek.getValue());//2

        //Convertir un LocalDatetime a LocalDate
        fechaTiempoActual = LocalDateTime.now();
        System.out.println("fechaTiempoActual = " + fechaTiempoActual);//2021-06-20T18:53:06.428739100

        LocalDate fechaActual = fechaTiempoActual.toLocalDate();
        System.out.println("fechaActual = " + fechaActual);//2021-06-20

        LocalTime tiempoActual = fechaTiempoActual.toLocalTime();
        System.out.println("tiempoActual = " + tiempoActual);//18:53:06.428739100

    }

}
