package test;

public class RecursividadDiez {

    private int sumarDigitos(int num) {
        if(num < 10) return num;
        else return (num % 10) + sumarDigitos(num / 10);
    }

    public static void main(String[] args) {
        //Suma los digitos de un numero de forma recursiva
        RecursividadDiez recursividadDiezObj = new RecursividadDiez();
        int sumaDigitos = recursividadDiezObj.sumarDigitos(1236);
        System.out.println(sumaDigitos);
    }

}
