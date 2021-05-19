public class Tema32SentenciasBuclesEtiquetasBuscar {

    public static void main(String[] args) {
        String frase = "trigo tres tristes tigres tragan trigotrigo en un trigaltrigo";
        String palabra = "trigo";

        int maxPalabra = palabra.length();
        int maxFrase = frase.length();

        char[] fraseCars = frase.toCharArray();
        char[] palabraCars = palabra.toCharArray();
        int cantidad = 0;

        buscar:
        for (int i = 0; i < maxFrase; ) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (palabraCars[j] != fraseCars[k++]) {
                    i++;
                    continue buscar;
                }
            }
            cantidad++;
            i += maxPalabra;
        }

        System.out.println("Encontrado = " + cantidad + " veces la palabra " + palabra + " en la frase");
    }

}
