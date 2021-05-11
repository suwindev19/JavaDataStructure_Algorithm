package lc_contest;

public class lc_5738_SumOfDigitsInbaseK {
    public static void main(String[] args) {
        int n = 54;
        String s = Integer.toString(n);
        int[] digits = new int[s.length()];
        int sum = 0;
        for(int i =0; i < s.length(); i++ ){
            digits[i] = s.charAt(i);
            System.out.println(digits[i]);
        }
        for(int i =0; i < digits.length; i++){
            sum +=digits[i];

        }
        System.out.println(sum);
    }
}
