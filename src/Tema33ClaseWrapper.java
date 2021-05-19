public class Tema33ClaseWrapper {

    public static void main(String[] args){

        /*
        Reglas de la clase Wrapper
        -tomar en cuenta que a la clase Wrapper solo se le puede asignar como valor primitivo
        al tipo primitivo que le corresponde
        Byte  - byte
        Short - short
        Integer - int
        Long - long
        Float - float
        Double - double
        Character - char
        Boolean - boolean
        */

        int intPrimitivo = 32768;

        //Forma explicita de instanciar la clase envolvente
        //Aca se esta aplicando el boxing
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        System.out.println("intObjeto = " + intObjeto);//32768

        //otra forma de instanciar la clase envolvente
        intObjeto = Integer.valueOf("4568");

        //Forma implicita de instanciar la clase envolvente
        //Aca se esta aplicando el autoboxing
        Integer intObjetoDos = intPrimitivo;
        System.out.println("intObjetoDos = " + intObjetoDos);//32768

        //Forma explicita de obtener el valor primitivo de la clase envolvente
        //Aca se esta aplicando el unboxing
        int num = intObjeto.intValue();
        System.out.println("num = " + num);//4568

        //Forma implicita de obtener el valor primitivo de la clase envolvente
        //Aca se esta aplicando el autounboxing
        int numDos = intObjetoDos;
        System.out.println("numDos = " + numDos);//32768

    }

}
