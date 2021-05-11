package maths;

public class LC_1228_Missing_Number_Arithmetic_Progression {
    public static void main(String[] args) {
        int[] arr = {15,13,12};
        System.out.println(missingNumber(arr));
    }

    public static int missingNumber(int[] arr) {
        int missing = arr[0];
        int diff = Math.abs(arr[0] - arr[1]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == diff + arr[i-1]) {
                continue;
            } else {
                missing = arr[i] + diff;
            }
        }
        return missing;
    }
}
