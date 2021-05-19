public class Tema8StringBuilderYStringBuffer {

    public static void main(String[] args){
        /*
        StringBuilder se caracteriza por ser mutable, ya que al modificarse el valor de la cadena, no se crea un
        nuevo objeto
        */
        //Construye un StringBuilder vacío y con una capacidad por defecto de 16 carácteres.
        StringBuilder sb = new StringBuilder();
        //Se le pasa la capacidad (número de caracteres) como argumento.
        StringBuilder sbDos = new StringBuilder(10);
        //Construye un StringBuilder en base al String que se le pasa como argumento.
        StringBuilder sbTres = new StringBuilder("susan");

        //Saber la capacidad del StringBuilder
        System.out.println("Capacidad del StringBuilder: " + sb.capacity());//16
        System.out.println("Capacidad del StringBuilderDos: " + sbDos.capacity());//10
        System.out.println("Capacidad del StringBuilderTres: " + sbTres.capacity());//21

        //Añade al final del StringBuilder a la que se aplica, un String o la representación en forma de String
        // de un dato asociado a una variable primitiva
        sb.append("carro");//carro
        sbDos.append("moto");//moto
        sbTres.append("helicoptero");//susanhelicoptero

        //Devuelve el numero de caracteres del StringBuilder
        System.out.println("Numero de caracteres del StringBuilder: " + sb.length());//5
        System.out.println("Numero de caracteres del StringBuilderDos: " + sbDos.length());//4
        System.out.println("Numero de caracteres del StringBuildertres: " + sbTres.length());//16

        //Devuelve una cadena comprendida entre los dos índices
        String subStr = sb.substring(0,2);//ca
        String subStrDos = sbDos.substring(1,3);//ot
        String subStrTres = sbTres.substring(2,5);//san

        //Devuelve el carácter asociado a la posición que se le indica en el argumento
        char car = sb.charAt(1);//a
        char carDos = sbDos.charAt(2);//t
        char carTres = sbTres.charAt(3);//a

        //Cambia el carácter indicado en el primer argumento por el carácter que se le pasa en el segundo
        StringBuilder mascota = new StringBuilder("lulu");
        mascota.setCharAt(3,'a');//lula

        //Borra el carácter indicado en el índice
        StringBuilder animal = new StringBuilder("leona");
        animal.deleteCharAt(4);//leon

        //Reemplaza los caracteres comprendidos entre los dos indices por la cadena que se le pasa en el argumento
        StringBuilder oficio = new StringBuilder("abogado");
        oficio.replace(5,7,"das");//abogadas

        //Borra la cadena de caracteres incluidos entre los dos indices indicados en los argumentos
        StringBuilder nombre = new StringBuilder("susan");
        nombre.delete(3,5);//sus

        //Analiza los caracteres de la cadena y encuentra el primer índice que coincide con el valor deseado
        //en caso no encuentre nada retornara -1
        StringBuilder estudiante = new StringBuilder("Miguel Angel");
        int pos = estudiante.indexOf("Angel");//7

        //Convierte un StringBuilder en un String
        String resultado = new StringBuilder("ana").toString();
        System.out.println("resultado = " + resultado);

        /*
        OJO:
        Los constructores y métodos de StringBuffer son los mismos que los de StringBuilder.

        StringBuffer tambien es mutable, sin embargo a diferencia del Stringbuilder, este es preferible implementarlo
        si el objeto puede cambiar gran número de veces y puede ser modificado por más de un hilo (thread).

        En cambio, se recomienda usar StringBuilder, si el valor del objeto puede cambiar gran número de veces y
        solo será modificado por un mismo hilo o thread.
        */


    }

}
