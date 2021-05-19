public class Tema40PasarPorReferenciaDos {

    public static void main(String[] args){

        Humano humano = new Humano();
        humano.modificarNombre("Andrés");

        System.out.println("iniciamos el metodo main");
        System.out.println("humano.obtenerNombre() = " + humano.obtenerNombre());

        System.out.println("Antes de llamar al metodo test");
        test(humano);
        System.out.println("Despues de llamar al metodo test");

        System.out.println("humano.obtenerNombre() = " + humano.obtenerNombre());
        System.out.println("finaliza el metodo main con los datos de la persona modificados!");
    }

    public static void test(Humano humano){
        System.out.println("Iniciamos el metodo test");
        humano.modificarNombre("Pepe");
        System.out.println("Finaliza el metodo test");
    }

}

class Humano {
    private String nombre;

    public void modificarNombre(String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return this.nombre;
    }

}
