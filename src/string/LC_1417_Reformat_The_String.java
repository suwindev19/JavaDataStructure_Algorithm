package string;

import java.time.temporal.ChronoField;
import java.util.ArrayDeque;
import java.util.Deque;

public class LC_1417_Reformat_The_String {
    public static void main(String[] args) {
        String s = "a0b1c2";
        System.out.println(reformat(s));
    }


    public static String reformat(String s) {
        StringBuffer sb = new StringBuffer();
        char[] digit = new char[s.length()];
        char[] alpha = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i))) {
                alpha[i] = s.charAt(i);
            } else {
                digit[i] = s.charAt(i);
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if ((digit.length == alpha.length) && (Character.isAlphabetic(digit[i])))  {
                sb.append(digit[i]);
            } else {
                sb.append(alpha[i]);
            }


        }
        return sb.toString();
    }

}
