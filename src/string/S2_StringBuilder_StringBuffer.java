package string;
/*
StringBuilder - mutable, not thread safe
StringBuffer  - mutable, thread safe

Output : Not same
 */
public class S2_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String s = new String();
        StringBuilder sb1 = new StringBuilder("geeks");
        StringBuilder sb2 = sb1;
        sb1 = sb1.append("forgeeks");
        if (sb1 == sb2) {
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}
