import java.util.Stack;

public class PostfixConversionExample {

    public static String convertToPostfix(String expression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String Q = expression + ")"; // Append ")" to the end of Q

        stack.push('('); // Push "(" onto the stack

        for (int i = 0; i < Q.length(); i++) {
            char currentChar = Q.charAt(i);

            if (isOperand(currentChar)) {
                postfix.append(currentChar); // Add operand to P
            } else if (currentChar == '(') {
                stack.push(currentChar); // Push "(" onto stack
            } else if (isOperator(currentChar)) {
                while (getPrecedence(stack.peek()) >= getPrecedence(currentChar)) {
                    postfix.append(stack.pop()); // Pop and add higher or equal precedence operators to P
                }
                stack.push(currentChar); // Push operator onto stack
            } else if (currentChar == ')') {
                while (stack.peek() != '(') {
                    postfix.append(stack.pop()); // Pop and add operators until "(" is encountered
                }
                stack.pop(); // Remove "(" from stack
            }
        }

        return postfix.toString();
    }

    private static boolean isOperand(char ch) {
        return Character.isLetterOrDigit(ch);
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int getPrecedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        String Q = "3+4*2/(1-5)^2";
        String P = convertToPostfix(Q);
        System.out.println("Postfix expression: " + P);
    }
}
