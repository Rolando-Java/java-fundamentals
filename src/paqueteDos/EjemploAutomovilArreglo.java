package paqueteDos;

import paqueteUno.Color;
import paqueteUno.TipoAutomovil;

import java.util.Arrays;

public class EjemploAutomovilArreglo {

    public static void main(String[] args){

        Persona conductorSubaru = new Persona("Luci", "Martinez");

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2, TipoMotor.BENCINA));
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
                new Motor(3, TipoMotor.DIESEL), new Estanque(45),
                conductorMazda);
        mazda.setTipo(TipoAutomovil.SUB);
        mazda.addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5));

        Persona conductorSuzuki = new Persona("Lalo","Mena");

        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS,
                new Motor(16, TipoMotor.BENCINA), new Estanque(50),
                conductorSuzuki);
        mazda.setTipo(TipoAutomovil.SUB);
        mazda.addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5))
                .addRueda(new Rueda("Michelin", 18, 10.5));

        Automovil[] autos = new Automovil[3];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = suzuki;

        Arrays.sort(autos, (o1, o2) -> o1.getFabricante().compareToIgnoreCase(o2.getFabricante()));
        for (Automovil auto : autos) {
            System.out.println(auto);
        }

    }

}
