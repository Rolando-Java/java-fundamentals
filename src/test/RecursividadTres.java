package test;

public class RecursividadTres {

    private void mostrarArrayRecursivo(int[] numeros, int pos) {

        if(pos < numeros.length) {
            System.out.println(numeros[pos]);
            mostrarArrayRecursivo(numeros, pos + 1);
        }

    }

    public static void main(String... args) {
        //Recorrer un array de forma recursiva
        RecursividadTres recursividadObj = new RecursividadTres();
        recursividadObj.mostrarArrayRecursivo(new int[]{1, 2, 3, 4, 5}, 0);

    }

}
