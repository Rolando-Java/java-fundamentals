package org.aguzman.archivos.ejemplos.servicio;

import java.io.*;

public class ArchivoServicio {

    private ArchivoServicio() {
    }

    /*
     BufferedWriter: es mas eficiente Y escribe texto en un flujo de salida de caracteres,
     almacenando los caracteres en el búfer para permitir la escritura eficiente de
     caracteres individuales, matrices y cadenas.
     Otra opcion a BufferedWriter es PrintWriter, que se usa por sus metodos tipo concola
     para escribir en un fichero. POr ejemplo, print(), println().
     FileWriter: crear el archivo en caso no exista.
     BufferedReader: lee el texto de un flujo de entrada de caracteres, almacenando los caracteres
     en el búfer para proporcionar una lectura eficiente de caracteres, matrices y líneas.
     */
    public static void crearArchivo(String nombreArchivo) {
        File file = new File(nombreArchivo);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            System.out.println("Se ha creado el archivo!!");
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File file = new File(nombreArchivo);
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            /*
             el metodo write() no retorna nada, y sirve para escribir
             en el archivo
             */
            bufferedWriter.write(contenido);
        } catch(IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static void anexarArchivo(String nombreArchivo, String contenido) {
        File file = new File(nombreArchivo);
        /*
         Al enviarle true al constructor fileWriter, estamos indicando que permita
         agregar contenido al que ya exista en el archivo, y que no sobreescriba el
         archivo
         */
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
            /*
             el metodo append(), retorna la misma instancia de
             Writer, para de esta forma anexar mas metodos
             append().apppen()..
             */
            bufferedWriter.append("\n").append(contenido);
        } catch(IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    public static String leerArchivo(String nombreArchivo) {
        StringBuilder sb = new StringBuilder();
        File file = new File(nombreArchivo);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String linea;
            while((linea = bufferedReader.readLine()) != null){
                sb.append(linea).append("\n");
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        return sb.toString();
    }

}
