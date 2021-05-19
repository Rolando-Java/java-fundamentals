public class Tema14OperadoresIncrementales {

    public static void main(String[] args){

        //Pre incremento : primero se incrementa y luego se asigna a la variable
        int i = 1;
        System.out.println("inicial i = " + i);//1
        int j = ++i;//i = i + 1

        System.out.println("i = " + i);//2
        System.out.println("j = " + j);//2

        //Post incremento : primero se asigna a la variable y luego se incrementa
        i = 2;
        System.out.println("inicial i = " + i);//2
        j = i++;//i = i + 1
        System.out.println("i = " + i);//3
        System.out.println("j = " + j);//2

        //Pre decremento : primero se decrementa y luego de asigna a la variable
        i = 3;
        System.out.println("inicial i = " + i);//3
        j = --i;//i = i -1

        System.out.println("i = " + i);//2
        System.out.println("j = " + j);//2

        //Post decremento : primero se asigna a la variable y luego se decrementa
        i = 4;
        System.out.println("inicial i = " + i);//4
        j = i--;
        System.out.println("i = " + i);//3
        System.out.println("j = " + j);//4

        System.out.println("(++j) = " + (++j));//5
        System.out.println("(j++) = " + (j++));//5
        System.out.println("j = " + j);//6

    }

}
