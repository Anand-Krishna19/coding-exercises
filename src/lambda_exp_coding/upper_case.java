package lambda_exp_coding;

import java.util.*;
import java.util.stream.Collectors;

/*
 * Problem Statement: Write a lambda expression that implements a custom functional interface StringProcessor
 * with a method String process(String s), which converts a given string to uppercase.
 * */

@FunctionalInterface
interface StringProcessor {

    public String process(String s);
}

public class upper_case {


    public static void main(String[] args) {
        String str = "hello world";

        System.out.println(Arrays.stream(str.split(" "))
                .map(s -> s.toUpperCase())
                .collect(Collectors.joining(" ")));

        //StringProcessor stringProcessor = String::toUpperCase;  can be written as method reference

        StringProcessor stringProcessor = s -> s.toUpperCase();
        System.out.println(stringProcessor.process(str));
    }
}
