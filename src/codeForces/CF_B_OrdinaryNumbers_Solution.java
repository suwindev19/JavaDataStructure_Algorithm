package codeForces;

import java.util.Scanner;

public class CF_B_OrdinaryNumbers_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            ordinaryCount_Array(n);
        }
    }

    // 11, 22, 33, 44, 55, 66, 77, 88, 99 => 9
    // 111, 222, 333, 444, 555, 666, 777, 888, 999 => 9
//    public static void ordinaryCount(int n) {
//        long answer = 0;
//        for (int i = 1; i <= 9; i++) {
//            long currNum = 0;
//            for (int j = 1; j <= 9; j++) {
//                currNum = currNum * 10 + i;
//                if (currNum <= n) {
//                    answer++;
//                }
//            }
//        }
//        System.out.println(answer);
//    }

    public static void ordinaryCount_Array(int n) {
        long answer = 0;
        int[] possibleAnswers = {1, 2, 3, 4, 5, 6, 7, 8, 9,
                11, 22, 33, 44, 55, 66, 77, 88, 99,
                111, 222, 333, 444, 555, 666, 777, 888, 999,
                1111, 2222, 3333, 4444, 5555, 6666, 7777, 8888, 9999,
                11111, 22222, 33333, 44444, 55555, 66666, 77777, 88888, 99999,
                111111, 222222, 333333, 444444, 555555, 666666, 777777, 888888, 999999,
                1111111, 2222222, 3333333, 4444444, 5555555, 6666666, 7777777, 8888888, 9999999,
                11111111, 22222222, 33333333, 44444444, 55555555, 66666666, 77777777, 88888888, 99999999,
                111111111, 222222222, 333333333, 444444444, 555555555, 666666666, 777777777, 888888888, 999999999};
        for(int i = 0; i < possibleAnswers.length;i++){
            if (possibleAnswers[i] <= n){
                answer++;
            }
        }
        System.out.println(answer);
    }

}


