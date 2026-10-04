import java.util.*;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "[()()]";
        String valid_invalid = isBalanced(s) ? "Balanced" : "Not Balance";
        System.out.println("Stack is "+ valid_invalid);
    }

    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        return stack.isEmpty();

    }
}

