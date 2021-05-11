package kickStart_April;

import java.util.Scanner;

public class Allocation_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 1; t <= T; t++){
            int N = sc.nextInt();
            int B = sc.nextInt();
            int[] housesCost = new int[N];
            for(int i =0; i < N; i++){
                housesCost[i] = sc.nextInt();
            }
            // Sort the houses array - Insertion sort
            for (int i = 1; i < housesCost.length;i++){
                for(int j = i -i; j < i; j++){
                    if (housesCost[i] < housesCost[j]){
                        int temp = housesCost[i];
                        housesCost[i] = housesCost[j];
                        housesCost[j] = temp;
                    }
                }
            }
            int result = 0;
            for(int i =0; i < N; i++){
                if(housesCost[i] <= B){
                    B -= housesCost[i];
                    result++;
                }
            }
            System.out.println("Case #" + t +": "+ result);
        }
    }
}
