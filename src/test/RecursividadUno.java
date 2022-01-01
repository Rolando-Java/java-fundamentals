package test;

public class RecursividadUno {

    private int sumaRecuriva(int num) {
        int suma;
        if(num == 1) {
            suma = num;
        } else {
            suma = num + sumaRecuriva(num - 1);
        }
        return suma;
    }

    public static void main(String... args) {
        //Sumar los numeros naturales hasta N (se lo damos nosotros) de forma recursiva.
        RecursividadUno recursividadObj = new RecursividadUno();
        int resultado = recursividadObj.sumaRecuriva(5);
        System.out.println("Resultado: " + resultado);
    }

}
