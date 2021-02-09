package array;

public class A_12_FrequenciesInSortedArray {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 25, 30, 30};
        int[] arr1 = {10, 10, 10, 10};
        int[] arr2 = {10, 20, 30};
        findFrequenciesInSortedArray(arr);
    }

    // Time Theta(n)
    // Space O(1)
    public static void findFrequenciesInSortedArray(int[] arr){
        int count = 1, i = 1;
        while(i < arr.length){
            while(i < arr.length && arr[i] == arr[i-1]){
                count++;
                i++;
            }
            System.out.println(arr[i-1] + " " + count);
            i++;
            count = 1;
        }
        if(arr.length == 1 || arr[arr.length-1] != arr[arr.length-2]){
            System.out.println(arr[arr.length-1] + " " + 1);
        }
    }
}
