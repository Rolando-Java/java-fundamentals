import java.util.Scanner;

public class Tema19OperadorTernario {

    public static void main(String[] args) {

        String variable = (7 == 7) ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 0.0;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la nota de matematicas entre 2.0 - 7.0: ");
        matematicas = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0: ");
        ciencias = Double.parseDouble(scanner.nextLine());

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0: ");
        historia = Double.parseDouble(scanner.nextLine());

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = (promedio >= 5.49) ? "Aprobado" : "Desaprobado";
        System.out.println("estado = " + estado);

    }

}
