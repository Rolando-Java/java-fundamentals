public class Tema48EjemploClaseMath {

    public static void main(String[] args){

        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);//3

        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);//3.5

        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);//1.2

        double  techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);//4.0

        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);//3.0

        long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);//3

        double exp = Math.exp(1);
        System.out.println("exp = " + exp);//2.718281828459045

        double log = Math.log(10);
        System.out.println("log = " + log);//2.302585092994046

        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);//1000.0

        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("convertir radianes a grados = " + grados);//90.0

        double radianes = Math.toRadians(90D);
        System.out.println("convertir de grados a radianes = " + radianes);//1.5707963267948966

        System.out.println("sin(90): " + Math.sin(radianes));//1.0
        System.out.println("cos(90): " + Math.cos(radianes));//6.123233995736766E-17

        radianes = Math.toRadians(180D);
        System.out.println("cos(180): " + Math.cos(radianes));//-1.0

        radianes = Math.toRadians(0D);
        System.out.println("cos(0): " + Math.cos(radianes));//1.0

    }

}
