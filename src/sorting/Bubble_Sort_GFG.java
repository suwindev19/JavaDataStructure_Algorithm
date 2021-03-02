package sorting;
/*
    2 10 8 7
    After 1st pass, maximum element reaches to its final position.
    2> 10, no
    2 10 8 7 no swapping
    10 > 8 , yes, swap
    2 8 10 7
    10 > 7 , yes, swap
    2 8 7 10 Bubble up to the last position
    -----------------------------------
    2 > 8 no, not swap
    2 8 7 10
    8 > 7 , yes , swap
    2 7 8 10
    -----------------------------------

     2 > 7 no, not swap
     2 7 8 10

 */
public class Bubble_Sort_GFG {
    public static void main(String[] args) {
        int[] arr =  {2, 10, 8 , 7};
        bubbleSort_Efficient1(arr);
    }

    public static void bubbleSort(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        for(int i  : arr){
            System.out.print(i + " ");
        }
    }
    // Time n * (n-1)/2
    // Space O(1)
    // If the array is already sorted,
    public static void bubbleSort_Efficient1(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }
        for(int i  : arr){
            System.out.print(i + " ");
        }
    }

    /*
    3, 5, 10, 20, 40
    j = 3 < 5 , false
    j = 5 < 10, false
    j = 10 < 20, false

    Stability in bubble sort
    two items with same values, it will not change the position
    It is in place sorting
     */

    public static void bubbleSort_Efficient2(int[] arr){
        for(int i = 0; i < arr.length -1; i++){
            boolean swapped = false;
            for(int j = 0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    swapped = true;
                }
            }

            if(swapped == false){
                break;
            }
        }


        for(int i  : arr){
            System.out.print(i + " ");
        }
    }


}
