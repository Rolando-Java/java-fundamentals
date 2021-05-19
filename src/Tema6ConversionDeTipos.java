public class Tema6ConversionDeTipos {

    public static void main(String[] args) {

        //conversion de string a tipo primitivo
        String numeroIntStr = "50";
        int numeroInt = Integer.parseInt(numeroIntStr);
        System.out.println("numeroInt = " + numeroInt);

        String numeroDoubleStr = "98765.43";
        double numeroDouble = Double.parseDouble(numeroDoubleStr);
        System.out.println("numeroDouble = " + numeroDouble);

        String numeroDoubleStrNotacionCientifica = "98765.43e-3";
        double numeroDoubleNotacionCientifica = Double.parseDouble(numeroDoubleStrNotacionCientifica);
        System.out.println("numeroDoubleNotacionCientifica = " + numeroDoubleNotacionCientifica);

        String booleanStr = "true";
        boolean valorBoolean = Boolean.parseBoolean(booleanStr);
        System.out.println("valorBoolean = " + valorBoolean);

        //conversion de tipo primitivo a string
        int numeroIntDos = 100;
        String numeroIntStrDos = Integer.toString(numeroIntDos);
        System.out.println("numeroIntStrDos = " + numeroIntStrDos);

        numeroIntStrDos = String.valueOf(numeroIntDos);
        System.out.println("numeroStrDos = " + numeroIntStrDos);

        double numeroDoubleDos = 1.23456e2;
        String numeroDoubleStrDos = Double.toString(numeroDoubleDos);
        System.out.println("numeroDoubleStrDos = " + numeroDoubleStrDos);

        numeroDoubleStrDos = String.valueOf(numeroDoubleDos);
        System.out.println("numeroDoubleStrDos = " + numeroDoubleStrDos);

        //conversion de tipo primitivo a otro primitivo
        //el casteo solo es necesario en caso quieres convertir una variable a un tipo primitivo
        //de menor tamaño. Sin embargo, puede haber perdida de valor.
        int i = 22768;
        short s = (short) i;
        System.out.println("s = " + s);
        char c = (char) i;
        System.out.println("c = " + c);
        long l = i;
        System.out.println("l = " + l);
        float f = i;
        System.out.println("f = " + f);

    }

}
