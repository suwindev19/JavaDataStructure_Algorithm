package recursion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class R_18_Joseph_Problem {
    public static void main(String[] args) {
        int n =6, k =5;
        System.out.println(joseph_Queue(n, k));
    }
    public static int josephus_Recursion(int n, int k) {
        // base case
        if (n==1) return 1;

        return (josephus_Recursion(n-1, k) + k -1) % n +1;
    }

    public static int joseph_Queue(int n, int k){
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 1; i <= n; i++) {
            queue.add(i);
        }
        Stack<Integer> tempStack = new Stack<>();
        while(queue.size() > 0) {
            for (int i =0; i < k; i++) {
                tempStack.push(queue.remove());
            }
            while (tempStack.size() >0 && queue.size() > 0) {
                for(int i = 0; i < k; i++){
                    int discardData = tempStack.pop();
                    queue.add(tempStack.pop());
                }
            }
        }
        return queue.peek();
    }


}
