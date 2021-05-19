public class Tema36WrapperBoolean {

    public static void main(String[] args){

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2;//false
        //Instanciando la clase envolvente de forma explicita.
        //Aca se esta aplicando el boxing
        Boolean objBoolean = Boolean.valueOf(primBoolean);
        //Instanciando la clase envolvente de forma explicita.
        //Aca se esta aplicando el autoboxing
        Boolean objBooleanDos = Boolean.valueOf("false");

        //El operador relacional == cuando se trata de una clase envolvente Boolean se aplica
        //el autounboxing. Es decir, detras de banbalinas se esta invocando al metodo booleanValue(),
        //para de esta forma comparar el valor de las clases envolventes.
        System.out.println("comparando dos objetos boolean: " + (objBoolean == objBooleanDos));//true
        System.out.println("comparando dos objetos boolean: " + (objBoolean.equals(objBooleanDos)));//true

        //Se observa el unboxing, al obtener el valor de la clase
        //envolvente de forma explicita
        boolean primBooleanUno = objBoolean.booleanValue();
        System.out.println("primBooleanUno = " + primBooleanUno);//false

        //Se observa el autounboxing, al obtener el valor de la clase
        //envolvente de forma implicita
        boolean primBooleanDos = objBooleanDos;
        System.out.println("primBooleanDos = " + primBooleanDos);//false

        /*
         OJO : No es necesario usar el metodo equals() para comparar el valor de clases envolventes Boolean,
         puesto que el operador relacional == , ya esta aplicando el autounboxing.
        */

    }

}
