package Stack.Problems;

import java.util.ArrayDeque;

public class EvaluatePostfix {
    public static void main(String[] args) {
        String expression = "3 4 * 2 5 * +";
        System.out.println(evaluatePostfix(expression));
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static int evaluatePostfix(String s) {
        String tokens[] = s.split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String token: tokens) {
            if(isOperator(token)) {
                int second = stack.pop();
                int first = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(first + second);
                        break;
                    case "-":
                        stack.push(first - second);
                        break;
                    case "*":
                        stack.push(first * second);
                        break;
                    case "/":
                        stack.push(first / second);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
