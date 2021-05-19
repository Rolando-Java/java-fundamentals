import java.util.Scanner;

public class Tema65EjemploArregloDesplazarPosicion2 {

    private static int[] numeros = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            int[] numerosAux = numeros.clone();

            System.out.print("Ingrese la posicion: ");
            int pos = Integer.parseInt(scanner.nextLine());
            System.out.print("Ingrese el valor: ");
            int valor = Integer.parseInt(scanner.nextLine());
            numeros[pos] = valor;

            for (int i = pos; i < numeros.length - 1; i++) {
                numeros[i + 1] = numerosAux[i];
            }

            for(int num : numeros){
                System.out.println("num = " + num);
            }

            System.out.print("Desea continuar ?..");
            continuar = Boolean.parseBoolean(scanner.nextLine());
        }

    }

}
