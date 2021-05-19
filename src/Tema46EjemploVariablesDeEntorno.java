import java.util.Map;

public class Tema46EjemploVariablesDeEntorno {

    public static void main(String[] arg){

        //Listando las variables de entorno
        Map<String, String> varEnv = System.getenv();
        System.out.println("Variables de ambiente del sistema = " + varEnv);

        System.out.println("---- Listando variables de entorno del sistema ----");
        for(String key : varEnv.keySet()){
            System.out.println(key  + " --> " + varEnv.get(key));
        }

        System.out.println("Obteniendo variables de entorno en especifico");

        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);//rbard

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);//C:\Program Files\Java\jdk1.8.0_271

        /*
         Ejercicio creando una variable de entorno con el comando
         setx SALUDO "Hola mundo"
         */
        String saludo = System.getenv("SALUDO");
        System.out.println("saludo = " + saludo);//Hola mundo

    }

}
