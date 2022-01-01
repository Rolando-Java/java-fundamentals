package test;

public class RecursividadDos {

    private int obtenerFactorial(int num) {
        int producto;
        if(num == 1) {
            producto = num;
        } else {
            producto = num * obtenerFactorial(num - 1);
        }
        return producto;
    }

    public static void main(String... args) {
        //Factorial de un numero
        RecursividadDos recursividadObj = new RecursividadDos();
        int factorial = recursividadObj.obtenerFactorial(5);
        System.out.println("factorial = " + factorial);

    }

}
