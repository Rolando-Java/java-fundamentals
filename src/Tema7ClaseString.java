public class Tema7ClaseString {

    public static void main(String[] args) {

        //creando un objeto de la clase String de forma implicita
        String curso = "Programacion Java";
        //creando un objeto de la clase String de forma explicita
        String cursoDos = new String("Programacion Java");

        String cursoTres = "Programacion Java";
        String cursoCuatro = new String("Programacion Java");

        System.out.println("curso==cursoTres : " + (curso == cursoTres));//true; porque apuntan a una misma direccion en memoria;
        System.out.println("cursoDos==cursoCuatro : " + (cursoDos == cursoCuatro));//false; porque apuntan a diferentes direcciones en memoria

        System.out.println("curso.equals(cursoTres) : " + curso.equals(cursoTres));//true; porque el valor String que contienen es el mismo
        System.out.println("cursoDos.equals(cursoCuatro) : " + cursoDos.equals(cursoCuatro));//true; porque el valor String que contienen es el mismo

        //concatenando cadenas
        curso = "Programacion Java";
        String profesor = "Andres Guzman";

        String verDetalle = curso + " con el instructor " + profesor;
        System.out.println("verDetalle = " + verDetalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(verDetalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + verDetalle);

        //Otra forma de concatenar cadenas
        String verDetalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("verDetalle2 = " + verDetalle2);

        //inmutabilidad del string: esto significa que al usar cualquier metodo de esta clase sobre una variable,
        //se retorna un valor de la clase String apuntando a otra direccion en memoria, y no altera a la variable
        //con el que se invoco el metodo.
        curso = "Programacion Java";
        String profesorDos = "Andre Guzman";

        String resultado = curso.concat(profesorDos);
        System.out.println("curso = " + curso);//curso sigue sin inmutarse, pues apunta a la misma direccion en memoria
        System.out.println("resultado = " + resultado);//resultado obtiene el valor retornado con otra direccion en memoria
        System.out.println(curso == resultado);//false, porque apuntan a direcciones en memoria diferentes

        String resultado2 = curso.transform(s -> s.concat(" con ").concat(profesorDos));
        System.out.println("curso = " + curso);//curso sigue sin inmutarse, pues apunta a la misma direccion en memoria
        System.out.println("resultado2 = " + resultado2);//resultado2 obtiene el valor retornado con otra direccion en memoria

        String resultado3 = resultado.replace('a', 'A');
        System.out.println("resultado = " + resultado);//resultado sigue sin inmutarse, pues apunta a la misma direccion en memoria
        System.out.println("resultado3 = " + resultado3);//resultado3 obtiene el valor retornado con otra direccion en memoria

        /*
        Validando un String
         */
        //validar la nulidad del String
        String varString = null;
        boolean esNulo = varString == null;//true

        //validar que la cadena no este vacia
        varString = "";
        boolean esVacio = varString.isEmpty();//true

        //validar que la cadena no contenga solo espacios en blanco, y que no este vacia
        //metodo isBlank aparece desde jdk11
        boolean esBlanco = varString.isBlank();//true

        /*
        String - Metodos
         */
        String nombre = "Andres";
        //Saber la cantidad de caracteres de una cadena
        System.out.println("nombre.length() = " + nombre.length());

        //Convertir una cadena a mayusculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//ANDRES

        //Convertir una cadena a minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//andres

        //Comparar la igualdad entre cadenas
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));//true
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));//false

        //Comparar la igualdad entre cadenas sin importar las mayusculas o minusculas
        System.out.println("nombre.equalsIgnoreCase(\"andres\") = " + nombre.equalsIgnoreCase("andres"));//true

        //Comparar si una cadenas es mayor, menor o igual que otra cadena
        /*
        mayor que 0, si alfabeticamente se acerca mas a la z
        menor que 0, si alfabeticamente se acerca mas a la a
        igual a 0, si representan la misma cadena
         */
        System.out.println("nombre.compareTo(\"Ana\") = " + nombre.compareTo("Ana"));//3
        System.out.println("nombre.compareTo(\"Susana\") = " + nombre.compareTo("Susana"));//-18
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));//0

        //Comparar si una cadena es mayor, menor o igual que otra cadena,
        // sin importar las mayusculas o minusculas
        /*
        mayor que 0, si alfabeticamente se acerca mas a la z
        menor que 0, si alfabeticamente se acerca mas a la a
        igual a 0, si representan la misma cadena
         */
        System.out.println("nombre.compareToIgnoreCase(\"ana\") = " + nombre.compareToIgnoreCase("ana"));//3
        System.out.println("nombre.compareToIgnoreCase(\"susana\") = " + nombre.compareToIgnoreCase("susana"));//-18
        System.out.println("nombre.compareToIgnoreCase(\"andres\") = " + nombre.compareToIgnoreCase("andres"));//0

        //Obtener un caracter de la cadena
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));//n
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length() - 1));//s

        //Obtener una subcadena de la cadena
        System.out.println("nombre.substring(1) = " + nombre.substring(1));//ndres
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1, 4));//ndr
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length() - 1));//s

        //Eliminar espacios en blanco al inicio y final de una cadena
        String oficio = " abogado ";
        System.out.println("oficio.trim() = " + oficio.trim());//abogado

        //Reemplazar una subcadena o caracter por otro, en toda la cadena
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace('a','.') = " + trabalenguas.replace('a', '.'));//tr.b.lengu.s
        System.out.println("trabalenguas.replace(\"a\",\"o\") = " + trabalenguas.replace("a", "o"));//trobolenguos
        System.out.println("trabalenguas.replace(\"len\",\"lan\") = " + trabalenguas.replace("len", "lan"));//trabalanguas

        //Saber si una subcadena o caracter se encuentra dentro de una cadena.
        //En caso se encuentre, se retornara la posicion de la primera ocurrencia.
        //Sin embargo, si es que no se encontro, se retorna -1
        System.out.println("trabalenguas.indexOf(\"r\") = " + trabalenguas.indexOf("r"));//1
        System.out.println("trabalenguas.indexOf('g') = " + trabalenguas.indexOf('g'));//8
        System.out.println("trabalenguas.indexOf(\"len\") = " + trabalenguas.indexOf("len"));//5
        System.out.println("trabalenguas.indexOf(\"lan\") = " + trabalenguas.indexOf("lan"));//-1

        //Saber si una subcadena o caracter se encuentra dentro de una cadena.
        //En caso se encuentre, se retornara la posicion de la ultima ocurrencia.
        //Sin embargo, si es que no se encontro, se retorna -1
        System.out.println("trabalenguas.lastIndexOf(\"r\") = " + trabalenguas.lastIndexOf("r"));//1
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));//10
        System.out.println("trabalenguas.lastIndexOf(\"len\") = " + trabalenguas.lastIndexOf("len"));//5
        System.out.println("trabalenguas.lastIndexOf(\"la\") = " + trabalenguas.lastIndexOf("la"));//-1

        //Saber si una subcadena se encuentra dentro de una cadena.
        //En caso se encuentre la primera ocurrencia, se retornara true.
        //Sin embargo, si es que no se encontro, se retorna false
        System.out.println("trabalenguas.contains(\"gua\") = " + trabalenguas.contains("gua"));//true
        System.out.println("trabalenguas.contains(\"tro\") = " + trabalenguas.contains("tro"));//false

        //Saber si una cadena inicia con la subcadena ingresada
        //Retorna true si es verdadero, caso contrario false
        System.out.println("trabalenguas.startsWith(\"tra\") = " + trabalenguas.startsWith("tra"));//true
        System.out.println("trabalenguas.startsWith(\"trabo\") = " + trabalenguas.startsWith("trabo"));//false

        //Saber si una cadena termina con la cadena ingresada
        //Retorna true si es verdadero, caso contrario false
        System.out.println("trabalenguas.endsWith(\"gua\") = " + trabalenguas.endsWith("gua"));//false
        System.out.println("trabalenguas.endsWith(\"pul\") = " + trabalenguas.endsWith("guas"));//true

        //Obtener un arreglo de cadenas, indicando el separador, a traves de expresiones regulares
        String telefono = "123-234-456";
        String[] numeros = telefono.split("-");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[i] = " + numeros[i]);
        }
        /*
        numeros[i] = 123
        numeros[i] = 234
        numeros[i] = 456
        */

        String secuencia = "12, 23, 34, 56".replace(" ","");
        numeros = secuencia.split(",");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[i] = " + numeros[i]);
        }
        /*
        numeros[i] = 12
        numeros[i] = 23
        numeros[i] = 34
        numeros[i] = 56
         */

        String archivo = "alguna.imagen.pdf";
        String[] arreglo = archivo.split("\\."); //tambien es valido [.]
        System.out.println("arreglo[arreglo.length-1] = " + arreglo[arreglo.length - 1]);//pdf

        //obtener un arreglo de caracteres de una cadena
        String frase = "trotamundos";
        System.out.println("frase.length() = " + frase.length());//11

        char[] arregloCaracteres = frase.toCharArray();
        System.out.println("arregloCaracteres.length = " + arregloCaracteres.length);//11

        for (char car : arregloCaracteres){
            System.out.print(car);
        }
        //trotamundos

    }

}
