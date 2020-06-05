package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

        private static int shift = 1;

        public static void main(String[] args) {
            // List of three integers: 1, 2, and 3
            List<Integer> intSeq = Arrays.asList(1, 2, 3);
            System.out.println("\n================\n");
            // Simple lambda expression
            intSeq.forEach(x -> System.out.println(x));
            System.out.println("\n================\n");
            // Multiline lambda expression
            intSeq.forEach(x -> {
                x += 2;
                System.out.println(x);
            });
            System.out.println("\n================\n");
            // Lambda expression with local variable
            intSeq.forEach(x -> {
                int y = x * 2;
                System.out.println(y);
            });
            System.out.println("\n================\n");
            // Lambda expression with declared parameter type
            intSeq.forEach((Integer x) -> {
                x += 2;
                System.out.println(x);
            });
            System.out.println("\n================\n");
            // Variable capture - local variable vs. static variable

            int mult = 2;

            intSeq.forEach(x -> {
                shift = 10;  // Static variable can be changed in lambda expression

                // Local variable cannot be changed (it must be final or effectively final)
                // mult = 3;

                System.out.println(x * mult + shift);
            });

            // Lambda expression as reference to static function
            intSeq.forEach(Main::f);







            System.out.println("\n=======Mine=========\n");

            List<Integer> number = Arrays.asList(1,2,3);

            number.forEach(x -> {
                x += 2;
                System.out.println(x);
            });

            for (Integer numbers: number) {
                System.out.println(numbers);
            }

        }

        private static void f(Integer x) {
            System.out.println(x);
        }
    }

