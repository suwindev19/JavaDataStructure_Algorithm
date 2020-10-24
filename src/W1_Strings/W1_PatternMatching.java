package W1_Strings;


import java.util.ArrayList;
import java.util.List;

/**
 * Given a set of strings words and a string pattern return a list of all of the strings in words that matches the pattern of the pattern string.
 *
 * Input:
 * words = ["aa", "bb"]
 * pattern = "cc"
 * Output: ["aa", "bb"]
 * Explanation: Both strings repeat letters just as the pattern string does.
 *
 * Input:
 * words = ["aac", "bbc", "bcb", "yzy"]
 * pattern = "ghg"
 * Output: ["bcb", "yzy"]
 */
public class W1_PatternMatching {

    public static void main(String[] args) {
        String[] words = {"aa", "bb"};
        System.out.println(findAndReplacePattern(words,  "cc"));

        String[] words_1 = {"aac", "bbc", "bcb", "yzy"};
        System.out.println(findAndReplacePattern(words_1,  "ghg"));
    }

    public static List<String> findAndReplacePattern(String[] words, String pattern){
        List<String > matches = new ArrayList<>();
        for(String word : words){
            if(isAligned(word, pattern)){
                matches.add(word);
            }
        }
        return matches;
    }

    private static boolean isAligned(String word, String pattern){
        // check edge case to make sure length of both word and pattern is the same.
        if(word.length() != pattern.length()){
            return false;
        }

        // ascii values
        int[] wordToPattern = new int[256];
        int[] patternToWord = new int[256];

        // Iterate through both word and pattern and see they match for each individual char

        for(int i = 0; i < word.length(); i++){
            int wordChar = Character.getNumericValue(word.charAt(i));
            int patternChar = Character.getNumericValue(pattern.charAt(i));

            if(wordToPattern[wordChar] == 0){
                wordToPattern[wordChar] = patternChar;
            }

            if(patternToWord[patternChar] == 0){
                patternToWord[patternChar] = wordChar;
            }
            if(wordToPattern[wordChar] != patternChar || patternToWord[patternChar] != wordChar){
                return false;
            }
        }
        return true;
    }

}
