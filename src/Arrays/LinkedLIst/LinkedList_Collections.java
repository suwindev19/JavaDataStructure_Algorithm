package Arrays.LinkedLIst;
import java.util.List;
public class LinkedList_Collections {

    /**
     * It is another implementation of the list Interface
     * implements List, Queue, Deque Interfaces + ...
     * It uses references -> each item has a reference to the next item + store the data itself
     * 34 -> 100 -> -12 -> 1 (Singly Linked List)
     * 34 <-> 100 <-> -12 <-> 1 (Doubly Linked List)
     *  - no random access
     *  - not synchronised
     *  - we can remove items efficiently O(1) when removing from beginning and end of the linked list
     *  - no sequential access !! If you want to find an item, you have to iterate through the list until you find it O(n)
     *  remove operation is very efficient : Update the references / pointer O(1)
     *  Therefore linked list is used for remove - heavy applications
     */
    public static void main(String[] args) {
        List<Integer> list= new java.util.LinkedList<>();
        list.add(3);
        list.add(10);
        list.add(20);
        list.add(45);

        for(Integer i : list){
            System.out.print(i + " | ");
        }

        System.out.println();
        list.remove(2);
        for(Integer i : list){
            System.out.print(i + " | ");
        }
        System.out.println();
        System.out.println(list.get(0)); // not as fast as ArrayList

        System.out.println(list.size());

    }
}
