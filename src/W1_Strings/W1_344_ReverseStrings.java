package W1_Strings;

/**
 * Leetcode: 344 Reverse String
 */

public class W1_344_ReverseStrings {
    public static void main(String[] args) {
//        System.out.println(reverse("oiishiiramen"));
        System.out.println(reverse_TwoPointersA(new char[]{'j', 'a', 'p', 'a', 'n'}));
    }


    // Time: O(n)
    // Space: O(n) - space complexity
    public static String reverse(String s){
        char[] characters = new char[s.length()];

        int j = 0;
        for(int i = s.length()-1; i >= 0; i--){
            characters[j++] = s.charAt(i);
        }
        return new String(characters);
    }

    // Time: O(n)
    // Use two pointers techniques to get O(1) space complexity
    public static char[] reverse_TwoPointers(char[] s){
        int a_pointer = 0;
        int b_pointer = s.length-1;
        while (a_pointer <= b_pointer){
            char temp = s[a_pointer];
            s[a_pointer] = s[b_pointer];
            s[b_pointer] = temp;
            a_pointer++;
            b_pointer--;
        }
        return s;
    }

    // Same as above
    // [h, e, l, l, o]
    // 0    1 2 3 4
    //Assign two pointers - one from the beginning, one from the end of the char array
    // increment i ++
    // decrement j --
    // create a temporary variable temp and assign it to i
    // i becomes vacant, therefore, assign j to i
    // j becomes vacant, therefore, assign temp to j
    // break from the loop
    public static char[] reverse_TwoPointersA(char[] s){
        int i = 0;
        int j = s.length-1;
        while(i < j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        return s;
    }
}
