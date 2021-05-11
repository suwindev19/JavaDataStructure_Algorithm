package codeForces;
/*
 */
import java.sql.PreparedStatement;
import java.util.*;
// http://codeforces.com/problemset/problem/701/A
public class CF_A_Cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[n];
        int[] originalIndexes = new int[n];
        for(int i =0; i < n; i++){
            cards[i] = sc.nextInt();
        }
        //                   1 5 7 4 4 3
        // originalIndexes : 1 2 3 4 5 6
        for(int i = 0; i < n; i++){
            originalIndexes[i] = i + 1;
        }

        // 1 5 7 4 4 3
        // 1 2 3 4 5 6
        //===============
        // 1 3 4 4 5 7 - cards
        // 1 6 4 5 2 3 - Indexes
        // Sort cards and indexes according to cards
        // Bubble Sort
        for(int i = 0; i < n  ; i++){
            for(int j =0; j < n - i-1;j++){
                if (cards[j] > cards[j+1]){
                    int temp = cards[j];
                    cards[j] = cards[j +1];
                    cards[j+1] = temp;

                    int indexSwap = originalIndexes[j];
                    originalIndexes[j] = originalIndexes[j+1];
                    originalIndexes[j+1] = indexSwap;

                }
            }
        }

        for(int start = 0, end = n-1; start < end; start++, end--){
            System.out.println(originalIndexes[start] + " "+ originalIndexes[end]);
        }

    }
}
