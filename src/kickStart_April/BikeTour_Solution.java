package kickStart_April;

import java.util.Scanner;

public class BikeTour_Solution {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int T = sc.nextInt();
            for(int t = 1; t <=T; t++){
                int N = sc.nextInt();
                int[] heights = new int[N];
                for(int i = 0; i < N; i++){
                    heights[i] = sc.nextInt();
                }
                int numOfPeaks = 0;
                // start at 1 and skip beginning and end elements
                for(int i = 1; i < N -1;i++){
                    if (heights[i-1] < heights[i] && heights[i+1] < heights[i]){
                        numOfPeaks++;
                    }
                }
                System.out.println("Case #" + t + ": " + numOfPeaks);
            }
        }
    }
}
