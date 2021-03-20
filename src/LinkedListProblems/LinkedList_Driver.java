package LinkedListProblems;

public class LinkedList_Driver {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtStart(2);
        list.insertAtStart(3);
        list.insertAtStart(5);
        list.insertAtStart(6);
        list.insertAtLast(7);
        list.printLinkedList();
        list.insertAtLastNode(8);
        list.insertAfter(3, 4);
        list.deleteFromFirst(list);
//        System.out.println(list.getMiddle());
        System.out.println("After many operations: ");
        list.printLinkedList();

    }
}
