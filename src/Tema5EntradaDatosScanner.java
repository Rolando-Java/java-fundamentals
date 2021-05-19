import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema5EntradaDatosScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");

        int numeroDecimal = 0;

        try {
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error debe ingresar un numero entero!");
            main(args);
            System.exit(0);
        }

        String resultadoBinario = "El numero en binario es: " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "El numero en octal es: " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "El numero en hexadecimal es: " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario + System.lineSeparator()
                + resultadoOctal + System.lineSeparator()
                + resultadoHexadecimal + System.lineSeparator();
        System.out.println(mensaje);

    }

}
