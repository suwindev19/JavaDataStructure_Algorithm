package string;

/*
Strings and StringBuilders
- Strings - immutable, everytime you change, a new object is created.
StringBuilder
- deals with a sequence of characters so it is mutable
- StringBuffer is the same as StringBuilder, but it is synchronised, so it works
    fine in multi-threaded environment.
    - but it is slower

    String          Runtime         memory
    - length()
    - charAt()
    - substring()   O(1)            O(1)
    - concat()      O(n)            O(N)


Suffixes or Prefixes Use (String class)
=======================================
- House
   -    e
   -    se
   -    ouse
   -    House
String class is better since run time is O(1) and

Prefixes - use String class
===========================
- House
    -H
    -Ho
    -Hou
    -Hous
    -House

 */

import java.util.ArrayList;
import java.util.List;

public class S13_StringMethods {
    public static void main(String[] args) {
        String s1= "appleorange";
//        System.out.println(reverseString(s));
        //=========================================
//        List<String> suffixes = getSuffixes(s);
//        for(String suffix : suffixes){
//            System.out.println(suffix);
//        }
        //=========================================
//        List<String> prefixes = getPrefixes(s);
//        for(String prefix : prefixes){
//            System.out.println(prefix);
//        }
        //=========================================
//        String s2 = "apporange";
//        String s3 = longestCommonPrefix(s1, s2 );
//        System.out.println(s3);
        //=========================================
        String[] stringList = {"flower","flow","flight"};
        String s = longestCommonPrefix_VerticalScanning(stringList);
        System.out.println(s);
        //=========================================
//        String[] stringList = {"flower","flow","flight"};
//        String s = longestCommonPrefix_StringList(stringList);
//        System.out.println(s);
    }
    // Trie - is a tree like data structure
    public static String reverseString(String text){
        int len = text.length(); // O(1)
        StringBuilder reversedString = new StringBuilder();
        for(int i=len-1; i>=0; i--){ // O(1) + O(n)
            reversedString.append(text.charAt(i));
        }
        return  reversedString.toString();
    }

    public static List<String> getSuffixes(String text){
        int lenText = text.length(); // O(1)
        List<String> suffixes = new ArrayList<>();
        for(int i =0; i < lenText; i++){
            suffixes.add(text.substring(i, lenText)); // O(1)

        }
        return suffixes;
    }

    public static List<String> getPrefixes(String text){
        int len = text.length(); ///5
        List<String> prefixes = new ArrayList<>();
        // apple
        for(int i = 0; i < len +1; i++){
            prefixes.add(text.substring(0,i));
        }
        return prefixes;
    }

    public static String longestCommonPrefix(String s1, String s2){
        int commonLen = Math.min(s1.length(), s2.length());
        for(int i =0; i < commonLen; i++){
            if (s1.charAt(i) != s2.charAt(i)){
                return s1.substring(0, i); // O(1)
            }
        }
        return s1.substring(0,commonLen);
    }

    public static String longestCommonPrefix_StringList(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++)
            while(!strs[i].startsWith(pre))
                pre = pre.substring(0,pre.length()-1);
        return pre;
    }

    public static String longestCommonPrefix_VerticalScanning(String[] strs){
        if (strs == null || strs.length == 0) return "";
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(int j = 1; j < strs.length; j++){
                if (i == strs[j].length() || c != strs[j].charAt(i)){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
