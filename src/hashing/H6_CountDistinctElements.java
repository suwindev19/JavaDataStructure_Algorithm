package hashing;

import java.util.HashSet;

public class H6_CountDistinctElements {
    public static void main(String[] args) {
        int[] array = {10, 20, 10, 20, 30, 30, 50};
        System.out.println(countDistinctElements_HashSet(array));
    }

    public static int countDistinctElements_Naive(int[] array){
        int count = 0;
        for(int i =0; i < array.length;i++){
            boolean flag = false;
            for(int j =0; j < i; j++){
                if (array[i] == array[j]){
                    flag = true;
                    break;
                }
            }
            if (flag == true){
                count++;
            }
        }
        return count;
    }

    public static int countDistinctElements_HashSet(int[] array){
        HashSet<Integer> hs = new HashSet<>();
        for(int i =0; i < array.length;i++){
            hs.add(array[i]);
        }
        return hs.size();
    }
}
