public class Tema13OperadoresUnarios {

    public static void main(String[] args) {
        /*
        Los operadores unarios hay dos : el + y el -
        Estos operadores operan con el signo de un valor numerico. Segun la tabla de multiplicacion de signos.
        Tabla de multiplicacion de signos
         - ( - ) = +
         + ( + ) = +
         - ( + ) = -
         + ( - ) = -
        */
        int i = -5;
        int j = +i;//(+1)*-5
        System.out.println("j = " + j);//-5

        int k = -i;//(-1)*-5
        System.out.println("k = " + k);//+5

        i = 6;
        j = +i;//(+1)*+6
        System.out.println("j = " + j);//+6

        k = -i;//(-1)*+6
        System.out.println("k = " + k);//-6

    }

}
