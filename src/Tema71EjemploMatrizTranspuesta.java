public class Tema71EjemploMatrizTranspuesta {

    public static void main(String[] args){

        int[][] matriz = new int[][]{
                {11, 45, 67},
                {36, 42, 12},
                {16, 89, 76}
        };

        int[][] matrizTranspuesta = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[i][j]=matriz[j][i];
            }
        }

        for(int[] arregloInt : matrizTranspuesta){
            for(int num : arregloInt){
                System.out.print(num + " ");
            }
            System.out.println("");
        }

    }

}
