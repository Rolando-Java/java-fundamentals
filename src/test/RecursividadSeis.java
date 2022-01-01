package test;

public class RecursividadSeis {

    private int obtenerValorPosicion(int pos) {
        if(pos == 0 || pos == 1) return pos;
        else return obtenerValorPosicion(pos - 1) + obtenerValorPosicion(pos - 2);
    }

    public static void main(String[] args) {
        //Calcular el valor de la posicion fibonacci usando recursividad
        RecursividadSeis recursividadSeisObj = new RecursividadSeis();
        int valor = recursividadSeisObj.obtenerValorPosicion(10);
        System.out.println(valor);

    }

}
