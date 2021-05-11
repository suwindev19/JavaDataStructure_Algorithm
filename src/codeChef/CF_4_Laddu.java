package codeChef;

import java.util.Scanner;

public class CF_4_Laddu {
    public static void main(String[] args) {
//        String answer = "";
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0){
            int laddus =0;
            int activities = sc.nextInt();
            String nationality = sc.next();
            while (activities > 0) {
                String kind = sc.next();
                if (kind.equals("CONTEST_WON")) {
                    int rank = sc.nextInt();
                    int bonus = Math.max(0, 20 -rank);
                    laddus += 300 + bonus;
                } else if (kind.equals("TOP_CONTRIBUTOR")) {
                    laddus += 300;
                } else if (kind.equals("BUG_FOUND")) {
                    int bug = sc.nextInt();
                    laddus += bug;
                } else if (kind.equals("CONTEST_HOSTING")) {
                    laddus += 50;
                }
                activities--;
            }
            System.out.println(laddus / (nationality.equals("INDIAN") ? 200 : 400));
            T--;
            //            int result = 0;
//            int redeem = 0;
//            if (nationality.equals("INDIAN")){
//                redeem = 200;
//            } else if (nationality.equals("NON_INDIAN")){
//                redeem = 400;
//            }
//            result = laddus/ redeem;
////            answer += result + "\n";
//            System.out.println(result);

        }
//        System.out.println(answer);
    }
}
