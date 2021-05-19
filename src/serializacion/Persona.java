package serializacion;

import java.io.Serial;
import java.io.Serializable;

/*
 Cuando una clase implementa la interfaz java.io.Serializable,
 todas sus subclases también son serializables. Por el contrario,
 cuando un objeto tiene una referencia a otro objeto,
 estos objetos deben implementar la interfaz Serializable por
 separado, o de lo contrario se lanzará una NotSerializableException
 */
public class Persona implements Serializable {

    @Serial
    public static final long serialVersionUID = 1L;

    private String nombre;
    private Integer edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer getEdad(){
        return this.edad;
    }

    public void setEdad(Integer edad){
        this.edad = edad;
    }

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " Edad: " + this.edad;
    }

}
