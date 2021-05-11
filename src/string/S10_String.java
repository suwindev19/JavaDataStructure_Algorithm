package string;
/*
Naive Substring search
Sentence    :   This is a test
Pattern     :   test
Worst case
O(NM)
------
N - text length
M - pattern length

 */
public class S10_String {
    public static void main(String[] args) {

    }

    public boolean isMatched(String text, String pattern){
        int lenOfText = text.length();
        int lenOfPattern = pattern.length();
        for(int i = 0; i <= lenOfText - lenOfPattern; i++){
            int j; // to track the letter of pattern
            // Compare the letters of pattern and text
            // ttttaaa
            //   tta therefore => i + j
            for(j =0; j < lenOfPattern;j++){
                if (text.charAt(i+j) != pattern.charAt(j)){
                    break;
                }
            }
            // check whether we have considered all the letters of the pattern
            if (j == lenOfPattern){
                return true;
            }
        }
        // search miss (pattern does not exits in the text
        return false;
    }
}
