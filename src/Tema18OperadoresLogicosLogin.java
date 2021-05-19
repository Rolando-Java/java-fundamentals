import java.util.Scanner;

public class Tema18OperadoresLogicosLogin {

    public static void main(String[] args) {

        String[] usernames = new String[]{"andres", "admin", "pepe"};
        String[] passwords = new String[]{"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el username: ");
        String u = scanner.nextLine();

        System.out.print("Ingrese el password: ");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            esAutenticado = (usernames[i].equals(u) && passwords[i].equals(p)) ? true : esAutenticado;
        }

        String mensaje = (esAutenticado) ?
                "Bienvenido usuario ".concat(u).concat("!") :
                "Username o contrasenia incorrecto".concat(System.lineSeparator()).concat("Lo siento, requiere autenticacion");
        System.out.println(mensaje);

    }

}
