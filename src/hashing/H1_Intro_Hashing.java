package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Search , Insert, Delete O(1)
Key             Value
Phone number    Person details
All values are unique, no duplicates values allowed.

Delete key and corresponding values
Hashing is not useful for
    finding closet value -> AVL or Red black tree
    keep the data for sorted data -> AVL or Red black tree
    prefix searching -> trie data structure
because hashing do exact key searching

Applications of Hashing
    - Dictionaries
    - database indexing
    - cryptography
    - Caches
    - Symbol tabels in compilers/ interpreters
    - routers
    - caches
    - getting data from databases
    - many more


Direct Address Table
0 absent
1 present
    Imagine a situation when you have 1000 keys with values from 0 to 999
    how would you implement the following in O(1) time
    1) search
    2) insert
    3) delete

    Index table
    - it does not handle
        large value -> phone number of employees
        floating point number
        string value
        address
        combination of digits and characters


        Therefore, hashing concept is developed
     Take universe of keys numbers
        e.g. phone numbers
            names
            employees ID [E12232P]
            Use a function called hash function
            convert these large values into smaller values that can be used as an index in the array
            Universe of keys -> Hash Function -> HashTable

        How does Hash Function work?
            Every time you use the hash function, it should generate the same small value index.
            Because you need to search for that value in the slot you have inserted.

            - should always map a large key to same small key
            - should generate values from 0 to m-1
            - should be fast, O(1) for integer and O(len) for string of length len
            - should uniformly distribute large keys into Hash Table slots
Hashing Functions
    - 100 items out of the large sets go to different slots in hash table
    - h(large - key) = large - key % M (choose the prime number - better distinction of large keys)
    bad value of M, 2^ or 10^3 , avoid having power
    take prime number not close to 2^ or 10^
    - for strings, weighted sum
        str[ ] = "abcd";
        str[0]*x0 + str[1]*x1 + str[2]*x2
        weighted sum to avoid the permutation problem
    - Universal hashing


Collision Handling
    If we know keys in advance, then we can handle hashing perfectly. This guarantees no collision.
    building dictionary of known words
    Can do preprocessing.
    If we do not know keys, then we use one of the followings:
        - chaining
            - make a chain of collision items
        - open addressing
            - linear probing
            - quadratic probing
            - double hashing
     Birthday Paradox
     If there are 23 people in the room, the probability of 2 people having the same birthday.
     If number are 90 people, probability goes up to 99.9%


Chaining
    hash(key) = key % 7
    Input keys : 50, 21, 58, 17, 15, 49, 56, 22, 23, 25
    Hash table (Array of Linked List headers)
    If there are collision, insert at the end of the link

    50 % 7 = 1 this is the hash key. Therefore store 50 in corresponding slot of the remainder 1.

    0   21  49  56
    1   50  15  22
    2   58  23
    3   17
    4   25
    5
    6
    7

    Performance of chaining
         m = no. of slots in Hash Table
         n = no. of keys to be inserted
         Load factor  alpha = n / m
         Trade off between space and time
         Load factor is small, you will have more collision.
         Expected chain length
         Keys are uniformly distributed = alpha
         Expected time to search = O(1+ alpha)
         Expected time to insert and delete = O(1+ alpha)

   Data Structures to store chains
        l has chain length
        linked list is not cache friendly, since they are in different locations
        Uses extra spaces for next references
        - linked list
            - search O(l)
            - delete O(l)
            - insert O(l)
        - dynamic sized arrays - cache friendliness
            - search O(l)
            - delete O(l)
            - insert O(l)
        - Self Balancing BST - disadvantage - cache not friendly
            - AVL tree
            - Red Black tree
            - search O(log l)
            - delete O(log l)
            - insert O(log l)


Bucket = 7
    Null                                70  56
    Null                                71
    Null Insert -> 70, 71, 9, 56, 72    9 -> 72
    Null                                Null
    Null                                Null
    Null                                Null
    Null                                Null

    search(56) -> true
    search(57) -> false
    delete 71

 */
class MyHash{
    int BUCKET;
    ArrayList<LinkedList<Integer>> table;

    MyHash(int b){
        BUCKET = b;
        table = new ArrayList<LinkedList<Integer>>();
        for(int i = 0; i < b;i++){
            table.add(new LinkedList<Integer>());
        }
    }

    void insert(int key) {
        int i = key % BUCKET;
        table.get(i).add(key);
    }

    boolean search(int key) {
        int i = key % BUCKET;
        return table.get(i).contains(key);
    }

    void remove(int key) {
        int i = key % BUCKET;
        table.get(i).remove((Integer)i); // type case as Integer object
    }
}


public class H1_Intro_Hashing {
    public static void main(String[] args) {

    }
}




























