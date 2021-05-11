package kickStart_April;

import java.util.Scanner;

public class FaceBook_PasswordCheck_Challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        StringBuilder result = new StringBuilder();
        for(int i =0; i < a.length() || i < b.length();i++){
            if (i < a.length()){
                result.append(a.charAt(i));
            }
            if (i < b.length()){
                result.append(b.charAt(i));
            }
        }
        System.out.println(result);
    }
}
