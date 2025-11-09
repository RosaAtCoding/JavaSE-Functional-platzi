package com.platzi.functional._11_composition;

import java.util.function.Function;

public class MathOperations {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplyBy3 = x -> x * 3;

        Function<Integer, Integer> add1MultiplyBy3 =
                multiplyBy3.compose(y -> {
                    System.out.println("Adding 1 to " + y);
                    return y + 1;
                });

        System.out.println(add1MultiplyBy3.apply(5));

        Function<Integer, Integer> andSquare =
                add1MultiplyBy3.andThen(x -> {
                    System.out.println("Square of " + x);
                    return x * x;
                });

        System.out.println(andSquare.apply(3));
    }
}