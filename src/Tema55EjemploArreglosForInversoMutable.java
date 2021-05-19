import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Tema55EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total = arreglo.length;

        for (int i = 0; i < total / 2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i]=actual;
        }
    }

    public static void main(String[] arg) {

        String[] productos = new String[]{"Kingston Pendrive 64GB", "Samsumg Galaxy", "Disco Duro SSD Samsumg Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta geenracion", "Bicileta oxeford"};

        int total = productos.length;

        Arrays.sort(productos);
        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        arregloInverso(productos);
//        Collections.reverse(Arrays.asList(productos));

        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        int num = 3;

        Collections.sort(new ArrayList<String>(),(o1, o2) -> 0);

    }

}
