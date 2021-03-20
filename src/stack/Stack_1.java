package stack;
/*
push, pop, peek, size. O(1) => Array implementation
Dynamic size implementation
amortised time O(1)
 */
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Stack;
public class Stack_1 {
    public static void main(String[] args) {
        // Stack<Integer> stack = new Stack ();
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
