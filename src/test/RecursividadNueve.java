package test;

public class RecursividadNueve {

    private double calcularPotencia(double base, int exponente) {
        if(exponente > 0) {
            if(exponente == 1) return base;
            else return base * calcularPotencia(base, exponente - 1);
        } else if(exponente < 0) {
            if(exponente == -1) return 1/base;
            else return 1/base * calcularPotencia(base, exponente + 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        //Calcula la potenica de un numero de forma recursiva, tanto para
        //exponentes negativos como positivos.
        RecursividadNueve recursividadNueveObj = new RecursividadNueve();
        double resultado = recursividadNueveObj.calcularPotencia(3, 0);
        System.out.println(resultado);

    }

}
