package org.aguzman.poosobrecarga;

import java.util.Arrays;

public class Calculadora {

    private Calculadora(){

    }

    public static int sumar(int a, int b){
        return a + b;
    }

    public static int sumar(int... argumentos){
        return Arrays.stream(argumentos).sum();
    }

    public static float sumar(float a, int... argumentos){
        return a + Arrays.stream(argumentos).sum();
    }

    public static double sumar(double... varargs){
        return Arrays.stream(varargs).sum();
    }

    public static long sumar(long a, long b){
        return a + b;
    }

    public static float sumar(float a, float b){
        return a + b;
    }

    public static float sumar(int i, float j){
        return i + j;
    }

    public static float sumar(float i, int j){
        return i + j;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(String a, String b){
        if(a == null || b == null){
            return 0;
        } else {
            char[] arrayCarsA = a.toCharArray();
            char[] arrayCarsB = b.toCharArray();

            for(char car : arrayCarsA){
                if(!Character.isDigit(car)){
                    return 0;
                }
            }

            for(char car : arrayCarsB){
                if(!Character.isDigit(car)){
                    return 0;
                }
            }

            return Integer.parseInt(a) + Integer.parseInt(b);
        }
    }

    public static int sumar(int a, int b, int c){
        return Calculadora.sumar(a, b) + c;
    }

}
