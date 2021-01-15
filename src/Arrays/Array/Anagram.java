package Arrays.Array;

import java.util.Arrays;

/**
 * Construct an algorithm to check whether two words (or phrases) are anagrams or not!
 * "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"
 */
public class Anagram {

    public boolean checkAnagram(char[] s1, char[] s2){
        if(s1.length != s2.length) return false;
        // bottleneck because it has O(nlog n ) running time
        Arrays.sort(s1);
        Arrays.sort(s2);

        // O(n) Time
        // O( n log n) + O(n) => O( n log n)
        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[] s1 = {'r','e', 's', 't', 'f', 'u', 'l'};
        char[] s2 = {'f', 'l', 'u', 's', 't', 'e', 'r'};

        Anagram anagram = new Anagram();
        System.out.println(anagram.checkAnagram(s1, s2));
    }

}
