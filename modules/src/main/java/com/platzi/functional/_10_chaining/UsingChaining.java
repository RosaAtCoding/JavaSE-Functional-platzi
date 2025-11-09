package com.platzi.functional._10_chaining;

public class UsingChaining {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder
                .append("Hello ")
                .append("world ")
                .append("and ")
                .append("hello ")
                .append("space.");

        System.out.println(stringBuilder);


        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();
    }


    static class Chainer {
        public Chainer sayHi() {
            System.out.println("Hi");
            return this;
        }

        public Chainer sayBye() {
            System.out.println("Bye");
            return this;
        }
    }
}