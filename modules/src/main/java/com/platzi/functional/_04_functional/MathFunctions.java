package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {

        // 1. Opción
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(squareFunction.apply(3));
        System.out.println(squareFunction.apply(25));

        System.out.println(square(25));


        // 2. Opción
        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        System.out.println("Is 6 odd? " + isOdd.apply(6));


        // 3. Opción
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println("Is 34 even? " + isEven.test(34));


        // Ejemplo Student
        Predicate<Student> isApproved = student -> student.getCalificacion() >= 6.0;

        Student rosa = new Student(10.0);
        System.out.println("\nStudent 'rosa' is approved? " + isApproved.test(rosa));
    }

    static class Student {
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }

    static int square(int x) {
        return x * x;
    }
}