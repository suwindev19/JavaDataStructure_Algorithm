package hashset;

public class H4_Repeating_Elements {
    public static void main(String[] args) {

    }

    public static void printRepeatedElements(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
