package lambda_exp_coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Problem Statement: Given a list of names, use List.sort() and
 * a lambda expression to sort them in reverse alphabetical order.
 * */

public class SortNames {

    public static void main(String[] arg) {

        //1. Using List.sort() and a lambda expression to sort them in reverse alphabetical order.
        List<String> lst = new ArrayList<>(List.of("Charlie", "Alice", "Bob", "Diana"));
        lst.sort((a, b) -> b.compareTo(a));

        System.out.println(lst);

        // 2. Using Stream API to sort them in reverse alphabetical order.
        List<String> listNames = Stream.of("Charlie", "Alice", "Bob", "Diana")
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(listNames);
    }
}
