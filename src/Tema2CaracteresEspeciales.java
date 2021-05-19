public class Tema2CaracteresEspeciales {

    public static void main(String[] args) {
        //este caracter simboliza un espacio en blanco
        char caracterEspacioSimbolo = ' ';
        System.out.println("char corresponde en byte:" + caracterEspacioSimbolo + Character.BYTES);

        //este caracter simboliza un espacio en blanco en modo unicode
        char caracterEspacioUnicode = '\u0020';
        System.out.println("char corresponde en byte:" + caracterEspacioUnicode + Character.BYTES);

        // \n : este caracter simboliza un salto de linea
        char caracterNuevaLinea = '\n';
        System.out.println("char corresponde en byte:" + caracterNuevaLinea + Character.BYTES);

        // \t : este caracter simboliza una espacio tabulador
        char caracterTabulador = '\t';
        System.out.println("char corresponde en byte:" + caracterTabulador + Character.BYTES);

        // \b : como backspace o retroceso, es decir, que elimina el caracter de la cadena que se encuentre
        //atras de este caracter especial
        char caracterBackspace = '\b';
        System.out.println("char corresponde en byte:" + caracterBackspace + caracterBackspace + Character.BYTES);

        // \r : retorno de carro. Este caracter especial permite que la cadena que se encuentre depuees, se imprimira
        // al inicio de la linea. Es decir que chancara el texto que se encuentre a la izquierda del caracter especial.
        // Sim embargo, esto no ocurrira, si hay un caracter especial de salto de linea despues que el caracter de
        // retorno de carro.
        //Cabe resaltar que la funcionalidad de este caracter especial va a depender de la plataforma o sistema operativo
        //sobre el cual estamos trabajando.
        char caracterRetornoCarro = '\r';
        System.out.println("char corresponde en byte:" + caracterRetornoCarro + caracterNuevaLinea + Character.BYTES);

        // \' : comilla simple
        System.out.println("Comilla simple: \'" + "bienvenida" + "\'");//'bienvenida'

        // \" : comilla compuesta
        System.out.println("Comilla compuesta: \"" + "bienvenida" + "\"");//"bienvenida"

        /*
         Ejemplo de caracteres especiales usando la clase System
         -El metodo 'lineSeparator()' devuelve el caracter especial (\n o \r), mas apto para dar un salto de linea
          dependiendo de la plataforma o sistema operativo sobre el cual estamos trabajando.
         -El metodo 'getProperty(String key)' devuelve el valor de las propiedades del sistema en funcion a la llave
         que le enviemos como parametro.
        */

        System.out.println("Hola jorge, " + System.lineSeparator() + "tuve un buen dia!");
        System.out.println("Hola susan, " + System.getProperty("line.separator") + "que tal tu dia!");

        //otras propiedades del sistema a tener en cuenta
        System.out.println("Directorio de instalacion de JRE = " + System.getProperty("java.home"));//C:\Program Files\Java\jdk-15.0.1
        System.out.println("Nombre del proveedor de JRE = " + System.getProperty("java.vendor"));//Oracle Corporation
        System.out.println("Numero de version de JRE = " + System.getProperty("java.version"));//15.0.1
        System.out.println("Nombre del sistema operativo = " + System.getProperty("os.name"));//Windows 10
        System.out.println("Arquitectura del sistema operativo = " + System.getProperty("os.arch"));//amd64
        System.out.println("Version del sistema operativo = " + System.getProperty("os.version"));//10.0
        System.out.println("Directorio de trabajo del usuario = " + System.getProperty("user.dir"));//C:\Users\rbard\Desktop\IntelliJIdea
        System.out.println("Directorio de inicio del usuario = " + System.getProperty("user.home"));//C:\Users\rbard
        System.out.println("Nombre de la cuenta del usuario = " + System.getProperty("user.name"));//rbard

    }

}
