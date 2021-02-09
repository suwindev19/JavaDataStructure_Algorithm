package array;

import java.io.StringReader;

/*

 */
public class A_10_LeaderIntheArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        leaderInTheArray(arr);
    }

    //Time O(n^2)
    // Space O(1)
    public static void leaderInTheArray(int[] arr){
        for(int i = 0 ; i < arr.length; i++){
            boolean flag = false;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                System.out.print(arr[i] + " ");
            }
        }
    }

    // Theta (n)
    public static void leaderInTheArray_Efficient(int[] arr) {
        int currentElement= arr[arr.length-1];
        System.out.print(currentElement);
        for(int i = arr.length-2; i >= 0; i--){
            if(currentElement < arr[i]){
                currentElement = arr[i];
                System.out.print(currentElement);
            }
        }
    }

}
