public class Tema16OperadoresLogicos {

    public static void main(String[] args) {

        int a = 3;
        byte b = 3;
        float c = 127e-7f;
        double d = 2.143e3;

        /*
         El operador and (&&)
         */
        //Retorna true : cuando las dos condiciones a evaluar sean verdad
        //Retornar false : cuando una de las condiciones o las dos condiciones a evaluar sean falsas
        //Recordar : que nomas encuentre una condicion falsa, las otra condicion ya
        //no se evaluara, y retornara false.

        boolean band1 = a == b && c < d;//true && true
        System.out.println("band1 = " + band1);//true

        boolean band2 = a == b && c > d;//true && false
        System.out.println("band2 = " + band2);//false

        boolean band3 = a != b && c < d;//false && true
                System.out.println("band3 = " + band3);//false

        boolean band4 = a != b && c > d;//false && false
        System.out.println("band4 = " + band4);//false

        /*
         El operador or (||)
        */
        //Retorna true : cuando al menos una de las dos condiciones a evaluar sea verdad
        //Retorna false : cuando las dos condiciones a evaluar sean falsas
        //Recordar : que nomas encuentre una condicion verdadera, la otra condicion ya
        //no se evaluara, y retornara true.

        boolean band5 = a == b || c < d;//true || true
        System.out.println("band5 = " + band5);//true

        boolean band6 = a == b || c > d;//true || false
        System.out.println("band6 = " + band6);//true

        boolean band7 = a != b || c < d;//false || true
        System.out.println("band7 = " + band7);//true

        boolean band8 = a != b || c > d;//false || false
        System.out.println("band8 = " + band8);//false

        /*
         El operador XOr (^)
        */
        //Retorna true : cuando una de las dos condiciones sea falsa y la otra sea verdad
        //Retorna false : cuando las dos condiciones a evaluar sean falsas o verdaderas

        boolean band9 = a == b ^ c < d;//true ^ true
        System.out.println("band9 = " + band9);//false

        boolean band10 = a == b ^ c > d;//true ^ false
        System.out.println("band10 = " + band10);//true

        boolean band11 = a != b ^ c < d;//false ^ true
        System.out.println("band11 = " + band11);//true

        boolean band12 = a != b ^ c > d;//false ^ false
        System.out.println("band12 = " + band12);//false

    }

}
