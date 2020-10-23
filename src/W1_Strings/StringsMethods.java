package W1_Strings;

public class StringsMethods {
    public static void main(String[] args) {
        String str1 = "rame-n@gmail.com";
        System.out.println(str1.matches(".*"));
        System.out.println(str1.matches("\\w@gmail(.*)"));

    }
}
