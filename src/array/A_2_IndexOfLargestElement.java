package array;

public class A_2_IndexOfLargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 9};
        System.out.println(indexOfLargestElement(arr));

    }

    private static int indexOfLargestElement(int[] arr){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > arr[result]){
                result = i;
            }
        }
        return result;
    }
}
