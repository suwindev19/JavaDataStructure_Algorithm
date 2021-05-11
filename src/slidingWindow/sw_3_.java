package slidingWindow;

import java.util.Scanner;

public class sw_3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = 4;
        // Index       0   1  2   3
        int[] array = {1 , 3, 4, 6};
        int Q = 2;
        int L = 1;
        int R = 4;
        while (Q > 0){
            L = L -1;
            R = R -1;
            int curr = 0;
            int min = 0;
            for (int i = L +1 ; i < R; i++){
                for(int j = i ; j < R -1 ; j++){
                    int test1 = array[j];
                    int test2 = array[j+1];
                    curr = Math.abs(test1 - test2);
                    min = curr;
                    min = Math.min(min, curr);
                }

            }
            System.out.println(min);
            Q--;
        }
    }


}
