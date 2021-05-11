package codeChef;
import java.util.Scanner;
public class GC_1_Q {
    public static void main(String[] args) {

    }
}






























/*
Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            String s = new String();
            s = sc.next();
            char[] sch = new char[s.length()];
            for(int i =0; i < s.length(); i++){
                sch[i] = s.charAt(i);
            }
            int steps = 0;
            for(int start =0 , end = s.length()-1 ; start < s.length(); start++){
                if (sch[start] == 'R'){
                    while (sch[end] != 'W'){
                        end--;
                    }
                    // Do not want swapping to occur, therefore, add this if
                    if (end < start) {
                        break;
                    }
                    sch[start] = 'W';
                    sch[end] = 'R';
                    steps++;
                }
            }
            System.out.println(steps);
            T--;
        }
 */

// practice question
/*
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bob = new String();
        bob = sc.next();

        String alice = new String();
        alice = sc.next();
        int result = 0;
        for (int i = 0; i < alice.length(); i++){
            if (bob.charAt(i)== alice.charAt(i)) {
                result++;
            }
        }
        System.out.println(result);
    }
 */