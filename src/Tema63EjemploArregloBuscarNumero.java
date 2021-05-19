import java.util.Scanner;

public class Tema63EjemploArregloBuscarNumero {

    public static void main(String[] args){

        int[] numeros = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar 5 numeros: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Igrese un numero a buscar");
        int numBuscar = Integer.parseInt(scanner.nextLine());
        boolean encontrado = false;
        for (int num : numeros){
            if(numBuscar == num){
                encontrado = true;
                break;
            }
        };

        if(encontrado) System.out.println("Numero encontrado!");
        else System.out.println("Numero no encontrado");

    }

}
