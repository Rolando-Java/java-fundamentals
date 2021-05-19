package org.aguzman.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int numerador, int denominador) throws DivisionPorZeroException {
        if (denominador == 0) throw new DivisionPorZeroException("no se puede dividir por cero!");
        return numerador / (double) denominador;
    }

    public double dividir(String numerador, String denominador)
            throws DivisionPorZeroException, FormatoNumeroException {
        try {
            int num = Integer.parseInt(numerador);
            int deno = Integer.parseInt(denominador);
            return this.dividir(num, deno);
        } catch (NumberFormatException ex){
            throw new FormatoNumeroException("debe ingresar un numero en el numerador y denominador");
        }
    }

}
