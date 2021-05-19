import java.text.SimpleDateFormat;
import java.util.Date;

public class Tema41EjemploJavaUtilDate {

    public static void main(String[] args){

        Date fecha = new Date();
        System.out.println("fecha = " + fecha);

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        String fechaStr = df.format(fecha);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("j = " + j);

        Date fechaDos = new Date();
        long tiempoFinal = fechaDos.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("fechaStr = " + fechaStr);//2021-03-27 06:49:06 p. m.
    }

}
