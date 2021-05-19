import java.util.Scanner;

public class Tema64EjemploArregloDesplazarPosicion {

    private static int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            int[] numerosAux = numeros.clone();
            int pos = 0, tan = numeros.length;
            for (int i = 0; i < tan; i++) {
                pos = (i - 1 < 0) ? tan : i;
                numeros[i] = numerosAux[pos - 1];
            }

            for (int num : numeros) {
                System.out.println("num = " + num);
            }

            System.out.println("Volver a invertir? ");
            continuar = Boolean.parseBoolean(scanner.nextLine());
        }

    }

}
