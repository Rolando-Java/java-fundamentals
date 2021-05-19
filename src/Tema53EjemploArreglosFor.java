import java.util.Arrays;

public class Tema53EjemploArreglosFor {

    public static void main(String[] arg){

        String[] productos = new String[7];
        int total = productos.length;

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsumg Galaxy";
        productos[2] = "Disco Duro SS Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }
        System.out.println("=== Usando foreach ===");
        for(String prod : productos){
            System.out.println("prod = " + prod);
        }
        System.out.println("=== Usando while ===");
        int i = 0;
        while(i < total){
            System.out.println("producto = " + productos[i]);
            i++;
        }
        System.out.println("=== Usando dowhile ===");
        i = 0;
        do {
            System.out.println("producto = " + productos[i]);
            i++;
        }while(i < total);


        int[] numeros = new int[10];
        int totalNumeros = numeros.length;

        for(int k = 0; k < totalNumeros; k++){
            numeros[k] = k*3;
        }

        Arrays.sort(numeros);
        for(int k = 0; k < totalNumeros; k++){
            System.out.println("numero = " + numeros[k]);
        }


    }

}
