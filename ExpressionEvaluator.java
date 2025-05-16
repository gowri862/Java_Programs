import java.util.*;

public class ExpressionEvaluator {

    // Step 1: Infix to Postfix
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch).append(' ');
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    result.append(stack.pop()).append(' ');
                stack.pop(); // pop '('
            } else if (isOperator(ch)) {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek()))
                    result.append(stack.pop()).append(' ');
                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            result.append(stack.pop()).append(' ');

        return result.toString();
    }

    private static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }

    private static int precedence(char ch) {
        switch (ch) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
        }
        return -1;
    }

    // Step 2: Evaluate Postfix
    public static int evaluatePostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (String token : postfix.trim().split("\\s+")) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token.charAt(0)) {
                    case '+': stack.push(a + b); break;
                    case '-': stack.push(a - b); break;
                    case '*': stack.push(a * b); break;
                    case '/': stack.push(a / b); break;
                }
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String infix = "3+(4*5)-6/(1+1)";
        String postfix = infixToPostfix(infix.replaceAll("\\s+", ""));
        int result = evaluatePostfix(postfix);

        System.out.println("Infix:    " + infix);
        System.out.println("Postfix:  " + postfix);
        System.out.println("Result:   " + result);
    }
}
