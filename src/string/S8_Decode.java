//package string;
//
//import java.util.Stack;
//
//public class S8_Decode {
//    public static void main(String[] args) {
//        String  s = "2[abc]3[cd]ef";
////        String[] s1 = s.split("[^[]]");
//        System.out.println(s1);
//
//    }
//
//    public String decodeString(String s) {
//        // Two stacks to store two values
//        // one for integer
//        // one for string
//        Stack<Integer> intStack = new Stack<>();
//        Stack<String> strStack = new Stack<>();
//        StringBuffer sb = new StringBuffer();
//
//        int n = s.length();
//        // Iterate through the string
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            if (Character.isDigit(c)) {
//                int num = c - '0'; // why '0'
//                while (i+1 < n && Character.isDigit(s.charAt(i+1))) {
//                    num = num * 10 + s.charAt(i+1) -'0';
//                    i++;
//                }
//            }
//        }
//    }
//}
