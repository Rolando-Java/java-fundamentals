public class Tema10EjercicioExtensionArchivo {

    public static void main(String[] args){

        String archivo = "alguna.imagen.pdf";
//
//        int i = archivo.lastIndexOf(".");
//        System.out.println("archivo.length() = " + archivo.length());
//        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));//pdf

        String[] arreglo = archivo.split("\\.");
        System.out.println("arreglo.length = " + arreglo.length);
        System.out.println("arreglo[arreglo.length-1] = " + arreglo[arreglo.length - 1]);

    }

}
