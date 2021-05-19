import java.util.Scanner;

public class Tema59EjemploArreglosNumeroMayor {

    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 5 enteros");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(a[i], max);
        }

        System.out.println("max = " + max);


    }

}
