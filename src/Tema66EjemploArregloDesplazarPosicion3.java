import java.util.Scanner;

public class Tema66EjemploArregloDesplazarPosicion3 {

    private static int[] numeros = new int[]{15, 17, 19, 23, 25, 27, 0};

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el valor: ");
            int valor = Integer.parseInt(scanner.nextLine());

            int pos = -1, tan = numeros.length;
            int numMaximoCercano = Integer.MAX_VALUE;
            for (int i = 0; i < tan; i++) {
                if(valor < numeros[i]){
                    numMaximoCercano = Math.min(numeros[i],numMaximoCercano);
                }
            }

            for (int i = 0; i < tan; i++) {
                if(numeros[i] == numMaximoCercano){
                    pos = i;
                    break;
                }
            }

            if(pos == -1){
                pos = tan - 1;
            }

            System.out.println("numMaximoCercano = " + numMaximoCercano);
            System.out.println("pos = " + pos);

            int[] numerosAux = numeros.clone();
            numeros[pos]=valor;

            for (int i = pos; i < tan - 1; i++) {
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
