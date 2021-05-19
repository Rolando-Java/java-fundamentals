import javax.swing.*;

public class Tema28SentenciaForArreglo {

    public static void main(String[] args) {

        String[] nombres = {"Andres", "Pepe", "Maria"
                , "Paco", "Lalo", "Bea", "Pato", "Pepa"};

        int count = nombres.length;
        for (int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase("andres") || nombres[i].equalsIgnoreCase("pepa")){
                continue;//Te envia a la seiguiente iteracion del bucle que lo contiene
            }
            System.out.println(i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if(nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;//termina la ejecucion del bucle que lo contiene
            }
            System.out.println("nombre = " + nombres[i]);
        }

        if(encontrado){
            JOptionPane.showMessageDialog(null,buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null,buscar + " no existe en el sistema!");
        }

        /*
         Recordar :
         continue, solo funciona en estructuras de repeticion como while, do-while y for.
         break: funciona en estructuras de repeticion como while, do-while y for, asimismo en switch-case
         */
    }
}
