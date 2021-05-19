public class Tema38PasarPorValor {

    public static void main(String[] arg){
        int i = 10;

        System.out.println("iniciamos el método main con i = " + i);
        test(i);
        System.out.println("finaliza el metodo main con el valor de i (se mantiene igual) = " + i);
    }

    public static void test(int i){
        System.out.println("iniciamos el metodo test con i = " + i);
        i = 35;
        System.out.println("finaliza el método test con i = " + i);
    }

}
