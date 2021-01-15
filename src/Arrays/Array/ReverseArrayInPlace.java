package Arrays.Array;

public class ReverseArrayInPlace {
    // O(n) Time + O(1) Space
    public int[] reverseArray(int[] array){
        //pointer for the first item
        int startIndex = 0;
        int endIndex = array.length-1;

        // swap 2 items using Two pointer technique
        while(endIndex > startIndex){
            // swap two items
            swap(array, startIndex, endIndex);
            // increment and decrement the indexes
            startIndex++;
            endIndex--;
        }
        return array;
    }

    private void swap(int[] nums, int startIndex, int endIndex){
        int temp = nums[startIndex];
        nums[startIndex ] = nums[endIndex];
        nums[endIndex] = temp;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        ReverseArrayInPlace reverseArrayInPlace = new ReverseArrayInPlace();
        int[] test = reverseArrayInPlace.reverseArray(array);

        for(int i = 0; i < test.length; i++){
            System.out.print(test[i] + " ");
        }

    }
}
