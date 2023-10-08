package test;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.function.Function;

public class Program {

    public static void main(String... args) throws Exception {

        // Clase Void en Java
        /*
         Reflexión en Java
         Podríamos hacer uso de la clase Void en la reflexión. De hecho, el tipo de retorno
         de cualquier método void coincidirá con la variable Void.TYPE que contiene el valor
         Class<Void> mencionado anteriormente.
         */
        Class<Calculator> calculatorClass = Calculator.class;
        Method[] methods = calculatorClass.getDeclaredMethods();

        // Obteniendo solo los método con el tipo de retorno void
        System.out.println(
                Arrays.stream(methods).filter(method -> method.getReturnType() == Void.TYPE)
                        .toList());

        /*
         Genéricos en Java
         Supongamos que queremos hacer uso de una clase genérica, especificando que al hacer uso del
         método, no queremos devolver nada. Entonces declaramos Void en la clase Genérica.
         */
        Function<String, Void> function = a -> {
            System.out.println(a);
            return null;
        };

        Program program = new Program();
        program.execute(function, "Hola mundo");

    }

    public <T,R> R execute(Function<T,R> function, T param) {
       return function.apply(param);
    }

}

class Calculator {

    private int result;

    public int add(int number) {
        return this.result += number;
    }

    public int sub(int number) {
        return this.result -= number;
    }

    public void clear() {
        this.result = 0;
    }

    public void print() {
        System.out.println(this.result);
    }


}
