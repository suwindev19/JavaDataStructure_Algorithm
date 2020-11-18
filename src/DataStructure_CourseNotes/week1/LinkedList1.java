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

- Doubly Linked List
    - We can get from 4 to 25 because we just have to hop to the next node.
    - Node class has two references, one pointing to the next node, one pointing to the previous node
    - It is not memory friendly, you have to store lots of references
    - But there is not need to track the previous node during traversal


    Linked List vs Array
Searching
    - Search operation yields the same result for both data structure
    - ArrayList search operation is pretty fast compared to LinkedList search operation
    - You can use random access arrays : getItem( int index) which is O(1) Time
    - LinkedList performance is O(n) Time
    - WHy?
    - ArrayList maintains index based system for its elment as it uses array data structure implicitly which makes it faster for searching an element in the list
    - On the other hand LinkedList requires the traversal through all the items for searching an element

Deletion
    - LinkedList remove operation takes O(1) time if we remove items from the beginning and usually this is the case
    - ArrayList : removing first element ( so at the beginning) takes O(n) time, removing the last item takes O(1) times
    - But on average, we have to reconstruct the array when removing
    - Therefore in conclusion, linkedlist is better for this option
    - Why?
    - Linked List basically operates with pointers : removal only requires change in the pointer location which can be done very fast
Memory Management

    - Arrays do not need any extra memory
    - LinkedList do need extra memory because of references / pointers
    - In this aspect, arrays are better, they are memory friendly.

    Operation               LinkedList              Arrays
    ---------               ----------              ------
    search                  O(n)                     O(1)
    Insert at the start     O(1)                     O(n)
    Insert at the end       O(n)                     O(1)
    Waste space             O(n)                     0
 */
public class LinkedList1 {
    Node head;

    public LinkedList1() {
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
