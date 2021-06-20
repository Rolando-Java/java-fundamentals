package org.aguzman.datetime.ejmeplos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class EjemploDateTimeFormatter {

    public static void main(String... args) throws ParseException {

        /*
         La clase DateTimeFormatter permite darle un formato
         a la fecha
         */

        LocalDateTime fechaActual = LocalDateTime.now();
        System.out.println("fechaActual = " + fechaActual);//2021-06-20T15:28:22.570188100

        //Convertir de fecha a String
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String fechaActualString = df.format(fechaActual);
        System.out.println("fechaActualString = " + fechaActualString);//2021-06-20 15:28:22

        //Convertir de String a fecha
        String fechaString = "15-01-2020";
        df = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate localDate = LocalDate.parse(fechaString, df);
        System.out.println("localDate = " + localDate);//2020-01-15

        //Formatos establecidos
        df = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        String fechaStringFormatEstabl = df.format(LocalDateTime.now());
        System.out.println("fechaStringFormatEstabl = " + fechaStringFormatEstabl);//2021-06-20T15:53:26.2815871

    }

}
