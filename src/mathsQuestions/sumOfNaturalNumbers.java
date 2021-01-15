package mathsQuestions;

public class sumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(sumNaturalNumbers(n));
        System.out.println(sumNaturalNumbersIterative(n));
    }
    // Approach 1
    // Time O(n) | Space O(1)
    public static int sumNaturalNumbersIterative(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    // Approach 2
    // Time O(1) | Space O(1)
    public static int sumNaturalNumbers(int n){
        return n * (n+1)/2;
    }
}
