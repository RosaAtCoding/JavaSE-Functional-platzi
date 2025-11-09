package com.platzi.functional._04_functional;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {

        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        UnaryOperator<String> addMark = text -> text + "!";

        System.out.println(quote.apply(addMark.apply("Hola amiga")));

        //////////////////////////////////

        BiFunction<Integer, Integer, Integer> multiplicacion =
                (x, y) -> x * y;

        System.out.println("2 * 4 = " + multiplicacion.apply(2, 4));

        BinaryOperator<Integer> multiplicacion2 =
                (x, y) -> x * y;

        System.out.println("2 * 4 = " + multiplicacion2.apply(2, 4));

        //////////////////////////////////

        BiFunction<String, Integer, String> leftPad =
                (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));

        List<BiFunction<String, Integer, String>> formateadores;
    }

}