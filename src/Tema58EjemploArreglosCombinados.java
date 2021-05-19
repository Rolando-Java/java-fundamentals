public class Tema58EjemploArreglosCombinados {

    public static void main(String[] args) {

        int[] a, b, c;
        a = new int[4];
        b = new int[4];
        c = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = (i + 1) * 5;
        }

        int aux = 0, auxA = 0, auxB = 0;
        int tanA = (a.length % 2 == 0) ? 2 : 3;
        int tanB = (b.length % 2 == 0) ? 2 : 3;
        int tanMax = Math.max(tanA, tanB);
        for (int i = 0; i < c.length / (tanA + tanB); ) {
            for (int j = 0; j < tanA; j++) {
                c[aux++] = a[auxA++];
            }

            for (int j = 0; j < tanB; j++) {
                c[aux++] = b[auxB++];
            }
        }


        for (int num : c) {
            System.out.println("num = " + num);
        }


    }

}
