package stack;

import java.util.*;

/*
I/P list - {10, 20, 30}
 */
public class G_2_Stack {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        reverse(list);
    }

    public static void reverse(List<Integer> list) {
        Deque<Integer> s = new ArrayDeque<>();
        for (Integer x : list) {
            s.push(x);
            System.out.println(s.peek());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.set(i, s.pop()));
        }

    }
}
