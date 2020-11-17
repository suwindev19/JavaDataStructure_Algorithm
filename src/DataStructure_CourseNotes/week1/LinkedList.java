package DataStructure_CourseNotes.week1;
/*
Linked List Operations
=====================
- inserting items at the beginning of the linked list
    - very simple, you just have to update the references -> O(1) Time complexity
    - linkedList.insertAtStart(10); 10 Null, insert 4 , point to 10 , set the pointer point to the next node
    - Array is great for random access
- inserting items at the end of the Linked List
    - You have to traverse the whole linked list to find the last node
    - How do you find the last node?
    - You know that the last node is pointing to NULL
    - You have to update the references when you get there O(n) Time
    - linkedList.insertAtEnd(25)
    - 12, 4, 123, -7, 10 , null
    - root of the node is 12. Have to go to the last node. Keep traversing until the pointer is pointing to null
    - 10 needs to point to item to be inserted (25) therefore O(1) + O(n) = O(n)

- Removing at the beginning
    - removing item at the beginning of the list is always very fast
    - you do not have to search the item
    - you have to update the references accordingly
    - O(1)
    - linkedList.removeStart()
- Removing at the given point
    - Search for the given item (which may take a lot of time
    - if the item is at the end of the list, O(n)
    - linkedList.reove(10)
 */
public class LinkedList {
    Node head;

    public  LinkedList() {
        this.head = null;
    }

    public void insertAtStart(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void deleteFromStart(){
        if(null != head){
            head = head.next;
        } else {
            System.out.println("List is not available");
        }
    }

    public void deleteFromLast(){
        Node current = head;
        if( head != null){
            while(current.next != null &&  current.next.next != null){ // once you reach to current.next is null, break from the loop
                current = current.next;
            }
        }
        current.next = null;
    }


    public void insertBeforeData(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;

    }

    public void insertAfterData(){

    }

    public void removeAfterData(){

    }

    public void printLinkedList( ){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " | ");
            current = current.next;
        }
        System.out.println("\n");
    }
}
