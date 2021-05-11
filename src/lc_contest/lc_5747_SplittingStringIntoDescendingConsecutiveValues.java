package lc_contest;

public class lc_5747_SplittingStringIntoDescendingConsecutiveValues {
    public static void main(String[] args) {
        String s1 = "0090089";
        String s2 = "9080701";
        String s3 = "10009998";
        System.out.println(splitString(s2));
    }

    public static boolean splitString(String s){
        int len = s.length();
        char[] digits = new char[len];
        for(int i =0; i < len;i++){
            digits[i] = s.charAt(i);
        }
       char[] digitsOnly = new char[len];
        int count = 0;
        for(int i = 0; i < len; i++){
            if (digits[i] != '0'){
                digitsOnly[count++] = digits[i];
            }
        }
        char[] result = new char[len];
        for(int i = 1; i < len; i++){
            if (digitsOnly[i] !=0){
                if (digitsOnly[i] - digitsOnly[i-1] == 1){
                    continue;
                } else{
                    return false;
                }
            }
        }
        return true;
    }
}
