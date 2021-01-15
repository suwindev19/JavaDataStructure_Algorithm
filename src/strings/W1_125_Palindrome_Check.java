package strings;

public class W1_125_Palindrome_Check {
    public static void main(String[] args) {
        System.out.println(palindromeCheck("abcdcba"));
    }

    // method 1
    // Time: O(n^2) | Space: O(n)
    public static boolean palindromeCheck(String str){
        String reversed = "";
        for(int i = str.length() -1 ; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return str.equals(reversed);
    }
}
