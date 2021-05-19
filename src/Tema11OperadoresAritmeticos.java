import javax.swing.*;

public class Tema11OperadoresAritmeticos {

    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));//9

        int resta = i - j;
        System.out.println("resta = " + resta);//1
        System.out.println("i - j = " + (i - j));//1

        int multi = i * j;
        System.out.println("multiplicacion = " + multi);//20

        int div = i / j;
        float div2 = (float)i / j;
        System.out.println("div = " + div);//1
        System.out.println("div2 = " + div2);//1.25

        int resto = i % j;
        System.out.println("resto = " + resto);//1

        resto = 8 % 5;
        System.out.println("resto = " + resto);//3

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un numero"));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }

    }

}