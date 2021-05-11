package codeChef;

import java.util.Scanner;
// floor division
public class CF_2_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T= sc.nextInt();
        while (T > 0){
            int n = sc.nextInt();
            int reversed =0;
            while (n > 0){
                int lastDigit = n % 10;
                reversed = reversed * 10 + lastDigit;
                n = n / 10;
            }
            System.out.println(reversed);
            T--;
        }
    }
}
