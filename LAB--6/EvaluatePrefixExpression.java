import java.util.Stack;

public class EvaluatePrefixExpression {
    public static int evaluatePrefixExpression(String expression) {
        Stack<Integer> stack = new Stack<>();

        // Reversing the expression to start evaluation from left to right
        String reversedExpression = new StringBuilder(expression).reverse().toString();

        for (char c : reversedExpression.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(c - '0'); // Convert char to integer and push to stack
            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String prefixExpression = "- + * 4 5 7 2";
        System.out.println("Prefix Expression: " + prefixExpression);

        int result = evaluatePrefixExpression(prefixExpression);
        System.out.println("Result of Evaluation: " + result);
    }
}