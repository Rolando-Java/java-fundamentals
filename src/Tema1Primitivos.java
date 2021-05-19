public class Tema1Primitivos {

    public static void main(String[] args) {
        //tipos primitivos que manejan numero enteros
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);

        System.out.println("tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("valor maximo de un byte: " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte: " + Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("tipo byte corresponde en byte a: " + Short.BYTES);
        System.out.println("tipo byte corresponde en bites a: " + Short.SIZE);
        System.out.println("valor maximo de un short: " + Short.MAX_VALUE);
        System.out.println("valor minimo de un short: " + Short.MIN_VALUE);

        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("valor minimo de un int: " + Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("tipo long corresponde en byte a " + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("valor minimo de un Long: " + Long.MIN_VALUE);

        //tipos primitivos que manejan valor decimales

        float realFloat = 2120F;
        System.out.println("realFloat = " + realFloat);

        //la letra e hace referencia a elevar a 10 a un exponente que se define al costado de la letra
        //en este ejemplo seria : 20.45*10^3 , ques es igual a 20450.0 Se corre ceros a la derecha
        float realFloatDos = 20.45e3F;
        System.out.println("realFloatDos = " + realFloatDos);

        //en este ejemplo seria : 20.45*10^-3 , que es igual a  0.02045 Se corre ceros a la izquierda
        float realFloatTres = 20.45e-3F;
        System.out.println("realFloatTres = " + realFloatTres);

        //cuando el valor decimal presenta mas digitos, el numero es compactado haciendo uso de la letra e
        float realFloatCuatro = 0.00000000015F;//1.5e-10f;
        System.out.println("realFloatCuatro = " + realFloatCuatro);
        System.out.println("float corresponde en byte a: " + Float.BYTES);
        System.out.println("float corresponde en bites a: " + Float.SIZE);
        System.out.println("maximo valor de un float: " + Float.MAX_VALUE);
        System.out.println("minimo valor de un float: " + Float.MIN_VALUE);

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a: " + Double.BYTES);
        System.out.println("double corresponde en bites a: " + Double.SIZE);
        System.out.println("maximo valor de un double: " + Double.MAX_VALUE);
        System.out.println("minimo valor de un double: " + Double.MIN_VALUE);

        //tipo primitivo char
        char carcacterSimbolo = 'A';
        System.out.println("carcacterSimbolo = " + carcacterSimbolo);

        char caracterDecimal = 65;
        System.out.println("caracterDecimal = " + caracterDecimal);

        char caracterUnicode = '\u0041';
        System.out.println("caracterUnicode = " + caracterUnicode);

        System.out.println("caracterDecimal es igual a caracterUnicode ? " + (caracterDecimal == caracterUnicode));
        System.out.println("caracterSimbolo es igual a caracterUnicode ? " + (carcacterSimbolo == caracterUnicode));

        System.out.println("char corresponde en byte a: " + Character.BYTES);
        System.out.println("char corresponde en bites a: " + Character.SIZE);
        System.out.println("maximo valor de un double a: " + Character.MAX_VALUE);
        System.out.println("minimo valor de un double a: " + Character.MIN_VALUE);

        //tipo primitivo boolean
        boolean datoLogicoFalso = false;
        System.out.println("datoLogicoFalso = " + datoLogicoFalso);

        boolean datoLogicoVerdad = true;
        System.out.println("datoLogicoVerdad = " + datoLogicoVerdad);

        boolean datoLogicoFalso2 = Boolean.FALSE;
        System.out.println("datoLogicoFalso2 = " + datoLogicoFalso2);

        boolean datoLogicoVerdad2 = Boolean.TRUE;
        System.out.println("datoLogicoVerdad2 = " + datoLogicoVerdad2);

        double a = 98765.43e-3; //98.76543
        float b = 1.2345e2F; //123.45
        boolean datoLogico = a > b;
        System.out.println("datoLogico = " + datoLogico);

        boolean esIgual = (3 - 2 == 1);
        System.out.println("esIgual = " + esIgual);

        //El tipo de variable var vino desde jdk10, y se adapta al tipo de valor que le pasas como literal
        //el literal por defecto de los numeros enteros es int y el de los decimales es double.
        /*
        Letra para determinar un tipo de literal diferente que el de los por defecto
        Ejemplo :
        123L - long
        123.45F - float
        123.45D - double
         */
        var varInt = 127;
        System.out.println("varInt = " + varInt);

        var varFloat = 123.45F;
        System.out.println("varFloat = " + varFloat);

        var varDouble = 127889898;
        System.out.println("varDouble = " + varDouble);

        char varCaracter = '\u0041';
        System.out.println("varCaracter = " + varCaracter);
    }

}
