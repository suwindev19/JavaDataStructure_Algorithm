package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class S6_Find_One_Extra_Character {
    public static void main(String[] args) {
        String s1 = "abcd";
        System.out.println(s1.length());
        String s2 = "abcde";
        System.out.println(s2.length());
        // ---------
        String s3 = "abc";
        String s4 = "acab";
        System.out.println(findOneExtraCharacter_Naive(s1,s2));
        System.out.println(findOneExtraCharacter_Efficient(s3,s4));

    }

    // naive approach
    /*
    Convert the string into char array
    Then sort the array
    Compare each item by item
    If there is a mismatch, return the elment
     */
    // Sort n log n
    // Space O(n)
    public static char findOneExtraCharacter_Naive(String s1, String s2) {
        char []a1 = s1.toCharArray();
        Arrays.sort(a1);
        char[]a2 = s2.toCharArray();
        Arrays.sort(a2);
        for (int i = 0; i < s1.length(); i++) {
            if (a1[i] !=a2[i]) {
                return a2[i];
            }
        }
        return a2[s1.length()];
    }

    public static char findOneExtraCharacter_Efficient(String s1, String s2) {
        int count[] = new int[26];
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            count[s1.charAt(i) -'a']--;
            count[s2.charAt(i) -'a']++;
        }
        count[s2.charAt(n) -'a']++;
        for (int i = 0; i < 26; i++) {
            if (count[i] ==1) {
                return (char) (i+'a');
            }
        }
        return 0;
    }

    public static char findOneExtraCharacter_Bitwise(String s1, String s2) {
        int result = 0;
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            result = result ^ s1.charAt(i) ^ s2.charAt(i);
        }
        result = result ^ s2.charAt(n);
        return (char) result;
    }
}
