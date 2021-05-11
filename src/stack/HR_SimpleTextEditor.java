package stack;

import java.util.Scanner;
import java.util.Stack;

public class HR_SimpleTextEditor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        Stack<String> stack = new Stack<>();
        String S = "";

        while (Q >=0) {
            int type = sc.nextInt();
            switch (type) {
                case 1: // append
                    String W = sc.next();
                    stack.push(W);
                    S += W;
                    break;
                case 2: // erase last x characters
                    S = stack.peek().substring(0, stack.peek().length() - sc.nextInt());
                    stack.push(S);
                    break;
                case 3:
                    S = stack.peek();
                    System.out.println(S);
                    int index = sc.nextInt();
                    System.out.println(S.charAt(index-1));
                    break;
                case 4:
                    S = stack.peek();
                    stack.pop();
                    break;
            }
           Q--;
        }


//=============================================================
// Code below does not pass 5 test cases. Time limit exceeded
//=============================================================
//        for (int i = 0; i < Q ; i++) {
//            int type = sc.nextInt();
//            switch (type) {
//                case 1: // append
//                    stack.push(S);
//                    String append = sc.next();
//                    S += append;
//                    System.out.println(S);
//                    break;
//                case 2: // erase last x characters
//                    stack.push(S);
//                    int character = sc.nextInt();
//                    S = S.substring(0, S.length() - character);
//                    System.out.println(S);
//                    break;
//                case 3: // print
//                    int index = sc.nextInt();
//                    System.out.println(S.charAt(index-1));
//                    break;
//                case 4: // undo
//                    S = stack.pop();
//                    break;
//                default:
//                    break;
//
//            }
//        }
    }
}
