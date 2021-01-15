package strings;

/**
 * Given a non-empty string of lowercase letters and a non-negative integer representing a key.
 * Write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabets, where k is the key.
 *
 * Note that the letters should "wrap" around the alphabet; in other words, the letter z shifted by one returns the letter a
 *
 *
 */
    // Algorithm
    // create an array with elements from the given plainText
    // each letter - shift the letter by the given key
    // Approach 1 : Using ascii value Base 10
    // use ascii value, a = 97 , b = 98, c = 99, ..., z = 122
    // To get the shifted letter, use the original letter and add shift key to get the encrypted letter
    // e.g. if the letter is z (unicode value is 122) , if shifts by 3, c
    // To wrap around the alphabet, use mod operator
    // if given letter is <= 122 , return the value
    // else return (96 + given string) % 122 (To wrap the character)
    // e.g. a -> shift by 3 -> d | (96 + 96) % 122 , remainder is 96 | (96 + 122) % 122 , remainder is 96.
    // edge case to be considered:
    // What if the key is a big number? e.g. 54 = 2 * 26 + 2 , 100 = 3 * 36 + 22
    // To void the big number conversion, at the beginning of the algorithm, key = key % 26



public class W1_Caesar_Cipher_Encryptor {
    public static void main(String[] args) {
        System.out.println(caesarCipher("zthe quick brown fox", 3));
    }

    public static String caesarCipher(String str, int shift){
        // create a new char array to store the newly encrypted cipher text string
        char[] encrypted = new char[str.length()];

        // this is to give the exact shift number for both large and small numbers
        int newShift = shift % 26;

        // Iterate through given char array of the string elements
        for(int i = 0; i < str.length(); i++){
            encrypted[i] = getNewLetter(str.charAt(i), newShift);
        }
        return new String(encrypted);
    }

    public static char getNewLetter(char letter, int shift){
        // shift the letter and get the newly shifted unicode.
        int newLetterCode = letter + shift;
        // ternary operator if newLetterCode <= 122, give the char as it.
        // else wrap the char
        return newLetterCode <= 122 ? (char) newLetterCode : (char) (96 + newLetterCode % 122);
    }
}
