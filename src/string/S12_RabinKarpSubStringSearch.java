package string;

public class S12_RabinKarpSubStringSearch {
    public static void main(String[] args) {
        String text = "This is test";
        String pattern = "test";
        System.out.println(rabinKarpSubstring(text, pattern));
    }

    /*
    Rabin Karp
    - Use Hash function - to transform multiple characters into a single value
    - And compare the integers
    Hash Function
    a   1
    b   2
    c   3
    d   4
    .
    .
    .
    z   6
    tttta
    t    t    a
    20 + 20 + 1 = 41

    Use hashing and hash function
    Computer h(p) hash value of the pattern in advance O(m) m is length of the pattern
    If hash values matches, you need to compare character by character
    tttta
    tta

    abbba
    abb = 1 + 2 + 2 = 5
    Pattern : aac = 1 + 1 + 3 = 5
    - Spurious state Hash values are the same, but characters are different
    Therefore O(m x n) for worst case
    Therefore use Rahin finger print function , there may be suprious hits
    but extremely low probability
    Use polynomial function

    Finger print function
    f(x) = m0 + m1x + ... + mn-1x^n-1
    1 x 26^2
    number of pattern -1
    705 % 31 = 23;

    Minimize the probability of spurious hits

    Rolling Hash Function - minimize the suprious hits
    --------------------------------------------------
    It is crucial to be able to calculate the next hash value in O(1) of the substring

    A   B   B   B   A
    ---------
    A   B   B   B   A
        ---------

    Most letters are the same for the next hash value so rolling hash allows
    calculate the hash without rehashing the whole substring

    hashFunction("bbb") = hashFunction("abb) - hash("a") + hash("b")
    (1x26^2 + 2x 26^1 + 2x26^0) - 26) + 2 x 26^0

    f(x) = m0 + m1x + ... + mn-1x^n-1
    x is prime number
     */
    // size of english alphabets
    private static int alphabetSize = 26;
    private static int primeNumber = 31; // prime number for modulo operator
    public static boolean rabinKarpSubstring(String text, String pattern){
        int lenPattern = pattern.length();
        int lenText = text.length();
        // Hashes for the region of text and pattern
        int hashText =0;
        int hashPattern =0;
        int h = 1; // largest polonomial term in rabin finger print function
        for(int i =0; i < lenPattern-1; i++){
            h = h* alphabetSize % primeNumber;
        }
        // pre-compute the hash of the pattern O(m)
        for(int i =0; i < lenPattern; i++){
            hashPattern = (alphabetSize * hashPattern + pattern.charAt(i)) % primeNumber;
        }

        // COME BACK TO THIS ONE
//        for(int i = 0; )
        return false;
    }
}
