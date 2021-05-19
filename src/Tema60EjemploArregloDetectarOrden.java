import java.util.Scanner;

public class Tema60EjemploArregloDetectarOrden {

    public static void main(String[] args) {

        int[] a = new int[7];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese 7 numeros: ");
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(scanner.nextLine());
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i] < a[i+1]){
                ascendente = true;
            } else if(a[i] > a[i+1]){
                descendente = true;
            }
        }

        if(ascendente && !descendente){
            System.out.println("Los numeros estan ordenados ascendentemente");
        } else if(!ascendente && descendente){
            System.out.println("Los numeros estan ordenados descendentemente");
        } else if(ascendente && descendente){
            System.out.println("Los numeros no estan ordenados");
        }

    }

}
