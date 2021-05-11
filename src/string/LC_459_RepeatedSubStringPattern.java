package string;

public class LC_459_RepeatedSubStringPattern {
    public static void main(String[] args) {
        String s = "ababab";
        System.out.println(repeatedSubstringPattern(s));
    }
    // look for a part of the string and repeat it multiple times
    // numberOfRepeats
    // grab a sizes of substring and test it out
    // 0 to half way to the length of the string
    //
    public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for(int i = len/2; i>=1;i--){
            if (len % i == 0){ // check len of substring is divisible
                int numOfRepeats = len/i;
                String substring = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j = 0; j < numOfRepeats; j++){
                    sb.append(substring);
                }
                if (sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
}
