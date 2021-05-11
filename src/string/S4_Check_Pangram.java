package string;
// Theta (n)
// Space
public class S4_Check_Pangram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        String str1 = "abc xyz apple";
        System.out.println(isPangram(str));
    }

    /*
    Get rid of all the spaces
    Use regex ^a-z
    Naive Solution
    ==============
     */

    public static boolean isPangram(String s) {
        int n = s.length();
        if (n < 26) {
            return false;
        }
        // use boolean array
        boolean []visited = new boolean[26];
        for (int i = 0; i < n;i++) {
            // char c to store ASCII value of a character 0 - 127
            char c = s.charAt(i);
            // 97-122
            if (c >='a' && c <= 'z') {
                visited[c -'a'] = true;
            }
            // 65-90
            if (c >= 'A' && c <= 'Z') {
                visited[c - 'A'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;
    }

}
