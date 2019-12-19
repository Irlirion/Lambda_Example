package com.sample;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        showLombok();
        showLambda();
    }

    private static void showLambda() {
        String[] strings = new String[] {"12", "1", "123"};
        String[] strings1 = new String[] {"12", "1", "123"};

        Arrays.sort(strings, (String firstStr, String secondStr) -> {
            if (firstStr.length() < secondStr.length()) return -1;
            else if (firstStr.length() > secondStr.length()) return 1;
            else return 0;
        });
        System.out.println(Arrays.toString(strings));

        Comparator<String> comp = (firstStr, secondStr) -> Integer.compare(firstStr.length(),secondStr.length());
        Arrays.sort(strings1, comp);
        System.out.println(Arrays.toString(strings1));

        List<String> stringList = Arrays.asList(strings);
        stringList.forEach(System.out::print);

        Consumer<Integer> c = x -> { System.out.println(x); };

        BiConsumer<Integer, String> b = (Integer x, String y) -> System.out.println(x + " : " + y);

        Predicate<String> p = Objects::isNull;

        c.accept(1);
        b.accept(1, "2");
        System.out.println(p.test(null));
    }

    static void showLombok() {
        Person Alex = new Person();
        Alex.setName("Alex");
        Alex.setAge(20);
        System.out.println(Alex);
        Person1 Rick = new Person1("Rick", 25);
        System.out.println(Rick);
    }
}
