package serializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class EjemploSerializar {
    public static void imprimir(List<? extends Empleado> empleados) {
        System.out.println("=========================");
        empleados.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Empleado> empleadoList = new ArrayList<>();
        empleadoList.add(new Jefe(new Persona("susan", 12),
                "Jefe de planta"));
        empleadoList.add(new Obrero(new Persona("pedro", 45),
                "Obrero de planta"));

        EjemploSerializar.imprimir(empleadoList);

        try (
                ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
                        new FileOutputStream("D:\\empleado.txt"));
                ObjectInputStream objectInputStream = new ObjectInputStream(
                        new FileInputStream("D:\\empleado.txt"));
        ) {
            escribiendoFichero.writeObject(empleadoList);

            empleadoList = (List<Empleado>) objectInputStream.readObject();
            EjemploSerializar.imprimir(empleadoList);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
