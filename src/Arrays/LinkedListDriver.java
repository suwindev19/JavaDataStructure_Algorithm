package Arrays;

public class LinkedListDriver {
    public static void main(String[] args) {
        LinkedList1 linkedList = new LinkedList1();
        linkedList.insertAtStart(10);
        linkedList.insertAtStart(20);
        linkedList.insertAtStart(30);
        linkedList.insertAtStart(40);
        linkedList.printLinkedList();


//        System.out.println("Remove from head: ");
//        linkedList.deleteFromStart();
//        linkedList.printLinkedList();
//
//        System.out.println("Remove from end: ");
//        linkedList.deleteFromLast();
//        linkedList.printLinkedList();

        System.out.println("insert Before Data");
        linkedList.insertBeforeData(25);
        linkedList.printLinkedList();

        System.out.println("insert After Data");
        linkedList.insertAfterData();
        linkedList.printLinkedList();

        System.out.println("remove After Data");
        linkedList.removeAfterData();
        linkedList.printLinkedList();

    }
}
