package leetCode;

import java.util.HashSet;
import java.util.Set;

/*
    remove all spaces in the string
    Iterate through the string and add each set of number into HashSet
    return the size of the set
 */
public class lc_1805_Number_Of_Different_Integers_In_String {
    public static void main(String[] args) {
        String s = new String("a123bc34d8ef34");
        System.out.println(numDifferentIntegers(s));
    }
    public  static int numDifferentIntegers(String word) {
        String[] arr = word.split("\\D");
        Set<String> s = new HashSet<String>();
        for (String str : arr) {
            str = str.trim();
            if (!str.equals("")) {
                str = str.replaceAll("^0*", "");
                s.add(str);
            }
        }
        return s.size();
    }
}

/*

public int numDifferentIntegers(String word) {
        HashSet<String> numberSet = new HashSet<>();
        StringBuilder number = new StringBuilder();

        int i = 0;
        while (i < word.length()) {
          // Once you encounter a digit, determine the entire number.
          if (Character.isDigit(word.charAt(i))) {
            while (i < word.length() && Character.isDigit(word.charAt(i))) {
              number.append(word.charAt(i));
              i++;
            }
            numberSet.add(removeLeadingZeroes(number));
            number = new StringBuilder();
          }
          i++;
        }
        return numberSet.size();
    }

    private static String removeLeadingZeroes(StringBuilder input) {
      while (input.length() > 1 && input.charAt(0) == '0') {
        input.deleteCharAt(0);
      }
      return input.toString();
    }

 */