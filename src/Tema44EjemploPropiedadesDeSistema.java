import java.util.Properties;

public class Tema44EjemploPropiedadesDeSistema {

    public static void main(String[] args){

        String username =  System.getProperty("user.name");
        System.out.println("username = " + username);

        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String versionJava = System.getProperty("java.version");
        System.out.println("versionJava = " + versionJava);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: " + lineSeparator + "una linea nueva ...");

        Properties properties = System.getProperties();
        properties.list(System.out);




    }

}
