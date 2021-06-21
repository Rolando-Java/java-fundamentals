package org.aguzman.datetime.ejmeplos;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EjemploLocalDate {

    public static void main(String[] args) {

        /*
         La clase LocalDate, nos permite representar una fecha(anio, mes, dia),
         mas no el tiempo
         */

        //Obteniendo la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("fechaActual: " + fechaActual);//2021-06-20

        //Formas de instanciar un LocalDate
        fechaActual = LocalDate.of(2020, 1, 25);
        System.out.println(fechaActual);//2020-01-25

        fechaActual = LocalDate.of(2020, Month.NOVEMBER, 25);
        System.out.println(fechaActual);//2020-11-25

        fechaActual = LocalDate.parse("2020-02-01");
        System.out.println(fechaActual);//2020-02-01

        //Cambiando el mes de la fecha
        fechaActual = fechaActual.withMonth(10);
        System.out.println("fechaActual = " + fechaActual);//2020-10-01

        //Cambiando el anio de la fecha
        fechaActual = fechaActual.withYear(2022);
        System.out.println("fechaActual = " + fechaActual);//2022-10-01

        //aumentando un dia
        fechaActual= LocalDate.now().plusDays(1);
        System.out.println("fechaActual = " + fechaActual);//2021-06-21

        //restando un mes
        fechaActual = fechaActual.minusMonths(1);
        System.out.println("fechaActual = " + fechaActual);//2021-05-21

        //aumentando 1 anio
        fechaActual = fechaActual.plus(1, ChronoUnit.YEARS);
        System.out.println("fechaActual = " + fechaActual);//2022-05-21

        //Sabiendo si al anio es bisiesto
        boolean esBisiesto = LocalDate.now().isLeapYear();
        System.out.println("esBisiesto = " + esBisiesto);//false

        //Comparando fechas
        boolean esAntes = LocalDate.now().isBefore(LocalDate.parse("2021-06-19"));
        System.out.println("esAntes = " + esAntes);//false

        boolean esDespues = LocalDate.parse("2020-11-11").isAfter(LocalDate.parse("2020-11-10"));
        System.out.println("esDespues = " + esDespues);//true

        esDespues = LocalDate.now().isAfter(LocalDate.now().minus(1,ChronoUnit.DAYS));
        System.out.println("esDespues = " + esDespues);//true

        //Descompomiendo los datos de una fecha
        fechaActual = LocalDate.now();
        System.out.println("fechaActual: " + fechaActual);//2021-06-20
        System.out.println("Dia del mes: " + fechaActual.getDayOfMonth());//20
        System.out.println("Mes: " + fechaActual.getMonth());//JUNE
        System.out.println("Anio: " + fechaActual.getYear());//2021
        System.out.println("Dia del anio: " + fechaActual.getDayOfYear());//171
        System.out.println("Era: " + fechaActual.getEra());//CE

        //Obteniendo el mes en un idioma en especifico
        Month month = fechaActual.getMonth();
        System.out.println("Nombre del mes: " + month.name());//JUNE
        //TextStyle.FULL: me brinda el nombre completo
        System.out.println("Mes español: " + month
                .getDisplayName(TextStyle.FULL, new Locale("es", "ES")));//junio
        System.out.println("Dia del mes: " + month.getValue());//6
        //Obteniendo el dia de semana en un idioma en especifico
        DayOfWeek dayOfWeek = fechaActual.getDayOfWeek();
        System.out.println("Dia de semana español: " + dayOfWeek
                .getDisplayName(TextStyle.FULL, new Locale("es", "ES")));//domingo
        System.out.println("Numero del dia: " + dayOfWeek.getValue());//7

    }

}
