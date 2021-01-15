package Arrays.Array;

public class App {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for(int i = 1; i < nums.length; i++){
            nums[i] = i;
        }
        // O(1)
        int num = nums[4];
        System.out.println(num);

        // O(n) Linear search // can reduce to O(logn) binary tree --> O(1) with hashtables (hashmap)
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 4){
                System.out.println("Index found : " + i);
            }
        }
//        nums[5] =1;
//        System.out.println(nums[5]);


    }
}
