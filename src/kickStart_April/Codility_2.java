package kickStart_April;

public class Codility_2 {
    public static void main(String[] args) {
        String s = "aabbabbcllozzzz";
        System.out.println(solution(s));
    }
    public static String solution(String s){
        int[] occurrences = new int[26];
        for(char ch : s.toCharArray()){
            occurrences[ch -'a']++;
        }
        char best_char = 'a';
        int best_result = occurrences[0];
        for(int i = 0; i < 26;i++){
            if (occurrences[i]> best_result){
                best_char = (char) ('a'+i);
                best_result = occurrences[i];
            }
        }
        return Character.toString(best_char);
    }
}
