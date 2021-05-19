package paqueteUno;

public class EjemploAutomovilEstatico {

    public static void main(String[] args){

        Automovil.setCapacidadEstanqueEstatico(40);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        System.out.println("Velocidad maxima carretera: " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad maxima ciudad: " + Automovil.VELOCIDAD_MAX_CIUDAD);

        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO, 3);
        mazda.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan = new Automovil("Nissan", "Navara",
                Color.GRIS, 3.5, 50);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara",
                Color.GRIS, 3.5, 50);
        nissan2.setTipo(TipoAutomovil.PICKUP);

        Automovil.setColorPatente(Color.AZUL);
        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());

        System.out.println("Kilometros por litros = " + Automovil.calcularConsumoEstatico(300,60));
        System.out.println("Kilometros por litros = " + subaru.calcularConsumoEstatico(300,60));
        System.out.println("Kilometros por litros = " + mazda.calcularConsumoEstatico(300,60));
        System.out.println("Kilometros por litros = " + nissan.calcularConsumoEstatico(300,60));

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipoSubaru.getDescripcion());

    }

}
