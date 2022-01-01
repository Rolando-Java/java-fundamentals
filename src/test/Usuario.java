package test;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

/*
    La clase record es una actualizacion de jdk 14
    La clase record en java genera automaticamente:
    -establece a los atributos username y password como privados y final.
    -genera un constructor de entrada para todos los atributos de la clase.
    -genera un metodo getter por cada atributo
    -genera el metodo equals, hashCode, toString

    La clase record no puede extender de una clase, pero si implementar interfaces
    La clase record puede declarar atributos estaticos
    La clase record puede declarar metodos estaticos y de instancia
 */
public record Usuario(String username, String password) implements Comparable<Usuario>, Serializable {

    //declarando atributo estatico
    @Serial
    private static final long serialVersionUID = 1L;

    /*
    Este bloque contiene la logica de validaciones que se correra antes
    de terminar de ejecutar el constructor e inicializar la clase.
    En una clase normal, es como decir:
    public Usuario() {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);
    }
     */
    public Usuario {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);
    }

    //Definiendo constructores con diferente numero
    //de parametros, pero que al final ha de inicializar
    //al constructor que tiene todos los parametros
    public Usuario(String username) {
        this(username, "1");
    }

    //Definiendo metodo de instancia
    public String usernameToUpperCase() {
        return this.username.toUpperCase();
    }

    //Definiendo metodo statico
    public static String usernameToLowerCase(Usuario usuario) {
        return usuario.username.toLowerCase();
    }

    @Override
    public int compareTo(Usuario usuario) {
        return usuario.username.compareTo(this.username);
    }

}