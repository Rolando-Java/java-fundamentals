package org.aguzman.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");

        try {
            double divisionDos = calculadora.dividir(numerador, denominador);
            System.out.println("divisionDos = " + divisionDos);
        } catch(FormatoNumeroException ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace(System.err);
            main(args);
        }catch (DivisionPorZeroException ex) {
            System.err.println(ex.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional, pero se ejecuta siempre con excepción o sin!");
        }

        System.out.println("Continuamos con el flujo de nuestra aplicacion!");


    }

}
