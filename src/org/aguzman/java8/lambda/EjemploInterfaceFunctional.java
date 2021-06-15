package org.aguzman.java8.lambda;

import org.aguzman.java8.lambda.aritmetica.Aritmetica;
import org.aguzman.java8.lambda.aritmetica.Calculadora;

import java.util.function.BiFunction;

public class EjemploInterfaceFunctional {

    public static void main(String... args){

        Calculadora calculadora = new Calculadora();

        Aritmetica suma = Double::sum;
        Aritmetica resta = (a, b) -> a - b;

        System.out.println("Suma: " + calculadora.computar(10, 5, suma));
        System.out.println("Resta: " + calculadora.computar(10, 5, resta));
        System.out.println("Multiplicar: " + calculadora.computar(10, 5, (a, b) -> a * b));

        System.out.println("Dividir: " + calculadora.computarConBiFunction(10, 5, (a, b) -> 10 / 5.0));

    }

}
