import java.util.Arrays;

public class Tema54EjemploArreglosForInverso {

    public static void main(String[] args){

//        String[] productos = new String[7];
        String[] productos = { "Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "MAcbook Air", "Chromecast 4ta generacion", "Bicilitea oxeford" };
        int total = productos.length;

//        productos[0] = "Kingston Pendrive 64GB";
//        productos[1] = "Samsumg Galaxy";
//        productos[2] = "Disco Duro SS Samsung Externo";
//        productos[3] = "Asus Notebook";
//        productos[4] = "Macbook Air";
//        productos[5] = "Chromecast 4ta generacion";
//        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);
        for(int i = 0; i < total; i++){
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        for(int i = 1; i <= total; i++){
            System.out.println("para indice " + (total - i) + " : " + productos[total - i]);
        }

    }

}
