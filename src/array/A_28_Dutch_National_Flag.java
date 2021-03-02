package array;

public class A_28_Dutch_National_Flag {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 1, 2, 0, 0, 1, 0, 2};
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {-10, 3, 4, -2, 5};

        sortArray(arr);
    }

    public static void sortArray(int[] arr){
        int low = 0, high = arr.length -1, i = 0;
        while(i <=high){
            if(arr[i] == 0){
                int temp = arr[low];
                arr[low] = arr[i];
                arr[i] = temp;
                low++;
                i++;
            }else if(arr[i] == 1){
                i++;
            }else if(arr[i] == 2){
                int temp = arr[high];
                arr[high] = arr[i];
                arr[i] = temp;
                high--;
            }
        }
        for(int a : arr){
            System.out.print(arr[a] + " ");
        }
    }
}
