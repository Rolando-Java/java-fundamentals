import java.util.Scanner;

public class Tema69EjemploMatrices {

    public static void main(String[] args){

        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5}
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero a buscar: ");
        int valor = Integer.parseInt(scanner.nextLine());

        BUCLE_MAYOR:
        for (int[] arregloDos : matrizDeEnteros) {
            for (int num : arregloDos) {
                if(num == valor){
                    System.out.println("Elemento " + num + " econtrado");
                    break BUCLE_MAYOR;
                }
            }
        }


    }

}
