import java.util.Scanner;

public class Tema67EjemploArregloDesplazarPosicion4 {

    public static int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Ingrese el numero a eliminar");
            int num = Integer.parseInt(scanner.nextLine());
            int pos = 0, tan = numeros.length;

            for (int i = 0; i < tan; i++) {
                if (numeros[i] == num) {
                    pos = i;
                    break;
                }
            }

            int[] numerosAux = new int[numeros.length - 1];
            for (int i = 0; i < tan - 1; i++) {
                if (i >= pos) {
                    numerosAux[i] = numeros[i + 1];
                } else {
                    numerosAux[i] = numeros[i];
                }
            }

            numeros = numerosAux;

            for (int n : numeros) {
                System.out.println("n = " + n);
            }

            System.out.print("Desea continuar ?..");
            continuar = Boolean.parseBoolean(scanner.nextLine());
        }


    }

}
