package hashing;

import java.util.HashMap;

/*
/ Given a string text, you want to use the characters of text to form as many instances of the word "balloon" as possible.

// You can use each character in text at most once. Return the maximum number of instances that can be formed.

// Input: text = "nlaebolko"
// Output: 1
// Example 2:

// Input: text = "loonbalxballpoon"
// Output: 2
// Example 3:

// Input: text = "leetcode"
// Output: 0

// balloon

// use an object to keep track of instances of each balloon char
    // in scrambled text
// Balloon - Can
// Initialise string s = "ballons
// Store each character of Balloon as key in HashMap
// Iteratte through the given strin s
// Use for loop i = 0 > end
// nlaebolko
// s.charAt(i)n == update value of the hashmap
// Get all the counts of the characters
// for each, iterate the HashMap , and compare the values of the count -> divide by the number of that character that existws in balloon to get the number of possible balloons that could be created
// if they are all equal 3 == 3 ==3
// return that value
// 3 == 3 == 2 , choose the minimum value and return that.

//keep track of balloon count
 */
public class H8_String {
    public static void main(String[] args) {

    }

    public static int maxNumberOfBalloons_Method1(String text) {
        int[] chars = new int[26]; //count all letters
        for (char c : text.toCharArray()) {
            chars[c - 'a']++;
        }
        int min = chars[1];//for b
        min = Math.min(min, chars[0]);//for a
        min = Math.min(min, chars[11] / 2);// for l /2
        min = Math.min(min, chars[14] / 2);//similarly for o/2
        min = Math.min(min, chars[13]);//for n
        return min;
    }

    public static int maxNumberOfBalloons_Method2(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        for(char ch : text.toCharArray()){
            switch(ch){
                case 'b': ++b;
                    break;
                case 'a': ++a;
                    break;
                case 'l': ++l;
                    break;
                case 'o': ++o;
                    break;
                case 'n': ++n;
                    break;
            }
        }
        return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));
    }
}
