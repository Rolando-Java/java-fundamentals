package test;

public class RecursividadSiete {

    private int invertirNumero(int num, int cantCeros) {
       if(num < 10) {
           return num;
       } else {
           return ((num % 10) * (int) Math.pow(10, cantCeros)) +
                   invertirNumero(num / 10, cantCeros - 1);
       }
    }

    public static void main(String[] args) {
        //Invertir un numero de forma recursiva (no usar String)
        RecursividadSiete recursividadSieteObj = new RecursividadSiete();
        int numInvertido = recursividadSieteObj.invertirNumero(4563, 3);
        System.out.println(numInvertido);
    }

}
