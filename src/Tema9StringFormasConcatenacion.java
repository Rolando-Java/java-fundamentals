
public class Tema9StringFormasConcatenacion {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(c);
        StringBuffer sf = new StringBuffer(c);

        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
//            c = c.concat(a).concat(b).concat(System.lineSeparator()); //500 => 3ms, 1000 => 7ms, 10000 => 150ms, 100000 => 6113ms
//            c += a + b + System.lineSeparator(); //500 => 24ms, 1000 => 31ms, 10000 => 110ms, 100000 => 2512ms
//            sb.append(a).append(b).append(System.lineSeparator()); //500 => 0ms, 1000 => 0ms, 10000 => 4ms, 100000 => 18ms
            sf.append(a).append(b).append(System.lineSeparator()); //500 => 0ms, 1000 => 0ms, 10000 => 4ms, 100000 => 18ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb);
        System.out.println("sf = " + sf);
    }

}
