public class Tema34Autoboxing {

    public static void main(String[] args){

        /*
         Autoboxing : por ejemplo, el valor primitivo int se asigna a la clase
         envolvente Integer de forma implicita. Sin embargo, tras banbalinas
         se esta llamando al metodo Integer.valueOf(int valor primitivo).
         */

        Integer[] enteros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        /*
         Autounboxing : convertir por ejemplo, de la clase envolvente Integer
         a su valor primitivo int de forma implicita. Puesto que tras banbalinas
         se esta invocando al metodo intValue() de la clase Integer
        */

        int suma = 0;
        for(Integer i : enteros){
            if(i % 2 == 0){
                suma += i;
            }
        }
        System.out.println("suma = " + suma);//56

    }

}
