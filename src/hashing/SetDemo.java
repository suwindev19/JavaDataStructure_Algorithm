package hashing;
import java.util.HashSet;

public class SetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>(20, 0.5f); // unordered
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);

        System.out.println(hashSet);
    }
}
