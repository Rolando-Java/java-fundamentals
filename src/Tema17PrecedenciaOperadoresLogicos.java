public class Tema17PrecedenciaOperadoresLogicos {

    public static void main(String[] args){

        //Donde ^ tiene mayor precedencia que ||
        boolean band1 = true || false ^ true;
        System.out.println("band2 = " + band1);//true

        //Donde ^ tiene mayor precedencia que &&
        boolean band2 = false && false ^ true;
        System.out.println("band3 = " + band2);//false

        //Donde && tiene mayor precedencia que ||
        boolean band3 = true || false && false;
        System.out.println("band1 = " + band3);//true

    }

}
