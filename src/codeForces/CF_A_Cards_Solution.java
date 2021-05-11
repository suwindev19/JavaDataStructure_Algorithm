package codeForces;

import java.util.Scanner;

public class CF_A_Cards_Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cards = new int[100];
        double average = 0.0, sum = 0.0;
        for(int i = 1; i <= n; i++){
            cards[i] = sc.nextInt();
            sum += cards[i];
        }
        average = (sum/ n)*2 ; // each player will get 2 cards
        for(int i = 1; i <= n; i++){
            if (cards[i] !=0){
                for(int j = 1; j <=n; j++){
                    if( cards[i] + cards[j] == average && i !=j){
                        System.out.println(i + " " + j);
                        cards[i] =  0;
                        cards[j] = 0;
                    }
                }
            }
        }
    }
}
