package kickStart_April;

import java.util.*;

public class FaceBook_MoonSoon_Umbrella {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int requirement =0;
        List<Integer> sizes = new ArrayList<>();
        int size = 0;
        if (sc.hasNextInt()){
            requirement = sc.nextInt();
            size = sc.nextInt();
            for(int i =0; i < size;i++){
                sizes.add(sc.nextInt());
            }
        }
        sc.close();
        int i = sizes.size()-1;
        Collections.sort(sizes);
        int count = 0;
        while ( requirement >=0 && i >= 0){
            count += requirement/ sizes.get(i);
            requirement = requirement % sizes.get(i);
            i--;
        }
        System.out.println(requirement !=0 ? -1 : count);

    }
}
