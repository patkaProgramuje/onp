import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static Stack<Integer> stack;

    public static void main(String[] args) {

        stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ONP expression: ");
        String[] expression = scanner.nextLine().split(" ");

        int result = getResult(expression);
        System.out.println("Result of this expression is: " + result);
    }


    private static int getResult(String[] expression) {
        for (String c : expression) {
            try {
                int number = Integer.valueOf(c);
                stack.push(number);
            } catch (NumberFormatException e) {
                Dictionary dictionary = new Dictionary();
                Integer a = stack.pop();
                Integer b = stack.pop();
                int result = dictionary.getOperation(c).operation(b, a);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    static class Dictionary {

        Map<String, Operator> hashmap = new HashMap<>();

        public Dictionary() {
            for (Operator operator : Operator.values()) {
                hashmap.put(operator.getOpr(), operator);
            }
        }

        public Operator getOperation(String operator) {
            return hashmap.get(operator);
        }
    }
}
