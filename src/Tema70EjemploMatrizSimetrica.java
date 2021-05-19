public class Tema70EjemploMatrizSimetrica {

    public static void main(String[] args){

        int[][] numeros = new int[][]{
                {0, 1, -1},
                {1, 4, 2},
                {-1, 2, 1}
        };

        boolean esSimetrico = true;
        UNO:
        for (int i = 0; i < numeros.length; i++) {
            DOS:
            for (int j = 0; j < numeros[i].length; j++) {
                if(numeros[i][j] != numeros[j][i]){
                    esSimetrico = false;
                    break UNO;
                }
            }
        }

        if(esSimetrico) System.out.println("La matriz es simetrica");
        else System.out.println("La matriz no es simetrica");

    }

}
