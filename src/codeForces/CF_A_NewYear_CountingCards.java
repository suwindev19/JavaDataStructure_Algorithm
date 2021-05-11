package codeForces;
/*
vowel           even digit
a               6
b               4 (since b is not vowel)

e               5 (false)
other letters
minimum number of flips
You should only flip the card you need to flip

If I have odd, and check whether the other side is vowel or not. If it is , it is contradictoary.
Therefore, you need to flip it to check whether the statement is true or not.

 */
import java.util.Scanner;

public class CF_A_NewYear_CountingCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int numOfCardFlips = 0;
        for(char c : s.toCharArray()){
            if (c == 'a' || c == 'e' || c == 'i' || c== 'o' || c == 'u'){
                numOfCardFlips++;
            } else if (c == '1' || c == '3' || c == '5' || c== '7' || c == '9'){
                numOfCardFlips++;
            }
        }
        System.out.println(numOfCardFlips);
    }
}
