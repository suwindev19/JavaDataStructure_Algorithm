package leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
// Permutations
public class LC_17_Letter_Combinations_Phone_Number {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
    public  static List<String> letterCombinations(String digits) {
        LinkedList<String> result = new LinkedList<>();
        if (digits.length() == 0) return result;
        result.add("");

        String[] mapping = new String[]{
                "0",
                "1",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };
        for(int i =0; i < digits.length();i++) {
            // Get each letter
            int index = Character.getNumericValue(digits.charAt(i));
            while(result.peek().length() == i){
                String current = result.remove();
                for(char c : mapping[index].toCharArray()) {
                    // a b c 
                    result.add(current + c);
                }
            }
        }

        return result;
    }



}
