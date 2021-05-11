package string;

public class S7_Validate_Anagram {
    public static void main(String[] args) {
        String s1 = "aa";
        String s2 = "bb";
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s1, String s2) {
        int s1Lengh = s1.length();
        int s2Length = s2.length();
        if (s1Lengh != s2Length) {
            return false;
        }
        int []count = new int[256];
        for (int i = 0; i < s1Lengh; i++) {
            count[s1.charAt(i)]--;
            count[s2.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}
