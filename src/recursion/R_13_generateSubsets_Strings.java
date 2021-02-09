package recursion;

/*
I/P s = "AB"
output : "", "A", "B", "AB"

Assumption : All characters in the input string are distinct
Generate subsequent of the string
subsequent, removing 0 or more character
Therefore , for a string of length n, there are going to be 2^n subsets.

""  ""
    "C"
"A" "A"
    "AC"
"B" "B"
    "BC"
"AB"    "AB"
        "ABC"
                    RECURSION TREE
                    --------------
                            cur=""
                 ""                     "A"             length 1
             ""      "B"            "A"     "AB"        length 2
         ""     "C" "B" "BC"      "A"  "AC" "AB" "ABC"  length 3

 */
public class R_13_generateSubsets_Strings {
    public static void main(String[] args) {
        String s = "ABC";
        String cur = "";
        int i = 0;
        generateSubsets_Recursion(s, cur, i);

    }

    static void generateSubsets_Recursion(String s, String cur , int i){
            if(i == s.length()){
                System.out.println(cur + " ");
                return;
            }

            generateSubsets_Recursion(s, cur, i+1);
            generateSubsets_Recursion(s , cur + s.charAt(i) , i+1);
    }

}






















