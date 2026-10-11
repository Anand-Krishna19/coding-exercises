package lambda_exp_coding;

import java.util.function.Predicate;

/**
 * Write a lambda expression to check if a given string is empty or null.
 * Given Input: "", null, "hello"
 * Output:
 * true
 * true
 * false
 */

public class CheckEmpty {

    static void main(String[] args) {
        Predicate<String> isEmpty = (x) -> x == null || x.isEmpty();

        System.out.println(isEmpty.test(""));
        System.out.println(isEmpty.test(null));
        System.out.println(isEmpty.test("hello"));
    }



}
