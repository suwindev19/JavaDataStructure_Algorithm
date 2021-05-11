package lc_contest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC_5713_Number_Of_Different_Integers_In_String {
    public static void main(String[] args) {
        String word = new String("a123bc34d8ef34");
        System.out.println(numDifferentIntegers(word));

    }

    public  static int numDifferentIntegers(String word) {

        int count = 0;
        word = word.replaceAll("[a-z]", " ");
        word = word.replaceAll("\\s", ",");
        for (int i = 0; i < word.length();i++) {
            String subString = new String();

        }


        return count;


    }
}
