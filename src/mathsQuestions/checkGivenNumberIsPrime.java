package mathsQuestions;

public class checkGivenNumberIsPrime {
    public static void main(String[] args) {
        int num = 25;
        boolean isPrime = true;
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("Num is " + num + " is a prime number.");
        }else{
            System.out.println("It is not a prime number");
        }
    }
}
