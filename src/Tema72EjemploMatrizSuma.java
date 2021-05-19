public class Tema72EjemploMatrizSuma {

    public static void main(String[] args){

        int[][] matrizUno = new int[][]{
            {21, 35, 40},
            {24, 36, 47}
        };

        int[][] matrizDos = new int[][]{
                {34, 60, 40},
                {45, 20, 48}
        };

        int[][] matrizTres = new int[2][3];

        for (int i = 0; i < matrizUno.length; i++) {
            for (int j = 0; j < matrizUno[i].length; j++) {
                matrizTres[i][j] = matrizUno[i][j] + matrizDos[i][j];
            }
        }

        for (int[] arregloUno : matrizTres) {
            for (int num : arregloUno) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

}
