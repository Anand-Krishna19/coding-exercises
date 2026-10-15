package lambda_exp_coding;

import java.util.List;
import java.util.stream.Collectors;

/*
 * Write a method that takes a list of integers and a custom lambda condition to filter out
 * numbers that don’t match the condition (e.g., filter out odd numbers).
 *
 * Given Input: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 * Expected Output: Even numbers: [2, 4, 6, 8, 10]
 */
public class FilteringViaLambda_8 {

    static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> list = numList.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
