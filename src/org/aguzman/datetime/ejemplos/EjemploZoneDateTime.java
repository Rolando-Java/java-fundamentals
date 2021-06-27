package org.aguzman.datetime.ejemplos;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class EjemploZoneDateTime {

    public static void main(String... args){

        /*
         La clase ZonedDateTime no s permite establecer zonas horarias
         */

        LocalDateTime fechaLocal = LocalDateTime.parse("2021-09-23 12:45",
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));


        //instanciar el ZonedDateTime con la zona de Lima
        ZoneId lima = ZoneId.of("America/Lima");
        //Primera forma de asignar el zoneId a la zona horaria
        ZonedDateTime zonaLima = ZonedDateTime.of(fechaLocal, lima);
        //Segunda forma de asignar el zoneId a la zona horaria
        zonaLima = fechaLocal.atZone(lima);
        System.out.println("Hora de partida en Lima: " + zonaLima);

        //Simulando cambio de zona horaria a madrid
        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZonedDateTime zonaMadrid = zonaLima.withZoneSameInstant(madrid).plusHours(8);
        System.out.println("Hora de llegada en Madrid: " + zonaMadrid);

        //Formateando el resultado de los ZonedDateTime
        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm, dd MMM yyyy");
        System.out.println("Detalles del viaje a españa: ");
        System.out.println("Partida NY: " + f.format(zonaLima));
        System.out.println("Llegada a Madrid: " + f.format(zonaMadrid));

        //Listando todas las ZoneId disponibles
        ZoneId.getAvailableZoneIds().forEach(System.out::println);

    }

}
