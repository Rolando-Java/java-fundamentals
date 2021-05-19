import java.lang.reflect.Method;

public class Tema37EjemploGetClass {

    public static void main(String[] args){

        String texto = "Hola que tal!";

        Class strClass = texto.getClass();

        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getName() = " + strClass.getSimpleName());
        System.out.println("strClass.getName() = " + strClass.getPackageName());
        System.out.println("strClass.getName() = " + strClass);

        for(Method method : strClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }

        Integer num = 34;
        Class integerClass = num.getClass();
        Class objClass = integerClass.getSuperclass().getSuperclass();
        System.out.println("integerClass = " + integerClass);
        System.out.println("integerClass = " + integerClass.getName());
        System.out.println("integerClass = " + integerClass.getSimpleName());
        System.out.println("integerClass = " + integerClass.getPackageName());
        System.out.println("integerClass = " + integerClass.getPackage().getName());
        System.out.println("integerClass = " + integerClass.getSuperclass().getSimpleName());
        System.out.println("integerClass = " + integerClass.getSuperclass().getSuperclass().getSimpleName());

        for(Method method : objClass.getMethods()){
            System.out.println("method.getName() = " + method.getName());
        }




    }

}
