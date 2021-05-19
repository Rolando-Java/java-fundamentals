public class Tema21OperadorInstanceOf {

    public static void main(String[] args){

        Persona persona = new Persona();

        boolean b1 = persona instanceof Persona;
        System.out.println("persona es una instancia de Persona = " + b1);//true

        b1 = persona instanceof InterfaceTres;
        System.out.println("persona es una instancia de InterfaceTres = " + b1);//true

        b1 = persona instanceof InterfaceDos;
        System.out.println("persona es una instancia de InterfaceDos = " + b1);//true

        b1 = persona instanceof InterfaceUno;
        System.out.println("persona es una instancia de InterfaceUno = " + b1);//true

        InterfaceTres interfaceTres = new Persona();

        b1 = interfaceTres instanceof Persona;
        System.out.println("persona es una instancia de Persona = " + b1);//true

        b1 = interfaceTres instanceof InterfaceTres;
        System.out.println("persona es una instancia de InterfaceTres = " + b1);//true

        b1 = interfaceTres instanceof InterfaceDos;
        System.out.println("persona es una instancia de InterfaceDos = " + b1);//true

        b1 = interfaceTres instanceof InterfaceUno;
        System.out.println("persona es una instancia de InterfaceUno = " + b1);//true

        persona = (Persona) interfaceTres;

        b1 = persona instanceof Persona;
        System.out.println("persona es una instancia de Persona =  = " + b1);//true

        b1 = persona instanceof InterfaceTres;
        System.out.println("persona es una instancia de InterfaceTres = " + b1);//true

        b1 = persona instanceof InterfaceDos;
        System.out.println("persona es una instancia de InterfaceDos = " + b1);//true

        b1 = persona instanceof InterfaceUno;
        System.out.println("persona es una instancia de InterfaceUno = " + b1);//true

        persona = null;

        b1 = persona instanceof Persona;
        System.out.println("persona es una instancia de Persona =  = " + b1);//false

        b1 = persona instanceof InterfaceTres;
        System.out.println("persona es una instancia de InterfaceTres = " + b1);//false

        b1 = persona instanceof InterfaceDos;
        System.out.println("persona es una instancia de InterfaceDos = " + b1);//false

        b1 = persona instanceof InterfaceUno;
        System.out.println("persona es una instancia de InterfaceUno = " + b1);//false

    }

}

interface InterfaceUno {
    void suma();
}

interface InterfaceDos {
    void resta();
}

interface InterfaceTres extends InterfaceUno , InterfaceDos{
    void multi();
}

class Persona implements InterfaceTres {
    @Override
    public void suma() {

    }

    @Override
    public void resta() {

    }

    @Override
    public void multi() {

    }
}


