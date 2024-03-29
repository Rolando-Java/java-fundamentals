package paqueteUno;

public class EjemploAutomovilEnum {

    public static void main(String[] args){
        Automovil.setCapacidadEstanqueEstatico(40);

        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setCilindrada(2.0);
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO, 3);
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.getFabricante() = " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipoSubaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipoSubaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();

        switch(tipo){
            case CONVERTIBLE -> System.out.println("El automovil es deportivo y descapotable de dos puertas");
            case COUPE -> System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON -> System.out.println("Es un automovil utilitario de transporte, de empresas");
            case HATCHBACK -> System.out.println("Es un automovil mediano compacto, aspecto deportivo");
            case PICKUP -> System.out.println("Es un automovil de doble cabina o camioneta");
            case SEDAN -> System.out.println("Es un automovil mediano");
            case STATION_WAGON -> System.out.println("Es un autmovil más grande, con maleta grande");
        }

        TipoAutomovil[] tipos = TipoAutomovil.values();

        for (TipoAutomovil tipoAutomovil : tipos) {
            System.out.println(tipoAutomovil.name() + ", " +
                    tipoAutomovil.getNombre() + ", " +
                    tipoAutomovil.getDescripcion() + ", " +
                    tipoAutomovil.getNumeroPuerta());
        }


    }

}
