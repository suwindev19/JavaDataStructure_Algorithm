package codeChef;

import java.util.Scanner;

public class CF_1_Life_Universe_Everything {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input =0;
        while (input != 42){
             input = sc.nextInt();
             if (input != 42){
                 System.out.println(input);
             } else{
                 break;
             }
        }
    }
}
