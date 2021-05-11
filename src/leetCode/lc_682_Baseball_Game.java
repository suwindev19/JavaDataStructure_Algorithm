package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;
/*

 */
public class lc_682_Baseball_Game {
    public static void main(String[] args) {
        String[] s = {"5","2","C","D","+"};
        System.out.println(calPoints(s));
    }

    public static int calPoints(String[] ops) {
        int sum = 0;
        Deque<Integer> stack = new ArrayDeque<Integer>();
        for (String op : ops) {
            switch (op) {
                case "+":
                    int top1 = stack.pop();
                    int top2 = stack.peek();
                    int top3 = top1 + top2;
                    stack.push(top1);
                    stack.push(top3);
                    break;
                case "D" :
                    int value = 2 *  stack.peek();
                    stack.push(value);
                    break;
                case "C" :
                    stack.pop();
                    break;
                default:
                    int valueX = Integer.parseInt(op);
                    stack.push(valueX);
                    break;
            }
        }
        for (int score : stack) {
            sum += score;
        }

        return sum;
    }
}
