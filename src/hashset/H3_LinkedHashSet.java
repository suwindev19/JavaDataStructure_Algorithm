package hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
Collection
Set
HashSet
LinkedHashSet - is a child of HashSet
        maintains doubly LinkedList
        Get the items in insertion order


size()
remove()
isEmpty()
clear()

add()
remove()
contains()

size()
isEmpty()

Collection
Set
HashSet
LinkedHashSet
What does extra thing LinkedHashSet do?
- Advantage
- You will get the items in their insertion order
- How does that happen?
    It maintains th doubly linked list internally.
    Items are


 */
public class H3_LinkedHashSet {
    public static void main(String[] args) {
//        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
//        lhs.add(10);
//        lhs.add(20);
//        lhs.add(30);
//        lhs.remove(10);
//        lhs.add(10);
//        System.out.println(lhs);

        int[] arr = {30, 20, 20, 25, 30, 30, 30, 30};
//        printDistinctElements(arr);
        printDistinctElements_HashSet(arr);

    }

    // You need these elements in order, therefore use LinkedHashSet
    public static void printDistinctElements(int[] arr) {
        LinkedHashSet<Integer> s = new LinkedHashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
        }
        for (Integer i : s) {
            System.out.println(i);
        }
    }

    // Time O(n^2)
    // Space O(1)
    public static void printDistinctElements_Naive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                System.out.println(arr[i] + " ");
            }
        }
    }

    // Time
    public static void printDistinctElements_HashSet(int[] arr) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length;i++) {
            if (s.contains(arr[i]) == false) {
                s.add(arr[i]);
                System.out.println(arr[i] + " ");
            }
        }
    }
}
