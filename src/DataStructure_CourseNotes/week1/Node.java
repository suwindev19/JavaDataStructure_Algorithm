package DataStructure_CourseNotes.week1;
/*
A Single node
- contains data -> integer, double or custom object
- contains a reference pointing to the next node in the linked list

Each node is composed of a data
 */
public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
