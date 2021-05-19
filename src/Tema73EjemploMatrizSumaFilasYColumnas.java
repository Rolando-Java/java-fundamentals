public class Tema73EjemploMatrizSumaFilasYColumnas {

    public static void main(String[] args){

        int[][] matrizUno = new int[][]{
                {20, 45, 65},
                {40, 56, 35}
        };

        int sumaFila = 0;
        int sumaColumna = 0;
        for (int i = 0; i < matrizUno.length; i++) {
            sumaFila = 0;
            for (int j = 0; j < matrizUno[i].length; j++) {
                sumaFila += matrizUno[i][j];
            }
            System.out.println("suma de la fila " + i + " es: " + sumaFila);
        }

        int[][] matrizDos = new int[matrizUno[0].length][matrizUno.length];

        for (int i = 0; i < matrizDos.length; i++) {
            sumaColumna = 0;
            for (int j = 0; j < matrizDos[i].length; j++) {
                matrizDos[i][j] = matrizUno[j][i];
                sumaColumna += matrizDos[i][j];
            }
            System.out.println("suma de columna " + i + " es: " + sumaColumna);
        }




    }

}
