import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Tema43EjemploJavaUtilDateParse {

    public static void main(String[] arg){

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            System.out.println("Ingrese una fecha con formato dd-MM-yyyy");
            Date fecha = format.parse(teclado.nextLine());
            System.out.println("fecha = " + fecha);
            System.out.println("format.format(fecha) = " + format.format(fecha));

            Date fechaDos = new Date();

            if(fecha.after(fechaDos)){
                System.out.println("Fecha del usuario es después que la fecha actual");
            } else if(fecha.before(fechaDos)){
                System.out.println("Fecha del usuario es anterior que la fecha actual");
            } else if(fecha.equals(fechaDos)){
                System.out.println("Fecha del usuario es igual que la fecha actual");
            }

            if(fecha.compareTo(fechaDos) > 0){
                System.out.println("Fecha del usuario es después que la fecha actual");
            } else if(fecha.compareTo(fechaDos) < 0){
                System.out.println("Fecha del usuario es anterior que la fecha actual");
            } else if(fecha.compareTo(fechaDos) == 0){
                System.out.println("Fecha del usuario es igual que la fecha actual");
            }

            Calendar calActual = GregorianCalendar.getInstance();
            Date fechaCalActual = calActual.getTime();

            if(fechaCalActual.after(fechaDos)){
                System.out.println("Fecha del usuario es después que la fecha actual");
            } else if(fechaCalActual.before(fechaDos)){
                System.out.println("Fecha del usuario es anterior que la fecha actual");
            } else if(fechaCalActual.equals(fechaDos)){
                System.out.println("Fecha del usuario es igual que la fecha actual");
            }

            if(fechaCalActual.compareTo(fechaDos) > 0){
                System.out.println("Fecha del usuario es después que la fecha actual");
            } else if(fechaCalActual.compareTo(fechaDos) < 0){
                System.out.println("Fecha del usuario es anterior que la fecha actual");
            } else if(fechaCalActual.compareTo(fechaDos) == 0){
                System.out.println("Fecha del usuario es igual que la fecha actual");
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }


    }

}
