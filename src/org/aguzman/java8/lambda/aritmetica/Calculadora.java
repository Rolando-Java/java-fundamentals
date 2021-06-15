package org.aguzman.java8.lambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {

    public double computar(double a, double b, Aritmetica aritmetica){
        return aritmetica.operacion(a, b);
    }

    public double computarConBiFunction(double a, double b, BiFunction<Double, Double, Double> aritmetica){
        return aritmetica.apply(a, b);
    }

}
