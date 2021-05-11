package maths;

import java.util.Scanner;

public class Maths_2_Sum_Of_N_Natural_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n * (n+1)/2);
    }
}
