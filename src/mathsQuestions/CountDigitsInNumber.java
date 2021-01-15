package mathsQuestions;

public class CountDigitsInNumber {
    public static void main(String[] args) {

        /*------ Count digits in a number------*/
        int num = 121313;
        CountDigitsInNumber countDigitsInNumber = new CountDigitsInNumber();
//        System.out.println(mathsQuestions.findNumDigitsIterative(num));
//        System.out.println(mathsQuestions.findNumDigitsRecursive(num));
        System.out.println(findNumDigitsLogarithm(num));
        findNumDigitsString(num);
    }

    public int findNumDigitsIterative(int num){
        // Approach 1 - Iterative
        // Time O(n)
        int digitsCount = 0;
        while(num !=0){
            digitsCount += 1;
            num /= 10;
        }
        return digitsCount;
    }

    // Time O(n)
    public int findNumDigitsRecursive(int num){
        if(num == 0) return 0;
        return findNumDigitsRecursive(num/10) + 1;
    }

    // 10^k-1 <= N < 10^k
    // k-1 <= log10 N < k
    // k <= log10 N + 1 < k + 1
    /// Time O(1)
    static int findNumDigitsLogarithm(int num){
        return (int) Math.floor(Math.log10(num)) + 1;
    }

    static void findNumDigitsString(int num){
        String count = Integer.toString(num);
        System.out.println(count.length());
    }
}
