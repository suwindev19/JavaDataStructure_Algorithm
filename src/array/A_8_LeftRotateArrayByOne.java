package array;

public class A_8_LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5};
        leftRotateArray(arr);
    }

    public static void leftRotateArray(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 1; i < n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;


        for(int k = 0; k < arr.length; k++){
            System.out.print(arr[k] + " ");
        }
    }
}
