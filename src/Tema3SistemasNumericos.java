public class Tema3SistemasNumericos {

    public static void main(String[] args) {
        /*
        Tomar en cuenta que estos sistemas numericos funcionan para cada tipo primitivo
        que maneja entero
         */

        //sitema decimal
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        //conviertiendo decimal a binario
        System.out.println("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        //conviertiendo decimal a octal
        System.out.println("numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        //conviertiendo decimal a hexadecimal
        System.out.println("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        //sistema binario
        int numeroBinario = 0b111110100;
        System.out.println("numeroBinario = " + numeroBinario);

        //sistema octal
        int numeroOctal = 0764;
        System.out.println("numeroOctal = " + numeroOctal);

        //sistema hexadecimal
        int numeroHexadecimal = 0x1f4;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

    }

}
