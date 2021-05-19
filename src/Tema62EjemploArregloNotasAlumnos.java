import java.util.Scanner;

public class Tema62EjemploArregloNotasAlumnos {

    public static void main(String[] args){

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumNotasMatematicas = 0, sumNotasHistoria = 0, sumNotasLenguaje = 0;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matematicas: ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia: ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = Double.parseDouble(scanner.nextLine());
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje: ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = Double.parseDouble(scanner.nextLine());
        }

        for (int i = 0; i < 7; i++) {
            sumNotasMatematicas+=claseMatematicas[i];
            sumNotasHistoria+=claseHistoria[i];
            sumNotasLenguaje+=claseLenguaje[i];
        }

        double promedioMatematica = (sumNotasMatematicas/claseMatematicas.length);
        double promedioHistoria = (sumNotasHistoria/claseHistoria.length);
        double promedioLenguaje = (sumNotasLenguaje/claseLenguaje.length);
        System.out.println("Promedio clase matematicas: " + promedioMatematica);
        System.out.println("Promedio clase historia: " + promedioHistoria);
        System.out.println("Promedio clase lenguaje: " + promedioLenguaje);

        System.out.println("Promedio total del curso: " + (promedioMatematica + promedioHistoria + promedioLenguaje) / 3);

        System.out.println("Ingrese el identificador del alumno: (0 - 6)");
        int id = Integer.parseInt(scanner.nextLine());
        double promedioAlumno = (claseMatematicas[id] + claseHistoria[id] + claseLenguaje[id]) / 3;
        System.out.println("promedioAlumno = " + promedioAlumno);
        
    }

}
