package array;
/*
int[ ] arr = { 0, 1, 1, 0, 1, 0}
output = 2

int[ ] arr = { 1, 1, 1, 1}
output = 4

int[ ] arr = {0, 0, 0}
output = 3
 */
public class A_16_MaximumConsecutive1s {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 1, 0, 1, 1, 1, 0};
        System.out.println(maximumConsecutive1s_Efficient(arr));
    }

    public static int maximumConsecutive1s(int[] arr){
        int maxCount = 0;
        for(int i = 0; i < arr.length; i++){
            int currentCount = 0;
            for(int j = i; j < arr.length; j++){
                if(arr[j] == 1) currentCount++;
                else break;
            }
            maxCount = Math.max(currentCount, maxCount);
        }
        return maxCount;
    }

    public static int maximumConsecutive1s_Efficient(int[] arr){
        int maxCount = 0, currentCount = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 0){
                currentCount = 0;
            }else{
                currentCount++;
                maxCount = Math.max(currentCount, maxCount);
            }
        }
        return maxCount;
    }
}
