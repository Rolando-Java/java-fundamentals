package paqueteDos;

import paqueteUno.Color;
import paqueteUno.TipoAutomovil;

public class EjemploAutomovilRelacionesObjetos {

    public static void main(String[] args){

        Persona conductorSubaru = new Persona("Luci", "Martinez");

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2D, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona conductorMazda = new Persona("Pato", "Rodriguez");

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(3D, TipoMotor.DIESEL), new Estanque(45),
                conductorMazda);
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.addRueda(new Rueda("Michelin", 18, 10.5))
            .addRueda(new Rueda("Michelin", 18, 10.5))
            .addRueda(new Rueda("Michelin", 18, 10.5))
            .addRueda(new Rueda("Michelin", 18, 10.5))
            .addRueda(new Rueda("Michelin", 18, 10.5));

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());

        System.out.println("Subaru Consumo: " + subaru.calcularConsumo(5, 10));
        System.out.println("Mazda Consumo: " + mazda.calcularConsumo(5, 10));

        Persona persona = new Persona("susan", "perez");
        System.out.println(persona);
        String nombre = String.valueOf(persona);
        System.out.println(nombre);

    }

}
