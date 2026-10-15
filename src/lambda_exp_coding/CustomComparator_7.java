package lambda_exp_coding;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Given a list of Employee objects (with name and salary attributes),
 * write a lambda expression to sort them by salary in ascending order.
 *
 * Output: [Bob: 55000.0, Charlie: 65000.0, Alice: 75000.0]
 * */

// Define the Employee record with name and salary attributes
// To access the attributes, we can use the automatically generated accessor methods: name() and salary()
// The record class is immutable and provides a concise way to define data classes in Java
// The record class automatically generates equals(), hashCode(), and toString() methods based on the fields
// The record class is a good fit for simple data carriers like Employee, where we want to encapsulate the data
// without additional behavior
record Employee(String name, Double salary) {
}

public class CustomComparator_7 {

    static void main(String[] args) {
        List<Employee> empList = List.of(
                new Employee("Charlie", 65000.0),
                new Employee("Alice", 75000.0),
                new Employee("Bob", 55000.0)
        );

        // Sort employees by salary in ascending order using lambda expression
        empList.stream()
                .sorted(Comparator.comparingDouble(Employee::salary))
                .forEach(e -> System.out.println(e.name() + ":" + e.salary()));

        // Sort employees by salary in descending order using lambda expression
        empList.stream()
                .sorted(Comparator.comparingDouble(Employee::salary).reversed())
                .forEach(e -> System.out.println(e.name() + ":" + e.salary()));
    }
}
