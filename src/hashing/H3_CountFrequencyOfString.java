package hashing;

public class H3_CountFrequencyOfString {
    public static void main(String[] args) {
        String s = "ababcdeeff";
//        countCharacters(s);
        countCharacters_Hashing(s);
    }

    public static void countCharacters(String s){
        for(char i = 'a'; i <= 'z'; i++){
            int count = 0;
            for(int j = 0; j < s.length();j++){
                if (s.charAt(j) == i){
                    count++;
                }
            }
            System.out.println("Character: " + i + " count: " + count);
        }
    }

    public static int hashFunction(char c){
        return c -'a';
    }

    public static void countCharacters_Hashing(String s){
        int[] frequency = new int[26];
        for(int i =0; i < s.length();i++){
            int index = hashFunction(s.charAt(i));
            frequency[index]++;
        }
        for(int i =0; i < 26; i++){
            System.out.println("Char: " + (char) (i+'a') + " Freq: " + frequency[i]);
        }
    }
}
