package lc_contest;

public class lc_1704_Determine_If_String_Halves_Are_Alike {
    public static void main(String[] args) {
        String s = "book";
        System.out.println(halvesAreAlike(s));
    }

    public static boolean halvesAreAlike(String s) {
        char[] array = s.toCharArray();
        int n = s.length();
        char[] cFirstHalf = new char[n/2];
        char[] cSecondHalf = new char[n/2];
        for(int i =0; i < n/2; i++) {
            cFirstHalf[i] = array[i];
        }
        for(int i = 0; i < cSecondHalf.length ; i++) {
            cFirstHalf[i] = array[n/2-1];
        }

        int countFirstHalve = 0;
        int countSecondHalve = 0;

        for(int i =0; i < cSecondHalf.length; i++) {
           if(cFirstHalf[i] == 'a' ||cFirstHalf[i] == 'b' || cFirstHalf[i] =='c' || cFirstHalf[i] =='d' ||cFirstHalf[i] == 'e') {
               countFirstHalve++;
           }

            if(cSecondHalf[i] == 'a' ||cSecondHalf[i] == 'b' || cSecondHalf[i] =='c' || cSecondHalf[i] =='d' ||cSecondHalf[i] == 'e') {
                countSecondHalve++;
            }
        }
        if (countFirstHalve == countSecondHalve) {
            return true;
        }
        return false;
    }
}
