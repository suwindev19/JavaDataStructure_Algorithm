package strings;

/**
 * ["flower","flow","flight"]
 * ["dog","racecar","car"]
 */
public class W1_14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strArray1 = new String[]{"flower","flow","flight"};
        String[] strArray2 = new String[]{"dog","racecar","car"};
//        System.out.println(longestCommon(strArray1));
//        System.out.println(longestCommon(strArray2));

    }

    // Approach 1
    // longestCommonPrefix = ""
    // move to the next index and compare each index of the string in the array
    // edge case => empty array return empty string
    public static String longestCommon(String[] strs){
        if(strs == null || strs.length == 0) {
            return "";
        }

        // initialise the long common prefix
        String longestCommonPrefix = strs[0];

        for(int i = 1; i < strs.length; i ++){
            int j = 0;
            String currentString = strs[i];

            while(j < longestCommonPrefix.length() && j < currentString.length() && longestCommonPrefix.charAt(j) == currentString.charAt(j)){
                j++;
            }

            if(j == 0){
                return "Empty string";
            }
            longestCommonPrefix = longestCommonPrefix.substring(0, j);
        }
        return longestCommonPrefix;
    }

    // Approach
    // Time : O(n), Space:
    public static String longestCommon1(String[] strs){

        if(strs.length == 0 )return "";
        String prefix = strs[0];

        for(int i = 1; i < strs.length; i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
