import java.util.Random;

public class Tema49EjemploClaseMathRandom {

    public static void main(String[] arg){

        //aleatorio de 0 al 5
        int aleUno = (int)(Math.random()*6);
        System.out.println("aleUno = " + aleUno);//4

        //aleatorio de 2 al 6
        int aleDos = (int)(Math.random()*5) + 2;
        System.out.println("aleDos = " + aleDos);//2

        //Clase Random para generar aleatorio
        Random random = new Random();

        //aleatorio de 0 al 4
        int aleTres = random.nextInt(5);
        System.out.println("aleTres = " + aleTres);//3

        //aleatorio de 3 al 7
        int aleCuatro = random.nextInt(5) + 3;
        System.out.println("aleCuatro = " + aleCuatro);//3
        
    }

}
