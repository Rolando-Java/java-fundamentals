import java.util.Arrays;
import java.util.Scanner;

public class Tema68EjemploArregloDesplazarPosicion5 {

    private static int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            int[] numerosAux = Arrays.copyOf(numeros,numeros.length);

            System.out.print("Ingrese la posicion: ");
            int pos = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese el valor: ");
            int valor = Integer.parseInt(scanner.nextLine());

            numeros = new int[numerosAux.length + 1];
            for(int i = 0; i < numeros.length; i++){
                if(i == pos) {
                    numeros[i] = valor;
                } else if(i > pos) {
                    numeros[i] = numerosAux[i - 1];
                } else {
                    numeros[i] = numerosAux[i];
                }
            }

            for (int num : numeros) {
                System.out.println("num = " + num);
            }

            System.out.print("Desea continuar ?..");
            continuar = Boolean.parseBoolean(scanner.nextLine());
        }

    }

}
