import java.util.Scanner;

public class Tema61EjemploArreglosParesImpares {

    public static void main(String[] args){

        int[] a, pares, impares;
        a = new int[10];

        Scanner scanner = new Scanner(System.in);
        int cantPares = 0, cantImpares = 0, auxPar = 0, auxImpar = 0;

        System.out.println("Ingrese 10 numeros");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.nextLine());
            if(a[i] % 2 == 0){
                cantPares++;
            } else {
                cantImpares++;
            }
        }

        pares = new int[cantPares];
        impares = new int[cantImpares];

        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                pares[auxPar++] = a[i];
            } else {
                impares[auxImpar++] = a[i];
            }
        }

        System.out.println("Listando numeros pares");
        for (int par : pares) {
            System.out.println("par = " + par);
        }

        System.out.println("Listando numeros impares");
        for (int impar : impares) {
            System.out.println("impar = " + impar);
        }

    }

}
