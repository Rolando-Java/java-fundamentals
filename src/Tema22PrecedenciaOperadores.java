public class Tema22PrecedenciaOperadores {

    public static void main(String[] args) {

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3D;
        System.out.println("promedio = " + promedio);//14.0

        promedio = (i + j + k) / 3d * 10;
        System.out.println("promedio = " + promedio);//88.66666666667

        promedio = --i + j++ + k / 3d * 10;
        System.out.println("promedio = " + promedio);//87.66666667
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
