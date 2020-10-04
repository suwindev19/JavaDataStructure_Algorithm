package W_1_Strings;

/**
 * 125. Valid Palindrome
 * https://leetcode.com/problems/valid-palindrome/
 */
public class D1_Valid_Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome_1("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome_2("Tokyo != Osaka"));

    }

    /**
     * 1. Use two pointers techniques
     * 1.1 Assign 0 to i.
     * 1.2 Assign s.length()-1 to j
     * Use while loop and condition is as long as i is less than j and ...
     * increment i and decrement j
     * conditional statement
     * if i != j, return false,
     * otherwise, true
     * Time : O(n)
     * Space : O(1)
     */

    public static boolean isPalindrome_1(String s){
        int i = 0;
        int j = s.length()-1;
        while(i <j){
            while(i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while(i < j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }

            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))){
                return false;
            }
        }
        return true;
    }

    // skip invalid characters - space, , : * ~
    // alphanumeric a-Z, A-Z, 0-9
    // O(n)
    // Skip invalid characters

    public static boolean isPalindrome_2(String s){
        // empty string to add only valid alphanumeric characters
        String fixedString = "";
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                fixedString += c;
            }
        }
        fixedString = fixedString.toLowerCase();
        int a_pointer = 0;
        int b_pointer = fixedString.length()-1;
        while(a_pointer <= b_pointer){
            if(fixedString.charAt(a_pointer) != fixedString.charAt(b_pointer)){
                return false;
            }
            a_pointer += 1;
            b_pointer -= 1;

        }
        return true;
    }
}
