public class Tema74DiagonalPrincipal {

    public static void main(String[] args){

        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j || (i == 0 || i == matriz.length - 1) ||
                        (j == 0 || j == matriz[i].length - 1)){
                    matriz[i][j] = 1;
                }
            }
        }

        for (int[] arregloUno : matriz) {
            for (int num : arregloUno) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }

    }

}
