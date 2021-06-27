package org.aguzman.archivos.ejemplos;

import org.aguzman.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploManejoArchivos {

    public static void main(String... args) {

        String nombreArchivo = "D:\\Cursos\\java.txt";
        ArchivoServicio.crearArchivo(nombreArchivo);
        ArchivoServicio.escribirArchivo(nombreArchivo, "Hola mundo!!");
        ArchivoServicio.anexarArchivo(nombreArchivo, "Segund parrafo");
        System.out.println(ArchivoServicio.leerArchivo(nombreArchivo));
    }

}
