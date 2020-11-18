# Java - Data Structure and Algorithms Udemy course by Holczer

This repo contains the notes and java code files I have taken while doing the [Data Structure and Algorithm in Java by Holczer Balazs](https://www.udemy.com/user/holczerbalazs/). This is his's [udmey course link](https://www.udemy.com/course/algorithms-and-data-structures/).


<img src="./../../img/dataStructure_CourseNotes.png" alt="dataStructure_CourseNotes" width="600"/>


**Table of Contents**

```
      -------------------------------
      1.  Introduction
          ============
      2.  Arrays
          =======

      3.  Arrays Interview Questions
          ==========================

      4.  Linked Lists
          ============
          A Single node
              Advantages
              Disadvantages
          Linked List Operations
          Linked List vs Array
              Searching
              Deletion
              Memory Management
          Interface
              Why and When to use Interface?
          Doubly Linked Lists
              Advantages of Doubly Linked List
          Collectoins
          Real World practical applications of Linked List

      5.  Linked Lists Interview Questions
          ================================
      -------------------------------

```

## Arrays

- **Arrays :** Fundamental building blocks for all other data Structures
  - There are two types of Arrays: Static and Dynamic Arrays
- **Static array :** is a fixed length container containing n elements indexable from the range [0, n-1].
- **indexable :** means that each slot/ index in the array can be referenced with a numbes. Static array are given as contagious chunck of memory.
- **When and where is a static Array used?**
  - Storing and accessing sequential data
  - Temporarily storing objects - most commonly used 
  - Used by IO routines as buffers
    - Store information from input and output streams 
    - If files are too large to fit in the memory, use Buffer to read small chunks 
  - Lookup tables and inverse lookup tables
    - Due to array's indexing properties, you can retrieve data from the table.
  - Can be used to return multiple values from a function
    - Find way around in the programming lanaguge that allow for only single return value. 
    - Use as pointer and return the values 
  - Used in dynamic programming to cache answers to subproblems 
    - [Knapsack problem](https://en.wikipedia.org/wiki/Knapsack_problem)
      - [Knapsack problem lecture notes for later reference](https://www2.cs.duke.edu/courses/spring19/compsci330/lecture4scribe.pdf)
    - Queen check problem
- **Complexity :**
  
  | Operation | Static Array | Dynamic Array |
  |---|---|---|
  |Access | O(1) | O(1)|
  |Search | O(n) | O(n)|
  |Insertion | N/A | O(n)|
  |Appending | N/A | O(1)|
  |Deletion | N/A | O(n)|

  - Static Array: Insertion, Appending, Deletion do not apply to static array since it is a fixed size.
  - Dynamic Array : needs to shift the elements for both insertion and deletion.
- Array 
    ```
    A = {44, 12, -5, 17, 6, 0, 3, 9, 100}   <- Array
          0   1   3   3  4  5  6  7   8     <- Indexing
    A[0] = 44 , [] square bracket denotes the indexing 
    A at position 0 

    ```
- **Operations on Dynamic Array**
  - The dynamic array can grow and shrink in size.
  - A = {34, 4}
  - A.add(-7)      A = {34, 4, -7}
  - A.add(34)      A = {34, 4, -7, 34}
  - A.remove(4)    A = {34, -7, 34}

- **Implement Dynamic Array** 
  - One of the most common way to implement is to use a static array.
    - Create a static array with an initial capacity
    - Add elements to the underlying static array, keeping track of the number of elements
    - If adding another element will exceed the capacity, then create a new static array with twice the capacity and copy the original elements into it.
- **Why is it important that we grow the size of the dynamic array exponentially when resizing?**
  - It is to keep the time complexity of insertions O(1). If we grow the array at an exponential rate, the cost of inserting as well as resizing becomes neglibigle.
## Arrays Arrays Interview Questions
## Linked Lists

**A Single node**
- contains data -> integer, double or custom object
- contains a reference pointing to the next node in the linked list
- Each node is composed of a data and a reference/ link to the next node in the sequence.
- Simple and very common data structure!
- They can be used to implement several other common data types: stacks, queues
- Simple linked lists by themselves do not allow random acccess to the data , therefore you cannot use indexes to get them.
- Many basic operations such as obtaining the last node of the list or finding a node that contains a given data or locating the place where a new node should be inserted - requires sequential scanning of most or all of the list elements


***Advantages***
- linked lists are dynamic data structures (array are not!)
- It can allocate the needed memory in run time
- Very efficient if we want to manipulate the first elements
- Easy implementation
- can store  items with different sizes : array assumes every element to be exactly the same
- It is easier for a linked list to grow organically. An array' size needs to be known ahead of time or re-created when it needs to grow


***Disadvantages***
- Waste memory because of references
- Node in a linked list must be read in order from the beginning as linked lists have sequential access (array items can be reached via indexes in O(1) time !
- Difficulties arise in Linked Lists when it comes to reverse traversing.
- Singly linked list are extremely difficult to nagivate backwards
- Solution: Doubly linked lists -> easier to read, but memory is wasted in allocating space for a back pointer


### Linked List Operations

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


### Linked List vs Array
**Searching**
  - Search operation yields the same result for both data structure
  - ArrayList search operation is pretty fast compared to LinkedList search operation
  - You can use random access arrays : getItem( int index) which is O(1) Time
  - LinkedList performance is O(n) Time
  - WHy?
  - ArrayList maintains index based system for its elment as it uses array data structure implicitly which makes it faster for searching an element in the list
  - On the other hand LinkedList requires the traversal through all the items for searching an element

**Deletion**
  - LinkedList remove operation takes O(1) time if we remove items from the beginning and usually this is the case
  - ArrayList : removing first element ( so at the beginning) takes O(n) time, removing the last item takes O(1) times
  - But on average, we have to reconstruct the array when removing
  - Therefore in conclusion, linkedlist is better for this option
  - Why?
  - Linked List basically operates with pointers : removal only requires change in the pointer location which can be done very fast
  
**Memory Management**
  - Arrays do not need any extra memory
  - LinkedList do need extra memory because of references / pointers
  - In this aspect, arrays are better, they are memory friendly.

| Operation   |            LinkedList  |            Arrays|
|---|---|---|
|Insert at the start |    O(1)  |                   O(n)|
|Insert at the end |      O(n)   |                  O(1)|
|Waste space     |        O(n)  |                   0|


**Interface**
- Interface is another way to achieve abstraction. 
- An interface is a completely abstract class that is used to group related methods with empty bodies.
- To access the interface methods, the interface must be implemented by another class with *implements* keybord.
- Interface cannot be used to create objects. 
- Interface does not have body.
- On implementation of an interface, you must override all of its methods. 
- Interface methods are by default abstract and public.
- Interface attributes are by default public, static and final. 
- Interface cannot contain a constructor. 
- 

**Why and When to use Interface?**
- To achieve security - hide certain details and only show the important details of an object (interface)
- You can achieve multiple interitance in Java via interface and implement multiple interfaces.


**Doubly Linked Lists**
- Doubly linked list are composed of nodes and references / pointeres from one node to the other!!
- The last and first references are pointing to a NULL
- You can access to the head
- You can access to tail as well.
- Single node
  - contains data -> integer, double or custom object
  - contains a reference pointing to the next node in the linked list
  - contains a reference pointing to the previous node in the linked list
- class Node {
  - data 
  - Node nextNode
  - Node previousNode
- }
- Singly Linked List
  - can only access from head ONLY => 12, 4, 123, -7, 25, NULL 
  - Time O(n)

  ```
      removeSingle(Node node, Node previousNode){
        tempNode = head;
        while (tempNode != null){
          if(tempNode == node){
            previousNode.nextNode = tempNode.nextNode;
            tempNode = null;
            return;
          }
          previousNode = tempNode;
          tempNode = tempNode.nextNode;
        }
      }
  ```
- Doubly Linked List
  - 7, 1, 10, -2, 2 
  - You don't need to traverse through the list
  - If you know the node you want to get rid of, you can update the reference because you can access the previous node with reference!

    ```
    removeDouble(Node node){
      node.previousNode.nextNode = node.nextNode;
      node.nextNode.previousNode = node.previousNode;
    }
    ```
**Advantages of Doubly Linked List**
  - a doubly linked list can be traversed both directions: forward and backward
  - the remove operation is more efficient if the node is given
  - for singly linked lists, you need the previous node.
  - to find it, you need to traverse the whole list
    - to remove a node from a singly linked list, you need the node + predecessor
    - to remove a node from a doubly linked list, you need the node 
  

**Collectoins**
- Iterable
  - Collection 
    - List
      - ArrayList
      - LinkedList - can implement queue and deque
      - Vector
        - Stack
    - Queue
      - Deque
      - ArrayDeque
      - PriorityQueue
    - Set 
      - Hashset
      - LinkedHashSet
      - SortedSet
      - TreeSet

**Real World practical applications of Linked List**
- Operating system uses almost all the important data structures.
  - Low level memory management 
    - Linked lists are important in low level memory management when dealing with C programming 
      - malloc() : allocate memory into heap
      - free() : free the memory 
    - With these built-in functions, we can manipulate the heap memory
      - char * char_ptr = (char*)malloc(30); // allocates 30 bytes of memory in the heap
    - Header  -> Header -> Header
    - B       -> B      -> B
    - O       -> O      -> O
    - D       -> D      -> D
    - Y       -> Y      -> Y
  - For more info, go to [this link](https://wiki.syslinux.org/wiki/index.php?title=Heap_Management).
- Windows application 
  - Alt + tab
  - All the tabs are linked together with linked list
- PhotoViewer - images are linked together
- Blockchains (bitCoin) - blockchain is basically a simple linked list where blocks are cryptographically linked together.
  - So the blockchain itself is a linked list with hash pointers
  - Every node in the blockchain has 2 hash values
    - Own hash
    - Hash value of the previous block 
### References

- Data Structures in Java - Part I (+INTERVIEW QUESTIONS) , https://www.udemy.com/course/algorithms-and-data-structures/
- Java Comparable Interface, https://www.javatpoint.com/Comparable-interface-in-collection-framework
- 
- 
 
  
