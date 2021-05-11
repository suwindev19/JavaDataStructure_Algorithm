package string;

public class S5_Pattern_Searching {
    public static void main(String[] args) {
//        String text = "geeks for geeks";
//        String pattern = "geeks";
        String text = "aaaaa";
        String pattern = "aaa";
        patternSearch(text, pattern);

        String no = "12.385";
        System.out.println(digitsAfterDecimalPoint(no));
    }
    public static void patternSearch(String text, String pattern) {
        int position = text.indexOf(pattern); // index of first occurrence of text
        while (position >= 0) {
            System.out.println(position + " ");
            position = text.indexOf(pattern, position+1);
        }
    }

    public static String digitsAfterDecimalPoint(String s) {
        String result = "";
        int position = s.indexOf('.');
        if (position < 0) {
            return "";
        } else {
            result = s.substring(position+1, s.length());
        }
        return result;
    }


}
