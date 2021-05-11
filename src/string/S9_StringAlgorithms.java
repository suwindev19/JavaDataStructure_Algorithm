package string;

import java.util.Scanner;

/*
Prefix      |                                    ^           ^
Text T      |   CodeNCode is the best source for competitive coding
Pattern P   |   Code
occurrences of pattern in Text
            0   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15
String  :   c   a   b   b   a   g   e       u   s   e   s       c   a   b
Window  :   c   a   b
                c   a   b
                    c   a   b
                        c   a   b

 */
public class S9_StringAlgorithms {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        for(int i = 1; i <= t;i++){
            String T = sc.nextLine();
            String P = sc.nextLine();
            int lenT = T.length();
            int lenP = P.length();
            for(int start = 0, end = lenP-1; end < lenT; start++, end++){
                if(match(T, P, lenP, start)){
                    System.out.println(start);
                }
            }
        }
    }

    public static boolean match(String T,  String P, int lenP, int start){
        for(int i =0; i < lenP; i++){
            if (T.charAt(start + i) != P.charAt(i)){
                return false;
            }
        }
        return true;
    }


}
