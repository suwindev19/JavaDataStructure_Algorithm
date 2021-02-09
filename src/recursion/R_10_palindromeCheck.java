package recursion;

public class R_10_palindromeCheck {
    public static void main(String[] args) {
        String s = "geeks";
        int end = s.length()-1;
        System.out.println(isPalindrome(s, 0, end ));
    }

    // think in terms of solution of smaller problems
    // Use those solution to solve the overall problem
    // s0 s1 s2 ... sn-3 sn-2 sn-1
    // first and last character should the same
    // s1 to sn-1 should be palindrome.
    // start = 0, end = n-1
    // Check every character exactly once
    // Time O(n)
    // T(n) = T(n-2) + Theta(1)
    // Auxillary space (Theta(n/2) therefore Theta(n)
    static boolean isPalindrome(String s, int start, int end){
        // corner case (base case)
        if(start >= end) return true;
        return (s.charAt(start)) == s.charAt(end) && isPalindrome(s, start+1, end -1); // short circuiting -> the first condition before logical && operator must be true
    }
}
