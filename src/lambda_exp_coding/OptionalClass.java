package lambda_exp_coding;

import java.util.Optional;

public class OptionalClass {

    // Method to check if the value is null or not Using Optional.ofNullable()
    public static void check_null_value() {
        String str = null;
        Optional<String> optionalStr = Optional.ofNullable(str);

        if (optionalStr.isPresent()) {
            System.out.println("Value is present: " + optionalStr.get());
        } else {
            System.out.println("Value is not present");
        }

        String defaultValue = optionalStr.orElse("Default Value");
        System.out.println("Default Value: " + defaultValue);
    }

    // Method to check if the value is present or not Using Optional.ofNullable()
    public static void check_value() {
        String str = "Hello, World!";
        Optional<String> optStr = Optional.ofNullable(str);

        if (!optStr.isPresent()) {
            System.out.println("Value is not present");
        } else {
            System.out.println("Value is present: " + optStr.get());
        }
    }

    // Method to check if the value is present using Optional.of()
    public static void check_optionalOf() {
        String str = "Hello, Optional!";
        Optional<String> optStr = Optional.of(str);

        if (optStr.isPresent()) {
            System.out.println("Value is present: " + optStr.get());
        } else {
            System.out.println("Value is not present");
        }
    }

    static void main(String[] args) {
        check_null_value();
        check_value();
        check_optionalOf();
    }
}
