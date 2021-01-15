package ArrayListConcepts;

import java.util.ArrayList;

public class VirtualCapacity {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<Object>(20);
        System.out.println(ar.size()); // size() will always work on the physical capacities, currently is 0.
        ar.add(100);
        System.out.println(ar.size()); // PC = 1

        ar.add(200);
        ar.add(300);
        ar.add(200);

        System.out.println(ar.size());


    }
}
