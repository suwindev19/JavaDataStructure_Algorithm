package kickStart_April;

import java.util.Scanner;
import java.util.*;
public class Facebook_Mentorship_OrderCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> height = new ArrayList<>();
        Integer size = sc.nextInt();
        for(int i =0; i < size;i++){
            height.add(sc.nextInt());
        }

        sc.close();
        List<Integer> original = new ArrayList<>();
        for(Integer i : height){
            original.add(i);
        }
        Collections.sort(height);
        for(int i =0;  i < height.size();i++){
            System.out.println(height.get(i));
        }
        int count = 0;
        for(int i =0; i < height.size();i++){
            if(height.get(i) != original.get(i)){
                count++;
            }
        }
        System.out.println( "Count is : " + count);

    }
}
