package string;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LC_20_Valid_Parenthesis {
    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
        System.out.println(isValid_Optimised(s));

    }

    public static boolean isValid(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            switch (c){
                case '(':
                    stack.push('(');
                    break;
                case '{':
                    stack.push('{');
                    break;
                case '[' :
                    stack.push('[');
                    break;
                case ')':
                    if (stack.size() ==0 || stack.pop() != c)
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty()|| stack.pop() != c)
                        return false;
                    break;
                case ']':
                    if (stack.size() == 0 || stack.pop() != c)
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }

    public static boolean isValid_Optimised(String s ){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c){
                return false;
            }
        }
        return stack.isEmpty();
    }
}
