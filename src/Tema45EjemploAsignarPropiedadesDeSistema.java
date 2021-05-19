import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Tema45EjemploAsignarPropiedadesDeSistema {

    public static void main(String[] arg){

        try {
            File path = new File("src/config.properties");
            FileInputStream archivo = new FileInputStream(path);

            Properties pro = new Properties(System.getProperties());
            pro.load(archivo);
            pro.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");

            System.setProperties(pro);
            System.out.println("mi.propiedad.personalizada = " + pro.getProperty("mi.propiedad.personalizada"));
            System.out.println("mi.propiedad.personalizada = " + System.getProperty("mi.propiedad.personalizada"));

            pro = System.getProperties();
            pro.list(System.out);

        } catch (IOException e) {
            System.out.println("No existe el archivo: " + e.getMessage());
        }

    }

}
