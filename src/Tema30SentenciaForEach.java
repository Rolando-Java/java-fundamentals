public class Tema30SentenciaForEach {

    public static void main(String[] args) {

        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 17};

        for (int num : numeros) {
            System.out.println("num = " + num);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        for(String nombre : nombres)
            System.out.println("nombre = " + nombre);


    }

}