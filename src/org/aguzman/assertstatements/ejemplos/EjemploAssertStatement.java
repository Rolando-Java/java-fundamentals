package org.aguzman.assertstatements.ejemplos;

public class EjemploAssertStatement {

    public static void main(String... args) {
        /*
         assert: valida el cumplimiento de la condicion. En caso
         contrario, retornará un AssertException con un mensaje personalizado,
         si es que le has colocado uno.
         La clase AssertionError extiende Error , que a su vez extiende
         Throwable. Esto significa que AssertionError es una excepción sin marcar.

         Por lo tanto, los métodos que usan aserciones no están obligados a declararlos,
         y el código de llamada adicional no debería intentar capturarlos.

         Los errores de aserción están destinados a indicar condiciones irrecuperables
         en una aplicación, por lo que nunca intente manejarlas o intentar la recuperación.

         -tomar en cuenta que los assert lo usa el programador con el objetivo
         de validar resultado erroneos, pero para el producto final, estas
         lineas de codigo generalmente se eliminan. Es decir, que debe recordar
         acerca de las afirmaciones es que se pueden deshabilitar, por lo que
         nunca asuma que se ejecutarán
         */

        Tiempo tiempo = new Tiempo(4, 60, 61);
    }

}

class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        test();
    }

    private void test() {
        //validando hora
        assert this.hora >= 0 && this.hora <= 24 : "Hora incorrecta";

        //validando minuto
        assert this.minuto >= 0 && this.minuto <= 60 : "Minuto incorrecto";

        //validando segundo
        assert this.segundo >= 0 && this.segundo <= 60 : "Segundo incorrecto";
        System.out.println("Paso test..");
    }

}
