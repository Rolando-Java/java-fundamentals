package org.aguzman.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {

    public static void main(String... args) {

        /*
         La clase periodo nos muestra la diferencias en dias, meses y años,
         pero como si fuera entre dos numeros nomas. Es decir, como restar el dia
         de la fecha uno con la fecha dos, mas no cuentas todos los dias
         y meses que tendria que pasar hasta la siguiente fecha.
         */
        LocalDate fechaUno = LocalDate.of(2011, 9, 23);
        LocalDate fechaDos = LocalDate.of(2020, 11, 25);

        Period periodo = Period.between(fechaUno, fechaDos);
        System.out.println("periodo = " + periodo);//P9Y2M2D
        System.out.println("dias: " + periodo.getDays());//2
        System.out.println("meses: " + periodo.getMonths());//2
        System.out.println("anios: " + periodo.getYears());//9
        System.out.println("segundos: " + periodo.toTotalMonths());//110
        System.out.printf("periodo: %s anios %s meses %s dias",
                periodo.getYears(), periodo.getMonths(),
                periodo.getDays());//9 anios 2 meses 2 dias

    }

}
