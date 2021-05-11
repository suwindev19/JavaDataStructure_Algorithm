package leetCode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lc_17_Letter_Combinations_Of_Phone_Number {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public  static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits == null || digits.equals("")) {
            return result;
        }
        Map<Character, char[]> lettersMap = new HashMap<>();
        lettersMap.put('0', new char[]{});
        lettersMap.put('1', new char[]{});
        lettersMap.put('2', new char[]{'a', 'b', 'c'});
        lettersMap.put('3', new char[]{'d', 'e', 'f'});
        lettersMap.put('4', new char[]{'g', 'h', 'i'});
        lettersMap.put('5', new char[]{'j', 'k', 'l'});
        lettersMap.put('6', new char[]{'m', 'n', 'o'});
        lettersMap.put('7', new char[]{'p', 'q', 'r', 's'});
        lettersMap.put('8', new char[]{'t', 'u', 'v'});
        lettersMap.put('9', new char[]{'w', 'x', 'y', 'z'});

        StringBuilder sb = new StringBuilder();
        letterCombinationsHelper(digits, sb, lettersMap, result);
        return result;
    }

    public static void letterCombinationsHelper(String digits, StringBuilder sb, Map<Character, char[]> lettersMap, List<String> result) {
        if (sb.length() == digits.length()) {
            result.add(sb.toString());
            return;
        }
        for (char ch : lettersMap.get(digits.charAt(sb.length()))) {
            sb.append(ch);
            letterCombinationsHelper(digits, sb, lettersMap, result);
            sb.deleteCharAt(sb.length() -1);
        }

    }

}
