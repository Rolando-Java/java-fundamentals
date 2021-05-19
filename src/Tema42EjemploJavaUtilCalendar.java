import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tema42EjemploJavaUtilCalendar {

    public static void main(String[] args){

        Calendar calendario = Calendar.getInstance();

        calendario.set(2020,0,25,19,20,10);
        Date fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);//Sat Jan 25 19:20:10 PET 2020

        calendario.set(2020,Calendar.SEPTEMBER,25,19,20,10);
        fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);//Fri Sep 25 19:20:10 PET 2020

        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);//Sat Jul 25 21:20:10 PET 2020

        calendario.set(Calendar.YEAR, 2021);
        calendario.set(Calendar.MONTH, Calendar.SEPTEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 12);
        calendario.set(Calendar.HOUR, 10);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 15);
        calendario.set(Calendar.SECOND, 15);
        calendario.set(Calendar.MILLISECOND, 125);

        fecha = calendario.getTime();
        System.out.println("fecha = " + fecha);//Sun Sep 12 22:15:15 PET 2021

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a");
        String fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);//2020-07-25 09:20:10

    }

}
