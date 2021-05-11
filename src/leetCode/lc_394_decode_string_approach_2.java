package leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class lc_394_decode_string_approach_2 {
    public static void main(String[] args) {
        String s = "1[leetcode]5[yay]azy";
        System.out.println(decodeString(s));
    }

    public static String decodeString(String s) {
        StringBuffer currString = new StringBuffer();

        Deque<Integer> intStack = new ArrayDeque<>();
        Deque<StringBuffer> strStack = new ArrayDeque<>();

        int count = 0;
        for (char c : s.toCharArray()) {
            switch (c) {
                case '0' : case '1': case'2': case'3' : case'4':
                case'5': case '6': case'7': case'8': case'9':
                    count = 10 * count + c -'0';
                    break;
                case '[':
                    intStack.push(count);
                    strStack.push(currString);
                    currString = new StringBuffer();
                    count = 0;
                    break;
                case ']':
                    StringBuffer temp = currString;
                    currString = strStack.pop();
                    int repeatedTimes = intStack.pop();
                    for (int i = repeatedTimes; i > 0; i--) {
                        currString.append(temp);
                    }
                    break;
                default:
                    currString.append(c);
            }
        }
        return currString.toString();
    }
}
