package lc_contest;

public class lc_5722_Truncate_Sentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        System.out.println(truncateSentence(s, k));
    }

    public static String truncateSentence(String s, int k) {
        StringBuffer sb = new StringBuffer();
        String[] arr = s.split("\\s+");
        for (String stest : arr) {
            System.out.println(stest);
        }

        for (int i = 0; i < k; i++) {
           sb.append(arr[i]+ " ");
        }


        return sb.toString().trim();
    }
}
