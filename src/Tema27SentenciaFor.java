public class Tema27SentenciaFor {

    public static void main(String[] args) {

        /*
        Al igual que el of, tambien en el for se
        puede omitir las llaves en caso solo
        se haga referencia a una unica instruccion
        for (int i = 1; i < 5; i++) System.out.println("i = " + i);
         */

        int i = 0;
        for (; ; ) {
            if (i > 5) {
                break;//termina con la ejecucion del bucle que lo contiene
            }
            System.out.println("i = " + i);
            i++;
        }

        for (int j = 0; j < 5; j++) {
            System.out.println("j = " + j);
        }

        for (int j = 10; j >= 0; j--) {
            System.out.println("j = " + j);
        }

        for(int j = 0, k = 11;j < k;j++, k--){
            System.out.println("j = " + j);
            System.out.println("k = " + k);
        }

    }

}
