public class Tema35WrapperOperadoresRelacionales {

    public static void main(String[] args){

        Integer numUno = Integer.valueOf(200);
        Integer numDos = numUno;

        System.out.println("numUno = " + numUno);//200
        System.out.println("numDos = " + numDos);//200

        //El operador relacional == esta comparando la igualdad de la direccion
        //en memoria de las dos objetos.
        System.out.println("Son el mismo objeto? " + (numUno == numDos));//true

        numDos = 200;

        System.out.println("Son el mismo objeto? " + (numUno == numDos));//false

        //El metodo equals, compara la igualdad del valor que contiene dentro, cada
        //objeto.
        System.out.println("tienen el mismo valor? " + numUno.equals(numDos));//true
        //Otra forma seria, obteniendo el valor de la clase envolvente, con el metodo
        //intValue().
        System.out.println("tienen el mismo valor? " + (numUno.intValue() == numDos.intValue()));//true

        /*
         Sin embargo, ocurre algo peculiar, con el operador relacional ==
         Lo que sucede, es que cuando la clase envolvente tiene asigando como valor
         primitivo, un numero menor a 128. entonces, al usar este operador, por defecto se
         aplica el unboxing. Es decir, que de manera implicita de llama al metodo intValue()
         */

        numUno = 127;
        numDos = 127;

        System.out.println("Tienen el mismo valor? " + (numUno == numDos));//true

        /*
         OJO : Es recomendable usar el metodo equals() para comparar el valor de clase envolventes numericas
         */

    }

}
