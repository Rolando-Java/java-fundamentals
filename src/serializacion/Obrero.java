package serializacion;

public class Obrero extends Empleado {

    public Obrero(Persona persona, String cargo){
        super(persona, cargo);
    }

    @Override
    public String funciones() {
        return "Mi funcion es fabricar laptops...";
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
