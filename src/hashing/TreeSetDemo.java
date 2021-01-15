package hashing;

import java.util.TreeSet;
import java.util.List;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(List.of(10, 30, 50, 70, 10, 40));
        treeSet.add(25);

        System.out.println(treeSet);
    }
}
