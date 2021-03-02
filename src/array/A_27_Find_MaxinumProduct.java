package array;
/*
    1. swap numbers + In place swap
        if you find 0 put at left side of array
        if you find 2 , put at right side of array
        if you find 1, don't do anything
    2. count 0, count 1, count 2
        first loop will count 0, 1, and 2
        second loop will place the numbers in the array
    3. sort (n log n)

    4. count + swap ( 1 loop)



 */
public class A_27_Find_MaxinumProduct {
    public static void main(String[] args) {

        int[] arr1= {-10, -2, 1, 2, 3, 4, 5, -20};
        System.out.println(maxProduct(arr1));


    }



    /*
    Maximize the products of three numbers

    1. sort - will cost you log(n)
    2. -10, -5, 2
        max1 max2 max3
        max1 min1 min2
        Iterate through the array

    3. 2 pointer, current max, max

        Find max
     */
    public static int maxProduct(int[] arr){
//        int max1 = 0, max2 = 0, max3 = 0;
//        int min1 = 0, min2 = 0;
        // negative and positive numbers in the code
        // All negative bounds and all positive bounds
        // Integer.Max_Value for min or 0 is OK. All the test cases will be covered.
        // If min1 x min2 x max1
        // All are negative.
        // Three possibilities
        // max1 max2 max3
        // min1 min2 max1
        // min1 min2 min3
        // -1, -2, -3 Therefore, it is only two products
        //  int product3 = min1 * min2 * min3;
        int max1 = Integer.MIN_VALUE, max2 =    Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max1){
                //
                max3 = max2;
                max2 = max1;
                max1 = arr[i];

            }else if(arr[i] > max2){
                max3 = max2;
                max2 = arr[i];
            }else if(arr[i] > max3){
                max3 = arr[i];
            }

            if(arr[i] < min1){
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i] < min2){
                min3 = min2;
                min2 = arr[i];
            }else if(arr[i] < min3){
                min3 = arr[i];
            }
        }
        int product1 = max1 * max2 * max3;
        int product2 = min1 * min2 * max1;

        int maxProduct = Math.max(product1 , product2);
        return maxProduct;
    }
}


























