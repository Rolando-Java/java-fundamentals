package paqueteDos;

import paqueteUno.Color;
import paqueteUno.TipoAutomovil;

public class EjemploAutomovil {

    public static void main(String[] args){

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2D, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3D, TipoMotor.DIESEL));
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println(mazda.calcularConsumo(5, 10));

    }

}
