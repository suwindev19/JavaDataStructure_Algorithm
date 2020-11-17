package DataStructure_CourseNotes.week1;
/*
A Single node
- contains data -> integer, double or custom object
- contains a reference pointing to the next node in the linked list

Each node is composed of a data and a reference/ link to the next node in the sequence.
Simple and very common data structure!
They can be used to implement several other common data types: stacks, queues
Simple linked lists by themselves do not allow random acccess to the data , therefore you cannot use indexes to get them.
Many basic operations such as obtaining the last node of the list or finding a node that contains a given data or locating the place where a new node should be inserted - requires sequential scanning of most or all of the list elements


Advantages
- linked lists are dynamic data structures (array are not!)
- It can allocate the needed memory in run time
- Very efficient if we want to manipulate the first elements

Easy implementation
- can store  items with different sizes : array assumes every element to be exactly the same
- It is easier for a linked list to grow organically. An array' size needs to be known ahead of time or re-created when it needs to grow


Disadvantages
- Waste memory because of references
- Node in a linked list must be read in order from the beginning as linked lists have sequential access (array items can be reached via indexes in O(1) time !
- Difficulties arise in Linked Lists when it comes to reverse traversing.
- Singly linked list are extremely difficult to nagivate backwards
- Solution: Doubly linked lists -> easier to read, but memory is wasted in allocating space for a back pointer

 */
public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
