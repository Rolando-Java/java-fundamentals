package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class Program {

    public static void main(String... args) {

        /*
        A diferencia del metodo Arrays.asList(), el metodo of
        devuelve una lista de la Interfaz List, Set o Map; en base
        a un arreglo de elementos
        -no permite un elemento null
        -la lista devuelta es completamente inmutable, puesto que no
        se puede modificar, agregar o eliminar los elementos de la lista

        Se puede combinar con el uso del constructor de cada tipo de lista, para obtener una lista
        que sea mutable
         */

        //lista inmutable
        List<Integer> listaUno = List.of(1, 3, 2);
        System.out.println(listaUno);

        //Obteniendo listas mutables haciendo uso del constructor de la clase
        listaUno = new ArrayList<>(List.of(1, 3, 2));
        listaUno.set(1, 5);
        System.out.println(listaUno);

        Set<Integer> listaDos = new HashSet<>(Set.of(1, 3, 5));
        listaDos.add(4);
        System.out.println(listaDos);

        listaDos = new TreeSet<>(Set.of(1, 3, 5));
        System.out.println(listaDos);

        Map<Integer, String> map = new HashMap<>(Map.of(2, "susan", 1, "joel"));
        System.out.println(map);

        map = new TreeMap<>(Map.of(2, "susan", 1, "joel"));
        System.out.println(map);

    }

}