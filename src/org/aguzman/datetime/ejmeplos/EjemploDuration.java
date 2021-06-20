package org.aguzman.datetime.ejmeplos;

import java.time.Duration;
import java.time.LocalDateTime;

public class EjemploDuration {

    public static void main(String... args) {

        /*
         La clase Duration nos permite obtener la diferencia de tiempo
         transcurrido entre dos fechas
         */
        LocalDateTime fechaUno = LocalDateTime.now();
        LocalDateTime fechaDos = LocalDateTime.now().plusDays(2).plusHours(2).plusMinutes(5).plusSeconds(15);

        Duration lapsus = Duration.between(fechaUno, fechaDos);
        System.out.println("lapsus = " + lapsus);//PT50H5M15S
        System.out.println("segundos: " + lapsus.getSeconds());//180315
        System.out.println("minutos: " + lapsus.toMinutes());//3005
        System.out.println("horas: " + lapsus.toHours());//50
        System.out.println("dias: " + lapsus.toDays());//2


    }

}
