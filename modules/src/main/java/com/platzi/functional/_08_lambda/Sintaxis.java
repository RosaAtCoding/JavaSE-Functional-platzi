package com.platzi.functional._08_lambda;

import com.platzi.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {

    public static void main(String[] args) {

        List<String> cursos = NombresUtils.getList("Java", "Functional");

        //cursos.forEach(curso -> System.out.println(curso));
        cursos.forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> s = (x, y) -> x * y;


        usingZero(() -> 2);


        //usingPredicate(text -> text.isEmpty());
        usingPredicate(String::isEmpty);


        usingBiFunction((x, y) -> x * y);

        usingBiFunction((x, y) -> {
            System.out.println("X:" + x + ", Y: " + y);
            return x - y;
        });

        usingBiFunction((Integer x, Integer y) -> x * y);


        usingNothing(() -> {});

        usingNothing(() -> {
            System.out.println("Hola alumno!");
        });
    }


    static void usingNothing(OperatingNothing operatingNothing) {

    }

    static void usingBiFunction(BiFunction<Integer, Integer, Integer> operation) {

    }

    static void usingPredicate(Predicate<String> predicate) {

    }

    static void usingZero(ZeroArguments zeroArguments) {

    }


    @FunctionalInterface
    interface OperatingNothing {
        void nothing();
    }

    @FunctionalInterface
    interface ZeroArguments {
        int get();
    }
}