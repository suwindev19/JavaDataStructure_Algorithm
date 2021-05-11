package kickStart_April;

public class Test {
    public static void main(String[] args) {
        int[] array = {100, 9, 3, 1};
        int N = 4;
        int P = 3;
        while (P > 0){
            int min =0;
            int curr = 0;
            int count = 0;
            for(int i = 0; i < N; i++){
                for(int j = i; j < P -1; j++){
                    curr =  Math.abs(array[count] - array[j+1]);
                    min += curr;
                }
                count++;
            }
            P--;
            System.out.println(min);
        }
    }
}
