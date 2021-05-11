package maths;

import java.util.Scanner;
/*
// number of test cases
3
// individual test case
1 2 2
3 8 5
2 2 8

 */
public class Maths_1_Find_nth_Term_Arithmetic_Progression {
    public static void main(String[] args) {
        int test, a, n, d;
        Scanner sc = new Scanner(System.in);
        test = sc.nextInt();
        int[] arr = new int[test];
        int i = 0;
        while (test >0) {
            a = sc.nextInt();
            n = sc.nextInt();
            d = sc.nextInt();
            arr[i] = a + (n-1) * d;
            i++;
            test--;
        }
        for(int j : arr){
            System.out.println(j);
        }
    }
}
