package org.aguzman.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camionList){
        camionList.forEach(c -> {
            if(c instanceof Animal) {
                Animal animal = (Animal) c;
                System.out.println(animal.getNombre() + " tipo: " + animal.getTipo());
            } else if(c instanceof Maquinaria){
                Maquinaria maquinaria = (Maquinaria) c;
                System.out.println(maquinaria.getTipo());
            } else if(c instanceof Automovil){
                Automovil automovil = (Automovil) c;
                System.out.println(automovil.getMarca());
            }
        });
    }

    public static void main(String[] args){

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("peregrino","caballo"));
        transporteCaballos.add(new Animal("grillo","caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("topocalma", "Caballo"));
        transporteCaballos.add(new Animal("Longotoma","Caballo"));

        EjemploGenericos.imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grua Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

        EjemploGenericos.imprimirCamion(transMaquinas);

        Camion<Automovil> transAuto = new Camion<>(3);
        transAuto.add(new Automovil("Toyota"));
        transAuto.add(new Automovil("Mitsubishi"));
        transAuto.add(new Automovil("Chevrolet"));

        EjemploGenericos.imprimirCamion(transAuto);

    }

}
