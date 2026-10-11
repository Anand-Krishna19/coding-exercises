package lambda_exp_coding;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/*
* Use the forEach() method and a lambda expression to print all elements of an ArrayList<Integer> multiplied by 2.
* Input: [1, 2, 3, 4, 5]
* Output: 2,4,6,8,10
* Hint: use Consumer lambda
*  */
public class ListIteration {

    static void main(String[] args) {
        // Creating an ArrayList<Integer> with elements 1,2,3,4,5
        //List.of used to create an immutable list of elements, then we are creating a mutable ArrayList from it.
        List<Integer> lst = new ArrayList<>(List.of(1,2,3,4,5));

        // Using Consumer lambda to print all elements of an ArrayList<Integer> multiplied by 2.
        Consumer<Integer> consumer = x -> System.out.println(x*2);

        lst.forEach(consumer);
    }
}
