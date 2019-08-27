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
            if (!c.equals("+") && !c.equals("-") && !c.equals("/") && !c.equals("*")) {
                stack.push(Integer.valueOf(c));
            } else {
                Operator operator = getOperator(c);
                Integer a = stack.pop();
                Integer b = stack.pop();
                int result = operator.operation(b, a);
                stack.push(result);
            }
        }
        return stack.pop();
    }

    private static Operator getOperator(String c) {
        switch (c) {
            case "+":
                return Operator.ADD;
            case "-":
                return Operator.MINUS;
            case "*":
                return Operator.MULTI;
            default:
                return Operator.DIV;
        }
    }
}
