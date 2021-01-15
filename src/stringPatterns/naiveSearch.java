package stringPatterns;

public class naiveSearch {
    public static void main(String[] args) {
        String text = "AABAACAADAABAAABAA";
        String pattern = "AABA";
        search(text, pattern);
    }

    // text = "AABAACAADA   A  B  A  A  A  B  A  A";
    //         12345678910  11 12 13 14 15 16 17 18
    // pattern = "AABA";
    public static void search(String text, String pattern){
        int n = text.length(); //18
        int m = pattern.length(); // 4

        // Loop to slide pattern one by one
        for(int i = 0; i <= n -m; i++){ // i < 18-4 (14)
            int j;
            // for current index i, check for pattern match
            for( j = 0; j < m; j++){ //
                if(text.charAt(i+j) != pattern.charAt(j)) // 0 + 0 != A |
                    // 0 + 1 = 1 A != A
                    break;
            }
            if(j == m) // j
                System.out.println("Pattern found at index " + i);
        }
    }
}
