package serializacion;

public class Jefe extends Empleado {

    public Jefe(Persona persona, String cargo){
        super(persona, cargo);
    }

    @Override
    public String funciones(){
        return "Mi funcion es dirigir la fabrica de laptos...";
    }

    @Override
    public String toString(){
        return super.toString();
    }

}
