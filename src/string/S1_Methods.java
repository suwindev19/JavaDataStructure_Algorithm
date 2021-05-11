package string;
/*
    every character is
 */
public class S1_Methods {
    public static void main(String[] args) {
        // Four ways to create String in java
        // 1. Character Array/ ArrayList
//        char [] arr = {'a', 'p', 'p', 'l', 'e'};
//        // 2. String class, immutable string
//        // For string class, Threadsafe
//        String str = "apple";
//        String str1 = new String("apple");
//        // 3. StringBuffer, ThreadSafe class
//        // extra overhead
//        StringBuffer sb1 = new StringBuffer("apple");
//        // 4. StringBuilder, Not ThreadSafe
//        // only used within the Thread
//        // there is no extra overhead, requires mutable string
//        StringBuilder sb2 = new StringBuilder("apple");
//        String str2 = "software engineer";
//        System.out.println(str2.length());
//        System.out.println(str2.charAt(3));
//        System.out.println(str2.substring(2,5));

        // String literals pool in Java
//        if (str == str1) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

//        String s1 = "software Engineer";
//        String s2 = "Engineer";
//        // contains boolean value return
//        // case sensitive
//        System.out.println(s1.contains(s2));
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.indexOf(s2, 2));

        String s1 = "geeks";
        String s2 = s1;
        s1 = s1 + "forgeeks";

        System.out.println(s1);
        System.out.println(s1 == s2);



    }
}
