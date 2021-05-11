package lc_contest;



import java.util.*;

public class lc_5727_Find_Winner_Of_Circular_Game {
    public static void main(String[] args) {
        int n = 6;
        int k = 5;
        System.out.println(findTheWinner(n, k));
    }

    // 0 - people removed
    // 1 - people still in the game
    public static int findTheWinner(int n, int k) {
        int[] arr = new int[n];
        for(int i =0; i < n; i++) {
            arr[i]  = 1;
        }
        int count =0;
        for(int j = 0; j < n -1; j++) { // n-1 removing
            int something = 0;
            for(int i = 0 ; i < k -1; i ++) {
                if (arr[(count + something) % n] == 0) { //             0/6 =0
                    i--;
                }
                something++;
            }
            count = (count + something) % n;
            arr[count] = 0;
            for(int i =0; i < n; i++) {
                System.out.println(arr[i]);
            }
            System.out.println("*******");
        }
        return count;
    }

}

/*

    }
 */