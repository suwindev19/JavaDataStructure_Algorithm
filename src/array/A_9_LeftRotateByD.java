package array;
/*
input [ ] = { 1, 2,3, 4, 5}
        d = 2;
output [ ] = {3, 4, 5, 1, 2}
Assume d elements is less than number of elements n in the Array

3 solutions
1. Time: Theta(nd), Space Auxillary Theta(1)

 */
public class A_9_LeftRotateByD {
    public static void main(String[] args) {
        int[] arr = { 1, 2,3, 4, 5};
        int d = 2;
        leftRotateByD_Reversal(arr, d);

    }

    /*
    Time Theta ( d + n-d + d) therefore Theta(n)
    Auxillary space = Theta(d)
     */
    public static void leftRotateByD(int[] arr, int d){
        // { 1, 2,3, 4, 5};
        //   0  1 2  3  4
        int[] temp = new int[d];
        for(int i = 0; i < d; i++){
            temp[i] =arr[i];            // {1,2}
        }
        for(int i = d; i < arr.length; i++){    // 3, 4, 5
            arr[i-d] = arr[i];                  // 3 -3 = 0 => {3 4, 5
        }
                                        // index   0  1  2   3  4 || 5 -2 =3
        for(int i = 0; i < d; i++){             // 3, 4, 5 , 1, 2
            arr[arr.length -d + i] = temp[i];
        }

        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public static void leftRotateByD_Reversal(int[] arr, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);

        for(int i  = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void reverse(int arr[], int low, int high){
        while(low< high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

    }

}
