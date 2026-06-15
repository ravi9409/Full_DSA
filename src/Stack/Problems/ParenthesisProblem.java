package Stack.Problems;

import java.util.ArrayDeque;

public class ParenthesisProblem {
    public static void main(String[] args) {
        String s = "({[]}]";
        System.out.println(validParenthesis(s));
    }

    public static boolean validParenthesis(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[' ) {
                stack.push(curr);
            }else {
                if(stack.isEmpty())
                    return false;
                char opening=stack.pop();
                if((opening=='(' && curr!=')') || (opening=='{' && curr!='}') || (opening=='[' && curr!=']'))
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}
