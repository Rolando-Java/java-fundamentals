package serializacion;

import java.io.Serial;
import java.io.Serializable;

public abstract class Empleado implements Serializable {
    /*
     anotacion que se debe poner sobre los campos y metodos
     relacionados con la serializacion.
    */
    @Serial
    public static final long serialVersionUID = 1L;

    private Persona persona;
    /*
     La palabra trasient permite que un campo no
     sea serializado
     */
    private transient String cargo;

    protected Empleado(Persona persona, String cargo){
        this.persona = persona;
        this.cargo = cargo;
    }

    public String getCargo(){
        return this.cargo;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public abstract String funciones();

    @Override
    public String toString(){
        return persona.toString() + " Cargo: " + this.cargo +
                " Funcion: " + this.funciones();
    }

}
