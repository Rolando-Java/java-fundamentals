package org.aguzman.recursividad.ejemplo;

import org.aguzman.recursividad.ejemplo.models.Componente;

import java.util.stream.Stream;

public class EjemploRecursividad {

    public static Stream<Componente> metodoRecursivo(Componente c, final int nivel) {
        c.setNivel(nivel);
        return Stream.concat(Stream.of(c) ,
                c.getHijos().stream().flatMap(comp -> EjemploRecursividad.metodoRecursivo(comp, nivel + 1)));
    }

    public static void main(String[] args) {

        Componente pc = new Componente("Gabinete PC ATX");
        Componente poder = new Componente("Fuente poder 700w");
        Componente placaMadre = new Componente("MainBoard Asus sockets AMD");
        Componente cpu = new Componente("Cpu AMD Ryzen 5 2800");
        Componente ventilador = new Componente("Ventilador CPU");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8GB");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disco SSD 2T");

        cpu.addComponente(ventilador)
                .addComponente(disipador);
        tv.addComponente(gpu)
                .addComponente(gpuRam)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);
        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);
        pc.addComponente(placaMadre)
                .addComponente(poder);

        EjemploRecursividad.metodoRecursivo(pc, 0)
                .forEach(System.out::println);


    }

}
