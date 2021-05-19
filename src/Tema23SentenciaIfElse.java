public class Tema23SentenciaIfElse {

    public static void main(String[] args) {

        int edad = 15;

        //En caso solo haya una instruccion, no es necesario el usar llaves
        if (edad >= 18) System.out.println("Felicitaciones, ya eres mayor de edad!");
        else System.out.println("Todavia eres menor de edad!!");

        System.out.println("Tu edad es " + edad);

        float promedio = 5.5F;

        if (promedio >= 6.5) {
            System.out.println("Felicitaciones, excelente promedio!");
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
        } else if (promedio >= 5.5) {
            System.out.println("Buen promedio!");
        } else if (promedio >= 5.0) {
            System.out.println("Regular, necesitas esforzarte un poco mas!");
        } else if (promedio >= 4.0) {
            System.out.println("Insuficiente, necesitas estudiar mas!");
        } else {
            System.out.println("Reprobado!");
        }

        System.out.println("Tu promedio es " + promedio);

    }
}