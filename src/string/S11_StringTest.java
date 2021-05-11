package string;

public class S11_StringTest {
    public static void main(String[] args) {
        S10_String bruteForce = new S10_String();
        String text = "This is a test";
        String pattern = "test";
        System.out.println(bruteForce.isMatched(text, pattern));
    }
}
