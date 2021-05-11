package kickStart_April;

import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int N = sc.nextInt(); // students pool to select from
            int P = sc.nextInt();
            int testCases = 0;
            int[] skills = new int[N];
            for (int i = 0; i < N; i++) {
                skills[i] = sc.nextInt();
            }
            // 3 1 9 100
            // sort the array 100 9 3 1
            for (int i = 1; i < N; i++) {
                int temp = skills[i];
                int j = i - 1;
                while (j >= 0 && temp > skills[j]) {
                    skills[j + 1] = skills[j];
                    skills[j] = temp;
                    j--;
                }
                skills[j + 1] = temp;
            }
            int minHoursCoaching = 0;
            // Case 1 if N == P
            if (N == P){
                for(int i = 1; i < N; i++){
                    minHoursCoaching += skills[0] - skills[i];
                }
            }

            // Case 2 if P == 2
            if ( P == 2){
                int curr = 0;
                for(int i = 0; i < N -1; i++){
                    curr = skills[i] - skills[i-1];
                    minHoursCoaching = curr;
                    curr = Math.min(curr, minHoursCoaching);
                }
            }
            // Case 3 : All other cases
            int curr = 0;
            for(int i = 0; i < N; i++){
                for(int j = P -1; j > 0; j--){
                    curr = Math.abs(skills[j] - skills[j -1]);
                    minHoursCoaching = curr;
                }
                minHoursCoaching = Math.min(minHoursCoaching, curr);
            }
            System.out.println("Case #" + testCases + ": " + minHoursCoaching);
            testCases++;
            T--;
        }
    }
}