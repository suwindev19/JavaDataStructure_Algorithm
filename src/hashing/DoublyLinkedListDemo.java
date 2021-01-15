package hashing;

import java.util.LinkedList;
import java.util.List;

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> arrayList1 = new LinkedList<>();
        LinkedList<Integer> arrayList2 = new LinkedList<>(List.of(50, 60, 70, 80, 90));

        arrayList1.add(10);
        arrayList1.add(0,5);
        arrayList1.addAll(1, arrayList2);
        arrayList1.add(5,70);
        arrayList1.set(6,100);
        arrayList1.addFirst(3);
        arrayList1.addLast(200);
        arrayList1.forEach(n->show(n));
        arrayList1.getFirst();
        arrayList1.getLast();
        arrayList1.peekFirst();

    }

    static void show(int n){
//        if(n >60)
            System.out.println(n);
    }
}
