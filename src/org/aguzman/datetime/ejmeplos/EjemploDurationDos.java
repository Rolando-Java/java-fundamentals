package org.aguzman.datetime.ejmeplos;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class EjemploDurationDos {

    public static void main(String... args) throws InterruptedException {

        Instant instant = Instant.now();

        TimeUnit.SECONDS.sleep(5);

        Instant instantDos = Instant.now();

        Duration lapsus = Duration.between(instant, instantDos);
        System.out.println("lapsus.getSeconds() = " + lapsus.getSeconds());

    }

}
