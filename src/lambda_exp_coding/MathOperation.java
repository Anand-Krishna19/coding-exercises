package lambda_exp_coding;

import java.lang.*;
import java.util.function.BiFunction;
import java.util.function.Function;

/*
 *  Create a functional interface MathOperation with int operate(int a, int b). Use lambdas
 *  to implement addition, subtraction, and multiplication.
 */

@FunctionalInterface
interface MathsOperation {

    int operate(int a, int b);
}

public class MathOperation {

    static void main(String[] args) {

        // Using lambda expressions to implement addition, subtraction, and multiplication
        MathsOperation addition = (a, b) -> a + b;
        MathsOperation substraction = (a, b) -> a - b;
        MathsOperation multiply = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(5, 5));
        System.out.println("Substraction: " + substraction.operate(15, 5));
        System.out.println("Multiply:" + multiply.operate(15, 5));
    }
}
