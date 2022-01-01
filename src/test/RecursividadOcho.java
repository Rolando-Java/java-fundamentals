package test;

public class RecursividadOcho {

    private String invertirCadena(String cadena) {
        if(cadena.length() == 1) {
            return cadena;
        } else {
            char car = cadena.charAt(0);
            String subCad = cadena.substring(1);
            return invertirCadena(subCad).concat(String.valueOf(car));
        }
    }

    public static void main(String[] args) {
        //Invertir una palabra de forma recursiva
        RecursividadOcho recursividadOchoObj = new RecursividadOcho();
        String cadenaInvertida = recursividadOchoObj.invertirCadena("enmanuel");
        System.out.println(cadenaInvertida);
    }

}
