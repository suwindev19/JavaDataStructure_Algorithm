# Java - Data Structure and Algorithms and LeetCode Problems

This repo contains the collection of java notes and leetcode coding challenges exercises that I am currently studying to learn more about Data Structure and Algorithms. This repo is being updated progressively.

<img src="./img/dsa.png" alt="Java Coding" width="600"/>

## Coding Challenges

The data structure and algorithms concepts and theories, and java methods, core java learnt from each session are detailed under each **_Weekly Learning Summary_**.

**Table of Contents**

```

-------------------------------
Week -1 Strings
    -Day 1: Reverse String
    -Day 1: Valid Palindrome
    -Day 1: Vaccum Cleaner Path
-------------------------------
Week -2
-------------------------------

```

## Weekly Learning Summary

### Week -1 Strings (Oct 2020)

### Java Strings Methods

- [String methods](https://www.tutorialspoint.com/java/lang/java_lang_string.htm)

- **[java.lang.Character.isLetterOrDigit(char ch)](https://www.tutorialspoint.com/java/lang/character_isletterordigit.htm)**
  - The java.lang.Character.isLetterOrDigit(char ch) determines if the specified character is a letter or digit.
  - A character is considered to be a letter or digit if either Character.isLetter(char ch) or Character.isDigit(char ch) returns true for the character.
  - String.charAt(i)
- **Two Pointer Technique - one of the techniques**

  - int pointer i, increment
  - int pointer j, decrement

- **[java.lang.String.valueOf(char[] data)](https://www.tutorialspoint.com/java/lang/string_valueof_chararray.htm)**

  - The java.lang.String.valueOf(char[] data) method returns the string representation of the char array argument.
  - The contents of the character array are copied and subsequent modification of the character array does not affect the newly created string.

- \***[String toCharArray() Method](https://beginnersbook.com/2013/12/java-string-tochararray-method-example/)**\*\*

  - The method toCharArray() returns an Array of chars after converting a String into sequence of characters.
  - The returned array length is equal to the length of the String and the sequence of chars in Array matches the sequence of characters in the String.

```
    public class CharArrayExample{
        public static void main(String args[]){
                String str = new String("Welcome to BeginnersBook.com");
                char[] array= str.toCharArray();
                System.out.print("Content of Array:");
                for(char c: array){
                    System.out.print(c);
                }
            }
    }
```

### References

- Java.lang.Character.isLetterOrDigit() Method, https://www.tutorialspoint.com/java/lang/character_isletterordigit.htm
- Java tutorial: Learn Java Programming with examples, https://beginnersbook.com/java-tutorial-for-beginners-with-examples/
-
-
