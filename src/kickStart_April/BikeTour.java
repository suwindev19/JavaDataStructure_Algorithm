package kickStart_April;

import java.util.Scanner;


public class BikeTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int testCase = 1;
        while (T > 0 ){
            int N = sc.nextInt();
            int[] checkPoints = new int[N];
            for (int i = 0; i < N; i++){
                checkPoints[i] = sc.nextInt();
            }
            int numOfPeaks = 0;
            boolean  isPeak = false;
            for (int i =0; i < N; i++){
                if (checkPoints[i] != checkPoints[0] && checkPoints[i] > checkPoints[i -1]){
                    isPeak = true;
                    numOfPeaks +=1;
                }
            }
            System.out.println("Case #" + testCase + ": " + numOfPeaks);
            testCase++;
            T--;
        }
    }
}
