package test;

public class RecursividadCinco {

    private void mostrarMatrizRecursiva(int[][] matriz, int fila, int col) {

        if(fila < matriz.length) {
            if(col < matriz[fila].length) {
                System.out.print(matriz[fila][col] + " ");
                col++;
            } else {
                System.out.println("");
                fila++;
                col = 0;
            }
            mostrarMatrizRecursiva(matriz, fila, col);
        }

    }

    public static void main(String... args) {
        //Recorrer una matriz de forma recursiva
        RecursividadCinco recursividadCincoObj = new RecursividadCinco();
        int[][] matrizNumeros = new int[3][];
        matrizNumeros[0] = new int[]{1, 2, 3, 6};
        matrizNumeros[1] = new int[]{4, 5, 6};
        matrizNumeros[2] = new int[]{7, 8, 9, 10, 12};

        recursividadCincoObj.mostrarMatrizRecursiva(matrizNumeros, 0, 0);

    }

}
