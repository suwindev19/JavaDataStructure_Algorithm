package linkedList;
/*
Main memory as array
Heap area
    Dynamically allocated object

 */

class Node{
    int data;
    // self referential structure
    Node next;
    // constructor
    Node (int x){
        data = x;
        next = null;
    }
}

public class LL_1_Implementation {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
    }
}
