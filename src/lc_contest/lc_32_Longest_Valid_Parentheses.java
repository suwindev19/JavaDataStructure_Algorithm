package lc_contest;

import java.util.ArrayDeque;
import java.util.Deque;

public class lc_32_Longest_Valid_Parentheses {
    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));
    }


    public static int longestValidParentheses(String s) {
        if (s == "") return 0;
        int answer = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(-1);
        for (int i = 0; i < s.length();i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    answer = Math.max(answer, i - stack.peek());
                }
            }
        }
        return answer;
    }
}
