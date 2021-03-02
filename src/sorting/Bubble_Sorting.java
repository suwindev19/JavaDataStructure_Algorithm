package sorting;
/*

Selection is top to down.

bubble it is like a water bubble, it comes up

        2
        5
        1
        3
        4
 i = 0
 j = 0
 j > j + 1, swap
 increment j
 Last value is in the correct position

bottom up sorting

I=0		[1]		j
			[2]
————————

			[3]
			[4]
			[5]

j<arr.length-i-1=>0-3
J<arr.length-i-1=>0-2


J.  J+1=>5
 */
public class Bubble_Sorting {
    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1};
        bubleSort(nums);
    }

    public static void bubleSort(int[] nums){
        for(int i = 0; i < nums.length ; i++){
            for(int j = 0; j < nums.length -i -1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        for(int i : nums){
            System.out.print(i + " ");
        }

    }
}
