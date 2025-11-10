package com.platzi.functional._14_optionals;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class MoreOptionals {

    public static void main(String[] args) {

        List<String> names = getNames();

//        if (names != null) {
//
//        }
//
//        Optional<List<String>> optionalNames = getOptionalNames();
//
//        if (optionalNames.ifPresent(namesValue -> namesValue.forEach(System.out::println))) {
//
//        }
    }

    static List<String> getNames() {
        List<String> list = new LinkedList<>();

        return Collections.emptyList();
    }

    static String mostValuablePlayer() {
        // return "";

        return null;
    }

    static int mostExpensiveItem() {
        return -1;
    }

    // Con Optional
    static Optional<List<String>> getOptionalNames() {

        return null;
    }
}