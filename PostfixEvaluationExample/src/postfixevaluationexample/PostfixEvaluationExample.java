import java.util.Stack;

public class PostfixEvaluationExample {

    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();
        postfix += ")"; // Add ")" as sentinel

        for (int i = 0; i < postfix.length(); i++) {
            char currentChar = postfix.charAt(i);

            if (isOperand(currentChar)) {
                int operand = Character.getNumericValue(currentChar);
                stack.push(operand); // Push operand onto stack
            } else if (isOperator(currentChar)) {
                int operand2 = stack.pop(); // Remove top element from stack
                int operand1 = stack.pop(); // Remove next-to-top element from stack

                int result = evaluateOperation(operand1, operand2, currentChar);
                stack.push(result); // Push result onto stack
            }
        }

        int value = stack.peek(); // Get the top element of stack
        return value;
    }

    private static boolean isOperand(char ch) {
        return Character.isDigit(ch);
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int evaluateOperation(int operand1, int operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                return operand1 / operand2;
        }
        throw new IllegalArgumentException("Invalid operator: " + operator);
    }

    public static void main(String[] args) {
        String P = "342*15-2^/+";
        int result = evaluatePostfix(P);
        System.out.println("Result: " + result);
    }
}
