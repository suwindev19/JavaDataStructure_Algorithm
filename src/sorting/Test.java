package sorting;
import java.lang.Integer;

public class Test {
    public static void main(String[] args) {
        int[] arr = {28, 50, 100, 99};
        System.out.println(find_Difference_Largest_Smallest(arr));
    }

    public static int find_Difference_Largest_Smallest(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return max - min;
    }


    public static int maxNumber(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
