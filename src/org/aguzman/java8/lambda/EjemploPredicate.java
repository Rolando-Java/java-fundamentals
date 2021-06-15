package org.aguzman.java8.lambda;

import org.aguzman.java8.lambda.models.Usuario;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicate {

    public static void main(String... args) {

        Predicate<Integer> predicate = num -> num > 10;
        System.out.println(predicate.test(11));

        Predicate<String> predicateDos = role -> role.equals("ROLE_ADMIN");
        System.out.println(predicateDos.test("ROLE_ADMIN"));

        BiPredicate<String, String> predicateTres = String::equals;
        System.out.println(predicateTres.test("domingo", "domingo"));

        BiPredicate<Integer, Integer> predicateCuatro = (i, j) -> i > j;
        System.out.println(predicateCuatro.test(6, 3));

        Usuario usuarioUno = new Usuario();
        Usuario usuarioDos = new Usuario();
        usuarioUno.setNombre("maria");
        usuarioDos.setNombre("maria");
        BiPredicate<Usuario, Usuario> predicateCinco = (ua, ub) -> ua.getNombre().equals(ub.getNombre());
        System.out.println(predicateCinco.test(usuarioUno, usuarioDos));

    }

}
