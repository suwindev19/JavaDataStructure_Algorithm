package strings;

import java.util.function.Predicate;

/**
 * 520. Detect  Capital
 * https://leetcode.com/problems/detect-capital/
 */

public class W1_520_DectectCapital {
    public static void main(String[] args) {
//        System.out.println(detectCapitalUse_2("USA"));
//        System.out.println(detectCapitalUse_2("FlaG"));
//        System.out.println(detectCapitalUse_2("leetcode"));
        System.out.println(detectCapital_0("KicK Start"));
    }

    public static boolean detectCapital_0(String word){
        char[] detectcapitals = word.toCharArray();
        for(int i = 0; i < detectcapitals.length ; i ++){
            if(!Character.isUpperCase(detectcapitals[i]) || !Character.isLowerCase(detectcapitals[i]) || !Character.isUpperCase(detectcapitals[0])){
                return false;
            }
        }
        return true;
    }

    // Consider edge cae
    // one letter word => either lower or uppercase
    // invalid character check
    // Approach 1
    // count char numbers
    // validate for three rules
    // if capital count is == word length , return
    // if count == 0 (means all lower case), return true
    // if count == 1, and that index position is at 0, return true
    // Time O(n) number of characters in words,
    // Space O(1)
    public static boolean detectCapitalUse_1(String word){

        int count = 0;
        for(int i = 0; i < word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        return count == 0 || count == word.length() || count == 1 && Character.isUpperCase(word.charAt(0));
    }

    // Improving approach 1
    // can quit as soon as you find capital letter not at index 0
    //
    public static boolean detectCapitalUse_2(String word){

        // case 1: all capital
        if(Character.isUpperCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))){
            for(int i = 2; i < word.length(); i++){
                if(Character.isLowerCase(word.charAt(i))){
                    return false;
                }
            }
            // case 2 and 3
        }else {
            for(int i = 1; i < word.length(); i++){
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
        }
        return true;

    }

    // Approach 3
    // check first two characters
    // use lambda
    // Time O(n), it makes the code more elegant and you need to change in only one place.
    // maintainable and more likely to be bug free 
    public static boolean detectCapitalUse_3(String word){
        // edge case
        if(word.length() <= 1) return true;
        // lambda
        Predicate<Character> correctCase = Character::isLowerCase;
        if(Character.isUpperCase(word.charAt(1))){
            correctCase = Character::isUpperCase;
        }
        for(int i = 1; i < word.length(); i++){
            if(!correctCase.test(word.charAt(i))) return false;
        }
        return true;
    }
}
