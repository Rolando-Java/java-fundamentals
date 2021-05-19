import javax.swing.*;

public class Tema4EntradaDatosJOptionPane {

    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null, "Ingrese un numero entero");

        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroString);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error debe ingresar un numero entero!");
            //se invoca al metodo main de forma recursiva
            main(args);
            //finaliza la JVM que se está ejecutando actualmente y sale del programa
            System.exit(0);
        }

        String resultadoDecimal = "El numero en decimal es: " + numeroDecimal;
        String resultadoBinario = "El numero en binario es: " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "El numero en octal es: " + Integer.toOctalString(numeroDecimal);
        String resultadoHexadecimal = "El numero en hexadecimal es: " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoDecimal + System.lineSeparator();
        mensaje += resultadoBinario + System.lineSeparator();
        mensaje += resultadoOctal + System.lineSeparator();
        mensaje += resultadoHexadecimal + System.lineSeparator();
        JOptionPane.showMessageDialog(null, mensaje);

    }

}
