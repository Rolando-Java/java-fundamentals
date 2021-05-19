import java.io.IOException;

public class Tema47EjemploEjecutarProgramaSO {

    public static void main(String[] args) {

        Runtime runtime = Runtime.getRuntime();
        Process process;

        int val = 0;
        try {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                process = runtime.exec("notepad");
            } else if(System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")) {
                process = runtime.exec("gedit");
            } else {
                process = runtime.exec("textedit");
            }
            /*
            Este metodo espera hasta que termine la ejecucion del proceso.
            Devuelve el valor 0 si se realizo una terminacion normal.
            */
            val = process.waitFor();
        } catch (IOException | InterruptedException ex) {
            System.err.println("El comando es desconocido: " + ex.getMessage());
            System.exit(val);
        }
        System.out.println("Se ha cerrado el editor");
        System.exit(val);

    }

}
