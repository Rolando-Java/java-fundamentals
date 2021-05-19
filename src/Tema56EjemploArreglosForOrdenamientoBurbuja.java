public class Tema56EjemploArreglosForOrdenamientoBurbuja {

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;
        for (int i = 0; i < total - 1; i++) {
            for (int j = i + 1; j < total; j++) {
                if(((Comparable)arreglo[i]).compareTo(arreglo[j]) > 0){
                    Object aux = arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=aux;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
    }

    public static void main(String[] args){

        String[] productos = new String[]{"Kingston Pendrive 64GB", "Samsumg Galaxy", "Disco Duro SSD Samsumg Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta geenracion", "Bicileta oxeford"};

        int total = productos.length;

        sortBurbuja(productos);

        for (int i = 0; i < total; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

    }

}