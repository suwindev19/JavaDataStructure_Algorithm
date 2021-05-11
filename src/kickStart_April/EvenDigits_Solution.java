package kickStart_April;
/*
Make the problem simpler
Two cases to consider
N integer
N + 1 = call it M
N - 1 = call it L
if N is already beautiful.

Higher value (M)
- find the first occurrence of odd digit x
- replace x by x -1, which is even digit
- replace all digits right of x by 8 since we need
  to maximise the number

Lower value (L)
- find the first occurrence of odd digit x
- if x is not 9, replace x by x + 1, which is even digit
- if x is 9, replace x by 0
    - walk to the left of x until you hit y, a non-8-digit,
      while replacing each traversed digit by 0
        - If there is no such y, answer is 2 followed by
          length of N 0's
        - Otherwise, replace y by y + 2;
    - Replace all digits right of x by 0
      since we need to minimize the number
Confusing
 */
public class EvenDigits_Solution {
    public static void main(String[] args) {
         int N = 9122;
        System.out.println(convertCharArrayBackToInteger(smallestEvenN(convertIntegerToCharArray(N), N)));
        System.out.println(convertCharArrayBackToInteger(largestEvenN(convertIntegerToCharArray(N), N)));

    }
    public static char[] convertIntegerToCharArray(int N) {
        // Convert N to char array
        int len = Integer.toString(N).length();
        char[] array = new char[len];
        for(int i = 0; N !=0; N /=10){
            array[len-i-1] = (char) (( N % 10) + '0');
            i++;
        }
        return array;
    }

    public static char[] largestEvenN(char[] array, int N){
        // 9 1 2 2
        // 2
        for(int i = 0; i < array.length;i++){
            if (Integer.parseInt(String.valueOf(array[i] - '0' + "")) % 2 ==0){
                continue;
            }
            if (array[i] == '9'){
                char[] arrayN = new char[N +1];
                for(int k = 0; k < array.length;k++){
                    arrayN[k+1] = array[k];
                }
                arrayN[0] = '0';
                arrayN[i+1] = '0';
                arrayN[i]++;
                return largestEvenN(arrayN, N);
            }
            for(int j = i + 1; j < array.length ; j++){
                array[j] = '0';
            }
            break;
        }
        return array;
    }


    public static char[] smallestEvenN(char[] array, int N) {
        for(int i =0; i < array.length;i++){
            if (Integer.parseInt(String.valueOf(array[i] - '0' + "")) % 2 ==0) continue;
            array[i]--;
            for(int j = i+1; j < array.length;j++){
                array[j] = '8';
            }
            break;
        }
        return array;
    }

    public static int convertCharArrayBackToInteger(char[] array) {
        int IncreasedN = 0;
        for (int k = 0; k < array.length;k++){
            int digit = array[k] - '0';
            if (digit < 0 || digit> 9) throw new NumberFormatException();
            IncreasedN *= 10;
            IncreasedN += digit;
        }
        return IncreasedN;
    }

}
