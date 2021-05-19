import java.util.Scanner;

public class Tema20OperadorTernarioNumeroMayor {

    public static void main(String[] args) {

        int max = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int num1 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese un segundo número: ");
        int num2 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese un tercer número: ");
        int num3 = Integer.parseInt(teclado.nextLine());

        System.out.println("Ingrese un cuarto número: ");
        int num4 = Integer.parseInt(teclado.nextLine());

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mayor es = " + max);


    }

}
